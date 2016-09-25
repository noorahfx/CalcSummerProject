package calcpa.calcsummerproject.Geometry.Octagon;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import calcpa.calcsummerproject.Model;
import calcpa.calcsummerproject.R;

public class OctagonActivity extends AppCompatActivity {


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


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_octagon);
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


        outState.putString("perimeter_et", octPerimeterSideAET.getText().toString());
        outState.putString("perimeter_tv", octPerimeterAnswerTV.getText().toString());
        outState.putString("area_et", octAreaSideAET.getText().toString());
        outState.putString("area_tv", octAreaAnswerTV.getText().toString());
        outState.putString("side_et", octSideAET.getText().toString());
        outState.putString("side_tv", octSideAAnswerTV.getText().toString());


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        octPerimeterSideAET.setText(savedInstanceState.getString("perimeter_et"));
        octPerimeterAnswerTV.setText(savedInstanceState.getString("perimeter_tv"));
        octAreaSideAET.setText(savedInstanceState.getString("area_et"));
        octAreaAnswerTV.setText(savedInstanceState.getString("area_tv"));
        octSideAET.setText(savedInstanceState.getString("side_et"));
        octSideAAnswerTV.setText(savedInstanceState.getString("side_tv"));

    }



    private void setPerimeterResource() {


        octPerimeterSideAET = (EditText) findViewById(R.id.oct_perimeter_side_a_et);
        octPerimeterAnswerTV = (TextView) findViewById(R.id.oct_perimeter_calc_answer_tx);
        octPerimeterCalcButton = (Button) findViewById(R.id.oct_perimeter_calc_button);
        octPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(octPerimeterSideAET)) {
                    octPerimeterSideAET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
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


        // Perimeter Clear button
        octPerimeterClearButton = (Button) findViewById(R.id.oct_perimeter_clear_button);
        octPerimeterClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                octPerimeterSideAET.setText("");
                octPerimeterAnswerTV.setText("");
            }
        });


    }

    private void setAreaResource() {
        //Area
        octAreaSideAET = (EditText) findViewById(R.id.oct_area_side_a_et);
        octAreaAnswerTV = (TextView) findViewById(R.id.oct_area_calc_answer_tx);
        octAreaCalcButton = (Button) findViewById(R.id.oct_area_calc_button);
        octAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(octAreaSideAET)) {
                    octAreaSideAET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));

                } else {
                    double aSide, octtagonArea;
                    aSide = Double.parseDouble(octAreaSideAET.getText().toString());
                    if (aSide <= 0) {
                        octAreaAnswerTV.setText("The variable a should be positive");
                    }
                    octtagonArea = 2 * (1 + Math.sqrt(2)) * Math.pow(aSide, 2);
                    octAreaAnswerTV.setText(String.format("%.02f", octtagonArea));
                }
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


    }

    private void setSideResource() {
        octSideAET = (EditText) findViewById(R.id.oct_side_et);
        octSideAAnswerTV = (TextView) findViewById(R.id.oct_side_calc_answer_tx);
        octSideACalcButton = (Button) findViewById(R.id.oct_side_calc_button);
        octSideACalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(octSideAET)) {
                    octSideAET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));


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

        // Area Clear button
        octSideAClearButton = (Button) findViewById(R.id.oct_side_clear_button);
        octSideAClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                octSideAET.setText("");
                octSideAAnswerTV.setText("");
            }
        });


    }

    private void setFontResource() {

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");

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




}
