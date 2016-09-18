package calcpa.calcsummerproject.Geometry.Triangle.TypesOfTriangle;

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

public class EquilateralTriangle extends AppCompatActivity {




    EditText sideAEditText;
    TextView answerEditText;
    Button calculateResultButton;
    Button calculateClearButton;


    // area
    EditText areaSideAET;
    TextView areaAnswerTV;
    Button calculateAreaButton;
    Button calculateAreaClearButton;


    // side A calculator
    EditText sideAAreaET;
    TextView sideAAnswerTV;
    Button calculateSideAButton;
    Button calculateSideClearButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equilateral_triangle);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_equilateral_triangle);
        // getSupportActionBar().setIcon(R.drawable.back_button_tb);
        //enable button in toolbar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        perimeterResource();
        areaResource();
        sideAResource();
        fontResource();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("perimeter_et", sideAEditText.getText().toString());
        outState.putString("perimeter_tv", answerEditText.getText().toString());
        outState.putString("area_et", areaSideAET.getText().toString());
        outState.putString("area_tv", areaAnswerTV.getText().toString());
        outState.putString("side_et", sideAAreaET.getText().toString());
        outState.putString("side_tv", sideAAnswerTV.getText().toString());


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        sideAEditText.setText(savedInstanceState.getString("perimeter_et"));
        answerEditText.setText(savedInstanceState.getString("perimeter_tv"));
        areaSideAET.setText(savedInstanceState.getString("area_et"));
        areaAnswerTV.setText(savedInstanceState.getString("area_tv"));
        sideAAreaET.setText(savedInstanceState.getString("side_et"));
        sideAAnswerTV.setText(savedInstanceState.getString("side_tv"));

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


    public void perimeterResource(){

        //initialize the EditText
        sideAEditText = (EditText) findViewById(R.id.equi_triangle_perimeter_sideA_et);
        answerEditText = (TextView) findViewById(R.id.equi_triangle_perimeter_ans_tv);
        calculateResultButton = (Button) findViewById(R.id.equi_triangle_perimeter_calc_button);
        calculateResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(sideAEditText)) {
                    sideAEditText.setError("Enter Value");
                } else {
                    double sideA, equilTrianglePerimeter;
                    sideA = Double.parseDouble(sideAEditText.getText().toString());
                    if (sideA <= 0) {
                        answerEditText.setText("The variable a should be positive");
                    } else {
                        equilTrianglePerimeter = 3 * sideA;
                        answerEditText.setText(String.format("%.02f", equilTrianglePerimeter));
                    }
                }
            }
        });


        // Perimeter Clear button
        calculateClearButton = (Button) findViewById(R.id.equi_triangle_perimeter_clear_button);
        calculateClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sideAEditText.setText("");
                answerEditText.setText("");
            }
        });


    }

    public void areaResource(){


        areaSideAET = (EditText) findViewById(R.id.equi_triangle_area_sideA_et);
        areaAnswerTV = (TextView) findViewById(R.id.equi_triangle_area_ans_tv);
        calculateAreaButton = (Button) findViewById(R.id.equi_triangle_area_calc_button);
        calculateAreaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(areaSideAET)) {
                    areaSideAET.setError("Enter Value");
                } else {
                    double sideA, equilTriangleArea;
                    sideA = Double.parseDouble(areaSideAET.getText().toString());
                    if (sideA <= 0) {
                        areaAnswerTV.setText("The variable a should be positive");
                    } else {
                        equilTriangleArea = (Math.sqrt(3) / 4) * (Math.pow(sideA, 2));
                        areaAnswerTV.setText(String.format("%.02f", equilTriangleArea));
                    }
                }
            }
        });


        // Area Clear button
        calculateAreaClearButton = (Button) findViewById(R.id.equi_tri_area_clear_button);
        calculateAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                areaSideAET.setText("");
                areaAnswerTV.setText("");
            }
        });

    }

    public void sideAResource(){
        sideAAreaET = (EditText) findViewById(R.id.equi_triangle_side_perimeter_et);
        sideAAnswerTV = (TextView) findViewById(R.id.equi_triangle_side_ans_tv);
        calculateSideAButton = (Button) findViewById(R.id.equi_triangle_side_calc_button);
        calculateSideAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(sideAAreaET)) {
                    sideAAreaET.setError("Enter Value");
                } else {
                    double perimeter, equilTriangleSide;
                    perimeter = Double.parseDouble(sideAAreaET.getText().toString());
                    if (perimeter <= 0) {
                        sideAAnswerTV.setText("The variable a should be positive");
                    } else {
                        equilTriangleSide = perimeter / 3;
                        sideAAnswerTV.setText(String.format("%.02f", equilTriangleSide));
                    }
                }
            }
        });

        // Side A Clear button
        calculateSideClearButton = (Button) findViewById(R.id.equi_tri_hyp_clear_button);
        calculateSideClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sideAAreaET.setText("");
                sideAAnswerTV.setText("");
            }
        });



    }

    public void fontResource(){

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");

        TextView myTextView = (TextView) findViewById(R.id.equi_triangle_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.equi_triangle_perimeter_sideA_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.equi_triangle_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.equi_triangle_area_sideA_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.equi_triangle_side_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.equi_triangle_side_perimeter_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);


        sideAEditText.setTypeface(myTypeFace);
        answerEditText.setTypeface(myTypeFace);
        calculateResultButton.setTypeface(myTypeFace);
        calculateClearButton.setTypeface(myTypeFace);

        areaSideAET.setTypeface(myTypeFace);
        areaAnswerTV.setTypeface(myTypeFace);
        calculateAreaButton.setTypeface(myTypeFace);
        calculateAreaClearButton.setTypeface(myTypeFace);

        sideAAreaET.setTypeface(myTypeFace);
        sideAAnswerTV.setTypeface(myTypeFace);
        calculateSideAButton.setTypeface(myTypeFace);
        calculateSideClearButton.setTypeface(myTypeFace);

    }



}