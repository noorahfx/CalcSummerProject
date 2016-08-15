package calcpa.calcsummerproject.Geometry.Heptagon;

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

public class Heptagon extends AppCompatActivity {

    MathView hepPerimeterFormula;
    String perimeterFormula ="$$A=\\pi r^{2}$$";

    MathView hepAreaFormula;
    String areaFormula ="$$d =2r$$";

    MathView hepSideFormula;
    String sideFormula ="$$C =2\\pi r$$";

    
    //perimeter
    EditText hepPerimeterSideAET;
    TextView hepPerimeterAnswerTV;
    Button hepPerimeterCalcButton;
    Button hepPerimeterClearButton;

    //area
    EditText hepAreaSideAET;
    TextView hepAreaAnswerTV;
    Button hepAreaCalcButton;
    Button hepAreaClearButton;

    //side A
    EditText hepSideAET;
    TextView hepSideAAnswerTV;
    Button hepSideACalcButton;
    Button hepSideAClearButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heptagon);

        hepPerimeterFormula =(MathView)findViewById(R.id.hep_perimeter_formula);
        assert hepPerimeterFormula != null;
        hepPerimeterFormula.setText(perimeterFormula);

        hepAreaFormula =(MathView)findViewById(R.id.hep_area_formula);
        assert hepAreaFormula != null;
        hepAreaFormula.setText(areaFormula);


        hepSideFormula =(MathView)findViewById(R.id.hep_side_formula);
        assert hepSideFormula != null;
        hepSideFormula.setText(sideFormula);


        
        // Perimeter Clear button
        hepPerimeterClearButton = (Button) findViewById(R.id.hep_perimeter_clear_button);
        hepPerimeterClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hepPerimeterSideAET.setText("");
                hepPerimeterAnswerTV.setText("");
            }
        });

        // Area Clear button
        hepAreaClearButton = (Button) findViewById(R.id.hep_area_clear_button);
        hepAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hepAreaSideAET.setText("");
                hepAreaAnswerTV.setText("");
            }
        });

        // Side A button
        hepSideAClearButton = (Button) findViewById(R.id.hep_side_clear_button);
        hepSideAClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hepSideAET.setText("");
                hepSideAAnswerTV.setText("");

            }
        });


        hepPerimeterSideAET = (EditText) findViewById(R.id.hep_perimeter_side_a_et);
        hepPerimeterAnswerTV = (TextView) findViewById(R.id.hep_perimeter_calc_answer_tx);
        hepPerimeterCalcButton = (Button) findViewById(R.id.hep_perimeter_calc_button);
        hepPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(hepPerimeterSideAET)) {
                    hepPerimeterSideAET.setError("Enter Value");
                } else {
                    double aSide, heptagonPerimeter;
                    aSide = Double.parseDouble(hepPerimeterSideAET.getText().toString());
                    if (aSide <= 0) {
                        hepPerimeterAnswerTV.setText("The variable a should be positive");
                    }
                    heptagonPerimeter = 7 * aSide;
                    hepPerimeterAnswerTV.setText(String.format("%.02f", heptagonPerimeter));
                }
            }
        });
//Area
        hepAreaSideAET = (EditText) findViewById(R.id.hep_area_side_a_et);
        hepAreaAnswerTV = (TextView) findViewById(R.id.hep_area_calc_answer_tx);
        hepAreaCalcButton = (Button) findViewById(R.id.hep_area_calc_button);
        hepAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(hepAreaSideAET)) {
                    hepAreaSideAET.setError("Enter Value");

                } else {
                    double aSide, heptagonArea;
                    aSide = Double.parseDouble(hepAreaSideAET.getText().toString());
                    if (aSide <= 0) {
                        hepAreaAnswerTV.setText("The variable a should be positive");
                    }
                    heptagonArea = (1.75) * Math.pow(aSide, 2) * (1 / Math.tan(Math.toRadians(180) / 7));
                    hepAreaAnswerTV.setText(String.format("%.02f", heptagonArea));
                }
            }
        });

        hepSideAET = (EditText) findViewById(R.id.hep_side_et);
        hepSideAAnswerTV = (TextView) findViewById(R.id.hep_side_calc_answer_tx);
        hepSideACalcButton = (Button) findViewById(R.id.hep_side_calc_button);
        hepSideACalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(hepSideAET)) {
                    hepSideAET.setError("Enter Value");

                } else {
                    double perimeter, hepSideA;
                    perimeter = Double.parseDouble(hepSideAET.getText().toString());
                    if (perimeter <= 0) {
                        hepSideAAnswerTV.setText("The variable p should be positive");
                    }
                    hepSideA = perimeter / 7;
                    hepSideAAnswerTV.setText(String.format("%.02f", hepSideA));
                }
            }
        });


        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),  "OptimusPrinceps.ttf");

        TextView myTextView = (TextView) findViewById(R.id.hep_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.hep_perimeter_side_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.hep_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.hep_area_side_a_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.hep_side_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.hep_side_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        hepPerimeterSideAET.setTypeface(myTypeFace);
        hepPerimeterAnswerTV.setTypeface(myTypeFace);
        hepPerimeterCalcButton.setTypeface(myTypeFace);
        hepPerimeterClearButton.setTypeface(myTypeFace);

        hepAreaSideAET.setTypeface(myTypeFace);
        hepAreaAnswerTV.setTypeface(myTypeFace);
        hepAreaCalcButton.setTypeface(myTypeFace);
        hepAreaClearButton.setTypeface(myTypeFace);

        hepSideAET.setTypeface(myTypeFace);
        hepSideAAnswerTV.setTypeface(myTypeFace);
        hepSideACalcButton.setTypeface(myTypeFace);
        hepSideAClearButton.setTypeface(myTypeFace);


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
