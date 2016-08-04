package calcpa.calcsummerproject.Geometry.Rhombus;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import calcpa.calcsummerproject.Model;
import calcpa.calcsummerproject.R;

public class Rhombus extends AppCompatActivity {


    //Perimeter
    EditText rhombusPerimeterAET;
    TextView rhombusPerimeterAnswerTV;
    Button rhombusPerimeterCalcButton;

    //Area
    EditText rhombusAreaPET;
    EditText rhombusAreaQET;
    TextView rhombusAreaAnswerTV;
    Button rhombusAreaCalcButton;

    //Sides
    EditText rhombusSidesPET;
    TextView rhombusSidesAnswerTV;
    Button rhombusSidesCalcButton;

    //Diagonal P
    EditText rhombusPDiaognalQET;
    EditText rhombusPDiaognalAreaET;
    TextView rhombusPDiaognalAnswerTV;
    Button rhombusPDiaognalCalcButton;


    //Diagonal Q
    EditText rhombusQDiagonalPET;
    EditText rhombusQDiagonalAreaET;
    TextView rhombusQDiagonalAnswerTV;
    Button rhombusQDiagonalCalcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhombus);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Perimeter
        rhombusPerimeterAET = (EditText) findViewById(R.id.rhombus_perimeter_a_et);
        rhombusPerimeterAnswerTV = (TextView) findViewById(R.id.rhombus_perimeter_calc_answer_tx);
        rhombusPerimeterCalcButton = (Button) findViewById(R.id.rhombus_perimeter_calc_button);
        rhombusPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(rhombusPerimeterAET)) {
                    rhombusPerimeterAET.setError("Enter Value");
                } else {
                    double aSide, rhombusPerimeter;
                    aSide = Double.parseDouble(rhombusPerimeterAET.getText().toString());
                    if (aSide <= 0) {
                        rhombusPerimeterAnswerTV.setText("The variable a should be positive");
                    } else {
                        rhombusPerimeter = 4 * aSide;
                        rhombusPerimeterAnswerTV.setText(String.format("%.02f", rhombusPerimeter));
                    }
                }
            }
        });

        //Area
        rhombusAreaPET = (EditText) findViewById(R.id.rhombus_area_p_et);
        rhombusAreaQET = (EditText) findViewById(R.id.rhombus_area_q_et);
        rhombusAreaAnswerTV = (TextView) findViewById(R.id.rhombus_area_calc_answer_tx);
        rhombusAreaCalcButton = (Button) findViewById(R.id.rhombus_area_calc_button);
        rhombusAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(rhombusAreaPET)) {
                    rhombusAreaPET.setError("Enter Value");
                } else if (Model.isEmpty(rhombusAreaQET)) {
                    rhombusAreaQET.setError("Enter Value");
                } else {
                    double pDiaognal, qDiaognal, rhombusArea;
                    pDiaognal = Double.parseDouble(rhombusAreaPET.getText().toString());
                    qDiaognal = Double.parseDouble(rhombusAreaQET.getText().toString());
                    if (pDiaognal <= 0) {
                        rhombusAreaAnswerTV.setText("The variable p should be positive");
                    } else if (qDiaognal <= 0) {
                        rhombusAreaAnswerTV.setText("The variable q should be positive");
                    } else {
                        rhombusArea = (pDiaognal * qDiaognal) / 2;
                        rhombusAreaAnswerTV.setText(String.format("%.02f", rhombusArea));
                    }
                }
            }
        });


        //Sides
        rhombusSidesPET = (EditText) findViewById(R.id.rhombus_sides_perimeter_et);
        rhombusSidesAnswerTV = (TextView) findViewById(R.id.rhombus_sides_calc_answer_tx);
        rhombusSidesCalcButton = (Button) findViewById(R.id.rhombus_sides_calc_button);
        rhombusSidesCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(rhombusSidesPET)) {
                    rhombusSidesPET.setError("Enter Value");
                } else {
                    double perimeter, rhombusSide;
                    perimeter = Double.parseDouble(rhombusSidesPET.getText().toString());
                    if (perimeter <= 0) {
                        rhombusSidesAnswerTV.setText("The variable a should be positive");
                    } else {
                        rhombusSide = perimeter / 4;
                        rhombusSidesAnswerTV.setText(String.format("%.02f", rhombusSide));
                    }
                }
            }
        });

        //Diagonal P
        rhombusPDiaognalQET = (EditText) findViewById(R.id.rhombus_p_diagonal_q_et);
        rhombusPDiaognalAreaET = (EditText) findViewById(R.id.rhombus_p_diagonal_area_et);
        rhombusPDiaognalAnswerTV = (TextView) findViewById(R.id.rhombus_p_diagonal_calc_answer_tx);
        rhombusPDiaognalCalcButton = (Button) findViewById(R.id.rhombus_p_diagonal_calc_button);
        rhombusPDiaognalCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(rhombusPDiaognalQET)) {
                    rhombusPDiaognalQET.setError("Enter Value");
                } else if (Model.isEmpty(rhombusPDiaognalAreaET)) {
                    rhombusPDiaognalAreaET.setError("Enter Value");
                } else {
                    double qDiaognal, area, rhombusPDiagonal;
                    qDiaognal = Double.parseDouble(rhombusPDiaognalQET.getText().toString());
                    area = Double.parseDouble(rhombusPDiaognalAreaET.getText().toString());
                    if (qDiaognal <= 0) {
                        rhombusPDiaognalAnswerTV.setText("The variable q should be positive");
                    } else if (area <= 0) {
                        rhombusPDiaognalAnswerTV.setText("The variable A should be positive");
                    } else {
                        rhombusPDiagonal = 2 * (area / qDiaognal);
                        rhombusPDiaognalAnswerTV.setText(String.format("%.02f", rhombusPDiagonal));
                    }
                }
            }
        });


        //Diagonal Q
        rhombusQDiagonalPET = (EditText) findViewById(R.id.rhombus_q_diagonal_p_et);
        rhombusQDiagonalAreaET = (EditText) findViewById(R.id.rhombus_q_diagonal_area_et);
        rhombusQDiagonalAnswerTV = (TextView) findViewById(R.id.rhombus_q_diagonal_calc_answer_tx);
        rhombusQDiagonalCalcButton = (Button) findViewById(R.id.rhombus_q_diagonal_calc_button);
        rhombusQDiagonalCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(rhombusQDiagonalPET)) {
                    rhombusQDiagonalPET.setError("Enter Value");
                } else if (Model.isEmpty(rhombusQDiagonalAreaET)) {
                    rhombusQDiagonalAreaET.setError("Enter Value");
                } else {
                    double pDiaognal, area, rhombusQDiagonal;
                    pDiaognal = Double.parseDouble(rhombusQDiagonalPET.getText().toString());
                    area = Double.parseDouble(rhombusQDiagonalAreaET.getText().toString());
                    if (pDiaognal <= 0) {
                        rhombusQDiagonalAnswerTV.setText("The variable p should be positive");
                    } else if (area <= 0) {
                        rhombusQDiagonalAnswerTV.setText("The variable A should be positive");
                    } else {
                        rhombusQDiagonal = 2 * (area / pDiaognal);
                        rhombusQDiagonalAnswerTV.setText(String.format("%.02f", rhombusQDiagonal));
                    }
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
