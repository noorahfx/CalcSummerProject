package calcpa.calcsummerproject.Geometry.Circle;

import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;
import io.github.kexanie.library.MathView;

import calcpa.calcsummerproject.Model;
import calcpa.calcsummerproject.R;

public class Circle extends AppCompatActivity {

 /**   MathView circleAreaFormula;
   // String areaFormula ="$$A=\\pi r^{2}$$";

    MathView circleDiameterFormula;
    String diameterFormula ="$$d =2r$$";

    MathView circleCircumFormula;
    String circumFormula ="$$C =2\\pi r$$";

    MathView circleRadiusFormula;
    String radiusFormula="$$r =\\sqrt{\\frac{A}{\\pi}}$$";
*/


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
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        /**     circleAreaFormula =(MathView)findViewById(R.id.areaFormula);
        assert circleAreaFormula != null;
        circleAreaFormula.setText(areaFormula);

        circleDiameterFormula =(MathView)findViewById(R.id.circle_diameter_formula);
        assert circleDiameterFormula != null;
        circleDiameterFormula.setText(diameterFormula);


        circleCircumFormula =(MathView)findViewById(R.id.circle_circum_formula);
        assert circleCircumFormula != null;
        circleCircumFormula.setText(circumFormula);


        circleRadiusFormula =(MathView)findViewById(R.id.circle_radius_formula);
        assert circleRadiusFormula != null;
        circleRadiusFormula.setText(radiusFormula);

*/
        // Area Clear button
        circleAreaClearButton =(Button)findViewById(R.id.circle_area_clear_button);
        circleAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circleAreaET.setText("");
                circleAnswerTV.setText("");
            }
        });

        // Diameter Clear button
        circleDiameterClearButton =(Button)findViewById(R.id.circle_diameter_clear_button);
        circleDiameterClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circleDiameterET.setText("");
                circleDiameterTV.setText("");
            }
        });

        // Circum Clear button
        circleCircumCLeranButton =(Button)findViewById(R.id.circle_circum_clear_button);
        circleCircumCLeranButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circleCircumET.setText("");
                circleCircumTV.setText("");
            }
        });

        // Radius Clear button
        circleRadiusClearButton =(Button)findViewById(R.id.circle_radius_clear_button);
        circleRadiusClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circleRadiusAreaET.setText("");
                circleRadiusTV.setText("");
            }
        });







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
                     circleAnswerTV.setText(String.format("%.02f",answer));
              }
            }
        });

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



        //area
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

//        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),  "DOMISC__.TTF");


        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),  "OptimusPrinceps.ttf");
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


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
   //     circleAreaString = circleAreaET.getText().toString();
     //   outState.putString("edittext",circleAreaString);
     }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
   //     circleAreaET.setText(savedInstanceState.getString("edittext"));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){

        }else if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){

        }
    }


}
