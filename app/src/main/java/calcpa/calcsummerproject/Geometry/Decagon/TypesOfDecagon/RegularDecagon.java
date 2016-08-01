package calcpa.calcsummerproject.Geometry.Decagon.TypesOfDecagon;

import android.content.res.Configuration;
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

import calcpa.calcsummerproject.Model;
import calcpa.calcsummerproject.R;

public class RegularDecagon extends AppCompatActivity {
    //area
    EditText decagonareaET;
    TextView decagonareaTV;
    Button decagonareaCalcButton;


    //perimeter
    EditText decagonPerimeterET;
    TextView decagonPerimeterTV;
    Button decagonPerimeterCalcButton;


    //Sides

    EditText decagonSideET;
    TextView decagonSideTV;
    Button decagonSideCalcButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_decagon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //area
        decagonareaET = (EditText) findViewById(R.id.decagon_area_a_et);
        decagonareaTV = (TextView) findViewById(R.id.decagon_area_calc_answer_tx);
        decagonareaCalcButton = (Button) findViewById(R.id.decagon_area_calc_button);
        decagonareaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(decagonareaET)) {
                    decagonareaET.setError("Enter Value");
                } else {
                    double sideA, decagonArea;
                    sideA = Double.parseDouble(decagonareaET.getText().toString());
                    if (sideA <= 0) {
                        decagonareaTV.setText("The variable a should be positive");
                    }
                    decagonArea = (2.5) * (Math.pow(sideA, 2)) * (Math.sqrt(5 + 2 * Math.sqrt(5)));
                    decagonareaTV.setText(String.format("%.02f", decagonArea));
                }
            }
        });


        //perimeter
        decagonPerimeterET = (EditText) findViewById(R.id.decagon_perimeter_v_et);
        decagonPerimeterTV = (TextView) findViewById(R.id.decagon_perimeter_calc_answer_tx);
        decagonPerimeterCalcButton = (Button) findViewById(R.id.decagon_perimeter_calc_button);
        decagonPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(decagonPerimeterET)) {
                    decagonPerimeterET.setError("Enter Value");
                } else {
                    double sideA, decagonPerimeter;
                    sideA = Double.parseDouble(decagonPerimeterET.getText().toString());
                    if (sideA <= 0) {
                        decagonPerimeterTV.setText("The variable a should be positive");
                    }
                    decagonPerimeter = 10 * sideA;
                    decagonPerimeterTV.setText(String.format("%.02f", decagonPerimeter));
                }
            }
        });


        //sides

        decagonSideET = (EditText) findViewById(R.id.decagon_sides_a_et);
        decagonSideTV = (TextView) findViewById(R.id.decagon_sides_calc_answer_tx);
        decagonSideCalcButton = (Button) findViewById(R.id.decagon_sides_calc_button);
        decagonSideCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //check to make sure field is not empty
                if (Model.isEmpty(decagonSideET)) {
                    decagonSideET.setError("Enter Value");
                } else {
                    double perimeter, decagonPerimeter;
                    perimeter = Double.parseDouble(decagonSideET.getText().toString());

                    if (perimeter <= 0) {
                        decagonSideTV.setText("The variable a should be positive");
                    }
                    decagonPerimeter = perimeter / 10;
                    decagonSideTV.setText(String.format("%.02f", decagonPerimeter));
                }


            }
        });


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {

        } else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {

        }

    }

}
