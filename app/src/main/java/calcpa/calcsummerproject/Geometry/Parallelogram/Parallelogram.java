package calcpa.calcsummerproject.Geometry.Parallelogram;

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

import calcpa.calcsummerproject.R;

public class Parallelogram extends AppCompatActivity {

    //Perimeter
    EditText parallelogramPerimeterBaseET;
    EditText parallelogramPerimeterAreaET;
    TextView parallelogramPerimeterAnswerTV;
    Button parallelogramPerimeterCalcButton;


    //Area
    EditText parallelogramAreaBaseET;
    EditText parallelogramAreaHeightET;
    TextView parallelogramAreaAnswerTV;
    Button parallelogramAreaCalcButton;


    //Base
    EditText parallelogramBaseSideET;
    EditText parallelogramBasePerimeterET;
    TextView parallelogramBaseAnswerTV;
    Button parallelogramBaseCalcButton;

    //height
    EditText parallelogramHeightBaseET;
    EditText parallelogramHeightAreaET;
    TextView parallelogramHeightAnswerTV;
    Button parallelogramHeightCalcButton;

    //Sides
    EditText parallelogramSideBaseET;
    EditText parallelogramSidePerimeterET;
    TextView parallelogramSideAnswerTV;
    Button parallelogramSideCalcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parallelogram);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Perimeter
        parallelogramPerimeterBaseET = (EditText)findViewById(R.id.parallelogram_perimeter_base_et);
        parallelogramPerimeterAreaET = (EditText)findViewById(R.id.parallelogram_perimeter_area_et);
        parallelogramPerimeterAnswerTV=(TextView)findViewById(R.id.parallelogram_perimeter_calc_answer_tx);
        parallelogramPerimeterCalcButton =(Button)findViewById(R.id.parallelogram_perimeter_calc_button);
        parallelogramPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = parallelogramPerimeterBaseET.getText().toString();
                String volume = parallelogramPerimeterAreaET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                parallelogramPerimeterAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //Area
        parallelogramAreaBaseET = (EditText)findViewById(R.id.parallelogram_area_base_et);
        parallelogramAreaHeightET = (EditText)findViewById(R.id.parallelogram_area_height_et);
        parallelogramAreaAnswerTV= (TextView)findViewById(R.id.parallelogram_area_calc_answer_tx);
        parallelogramAreaCalcButton=(Button)findViewById(R.id.parallelogram_area_calc_button);
        parallelogramAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = parallelogramAreaBaseET.getText().toString();
                String volume = parallelogramAreaHeightET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                parallelogramAreaAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //Base
        parallelogramBaseSideET = (EditText)findViewById(R.id.parallelogram_base_side_a_et);
        parallelogramBasePerimeterET = (EditText)findViewById(R.id.parallelogram_base_perimeter_et);
        parallelogramBaseAnswerTV= (TextView)findViewById(R.id.parallelogram_base_calc_answer_tx);
        parallelogramBaseCalcButton=(Button)findViewById(R.id.parallelogram_base_calc_button);
        parallelogramBaseCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = parallelogramBaseSideET.getText().toString();
                String volume = parallelogramBasePerimeterET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                parallelogramBaseAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //height
        parallelogramHeightBaseET = (EditText)findViewById(R.id.parallelogram_height_base_et);
        parallelogramHeightAreaET = (EditText)findViewById(R.id.parallelogram_height_area_et);
        parallelogramHeightAnswerTV= (TextView)findViewById(R.id.parallelogram_height_calc_answer_tx);
        parallelogramHeightCalcButton=(Button)findViewById(R.id.parallelogram_height_calc_button);
        parallelogramHeightCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = parallelogramHeightBaseET.getText().toString();
                String volume = parallelogramHeightAreaET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                parallelogramHeightAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Sides
        parallelogramSideBaseET = (EditText)findViewById(R.id.parallelogram_side_base_et);
        parallelogramSidePerimeterET = (EditText)findViewById(R.id.parallelogram_side_perimeter_et);
        parallelogramSideAnswerTV= (TextView)findViewById(R.id.parallelogram_side_calc_answer_tx);
        parallelogramSideCalcButton=(Button)findViewById(R.id.parallelogram_side_calc_button);
        parallelogramSideCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = parallelogramSideBaseET.getText().toString();
                String volume = parallelogramSidePerimeterET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                parallelogramSideAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
