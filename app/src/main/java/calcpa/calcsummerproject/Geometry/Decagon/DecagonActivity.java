package calcpa.calcsummerproject.Geometry.Decagon;


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

public class DecagonActivity extends AppCompatActivity {

    //area
    EditText decagonareaET;
    TextView decagonareaTV;
    Button decagonareaCalcButton;
    Button decagonAreaClearButton;

    //perimeter
    EditText decagonPerimeterET;
    TextView decagonPerimeterTV;
    Button decagonPerimeterCalcButton;
    Button decagonPerimeterClearButton;

    //Sides
    EditText decagonSideET;
    TextView decagonSideTV;
    Button decagonSideCalcButton;
    Button decagonSidesClearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decagon);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_decagon);
        // getSupportActionBar().setIcon(R.drawable.back_button_tb);
        //enable button in toolbar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setAreaResource();
        setPerimeterResource();
        setSideResource();
        setFontResource();


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


        outState.putString("area_et", decagonareaET.getText().toString());
        outState.putString("area_tv", decagonareaTV.getText().toString());
        outState.putString("perimeter_et", decagonPerimeterET.getText().toString());
        outState.putString("perimeter_tv", decagonPerimeterTV.getText().toString());
        outState.putString("side_et", decagonSideET.getText().toString());
        outState.putString("side_tv", decagonSideTV.getText().toString());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        decagonareaET.setText(savedInstanceState.getString("area_et"));
        decagonareaTV.setText(savedInstanceState.getString("area_tv"));
        decagonPerimeterET.setText(savedInstanceState.getString("perimeter_et"));
        decagonPerimeterTV.setText(savedInstanceState.getString("perimeter_tv"));
        decagonSideET.setText(savedInstanceState.getString("side_et"));
        decagonSideTV.setText(savedInstanceState.getString("side_tv"));

    }

    private void setAreaResource() {
        decagonareaET = (EditText) findViewById(R.id.decagon_area_a_et);
        decagonareaTV = (TextView) findViewById(R.id.decagon_area_calc_answer_tx);
        decagonareaCalcButton = (Button) findViewById(R.id.decagon_area_calc_button);
        decagonareaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(decagonareaET)) {
                    decagonareaET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double sideA, decagonArea;
                    sideA = Double.parseDouble(decagonareaET.getText().toString());
                    if (sideA <= 0) {
                        decagonareaTV.setText("The variable a should be positive");
                    }
                    decagonArea = (2.5) * (Math.pow(sideA, 2)) * (Math.sqrt(5 + 2 * Math.sqrt(5)));
                    decagonareaTV.setText(String.format("%.02f", decagonArea));
                }
            }
        });

        // Area Clear button
        decagonAreaClearButton = (Button) findViewById(R.id.decagon_area_clear_button);
        decagonAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decagonareaET.setText("");
                decagonareaET.setText("");

            }
        });


    }

    private void setPerimeterResource() {

        //perimeter
        decagonPerimeterET = (EditText) findViewById(R.id.decagon_perimeter_v_et);
        decagonPerimeterTV = (TextView) findViewById(R.id.decagon_perimeter_calc_answer_tx);
        decagonPerimeterCalcButton = (Button) findViewById(R.id.decagon_perimeter_calc_button);
        decagonPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(decagonPerimeterET)) {
                    decagonPerimeterET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double sideA, decagonPerimeter;
                    sideA = Double.parseDouble(decagonPerimeterET.getText().toString());
                    if (sideA <= 0) {
                        decagonPerimeterTV.setText("The variable a should be positive");
                    }
                    decagonPerimeter = 10 * sideA;
                    decagonPerimeterTV.setText(String.format("%.02f", decagonPerimeter));
                }
            }
        });

        // Perimeter Clear button
        decagonPerimeterClearButton = (Button) findViewById(R.id.decagon_perimeter_clear_button);
        decagonPerimeterClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decagonPerimeterET.setText("");
                decagonPerimeterTV.setText("");

            }
        });


    }

    private void setSideResource() {
        //sides

        decagonSideET = (EditText) findViewById(R.id.decagon_sides_a_et);
        decagonSideTV = (TextView) findViewById(R.id.decagon_sides_calc_answer_tx);
        decagonSideCalcButton = (Button) findViewById(R.id.decagon_sides_calc_button);
        decagonSideCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //check to make sure field is not empty
                if (Model.isEmpty(decagonSideET)) {
                    decagonSideET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double perimeter, decagonPerimeter;
                    perimeter = Double.parseDouble(decagonSideET.getText().toString());

                    if (perimeter <= 0) {
                        decagonSideTV.setText("The variable a should be positive");
                    }
                    decagonPerimeter = perimeter / 10;
                    decagonSideTV.setText(String.format("%.02f", decagonPerimeter));
                }


            }
        });

        // Sides Clear button
        decagonSidesClearButton = (Button) findViewById(R.id.decagon_sides_clear_button);
        decagonSidesClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decagonSideET.setText("");
                decagonSideTV.setText("");

            }
        });


    }

    private void setFontResource() {


        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");

        TextView myTextView = (TextView) findViewById(R.id.decagon_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.decagon_area_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.decagon_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.decagon_perimeter_v_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.decagon_sides_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.decagon_sides_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        decagonareaET.setTypeface(myTypeFace);
        decagonareaTV.setTypeface(myTypeFace);
        decagonareaCalcButton.setTypeface(myTypeFace);
        decagonAreaClearButton.setTypeface(myTypeFace);

        decagonPerimeterET.setTypeface(myTypeFace);
        decagonPerimeterTV.setTypeface(myTypeFace);
        decagonPerimeterCalcButton.setTypeface(myTypeFace);
        decagonPerimeterClearButton.setTypeface(myTypeFace);

        decagonSideET.setTypeface(myTypeFace);
        decagonSideTV.setTypeface(myTypeFace);
        decagonSideCalcButton.setTypeface(myTypeFace);
        decagonSidesClearButton.setTypeface(myTypeFace);


    }




}
