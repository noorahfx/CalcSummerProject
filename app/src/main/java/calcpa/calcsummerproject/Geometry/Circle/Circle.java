package calcpa.calcsummerproject.Geometry.Circle;


import android.graphics.Typeface;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import calcpa.calcsummerproject.Model;
import calcpa.calcsummerproject.R;

public class Circle extends AppCompatActivity {

    //area
    EditText circleAreaET;
    TextView circleAnswerTV;
    Button circleAreaCalculateButton;

    //clear button
    Button circleAreaClearButton;
    Button circleDiameterClearButton;
    Button circleCircumCLeranButton;
    Button circleRadiusClearButton;

    //diameter
    EditText circleDiameterET;
    TextView circleDiameterTV;
    Button circleDiameterCalculateButton;

    //circumference
    EditText circleCircumET;
    TextView circleCircumTV;
    Button circlCircumCalculateButton;

    //circumference
    EditText circleRadiusAreaET;
    TextView circleRadiusTV;
    Button circlRadiusCalculateButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        areaResource();
        diameterResource();
        circumResource();
        radiusResource();
        fontResource();


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("area_et", circleAreaET.getText().toString());
        outState.putString("area_tv", circleAnswerTV.getText().toString());
        outState.putString("diameter_et", circleDiameterET.getText().toString());
        outState.putString("diameter_tv", circleDiameterTV.getText().toString());
        outState.putString("circum_et", circleCircumET.getText().toString());
        outState.putString("circum_tv", circleCircumTV.getText().toString());
        outState.putString("radius_et", circleRadiusAreaET.getText().toString());
        outState.putString("radius_tv", circleRadiusTV.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        circleAreaET.setText(savedInstanceState.getString("area_et"));
        circleAnswerTV.setText(savedInstanceState.getString("area_tv"));
        circleDiameterET.setText(savedInstanceState.getString("diameter_et"));
        circleDiameterTV.setText(savedInstanceState.getString("diameter_tv"));
        circleCircumET.setText(savedInstanceState.getString("circum_et"));
        circleCircumTV.setText(savedInstanceState.getString("circum_tv"));
        circleRadiusAreaET.setText(savedInstanceState.getString("radius_et"));
        circleRadiusTV.setText(savedInstanceState.getString("radius_tv"));
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

    private void areaResource() {

        //area
        circleAreaET = (EditText) findViewById(R.id.circle_area_a_et);
        circleAnswerTV = (TextView) findViewById(R.id.circle_calc_answer_tx);
        circleAreaCalculateButton = (Button) findViewById(R.id.circle_area_calc_button);
        circleAreaCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(circleAreaET)) {
                    circleAreaET.setError(Html.fromHtml("<font color='red'>Enter value</font>"));
                } else {
                    double radius;
                    radius = Double.parseDouble(circleAreaET.getText().toString());
                    if (radius <= 0) {
                        circleAnswerTV.setText("The variable r should be positive");
                    }
                    double answer = Math.PI * (radius * radius);
                    circleAnswerTV.setText(String.format("%.02f", answer));
                }
            }
        });

        //Clear button
        circleAreaClearButton = (Button) findViewById(R.id.circle_area_clear_button);
        circleAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circleAreaET.setText("");
                circleAnswerTV.setText("");
            }
        });
    }

    private void diameterResource() {
        //diameter
        circleDiameterET = (EditText) findViewById(R.id.circle_diameter_d_et);
        circleDiameterTV = (TextView) findViewById(R.id.circle_calc_diamter_answer_tx);
        circleDiameterCalculateButton = (Button) findViewById(R.id.circle_diameter_calc_button);
        circleDiameterCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(circleDiameterET)) {
                    circleDiameterET.setError("Enter Value");
                } else {
                    double radius;
                    radius = Double.parseDouble(circleDiameterET.getText().toString());
                    if (radius <= 0) {
                        circleDiameterTV.setText("The variable r should be positive");
                    }
                    double answer = 2 * radius;
                    circleDiameterTV.setText(String.format("%.02f", answer));
                }
            }
        });

        //Clear button
        circleDiameterClearButton = (Button) findViewById(R.id.circle_diameter_clear_button);
        circleDiameterClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circleDiameterET.setText("");
                circleDiameterTV.setText("");
            }
        });


    }

    private void circumResource() {

        //circumference
        circleCircumET = (EditText) findViewById(R.id.circle_circum_c_et);
        circleCircumTV = (TextView) findViewById(R.id.circle_circum_calc_answer_tx);
        circlCircumCalculateButton = (Button) findViewById(R.id.circle_circum_calc_button);
        circlCircumCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(circleCircumET)) {
                    circleCircumET.setError("Enter Value");
                } else {
                    double radius;
                    radius = Double.parseDouble(circleCircumET.getText().toString());
                    if (radius <= 0) {
                        circleCircumTV.setText("The variable r should be positive");
                    }
                    double answer = 2 * Math.PI * radius;
                    circleCircumTV.setText(String.format("%.02f", answer));
                }
            }
        });
        //Clear button
        circleCircumCLeranButton = (Button) findViewById(R.id.circle_circum_clear_button);
        circleCircumCLeranButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circleCircumET.setText("");
                circleCircumTV.setText("");
            }
        });
    }

    private void radiusResource() {

        //radius
        circleRadiusAreaET = (EditText) findViewById(R.id.circle_radius_c_et);
        circleRadiusTV = (TextView) findViewById(R.id.circle_radius_calc_answer_tx);
        circlRadiusCalculateButton = (Button) findViewById(R.id.circle_radius_calc_button);
        circlRadiusCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(circleRadiusAreaET)) {
                    circleRadiusAreaET.setError("Enter Value");
                } else {
                    double area;
                    area = Double.parseDouble(circleRadiusAreaET.getText().toString());
                    if (area <= 0) {
                        circleRadiusTV.setText("The variable r should be positive");
                    }
                    double answer = Math.sqrt((area) / Math.PI);
                    circleRadiusTV.setText(String.format("%.02f", answer));
                }
            }
        });
        //Clear button
        circleRadiusClearButton = (Button) findViewById(R.id.circle_radius_clear_button);
        circleRadiusClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circleRadiusAreaET.setText("");
                circleRadiusTV.setText("");
            }
        });
    }

    private void fontResource() {
        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");
        TextView myTextView = (TextView) findViewById(R.id.circle_area_text);
        myTextView.setTypeface(myTypeFace);


        myTextView = (TextView) findViewById(R.id.circle_diameter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.circle_circum_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.circle_radius_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.circle_area_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.circle_diameter_d_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.circle_circum_c_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.circle_radius_c_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);


        circleAreaET.setTypeface(myTypeFace);
        circleAnswerTV.setTypeface(myTypeFace);
        circleAreaCalculateButton.setTypeface(myTypeFace);
        circleDiameterET.setTypeface(myTypeFace);
        circleDiameterTV.setTypeface(myTypeFace);
        circleDiameterCalculateButton.setTypeface(myTypeFace);
        circleCircumET.setTypeface(myTypeFace);
        circleCircumTV.setTypeface(myTypeFace);
        circlCircumCalculateButton.setTypeface(myTypeFace);
        circleRadiusAreaET.setTypeface(myTypeFace);
        circleRadiusTV.setTypeface(myTypeFace);
        circlRadiusCalculateButton.setTypeface(myTypeFace);
        circleAreaClearButton.setTypeface(myTypeFace);
        circleDiameterClearButton.setTypeface(myTypeFace);
        circleCircumCLeranButton.setTypeface(myTypeFace);
        circleRadiusClearButton.setTypeface(myTypeFace);


    }


}
