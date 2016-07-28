package calcpa.calcsummerproject.Geometry.Triangle.TypesOfTriangle;

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
    /**
     * MathView equilateral_triangle_paramter;
     * String e_t_paramter = "$$P=3a$$";
     * <p/>
     * MathView equilateral_triangle_area;
     * String e_t_area = "$$A=\\frac{\\sqrt{3}}{4}{a^{2}}$$";
     * <p/>
     * MathView equilateral_triangle_side_a;
     * String e_t_side_a = "$$a=\\frac{P}{3}$$";
     */

    EditText sideAEditText;
    TextView answerEditText;
    Button calculateResultButton;


    //right triangle area
    EditText areaSideAET;
    TextView areaAnswerTV;
    Button calculateAreaButton;


    //right triangle side A calculatro
    EditText sideAAreaET;
    TextView sideAAnswerTV;
    Button calculateSideAButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equilateral_triangle);

        /**    Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Take cover.ttf");
         TextView myTextView = (TextView)findViewById(R.id.equilateral_triangle_title);
         assert myTextView != null;
         myTextView.setTypeface(myTypeFace);

         myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
         myTextView = (TextView)findViewById(R.id.equilateral_triangle_define_id);
         assert myTextView != null;
         myTextView.setTypeface(myTypeFace);

         myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
         myTextView=(TextView)findViewById(R.id.equilateral_tr_def_str_id);
         assert myTextView != null;
         myTextView.setTypeface(myTypeFace);



         myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
         myTextView=(TextView)findViewById(R.id.equilateral_tri_formula_id);
         assert myTextView != null;
         myTextView.setTypeface(myTypeFace);

         myTypeFace = Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
         myTextView = (TextView)findViewById(R.id.equilateral_tr_prop_id);
         assert myTextView != null;
         myTextView.setTypeface(myTypeFace);

         myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
         myTextView = (TextView)findViewById(R.id.equilateral_tr_prop_1_id);
         assert myTextView != null;
         myTextView.setTypeface(myTypeFace);

         equilateral_triangle_paramter =(MathView)findViewById(R.id.equilateral_triangle_paramter);
         assert equilateral_triangle_paramter != null;
         equilateral_triangle_paramter.setText(e_t_paramter);

         equilateral_triangle_area = (MathView)findViewById(R.id.equilateral_triangle_area);
         assert equilateral_triangle_area != null;
         equilateral_triangle_area.setText(e_t_area);

         equilateral_triangle_side_a =(MathView)findViewById(R.id.equilateral_triangle_side_a);
         assert equilateral_triangle_side_a != null;
         equilateral_triangle_side_a.setText(e_t_side_a);  */


  /*      Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Take cover.ttf");
        TextView myTextView = (TextView)findViewById(R.id.perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);
*/
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


    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}