package calcpa.calcsummerproject.Geometry.Eclipse;

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

public class Eclipse extends AppCompatActivity {


    //Area
    EditText ellipseAreaAET;
    EditText ellipseAreaBET;
    TextView ellipseAreaAnswerTV;
    Button ellipseAreaCalcButton;


    //Circumference
    EditText ellipseCircumAET;
    EditText ellipseCircumBET;
    TextView ellipseCircumAnswerTV;
    Button ellipseCircumCalcButton;


    //Axis
    EditText ellipseAXisAET;
    EditText ellipseAXisBET;
    TextView ellipseAXisAnswerTV;
    Button ellipseAXisCalcButton;


    //Bxis
    EditText ellipseBXisAET;
    EditText ellipseBXisBET;
    TextView ellipseBXisAnswerTV;
    Button ellipseBXisCalcButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eclipse);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Area

        ellipseAreaAET = (EditText) findViewById(R.id.ellipse_area_a_et);
        ellipseAreaBET = (EditText) findViewById(R.id.ellipse_area_b_et);
        ellipseAreaAnswerTV = (TextView) findViewById(R.id.ellipse_area_calc_answer_tx);
        ellipseAreaCalcButton = (Button) findViewById(R.id.ellipse_area_calc_button);
        ellipseAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(ellipseAreaAET)) {
                    ellipseAreaAET.setError("Enter Value");
                } else if (Model.isEmpty(ellipseAreaBET)) {
                    ellipseAreaBET.setError("Enter Value");
                } else {
                    double aXis, bXis, ellipseArea;
                    aXis = Double.parseDouble(ellipseAreaAET.getText().toString());
                    bXis = Double.parseDouble(ellipseAreaBET.getText().toString());
                    ellipseArea = Math.PI * aXis * bXis;
                    ellipseAreaAnswerTV.setText(String.format("%.02f", ellipseArea));
                }


            }
        });


        //Circumferenece
        ellipseCircumAET = (EditText) findViewById(R.id.ellipse_circum_a_et);
        ellipseCircumBET = (EditText) findViewById(R.id.ellipse_circum_b_et);
        ellipseCircumAnswerTV = (TextView) findViewById(R.id.ellipse_circum_calc_answer_tx);
        ellipseCircumCalcButton = (Button) findViewById(R.id.ellipse_circum_calc_button);
        ellipseCircumCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(ellipseCircumAET)) {
                    ellipseCircumAET.setError("Enter Height");
                } else if (Model.isEmpty(ellipseCircumBET)) {
                    ellipseCircumBET.setError("Enter Volume");
                } else {
                    double aXis, bXis, ellipseCircumference;
                    aXis = Double.parseDouble(ellipseCircumAET.getText().toString());
                    bXis = Double.parseDouble(ellipseCircumBET.getText().toString());
                    ellipseCircumference = 2 * 3.14 * Math.sqrt((Math.pow(aXis, 2) + Math.pow(bXis, 2)) / 2);
                    ellipseCircumAnswerTV.setText(String.format("%.02f", ellipseCircumference));
                }

            }
        });


        //A-xis
        ellipseAXisAET = (EditText) findViewById(R.id.ellipse_a_xis_b_et);
        ellipseAXisBET = (EditText) findViewById(R.id.ellipse_a_xis_area_et);
        ellipseAXisAnswerTV = (TextView) findViewById(R.id.ellipse_a_xis_calc_answer_tx);
        ellipseAXisCalcButton = (Button) findViewById(R.id.ellipse_a_xis_calc_button);
        ellipseAXisCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(ellipseAXisAET)) {
                    ellipseAXisAET.setError("Enter Value");
                } else if (Model.isEmpty(ellipseAXisBET)) {
                    ellipseAXisBET.setError("Enter Value");
                } else {
                    double bXis, area, ellipseAXis;
                    bXis = Double.parseDouble(ellipseAXisAET.getText().toString());
                    area = Double.parseDouble(ellipseAXisBET.getText().toString());
                    ellipseAXis = area / (Math.PI * bXis);
                    ellipseAXisAnswerTV.setText(String.format("%.02f", ellipseAXis));
                }


            }
        });


        //B-xis
        ellipseBXisAET = (EditText) findViewById(R.id.ellipse_b_xis_a_et);
        ellipseBXisBET = (EditText) findViewById(R.id.ellipse_b_xis_area_et);
        ellipseBXisAnswerTV = (TextView) findViewById(R.id.ellipse_b_xis_calc_answer_tx);
        ellipseBXisCalcButton = (Button) findViewById(R.id.ellipse_b_xis_calc_button);
        ellipseBXisCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(ellipseBXisAET)) {
                    ellipseBXisAET.setError("Enter Value");
                } else if (Model.isEmpty(ellipseBXisBET)) {
                    ellipseBXisBET.setError("Enter Value");
                } else {
                    double aXis, area, ellipseBXis;
                    aXis = Double.parseDouble(ellipseBXisAET.getText().toString());
                    area = Double.parseDouble(ellipseBXisBET.getText().toString());
                    ellipseBXis = area / (Math.PI * aXis);
                    ellipseBXisAnswerTV.setText(String.format("%.02f", ellipseBXis));
                }


            }
        });


    }

}
