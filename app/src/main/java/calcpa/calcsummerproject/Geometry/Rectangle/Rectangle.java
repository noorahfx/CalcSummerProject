package calcpa.calcsummerproject.Geometry.Rectangle;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import calcpa.calcsummerproject.Model;
import calcpa.calcsummerproject.R;
import io.github.kexanie.library.MathView;

public class Rectangle extends AppCompatActivity {

    //Perimeter
    EditText rectanglePerimeterLET;
    EditText rectanglePerimeterWET;
    TextView rectanglePerimeterAnswerTV;
    Button rectanglePerimeterCalcButton;
    Button rectanglePerimClearButton;

    //Area
    EditText rectangleAreaLET;
    EditText rectangleAreaWET;
    TextView rectangleAreaAnswerTV;
    Button rectangleAreaCalcButton;
    Button rectangleAreaClearButton;


    //Length
    EditText rectangleLengthWET;
    EditText rectangleLengthPET;
    TextView rectangleLengthAnswerTV;
    Button rectangleLengthCalcButton;
    Button rectangleLengthClearButton;


    //Width
    EditText rectangleWidthLET;
    EditText rectangleWidthPET;
    TextView rectangleWidthAnswerTV;
    Button rectangleWidthCalcButton;
    Button rectangleWidthClearButton;



    //Diagonal P
    EditText rectanglePDiagonalLET;
    EditText rectanglePDiagonalWET;
    TextView rectanglePDiagonalAnswerTV;
    Button rectanglePDiagonalCalcButton;
    Button rectanglepDiagonalClearButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    perimeterResource();
        areaResource();
        widthResource();
        lengthResource();
        fontResource();
        diagonalPResource();




    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("perimeter_et1", rectanglePerimeterLET.getText().toString());
        outState.putString("perimeter_et2", rectanglePerimeterWET.getText().toString());
        outState.putString("perimeter_tv", rectanglePerimeterAnswerTV.getText().toString());
        outState.putString("area_et1", rectangleAreaLET.getText().toString());
        outState.putString("area_et2", rectangleAreaWET.getText().toString());
        outState.putString("area_tv", rectangleAreaAnswerTV.getText().toString());
        outState.putString("length_et1", rectangleLengthWET.getText().toString());
        outState.putString("length_et2", rectangleLengthPET.getText().toString());
        outState.putString("length_tv", rectangleLengthAnswerTV.getText().toString());
        outState.putString("width_et1", rectangleWidthLET.getText().toString());
        outState.putString("width_et2", rectangleWidthPET.getText().toString());
        outState.putString("width_tv", rectangleWidthAnswerTV.getText().toString());
        outState.putString("pdiagonal_et1", rectanglePDiagonalLET.getText().toString());
        outState.putString("pdiagonal_et2", rectanglePDiagonalWET.getText().toString());
        outState.putString("pdiagonal_tv", rectanglePDiagonalAnswerTV.getText().toString());

    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        rectanglePerimeterLET.setText(savedInstanceState.getString("perimeter_et1"));
        rectanglePerimeterWET.setText(savedInstanceState.getString("perimeter_et2"));
        rectanglePerimeterAnswerTV.setText(savedInstanceState.getString("perimeter_tv"));
        rectangleAreaLET.setText(savedInstanceState.getString("area_et1"));
        rectangleAreaWET.setText(savedInstanceState.getString("area_et2"));
        rectangleAreaAnswerTV.setText(savedInstanceState.getString("area_tv"));
        rectangleLengthWET.setText(savedInstanceState.getString("length_et1"));
        rectangleLengthPET.setText(savedInstanceState.getString("length_et2"));
        rectangleLengthAnswerTV.setText(savedInstanceState.getString("length_tv"));
        rectangleWidthLET.setText(savedInstanceState.getString("width_et1"));
        rectangleWidthPET.setText(savedInstanceState.getString("width_et2"));
        rectangleWidthAnswerTV.setText(savedInstanceState.getString("width_tv"));
        rectanglePDiagonalLET.setText(savedInstanceState.getString("pdiagonal_et1"));
        rectanglePDiagonalWET.setText(savedInstanceState.getString("pdiagonal_et2"));
        rectanglePDiagonalAnswerTV.setText(savedInstanceState.getString("pdiagonal_tv"));

    }

    private void perimeterResource(){

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


        // Perimeter Clear button
        rectanglePerimClearButton = (Button) findViewById(R.id.rectangle_perimeter_clear_button);
        rectanglePerimClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rectanglePerimeterLET.setText("");
                rectanglePerimeterWET.setText("");
                rectanglePerimeterAnswerTV.setText("");
            }
        });



    }

    private void areaResource(){
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

        // Area Clear button
        rectangleAreaClearButton = (Button) findViewById(R.id.rectangle_area_clear_button);
        rectangleAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rectangleAreaLET.setText("");
                rectangleAreaWET.setText("");
                rectangleAreaAnswerTV.setText("");
            }
        });




    }

    private void lengthResource(){
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

        // Length Clear button
        rectangleLengthClearButton = (Button) findViewById(R.id.rectangle_length_clear_button);
        rectangleLengthClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rectangleLengthWET.setText("");
                rectangleLengthPET.setText("");
                rectangleLengthAnswerTV.setText("");
            }
        });


    }

    private void widthResource(){
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

        // Width Clear button
        rectangleWidthClearButton = (Button) findViewById(R.id.rectangle_width_clear_button);
        rectangleWidthClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rectangleWidthLET.setText("");
                rectangleWidthPET.setText("");
                rectangleWidthClearButton.setText("");
            }
        });



    }

    private void diagonalPResource(){
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

        // Width Clear button
        rectanglepDiagonalClearButton = (Button) findViewById(R.id.rectangle_diagonal_clear_button);
        rectanglepDiagonalClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rectanglePDiagonalLET.setText("");
                rectanglePDiagonalWET.setText("");
                rectanglePDiagonalAnswerTV.setText("");
            }
        });



    }

    private void fontResource(){

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");

        TextView myTextView = (TextView) findViewById(R.id.rectangle_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rectangle_perimeter_length_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rectangle_perimeter_width_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rectangle_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rectangle_area_length_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rectangle_area_width_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rectangle_length_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rectangle_length_width_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rectangle_length_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rectangle_width_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rectangle_width_length_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rectangle_width_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rectangle_diagonal_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rectangle_diagonal_length_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rectangle_diagonal_width_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        rectanglePerimeterLET.setTypeface(myTypeFace);
        rectanglePerimeterWET.setTypeface(myTypeFace);
        rectanglePerimeterAnswerTV.setTypeface(myTypeFace);
        rectanglePerimeterCalcButton.setTypeface(myTypeFace);
        rectanglePerimClearButton.setTypeface(myTypeFace);

        rectangleAreaLET.setTypeface(myTypeFace);
        rectangleAreaWET.setTypeface(myTypeFace);
        rectangleAreaAnswerTV.setTypeface(myTypeFace);
        rectangleAreaCalcButton.setTypeface(myTypeFace);
        rectangleAreaClearButton.setTypeface(myTypeFace);

        rectangleLengthWET.setTypeface(myTypeFace);
        rectangleLengthPET.setTypeface(myTypeFace);
        rectangleLengthAnswerTV.setTypeface(myTypeFace);
        rectangleLengthCalcButton.setTypeface(myTypeFace);
        rectangleLengthClearButton.setTypeface(myTypeFace);

        rectangleWidthLET.setTypeface(myTypeFace);
        rectangleWidthPET.setTypeface(myTypeFace);
        rectangleWidthAnswerTV.setTypeface(myTypeFace);
        rectangleWidthCalcButton.setTypeface(myTypeFace);
        rectangleWidthClearButton.setTypeface(myTypeFace);

        rectanglePDiagonalLET.setTypeface(myTypeFace);
        rectanglePDiagonalWET.setTypeface(myTypeFace);
        rectanglePDiagonalAnswerTV.setTypeface(myTypeFace);
        rectanglePDiagonalCalcButton.setTypeface(myTypeFace);
        rectanglepDiagonalClearButton.setTypeface(myTypeFace);


    }


    @Override
    public void onStart(){
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    public void onStop(){
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
    }



}
