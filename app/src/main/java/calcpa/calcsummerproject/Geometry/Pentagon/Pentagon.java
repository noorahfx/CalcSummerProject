package calcpa.calcsummerproject.Geometry.Pentagon;

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

public class Pentagon extends AppCompatActivity {

    //perimeter
    EditText penPerimeterSideAET;
    TextView penPerimeterAnswerTV;
    Button penPerimeterCalcButton;
    Button penPerimeterClearButton;

    //area
    EditText penAreaSideAET;
    TextView penAreaAnswerTV;
    Button penAreaCalcButton;
    Button penAreaClearButton;

    //side A
    EditText penSideAET;
    TextView penSideAAnswerTV;
    Button penSideACalcButton;
    Button penSideAClearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pentagon);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_pentagon);
        // getSupportActionBar().setIcon(R.drawable.back_button_tb);
        //enable button in toolbar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        perimeterResource();
        areaResource();
        sideResource();
        fontResource();


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


        outState.putString("perimeter_et", penPerimeterSideAET.getText().toString());
        outState.putString("perimeter_tv", penPerimeterAnswerTV.getText().toString());
        outState.putString("area_et", penAreaSideAET.getText().toString());
        outState.putString("area_tv", penAreaAnswerTV.getText().toString());
        outState.putString("side_et", penSideAET.getText().toString());
        outState.putString("side_tv", penSideAAnswerTV.getText().toString());


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        penPerimeterSideAET.setText(savedInstanceState.getString("perimeter_et"));
        penPerimeterAnswerTV.setText(savedInstanceState.getString("perimeter_tv"));
        penAreaSideAET.setText(savedInstanceState.getString("area_et"));
        penAreaAnswerTV.setText(savedInstanceState.getString("area_tv"));
        penSideAET.setText(savedInstanceState.getString("side_et"));
        penSideAAnswerTV.setText(savedInstanceState.getString("side_tv"));

    }


    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }


    private void perimeterResource() {

        penPerimeterSideAET = (EditText) findViewById(R.id.pen_perimeter_side_a_et);
        penPerimeterAnswerTV = (TextView) findViewById(R.id.pen_perimeter_calc_answer_tx);
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


        // Perimeter Clear button
        penPerimeterClearButton = (Button) findViewById(R.id.pen_perimeter_clear_button);
        penPerimeterClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                penPerimeterSideAET.setText("");
                penPerimeterAnswerTV.setText("");
            }
        });


    }

    private void areaResource() {

        //Area
        penAreaSideAET = (EditText) findViewById(R.id.pen_area_side_a_et);
        penAreaAnswerTV = (TextView) findViewById(R.id.pen_area_calc_answer_tx);
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
                    pentagonArea = (.25) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(aSide, 2);
                    penAreaAnswerTV.setText(String.format("%.02f", pentagonArea));
                }
            }
        });


        // Area Clear button
        penAreaClearButton = (Button) findViewById(R.id.pen_area_clear_button);
        penAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                penAreaSideAET.setText("");
                penAreaAnswerTV.setText("");
            }
        });

    }

    private void sideResource() {
        penSideAET = (EditText) findViewById(R.id.pen_side_et);
        penSideAAnswerTV = (TextView) findViewById(R.id.pen_side_calc_answer_tx);
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

        // Side A Clear button
        penSideAClearButton = (Button) findViewById(R.id.pen_side_clear_button);
        penSideAClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                penSideAET.setText("");
                penSideAAnswerTV.setText("");
            }
        });


    }

    private void fontResource() {
        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");

        TextView myTextView = (TextView) findViewById(R.id.pen_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.pen_perimeter_side_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.pen_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.pen_area_side_a_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.pen_side_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.pen_side_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        penPerimeterSideAET.setTypeface(myTypeFace);
        penPerimeterAnswerTV.setTypeface(myTypeFace);
        penPerimeterCalcButton.setTypeface(myTypeFace);
        penPerimeterClearButton.setTypeface(myTypeFace);

        penAreaSideAET.setTypeface(myTypeFace);
        penAreaAnswerTV.setTypeface(myTypeFace);
        penAreaCalcButton.setTypeface(myTypeFace);
        penAreaClearButton.setTypeface(myTypeFace);

        penSideAET.setTypeface(myTypeFace);
        penSideAAnswerTV.setTypeface(myTypeFace);
        penSideACalcButton.setTypeface(myTypeFace);
        penSideAClearButton.setTypeface(myTypeFace);

    }


}
