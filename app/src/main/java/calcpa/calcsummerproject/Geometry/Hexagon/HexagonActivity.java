package calcpa.calcsummerproject.Geometry.Hexagon;

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


public class HexagonActivity extends AppCompatActivity {

    //perimeter
    EditText hexPerimeterSideAET;
    TextView hexPerimeterAnswerTV;
    Button hexPerimeterCalcButton;
    Button hexPerimeterClearButton;

    //area
    EditText hexAreaSideAET;
    TextView hexAreaAnswerTV;
    Button hexAreaCalcButton;
    Button hexAreaClearButton;

    //side A
    EditText hexSideAET;
    TextView hexSideAAnswerTV;
    Button hexSideACalcButton;
    Button hexSideAClearButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexagon);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_hexagon);
        // getSupportActionBar().setIcon(R.drawable.back_button_tb);
        //enable button in toolbar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled (true);

        setPerimeterResource ();
        setAreaResource ();
        setSideResource ();
        setFontResource();

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


        outState.putString("perimeter_et", hexPerimeterSideAET.getText().toString());
        outState.putString("perimeter_tv", hexPerimeterAnswerTV.getText().toString());
        outState.putString("area_et", hexAreaSideAET.getText().toString());
        outState.putString("area_tv", hexAreaAnswerTV.getText().toString());
        outState.putString("side_et", hexSideAET.getText().toString());
        outState.putString("side_tv", hexSideAAnswerTV.getText().toString());


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        hexPerimeterSideAET.setText(savedInstanceState.getString("perimeter_et"));
        hexPerimeterAnswerTV.setText(savedInstanceState.getString("perimeter_tv"));
        hexAreaSideAET.setText(savedInstanceState.getString("area_et"));
        hexAreaAnswerTV.setText(savedInstanceState.getString("area_tv"));
        hexSideAET.setText(savedInstanceState.getString("side_et"));
        hexSideAAnswerTV.setText(savedInstanceState.getString("side_tv"));

    }





    private void setPerimeterResource(){


        hexPerimeterSideAET =(EditText)findViewById(R.id.hex_perimeter_side_a_et);
        hexPerimeterAnswerTV =(TextView)findViewById(R.id.hex_perimeter_calc_answer_tx);
        hexPerimeterCalcButton=(Button)findViewById(R.id.hex_perimeter_calc_button);
        hexPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(hexPerimeterSideAET)) {
                    hexPerimeterSideAET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double aSide, hexASide;
                    aSide = Double.parseDouble(hexPerimeterSideAET.getText().toString());
                    if (aSide <= 0) {
                        hexPerimeterAnswerTV.setText("The variable a should be positive");
                    }
                    hexASide = 6*aSide;
                    hexPerimeterAnswerTV.setText(String.format("%.02f", hexASide));
                }

            }
        });


        // Perimeter Clear button
        hexPerimeterClearButton = (Button) findViewById(R.id.hex_perimeter_clear_button);
        hexPerimeterClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hexPerimeterSideAET.setText("");
                hexPerimeterAnswerTV.setText("");
            }
        });





    }

    private void setAreaResource(){

        hexAreaSideAET =(EditText)findViewById(R.id.hex_area_side_a_et);
        hexAreaAnswerTV =(TextView)findViewById(R.id.hex_area_calc_answer_tx);
        hexAreaCalcButton=(Button)findViewById(R.id.hex_area_calc_button);
        hexAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(hexAreaSideAET)) {
                    hexAreaSideAET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double aSide, hexArea;
                    aSide = Double.parseDouble(hexAreaSideAET.getText().toString());
                    if (aSide <= 0) {
                        hexAreaAnswerTV.setText("The variable a should be positive");
                    }
                    hexArea = ((3*Math.sqrt(3))/2)*(Math.pow(aSide,2));
                    hexAreaAnswerTV.setText(String.format("%.02f", hexArea));
                }


            }
        });


        // Area Clear button
        hexAreaClearButton = (Button) findViewById(R.id.hex_area_clear_button);
        hexAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hexAreaSideAET.setText("");
                hexAreaAnswerTV.setText("");
            }
        });




    }

    private void setSideResource(){
        hexSideAET =(EditText)findViewById(R.id.hex_side_et);
        hexSideAAnswerTV =(TextView)findViewById(R.id.hex_side_calc_answer_tx);
        hexSideACalcButton=(Button)findViewById(R.id.hex_side_calc_button);
        hexSideACalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(hexSideAET)) {
                    hexSideAET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double aSide, hexASide;
                    aSide = Double.parseDouble(hexSideAET.getText().toString());
                    if (aSide <= 0) {
                        hexSideAAnswerTV.setText("The variable a should be positive");
                    }
                    hexASide = aSide/6;
                    hexSideAAnswerTV.setText(String.format("%.02f", hexASide));
                }


            }
        });

        // Side A Clear button
        hexSideAClearButton = (Button) findViewById(R.id.hex_side_clear_button);
        hexSideAClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hexSideAET.setText("");
                hexSideAAnswerTV.setText("");
            }
        });




    }

    private void setFontResource(){


        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),  "OptimusPrinceps.ttf");

        TextView myTextView = (TextView) findViewById(R.id.hex_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.hex_perimeter_side_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.hex_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.hex_area_side_a_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.hex_side_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.hex_side_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        hexPerimeterSideAET.setTypeface(myTypeFace);
        hexPerimeterAnswerTV.setTypeface(myTypeFace);
        hexPerimeterCalcButton.setTypeface(myTypeFace);
        hexPerimeterClearButton.setTypeface(myTypeFace);

        hexAreaSideAET.setTypeface(myTypeFace);
        hexAreaAnswerTV.setTypeface(myTypeFace);
        hexAreaCalcButton.setTypeface(myTypeFace);
        hexAreaClearButton.setTypeface(myTypeFace);

        hexSideAET.setTypeface(myTypeFace);
        hexSideAAnswerTV.setTypeface(myTypeFace);
        hexSideACalcButton.setTypeface(myTypeFace);
        hexSideAClearButton.setTypeface(myTypeFace);


    }



    

}

