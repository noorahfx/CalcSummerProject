package calcpa.calcsummerproject.Geometry.Octagon;

import android.content.res.Configuration;
import android.graphics.Typeface;
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
import io.github.kexanie.library.MathView;

public class Octagon extends AppCompatActivity {


    MathView octPerimeterFormula;
    String perimeterFormula ="$$A=\\pi r^{2}$$";

    MathView octAreaFormula;
    String areaFormula ="$$d =2r$$";

    MathView octSideFormula;
    String sideFormula ="$$C =2\\pi r$$";

    
    //perimeter
    EditText octPerimeterSideAET;
    TextView octPerimeterAnswerTV;
    Button octPerimeterCalcButton;
    Button octPerimeterClearButton;

    //area
    EditText octAreaSideAET;
    TextView octAreaAnswerTV;
    Button octAreaCalcButton;
    Button octAreaClearButton;

    //side A
    EditText octSideAET;
    TextView octSideAAnswerTV;
    Button octSideACalcButton;
    Button octSideAClearButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octagon);


        octPerimeterFormula =(MathView)findViewById(R.id.oct_perimeter_formula);
        assert octPerimeterFormula != null;
        octPerimeterFormula.setText(perimeterFormula);

        octAreaFormula =(MathView)findViewById(R.id.oct_area_formula);
        assert octAreaFormula != null;
        octAreaFormula.setText(areaFormula);


        octSideFormula =(MathView)findViewById(R.id.oct_side_formula);
        assert octSideFormula != null;
        octSideFormula.setText(sideFormula);



        // Perimeter Clear button
        octPerimeterClearButton = (Button) findViewById(R.id.oct_perimeter_clear_button);
        octPerimeterClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                octPerimeterSideAET.setText("");
                octPerimeterAnswerTV.setText("");
            }
        });

        // Area Clear button
        octAreaClearButton = (Button) findViewById(R.id.oct_area_clear_button);
        octAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                octAreaSideAET.setText("");
                octAreaAnswerTV.setText("");
            }
        });

        // Area Clear button
        octSideAClearButton = (Button) findViewById(R.id.oct_side_clear_button);
        octSideAClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                octSideAET.setText("");
                octSideAAnswerTV.setText("");
            }
        });

        octPerimeterSideAET = (EditText) findViewById(R.id.oct_perimeter_side_a_et);
        octPerimeterAnswerTV = (TextView) findViewById(R.id.oct_perimeter_calc_answer_tx);
        octPerimeterCalcButton = (Button) findViewById(R.id.oct_perimeter_calc_button);
        octPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(octPerimeterSideAET)) {
                    octPerimeterSideAET.setError("Enter Value");
                } else {
                    double aSide, octtagonPerimeter;
                    aSide = Double.parseDouble(octPerimeterSideAET.getText().toString());
                    if (aSide <= 0) {
                        octPerimeterAnswerTV.setText("The variable a should be positive");
                    }
                    octtagonPerimeter = 8 * aSide;
                    octPerimeterAnswerTV.setText(String.format("%.02f", octtagonPerimeter));
                }
            }
        });
//Area
        octAreaSideAET = (EditText) findViewById(R.id.oct_area_side_a_et);
        octAreaAnswerTV = (TextView) findViewById(R.id.oct_area_calc_answer_tx);
        octAreaCalcButton = (Button) findViewById(R.id.oct_area_calc_button);
        octAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(octAreaSideAET)) {
                    octAreaSideAET.setError("Enter Value");

                } else {
                    double aSide, octtagonArea;
                    aSide = Double.parseDouble(octAreaSideAET.getText().toString());
                    if (aSide <= 0) {
                        octAreaAnswerTV.setText("The variable a should be positive");
                    }
                    octtagonArea = 2*(1+Math.sqrt(2))*Math.pow(aSide,2);
                    octAreaAnswerTV.setText(String.format("%.02f", octtagonArea));
                }
            }
        });

        octSideAET = (EditText) findViewById(R.id.oct_side_et);
        octSideAAnswerTV = (TextView) findViewById(R.id.oct_side_calc_answer_tx);
        octSideACalcButton = (Button) findViewById(R.id.oct_side_calc_button);
        octSideACalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(octSideAET)) {
                    octSideAET.setError("Enter Value");

                } else {
                    double perimeter, octSideA;
                    perimeter = Double.parseDouble(octSideAET.getText().toString());
                    if (perimeter <= 0) {
                        octSideAAnswerTV.setText("The variable a should be positive");
                    }
                    octSideA = perimeter / 8;
                    octSideAAnswerTV.setText(String.format("%.02f", octSideA));
                }
            }
        });




        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),  "OptimusPrinceps.ttf");

        TextView myTextView = (TextView) findViewById(R.id.oct_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.oct_perimeter_side_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.oct_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.oct_area_side_a_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.oct_side_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.oct_side_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        octPerimeterSideAET.setTypeface(myTypeFace);
        octPerimeterAnswerTV.setTypeface(myTypeFace);
        octPerimeterCalcButton.setTypeface(myTypeFace);
        octPerimeterClearButton.setTypeface(myTypeFace);

        octAreaSideAET.setTypeface(myTypeFace);
        octAreaAnswerTV.setTypeface(myTypeFace);
        octAreaCalcButton.setTypeface(myTypeFace);
        octAreaClearButton.setTypeface(myTypeFace);

        octSideAET.setTypeface(myTypeFace);
        octSideAAnswerTV.setTypeface(myTypeFace);
        octSideACalcButton.setTypeface(myTypeFace);
        octSideAClearButton.setTypeface(myTypeFace);

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
