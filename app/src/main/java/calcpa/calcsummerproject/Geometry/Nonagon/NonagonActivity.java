package calcpa.calcsummerproject.Geometry.Nonagon;

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

public class NonagonActivity extends AppCompatActivity {


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


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_nonagon);
        // getSupportActionBar().setIcon(R.drawable.back_button_tb);
        //enable button in toolbar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setPerimeterResource();
        setAreaResource();
        setSideResource();
        setFontResource();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


        outState.putString("perimeter_et", nonPerimeterSideAET.getText().toString());
        outState.putString("perimeter_tv", nonPerimeterAnswerTV.getText().toString());
        outState.putString("area_et", nonAreaSideAET.getText().toString());
        outState.putString("area_tv", nonAreaAnswerTV.getText().toString());
        outState.putString("side_et", nonSideAET.getText().toString());
        outState.putString("side_tv", nonSideAAnswerTV.getText().toString());


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        nonPerimeterSideAET.setText(savedInstanceState.getString("perimeter_et"));
        nonPerimeterAnswerTV.setText(savedInstanceState.getString("perimeter_tv"));
        nonAreaSideAET.setText(savedInstanceState.getString("area_et"));
        nonAreaAnswerTV.setText(savedInstanceState.getString("area_tv"));
        nonSideAET.setText(savedInstanceState.getString("side_et"));
        nonSideAAnswerTV.setText(savedInstanceState.getString("side_tv"));

    }

    private void setPerimeterResource() {
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


        // Perimeter Clear button
        nonPerimeterClearButton = (Button) findViewById(R.id.non_perimeter_clear_button);
        nonPerimeterClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nonPerimeterSideAET.setText("");
                nonPerimeterAnswerTV.setText("");
            }
        });


    }

    private void setAreaResource() {
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

        // Area Clear button
        nonAreaClearButton = (Button) findViewById(R.id.non_area_clear_button);
        nonAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nonAreaSideAET.setText("");
                nonAreaAnswerTV.setText("");
            }
        });


    }

    private void setSideResource() {
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

        // Clear button
        nonSideAClearButton = (Button) findViewById(R.id.non_side_clear_button);
        nonSideAClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nonSideAET.setText("");
                nonSideAAnswerTV.setText("");
            }
        });

    }

    private void setFontResource() {

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");

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




}

