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

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String aXis = ellipseAreaAET.getText().toString();
                String bXis = ellipseAreaBET.getText().toString();


                double area = 6 * Double.parseDouble(aXis);
                ellipseAreaAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(aXis)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
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

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = ellipseCircumAET.getText().toString();
                String volume = ellipseCircumBET.getText().toString();


                double area = 6 * Double.parseDouble(height);
                ellipseCircumAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //A-xis


        ellipseAXisAET = (EditText) findViewById(R.id.ellipse_a_xis_a_et);
        ellipseAXisBET = (EditText) findViewById(R.id.ellipse_a_xis_b_et);
        ellipseAXisAnswerTV = (TextView) findViewById(R.id.ellipse_a_xis_calc_answer_tx);
        ellipseAXisCalcButton = (Button) findViewById(R.id.ellipse_a_xis_calc_button);
        ellipseAXisCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String aXis = ellipseAXisAET.getText().toString();
                String bXis = ellipseAXisBET.getText().toString();


                double area = 6 * Double.parseDouble(aXis);
                ellipseAXisAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(aXis)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
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

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String aXis = ellipseBXisAET.getText().toString();
                String bXis = ellipseBXisBET.getText().toString();


                double area = 6 * Double.parseDouble(aXis);
                ellipseBXisAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(aXis)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}
