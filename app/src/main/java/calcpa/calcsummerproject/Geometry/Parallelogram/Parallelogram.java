package calcpa.calcsummerproject.Geometry.Parallelogram;

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
                //check to make sure field is not empty
                if (Model.isEmpty(parallelogramPerimeterBaseET)) {
                    parallelogramPerimeterBaseET.setError("Enter Value");
                } else if (Model.isEmpty(parallelogramPerimeterAreaET)) {
                    parallelogramPerimeterAreaET.setError("Enter Value");
                } else {
                    double base, aSide, paralPerim;
                    base = Double.parseDouble(parallelogramPerimeterBaseET.getText().toString());
                    aSide = Double.parseDouble(parallelogramPerimeterAreaET.getText().toString());
                    if (base <= 0) {
                        parallelogramPerimeterAreaET.setText("The variable b should be positive");
                    } else if (aSide <= 0) {
                        parallelogramPerimeterAreaET.setText("The variable A should be positive");
                    } else {
                        paralPerim = 2 * (aSide + base);
                        parallelogramPerimeterAreaET.setText(String.format("%.02f", paralPerim));
                    }

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
                //check to make sure field is not empty
                if (Model.isEmpty(parallelogramAreaBaseET)) {
                    parallelogramAreaBaseET.setError("Enter Value");
                } else if (Model.isEmpty(parallelogramAreaHeightET)) {
                    parallelogramAreaHeightET.setError("Enter Value");
                }else {
                    double base, height, paralArea;
                    base = Double.parseDouble(parallelogramAreaBaseET.getText().toString());
                    height = Double.parseDouble(parallelogramAreaHeightET.getText().toString());
                    if (base <= 0) {
                        parallelogramAreaAnswerTV.setText("The variable b should be positive");
                    } else if (height <= 0) {
                        parallelogramAreaAnswerTV.setText("The variable h should be positive");
                    } else {
                        paralArea = base * height;
                        parallelogramAreaAnswerTV.setText(String.format("%.02f", paralArea));
                    }
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
                //check to make sure field is not empty
                if (Model.isEmpty(parallelogramBaseSideET)) {
                    parallelogramBaseSideET.setError("Enter Value");
                } else if (Model.isEmpty(parallelogramBasePerimeterET)) {
                    parallelogramBasePerimeterET.setError("Enter Value");
                }else {
                    double area, height, paralBase;
                    height = Double.parseDouble(parallelogramBaseSideET.getText().toString());
                    area = Double.parseDouble(parallelogramBasePerimeterET.getText().toString());
                    if (area <= 0) {
                        parallelogramBaseAnswerTV.setText("The variable A should be positive");
                    } else if (height <= 0) {
                        parallelogramBaseAnswerTV.setText("The variable h should be positive");
                    } else {
                        paralBase = area / height;
                        parallelogramBaseAnswerTV.setText(String.format("%.02f", paralBase));
                    }

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
                //check to make sure field is not empty
                if (Model.isEmpty(parallelogramHeightBaseET)) {
                    parallelogramHeightBaseET.setError("Enter Value");
                } else if (Model.isEmpty(parallelogramHeightAreaET)) {
                    parallelogramHeightAreaET.setError("Enter Value");
                }else {
                    double area, base, paralHeight;
                    base = Double.parseDouble(parallelogramHeightBaseET.getText().toString());
                    area = Double.parseDouble(parallelogramHeightAreaET.getText().toString());
                    if (area <= 0) {
                        parallelogramHeightAnswerTV.setText("The variable A should be positive");
                    } else if (base <= 0) {
                        parallelogramHeightAnswerTV.setText("The variable b should be positive");
                    } else {
                        paralHeight = area / base;
                        parallelogramHeightAnswerTV.setText(String.format("%.02f", paralHeight));
                    }
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

                //check to make sure field is not empty
                if (Model.isEmpty(parallelogramSideBaseET)) {
                    parallelogramSideBaseET.setError("Enter Value");
                } else if (Model.isEmpty(parallelogramSidePerimeterET)) {
                    parallelogramSidePerimeterET.setError("Enter Value");
                }else {
                    double base, perimeter, paralSides;
                    base = Double.parseDouble(parallelogramSideBaseET.getText().toString());
                    perimeter = Double.parseDouble(parallelogramSidePerimeterET.getText().toString());
                    if (base <= 0) {
                        parallelogramSideAnswerTV.setText("The variable b should be positive");
                    } else if (perimeter <= 0) {
                        parallelogramSideAnswerTV.setText("The variable P should be positive");
                    } else if (perimeter <= (2 * base)) {
                        parallelogramSideAnswerTV.setText("Invalid input: Make sure P>2*b");
                    } else {
                        paralSides = (perimeter / 2) - base;
                        parallelogramSideAnswerTV.setText(String.format("%.02f", paralSides));
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
