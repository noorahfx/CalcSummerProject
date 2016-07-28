package calcpa.calcsummerproject.Geometry.Pentagon.TypesOfPentagon;

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

public class RegularPentagon extends AppCompatActivity {
    //perimeter
    EditText penPerimeterSideAET;
    TextView penPerimeterAnswerTV;
    Button penPerimeterCalcButton;

    //area
    EditText penAreaSideAET;
    TextView penAreaAnswerTV;
    Button penAreaCalcButton;

    //side A
    EditText penSideAET;
    TextView penSideAAnswerTV;
    Button penSideACalcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_pentagon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        penPerimeterSideAET = (EditText) findViewById(R.id.pen_perimeter_side_a_et);
        penPerimeterAnswerTV = (TextView) findViewById(R.id.pen_calc_answer_tx);
        penPerimeterCalcButton = (Button) findViewById(R.id.pen_perimeter_calc_button);
        penPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(penPerimeterSideAET)) {
                    penPerimeterSideAET.setError("Enter Value");
                } else {
                    double aSide, pentagonPerimeter;
                    aSide = Double.parseDouble(penPerimeterSideAET.getText().toString());
                    if (aSide <= 0) {
                        penPerimeterAnswerTV.setText("The variable a should be positive");
                    }
                    pentagonPerimeter = 5 * aSide;
                    penPerimeterAnswerTV.setText(String.format("%.02f", pentagonPerimeter));
                }
            }
        });
//Area
        penAreaSideAET = (EditText) findViewById(R.id.pen_area_side_a_et);
        penAreaAnswerTV = (TextView) findViewById(R.id.pen_calc_area_answer_tx);
        penAreaCalcButton = (Button) findViewById(R.id.pen_area_calc_button);
        penAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(penAreaSideAET)) {
                    penAreaSideAET.setError("Enter Value");

                } else {
                    double aSide, pentagonArea;
                    aSide = Double.parseDouble(penAreaSideAET.getText().toString());
                    if (aSide <= 0) {
                        penAreaAnswerTV.setText("The variable a should be positive");
                    }
                    pentagonArea = (.25) * Math.sqrt(5*(5+2*Math.sqrt(5)))*Math.pow(aSide,2);
                    penAreaAnswerTV.setText(String.format("%.02f", pentagonArea));
                }
            }
        });

        penSideAET = (EditText) findViewById(R.id.pen_side_et);
        penSideAAnswerTV = (TextView) findViewById(R.id.pen_calc_side_answer_tx);
        penSideACalcButton = (Button) findViewById(R.id.pen_side_calc_button);
        penSideACalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(penSideAET)) {
                    penSideAET.setError("Enter Value");

                } else {
                    double perimeter, penSideA;
                    perimeter = Double.parseDouble(penSideAET.getText().toString());
                    if (perimeter <= 0) {
                        penSideAAnswerTV.setText("The variable P should be positive");
                    }
                    penSideA = perimeter / 5;
                    penSideAAnswerTV.setText(String.format("%.02f", penSideA));
                }
            }
        });
    }
}
