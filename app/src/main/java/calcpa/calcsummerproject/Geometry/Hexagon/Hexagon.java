package calcpa.calcsummerproject.Geometry.Hexagon;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import calcpa.calcsummerproject.Model;
import calcpa.calcsummerproject.R;
import io.github.kexanie.library.MathView;


public class Hexagon extends AppCompatActivity {


    MathView hexPerimeterFormula;
    String perimeterFormula ="$$A=\\pi r^{2}$$";

    MathView hexAreaFormula;
    String areaFormula ="$$d =2r$$";

    MathView hexSideFormula;
    String sideFormula ="$$C =2\\pi r$$";
    
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



        hexPerimeterFormula =(MathView)findViewById(R.id.hex_perimeter_formula);
        assert hexPerimeterFormula != null;
        hexPerimeterFormula.setText(perimeterFormula);

        hexAreaFormula =(MathView)findViewById(R.id.hex_area_formula);
        assert hexAreaFormula != null;
        hexAreaFormula.setText(areaFormula);


        hexSideFormula =(MathView)findViewById(R.id.hex_side_formula);
        assert hexSideFormula != null;
        hexSideFormula.setText(sideFormula);
        
        // Perimeter Clear button
        hexPerimeterClearButton = (Button) findViewById(R.id.hex_perimeter_clear_button);
        hexPerimeterClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hexPerimeterSideAET.setText("");
                hexPerimeterAnswerTV.setText("");
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

        // Side A Clear button
        hexSideAClearButton = (Button) findViewById(R.id.hex_side_clear_button);
        hexSideAClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hexSideAET.setText("");
                hexSideAAnswerTV.setText("");
            }
        });



        hexPerimeterSideAET =(EditText)findViewById(R.id.hex_perimeter_side_a_et);
        hexPerimeterAnswerTV =(TextView)findViewById(R.id.hex_perimeter_calc_answer_tx);
        hexPerimeterCalcButton=(Button)findViewById(R.id.hex_perimeter_calc_button);
        hexPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(hexPerimeterSideAET)) {
                    hexPerimeterSideAET.setError("Enter Value");
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

        hexAreaSideAET =(EditText)findViewById(R.id.hex_area_side_a_et);
        hexAreaAnswerTV =(TextView)findViewById(R.id.hex_area_calc_answer_tx);
        hexAreaCalcButton=(Button)findViewById(R.id.hex_area_calc_button);
        hexAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(hexAreaSideAET)) {
                    hexAreaSideAET.setError("Enter Value");
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


        hexSideAET =(EditText)findViewById(R.id.hex_side_et);
        hexSideAAnswerTV =(TextView)findViewById(R.id.hex_side_calc_answer_tx);
        hexSideACalcButton=(Button)findViewById(R.id.hex_side_calc_button);
        hexSideACalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(hexSideAET)) {
                    hexSideAET.setError("Enter Value");
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

