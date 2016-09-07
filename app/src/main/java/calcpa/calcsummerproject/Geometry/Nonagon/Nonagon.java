package calcpa.calcsummerproject.Geometry.Nonagon;

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

public class Nonagon extends AppCompatActivity {


    //perimeter
    EditText nonPerimeterSideAET;
    TextView nonPerimeterAnswerTV;
    Button nonPerimeterCalcButton;
    Button nonPerimeterClearButton;

    //area
    EditText nonAreaSideAET;
    TextView nonAreaAnswerTV;
    Button nonAreaCalcButton;
    Button nonAreaClearButton;

    //side A
    EditText nonSideAET;
    TextView nonSideAAnswerTV;
    Button nonSideACalcButton;
    Button nonSideAClearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonagon);




        // Perimeter Clear button
        nonPerimeterClearButton = (Button) findViewById(R.id.non_perimeter_clear_button);
        nonPerimeterClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nonPerimeterSideAET.setText("");
                nonPerimeterAnswerTV.setText("");
            }
        });

        // Area Clear button
        nonAreaClearButton = (Button) findViewById(R.id.non_area_clear_button);
        nonAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nonAreaSideAET.setText("");
                nonAreaAnswerTV.setText("");
            }
        });

        // Area Clear button
        nonSideAClearButton = (Button) findViewById(R.id.non_side_clear_button);
        nonSideAClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nonSideAET.setText("");
                nonSideAAnswerTV.setText("");
            }
        });

        nonPerimeterSideAET = (EditText) findViewById(R.id.non_perimeter_side_a_et);
        nonPerimeterAnswerTV = (TextView) findViewById(R.id.non_perimeter_calc_answer_tx);
        nonPerimeterCalcButton = (Button) findViewById(R.id.non_perimeter_calc_button);
        nonPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(nonPerimeterSideAET)) {
                    nonPerimeterSideAET.setError("Enter Value");
                } else {
                    double aSide, nontagonPerimeter;
                    aSide = Double.parseDouble(nonPerimeterSideAET.getText().toString());
                    if (aSide <= 0) {
                        nonPerimeterAnswerTV.setText("The variable a should be positive");
                    }
                    nontagonPerimeter = 9 * aSide;
                    nonPerimeterAnswerTV.setText(String.format("%.02f", nontagonPerimeter));
                }
            }
        });
//Area
        nonAreaSideAET = (EditText) findViewById(R.id.non_area_side_a_et);
        nonAreaAnswerTV = (TextView) findViewById(R.id.non_area_calc_answer_tx);
        nonAreaCalcButton = (Button) findViewById(R.id.non_area_calc_button);
        nonAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(nonAreaSideAET)) {
                    nonAreaSideAET.setError("Enter Value");

                } else {
                    double aSide, nontagonArea;
                    aSide = Double.parseDouble(nonAreaSideAET.getText().toString());
                    if (aSide <= 0) {
                        nonAreaAnswerTV.setText("The variable a should be positive");
                    }
                    nontagonArea = (2.25) * Math.pow(aSide, 2) *
                            (1 / Math.tan(Math.toRadians(180) / 9));
                    nonAreaAnswerTV.setText(String.format("%.02f", nontagonArea));
                }
            }
        });

        nonSideAET = (EditText) findViewById(R.id.non_side_et);
        nonSideAAnswerTV = (TextView) findViewById(R.id.non_side_calc_answer_tx);
        nonSideACalcButton = (Button) findViewById(R.id.non_side_calc_button);
        nonSideACalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(nonSideAET)) {
                    nonSideAET.setError("Enter Value");

                } else {
                    double perimeter, nonSideA;
                    perimeter = Double.parseDouble(nonSideAET.getText().toString());
                    if (perimeter <= 0) {
                        nonAreaAnswerTV.setText("The variable p should be positive");
                    }
                    nonSideA = perimeter / 9;
                    nonSideAAnswerTV.setText(String.format("%.02f", nonSideA));
                }
            }
        });




        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),  "OptimusPrinceps.ttf");

        TextView myTextView = (TextView) findViewById(R.id.non_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.non_perimeter_side_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.non_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.non_area_side_a_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.non_side_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.non_side_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        nonPerimeterSideAET.setTypeface(myTypeFace);
        nonPerimeterAnswerTV.setTypeface(myTypeFace);
        nonPerimeterCalcButton.setTypeface(myTypeFace);
        nonPerimeterClearButton.setTypeface(myTypeFace);

        nonAreaSideAET.setTypeface(myTypeFace);
        nonAreaAnswerTV.setTypeface(myTypeFace);
        nonAreaCalcButton.setTypeface(myTypeFace);
        nonAreaClearButton.setTypeface(myTypeFace);

        nonSideAET.setTypeface(myTypeFace);
        nonSideAAnswerTV.setTypeface(myTypeFace);
        nonSideACalcButton.setTypeface(myTypeFace);
        nonSideAClearButton.setTypeface(myTypeFace);

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

