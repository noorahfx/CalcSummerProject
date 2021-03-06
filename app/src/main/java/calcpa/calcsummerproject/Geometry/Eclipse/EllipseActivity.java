package calcpa.calcsummerproject.Geometry.Eclipse;

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

public class EllipseActivity extends AppCompatActivity {


    //Area
    EditText ellipseAreaAET;
    EditText ellipseAreaBET;
    TextView ellipseAreaAnswerTV;
    Button ellipseAreaCalcButton;
    Button ellipseAreaClearButton;


    //Circumference
    EditText ellipseCircumAET;
    EditText ellipseCircumBET;
    TextView ellipseCircumAnswerTV;
    Button ellipseCircumCalcButton;
    Button ellipseCircumClearButton;


    //Axis
    EditText ellipseAXisAET;
    EditText ellipseAXisBET;
    TextView ellipseAXisAnswerTV;
    Button ellipseAXisCalcButton;
    Button ellipseAXisClearButton;


    //Bxis
    EditText ellipseBXisAET;
    EditText ellipseBXisBET;
    TextView ellipseBXisAnswerTV;
    Button ellipseBXisCalcButton;
    Button ellipseBXisClearButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eclipse);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_eclipse);
        // getSupportActionBar().setIcon(R.drawable.back_button_tb);
        //enable button in toolbar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        setAreaResource();
        setCircumResource();
        setAXisResource();
        setBXisResource();
        setFontResource();



    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("area_et1", ellipseAreaAET.getText().toString());
        outState.putString("area_et2", ellipseAreaBET.getText().toString());
        outState.putString("area_tv", ellipseAreaAnswerTV.getText().toString());
        outState.putString("circum_et1", ellipseCircumAET.getText().toString());
        outState.putString("circum_et2", ellipseCircumBET.getText().toString());
        outState.putString("circum_tv", ellipseCircumAnswerTV.getText().toString());
        outState.putString("axis_et1", ellipseAXisAET.getText().toString());
        outState.putString("axis_et2", ellipseAXisBET.getText().toString());
        outState.putString("axis_tv", ellipseAXisAnswerTV.getText().toString());
        outState.putString("bxis_et1", ellipseBXisAET.getText().toString());
        outState.putString("bxis_et2", ellipseBXisBET.getText().toString());
        outState.putString("bxis_tv", ellipseBXisAnswerTV.getText().toString());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        ellipseAreaAET.setText(savedInstanceState.getString("area_et1"));
        ellipseAreaBET.setText(savedInstanceState.getString("area_et2"));
        ellipseAreaAnswerTV.setText(savedInstanceState.getString("area_tv"));
        ellipseCircumAET.setText(savedInstanceState.getString("circum_et1"));
        ellipseCircumBET.setText(savedInstanceState.getString("circum_et2"));
        ellipseCircumAnswerTV.setText(savedInstanceState.getString("circum_tv"));
        ellipseAXisAET.setText(savedInstanceState.getString("axis_et1"));
        ellipseAXisBET.setText(savedInstanceState.getString("axis_et2"));
        ellipseAXisAnswerTV.setText(savedInstanceState.getString("axis_tv"));
        ellipseBXisAET.setText(savedInstanceState.getString("bxis_et1"));
        ellipseBXisBET.setText(savedInstanceState.getString("bxis_et2"));
        ellipseBXisAnswerTV.setText(savedInstanceState.getString("bxis_tv"));

    }




    private void setAreaResource() {
        //Area
        ellipseAreaAET = (EditText) findViewById(R.id.ellipse_area_a_et);
        ellipseAreaBET = (EditText) findViewById(R.id.ellipse_area_b_et);
        ellipseAreaAnswerTV = (TextView) findViewById(R.id.ellipse_area_calc_answer_tx);
        ellipseAreaCalcButton = (Button) findViewById(R.id.ellipse_area_calc_button);
        ellipseAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(ellipseAreaAET)) {
                    ellipseAreaAET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else if (Model.isEmpty(ellipseAreaBET)) {
                    ellipseAreaBET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double aXis, bXis, ellipseArea;
                    aXis = Double.parseDouble(ellipseAreaAET.getText().toString());
                    bXis = Double.parseDouble(ellipseAreaBET.getText().toString());
                    if (aXis <= 0) {
                        ellipseAreaAnswerTV.setText("The variable a should be positive");
                    } else if (bXis <= 0) {
                        ellipseAreaAnswerTV.setText("The variable b should be positive");
                    } else {
                        ellipseArea = Math.PI * aXis * bXis;
                        ellipseAreaAnswerTV.setText(String.format("%.02f", ellipseArea));
                    }

                }
            }
        });


        //   Area Clear button
        ellipseAreaClearButton = (Button) findViewById(R.id.ellipse_area_clear_button);
        ellipseAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ellipseAreaAET.setText("");
                ellipseAreaBET.setText("");
                ellipseAreaAnswerTV.setText("");

            }
        });


    }

    private void setCircumResource() {
        //Circumferenece
        ellipseCircumAET = (EditText) findViewById(R.id.ellipse_circum_a_et);
        ellipseCircumBET = (EditText) findViewById(R.id.ellipse_circum_b_et);
        ellipseCircumAnswerTV = (TextView) findViewById(R.id.ellipse_circum_calc_answer_tx);
        ellipseCircumCalcButton = (Button) findViewById(R.id.ellipse_circum_calc_button);
        ellipseCircumCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(ellipseCircumAET)) {
                    ellipseCircumAET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else if (Model.isEmpty(ellipseCircumBET)) {
                    ellipseCircumBET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double aXis, bXis, ellipseCircumference;
                    aXis = Double.parseDouble(ellipseCircumAET.getText().toString());
                    bXis = Double.parseDouble(ellipseCircumBET.getText().toString());
                    if (aXis <= 0) {
                        ellipseCircumAnswerTV.setText("The variable a should be positive");
                    } else if (bXis <= 0) {
                        ellipseCircumAnswerTV.setText("The variable b should be positive");
                    } else {
                        ellipseCircumference = 2 * 3.14 * Math.sqrt((Math.pow(aXis, 2) + Math.pow(bXis, 2)) / 2);
                        ellipseCircumAnswerTV.setText(String.format("%.02f", ellipseCircumference));
                    }
                }

            }
        });

        //   Circum Clear button
        ellipseCircumClearButton = (Button) findViewById(R.id.ellipse_circum_clear_button);
        ellipseCircumClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ellipseCircumAET.setText("");
                ellipseCircumBET.setText("");
                ellipseCircumAnswerTV.setText("");

            }
        });

    }


    private void setAXisResource() {
        //A-xis
        ellipseAXisAET = (EditText) findViewById(R.id.ellipse_a_xis_b_et);
        ellipseAXisBET = (EditText) findViewById(R.id.ellipse_a_xis_area_et);
        ellipseAXisAnswerTV = (TextView) findViewById(R.id.ellipse_a_xis_calc_answer_tx);
        ellipseAXisCalcButton = (Button) findViewById(R.id.ellipse_a_xis_calc_button);
        ellipseAXisCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(ellipseAXisAET)) {
                    ellipseAXisAET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else if (Model.isEmpty(ellipseAXisBET)) {
                    ellipseAXisBET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double bXis, area, ellipseAXis;
                    bXis = Double.parseDouble(ellipseAXisAET.getText().toString());
                    area = Double.parseDouble(ellipseAXisBET.getText().toString());
                    if (bXis <= 0) {
                        ellipseCircumAnswerTV.setText("The variable b should be positive");
                    } else if (area <= 0) {
                        ellipseCircumAnswerTV.setText("The variable A should be positive");
                    } else {
                        ellipseAXis = area / (Math.PI * bXis);
                        ellipseAXisAnswerTV.setText(String.format("%.02f", ellipseAXis));
                    }
                }

            }
        });

        //   A xis Clear button
        ellipseAXisClearButton = (Button) findViewById(R.id.ellipse_a_xis_clear_button);
        ellipseAXisClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ellipseAXisAET.setText("");
                ellipseAXisBET.setText("");
                ellipseAXisAnswerTV.setText("");
            }
        });


    }

    private void setBXisResource() {
        //B-xis
        ellipseBXisAET = (EditText) findViewById(R.id.ellipse_b_xis_a_et);
        ellipseBXisBET = (EditText) findViewById(R.id.ellipse_b_xis_area_et);
        ellipseBXisAnswerTV = (TextView) findViewById(R.id.ellipse_b_xis_calc_answer_tx);
        ellipseBXisCalcButton = (Button) findViewById(R.id.ellipse_b_xis_calc_button);
        ellipseBXisCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(ellipseBXisAET)) {
                    ellipseBXisAET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else if (Model.isEmpty(ellipseBXisBET)) {
                    ellipseBXisBET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double aXis, area, ellipseBXis;
                    aXis = Double.parseDouble(ellipseBXisAET.getText().toString());
                    area = Double.parseDouble(ellipseBXisBET.getText().toString());
                    if (aXis <= 0) {
                        ellipseCircumAnswerTV.setText("The variable a should be positive");
                    } else if (area <= 0) {
                        ellipseCircumAnswerTV.setText("The variable A should be positive");
                    } else {
                        ellipseBXis = area / (Math.PI * aXis);
                        ellipseBXisAnswerTV.setText(String.format("%.02f", ellipseBXis));
                    }
                }

            }
        });

        //   B-xis Clear button
        ellipseBXisClearButton = (Button) findViewById(R.id.ellipse_b_xis_clear_button);
        ellipseBXisClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ellipseBXisAET.setText("");
                ellipseBXisBET.setText("");
                ellipseBXisAnswerTV.setText("");
            }
        });
    }

    private void setFontResource() {
        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");
        TextView myTextView = (TextView) findViewById(R.id.ellipse_area_text);
        myTextView.setTypeface(myTypeFace);


        myTextView = (TextView) findViewById(R.id.ellipse_area_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.ellipse_area_b_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.ellipse_a_xis_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.ellipse_a_xis_b_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.ellipse_a_xis_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.ellipse_b_xis_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.ellipse_b_xis_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.ellipse_b_xis_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.ellipse_circum_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.ellipse_circum_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.ellipse_circum_b_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);



        ellipseAreaAET.setTypeface(myTypeFace);
        ellipseAreaBET.setTypeface(myTypeFace);
        ellipseAreaAnswerTV.setTypeface(myTypeFace);
        ellipseAreaCalcButton.setTypeface(myTypeFace);
        ellipseAreaClearButton.setTypeface(myTypeFace);
        ellipseCircumAET.setTypeface(myTypeFace);
        ellipseCircumBET.setTypeface(myTypeFace);
        ellipseCircumAnswerTV.setTypeface(myTypeFace);
        ellipseCircumCalcButton.setTypeface(myTypeFace);
        ellipseCircumClearButton.setTypeface(myTypeFace);
        ellipseAXisAET.setTypeface(myTypeFace);
        ellipseAXisBET.setTypeface(myTypeFace);
        ellipseAXisAnswerTV.setTypeface(myTypeFace);
        ellipseAXisCalcButton.setTypeface(myTypeFace);
        ellipseAXisClearButton.setTypeface(myTypeFace);
        ellipseBXisAET.setTypeface(myTypeFace);
        ellipseBXisBET.setTypeface(myTypeFace);
        ellipseBXisAnswerTV.setTypeface(myTypeFace);
        ellipseBXisCalcButton.setTypeface(myTypeFace);
        ellipseBXisClearButton.setTypeface(myTypeFace);

    }

}
