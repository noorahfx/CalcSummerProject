package calcpa.calcsummerproject.Geometry.Rectangle;

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

public class Rectangle extends AppCompatActivity {

    //Perimeter
    EditText rectanglePerimeterLET;
    EditText rectanglePerimeterWET;
    TextView rectanglePerimeterAnswerTV;
    Button rectanglePerimeterCalcButton;

    //Area
    EditText rectangleAreaLET;
    EditText rectangleAreaWET;
    TextView rectangleAreaAnswerTV;
    Button rectangleAreaCalcButton;

    //Length
    EditText rectangleLengthWET;
    EditText rectangleLengthPET;
    TextView rectangleLengthAnswerTV;
    Button rectangleLengthCalcButton;

    //Width
    EditText rectangleWidthLET;
    EditText rectangleWidthPET;
    TextView rectangleWidthAnswerTV;
    Button rectangleWidthCalcButton;


    //Diagonal P
    EditText rectanglePDiagonalLET;
    EditText rectanglePDiagonalWET;
    TextView rectanglePDiagonalAnswerTV;
    Button rectanglePDiagonalCalcButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Perimeter
          rectanglePerimeterLET = (EditText) findViewById(R.id.rectangle_perimeter_length_et);
          rectanglePerimeterWET  = (EditText) findViewById(R.id.rectangle_perimeter_width_et);
          rectanglePerimeterAnswerTV =(TextView)findViewById(R.id.rectangle_perimeter_calc_answer_tx);
          rectanglePerimeterCalcButton = (Button)findViewById(R.id.rectangle_perimeter_calc_button);
        rectanglePerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(rectanglePerimeterLET)) {
                    rectanglePerimeterLET.setError("Enter Value");
                } else if (Model.isEmpty(rectanglePerimeterWET)) {
                    rectanglePerimeterWET.setError("Enter Value");
                } else {
                    double length, width, rectanglePerimeter;
                    length = Double.parseDouble(rectanglePerimeterLET.getText().toString());
                    width = Double.parseDouble(rectanglePerimeterWET.getText().toString());
                    if (length <= 0) {
                        rectanglePerimeterAnswerTV.setText("The variable l should be positive");
                    } else if (width <= 0) {
                        rectanglePerimeterAnswerTV.setText("The variable w should be positive");
                    } else {
                        rectanglePerimeter = 2 *(length+width);
                        rectanglePerimeterAnswerTV.setText(String.format("%.02f", rectanglePerimeter));
                    }
                }
            }
        });
        //Area
          rectangleAreaLET= (EditText) findViewById(R.id.rectangle_area_length_et);
          rectangleAreaWET  = (EditText) findViewById(R.id.rectangle_area_width_et);
          rectangleAreaAnswerTV =(TextView)findViewById(R.id.rectangle_area_calc_answer_tx);
          rectangleAreaCalcButton = (Button)findViewById(R.id.rectangle_area_calc_button);
        rectangleAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(rectangleAreaLET)) {
                    rectangleAreaLET.setError("Enter Value");
                } else if (Model.isEmpty(rectangleAreaWET)) {
                    rectangleAreaWET.setError("Enter Value");
                } else {
                    double length, width, rectangleArea;
                    length = Double.parseDouble(rectangleAreaLET.getText().toString());
                    width = Double.parseDouble(rectangleAreaWET.getText().toString());
                    if (length <= 0) {
                        rectangleAreaAnswerTV.setText("The variable l should be positive");
                    } else if (width <= 0) {
                        rectangleAreaAnswerTV.setText("The variable w should be positive");
                    } else {
                        rectangleArea = width*length;
                        rectangleAreaAnswerTV.setText(String.format("%.02f", rectangleArea));
                    }
                }
            }
        });

        //Length
          rectangleLengthWET  = (EditText) findViewById(R.id.rectangle_length_width_et);
          rectangleLengthPET= (EditText) findViewById(R.id.rectangle_length_perimeter_et);
          rectangleLengthAnswerTV =(TextView)findViewById(R.id.rectangle_length_calc_answer_tx);
          rectangleLengthCalcButton = (Button)findViewById(R.id.rectangle_length_calc_button);
        rectangleLengthCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(rectangleLengthWET)) {
                    rectangleLengthWET.setError("Enter Value");
                } else if (Model.isEmpty(rectangleLengthPET)) {
                    rectangleLengthPET.setError("Enter Value");
                } else {
                    double width, perimeter, rectangleLength;
                    width = Double.parseDouble(rectangleLengthWET.getText().toString());
                    perimeter = Double.parseDouble(rectangleLengthPET.getText().toString());
                    if (width <= 0) {
                        rectangleLengthAnswerTV.setText("The variable l should be positive");
                    } else if (perimeter<= 0) {
                        rectangleLengthAnswerTV.setText("The variable w should be positive");
                    } else if
                        (perimeter <=(2*width)) {
                        rectangleLengthAnswerTV.setText("Invalid input:make sure P>2*W");
                    } else {
                        rectangleLength = (perimeter/2)-width;
                        rectangleLengthAnswerTV.setText(String.format("%.02f", rectangleLength));
                    }
                }
            }
        });

        //Width
          rectangleWidthLET = (EditText) findViewById(R.id.rectangle_width_length_et);
          rectangleWidthPET = (EditText) findViewById(R.id.rectangle_width_perimeter_et);
          rectangleWidthAnswerTV =(TextView)findViewById(R.id.rectangle_width_calc_answer_tx);
          rectangleWidthCalcButton = (Button)findViewById(R.id.rectangle_width_calc_button);
        rectangleWidthCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(rectangleWidthLET)) {
                    rectangleWidthLET.setError("Enter Value");
                } else if (Model.isEmpty(rectangleWidthPET)) {
                    rectangleWidthPET.setError("Enter Value");
                } else {
                    double length, perimeter, rectangleWidth;
                    length = Double.parseDouble(rectangleWidthLET.getText().toString());
                    perimeter = Double.parseDouble(rectangleWidthPET.getText().toString());
                    if (length <= 0) {
                        rectangleWidthAnswerTV.setText("The variable l should be positive");
                    } else if (perimeter<= 0) {
                        rectangleWidthAnswerTV.setText("The variable w should be positive");
                    } else if
                            (perimeter <=(2*length)) {
                        rectangleWidthAnswerTV.setText("Invalid input:make sure P>2*L");
                    } else {
                        rectangleWidth = (perimeter/2)-length;
                        rectangleWidthAnswerTV.setText(String.format("%.02f", rectangleWidth));
                    }
                }
            }
        });

        //Diagonal P
          rectanglePDiagonalLET = (EditText) findViewById(R.id.rectangle_diagonal_length_et);
          rectanglePDiagonalWET  = (EditText) findViewById(R.id.rectangle_diagonal_width_et);
          rectanglePDiagonalAnswerTV =(TextView)findViewById(R.id.rectangle_diagonal_calc_answer_tx);
          rectanglePDiagonalCalcButton= (Button)findViewById(R.id.rectangle_diagonal_calc_button);
        rectanglePDiagonalCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(rectanglePDiagonalLET)) {
                    rectanglePDiagonalLET.setError("Enter Value");
                } else if (Model.isEmpty(rectanglePDiagonalWET)) {
                    rectanglePDiagonalWET.setError("Enter Value");
                } else {
                    double length, width, rectangleDiaognal;
                    length = Double.parseDouble(rectanglePDiagonalLET.getText().toString());
                    width = Double.parseDouble(rectanglePDiagonalWET.getText().toString());
                    if (length <= 0) {
                        rectanglePDiagonalAnswerTV.setText("The variable l should be positive");
                    } else if (width<= 0) {
                        rectanglePDiagonalAnswerTV.setText("The variable w should be positive");
                    } else {
                        rectangleDiaognal = Math.sqrt((Math.pow(width,2))+(Math.pow(length,2)));
                        rectanglePDiagonalAnswerTV.setText(String.format("%.02f", rectangleDiaognal));
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
