package calcpa.calcsummerproject.Geometry.Circle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import calcpa.calcsummerproject.Model;
import calcpa.calcsummerproject.R;

public class Circle extends AppCompatActivity {

    //area
    EditText circleAreaET;
    TextView circleAnswerTV;
    Button circleAreaCalculateButton;

    //diameter
    EditText circleDiameterET;
    TextView circleDiameterTV;
    Button circleDiameterCalculateButton;


    //circumference
    EditText circleCircumET;
    TextView circleCircumTV;
    Button circlCircumCalculateButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //area
        circleAreaET = (EditText) findViewById(R.id.circle_area_a_et);
        circleAnswerTV = (TextView) findViewById(R.id.circle_calc_answer_tx);
        circleAreaCalculateButton = (Button) findViewById(R.id.circle_area_calc_button);
        circleAreaCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(circleAreaET)) {
                    circleAreaET.setError("Enter Radius");
                } else {
                    double radius;
                    radius = Double.parseDouble(circleAreaET.getText().toString());
                    double answer = Math.PI * (radius * radius);
                    circleAnswerTV.setText(String.format("%.02f", answer));
                }

            }
        });

        //diameter
        circleDiameterET = (EditText) findViewById(R.id.circle_diameter_d_et);
        circleDiameterTV = (TextView) findViewById(R.id.circle_calc_diamter_answer_tx);
        circleDiameterCalculateButton = (Button) findViewById(R.id.circle_diameter_calc_button);
        circleDiameterCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(circleDiameterET)) {
                    circleDiameterET.setError("Enter Radius");
                } else {
                    double radius;
                    radius = Double.parseDouble(circleDiameterET.getText().toString());
                    double answer = 2 * radius;
                    circleDiameterTV.setText(String.format("%.02f", answer));
                }
            }
        });

        //circumference
        circleCircumET = (EditText) findViewById(R.id.circle_circum_c_et);
        circleCircumTV = (TextView) findViewById(R.id.circle_circum_calc_answer_tx);
        circlCircumCalculateButton = (Button) findViewById(R.id.circle_circum_calc_button);
        circlCircumCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(circleCircumET)) {
                    circleCircumET.setError("Enter Radius");
                } else {
                    double radius;
                    radius = Double.parseDouble(circleCircumET.getText().toString());
                    double answer = 2 * Math.PI * radius;
                    circleCircumTV.setText(String.format("%.02f", answer));
                }
            }
        });
    }
}
