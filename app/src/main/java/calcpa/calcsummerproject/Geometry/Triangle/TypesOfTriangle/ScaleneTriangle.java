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

public class ScaleneTriangle extends AppCompatActivity {


    MathView scaleneTriPerimeterFormula;
    String perimeterFormula ="$$A=\\pi r^{2}$$";


    MathView scaleneTriAreaFormula;
    String areaFormula ="$$A=\\pi r^{2}$$";


    MathView scaleneTriSideAFormula;
    String sideAFormula ="$$A=\\pi r^{2}$$";



    MathView scaleneTriSideBFormula;
    String sideBFormula ="$$A=\\pi r^{2}$$";

    //perimeter
    EditText scaleneTriPerimeterSideAET;
    EditText scaleneTriPerimeterBaseET;
    EditText scaleneTriPerimeterSideCET;
    TextView scaleneTriPerimeterAnsTV;
    Button scaleneTriPerimeterCalcButton;
    Button scaleneTriPerimeterClearButton;


    //    area
    EditText scaleneTriAreaBaseET;
    EditText scaleneTriAreaHeightET;
    TextView scaleneTriAreaAnsTV;
    Button scaleneTriAreaCalcButton;
    Button scaleneTriArearClearButton;



    //    side A
    EditText scaleneTriSideABaseET;
    EditText scaleneTriSideASideCET;
    EditText scaleneTriSideAPerimeterET;
    TextView scaleneTriSideAAnsTV;
    Button scaleneTriSideACalcButton;
    Button scaleneTriSideAClearButton;



    //    side B
    EditText scaleneTriBaseSideAET;
    EditText scaleneTriBaseSideCET;
    EditText scaleneTriBasePerimeterET;
    TextView scaleneTriBaseAnsTV;
    Button scaleneTriBaseCalcButton;
    Button scaleneTriSideBClearButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scalene_triangle);


        scaleneTriPerimeterFormula =(MathView)findViewById(R.id.scalene_tri_perimeter_formula);
        assert scaleneTriPerimeterFormula != null;
        scaleneTriPerimeterFormula.setText(perimeterFormula);

        scaleneTriAreaFormula =(MathView)findViewById(R.id.scalene_tri_area_formula);
        assert scaleneTriAreaFormula != null;
        scaleneTriAreaFormula.setText(areaFormula);



        scaleneTriSideAFormula =(MathView)findViewById(R.id.scalene_tri_sideA_formula);
        assert scaleneTriSideAFormula != null;
        scaleneTriSideAFormula.setText(sideAFormula);

        scaleneTriSideBFormula =(MathView)findViewById(R.id.scalene_tri_base_formula);
        assert scaleneTriSideBFormula != null;
        scaleneTriSideBFormula.setText(sideBFormula);





        // Perimeter Clear button
        scaleneTriPerimeterClearButton = (Button)
                findViewById(R.id.scalene_tri_perimeter_clear_button);
        scaleneTriPerimeterClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scaleneTriPerimeterSideAET.setText("");
                scaleneTriPerimeterBaseET.setText("");
                scaleneTriPerimeterSideCET.setText("");
                scaleneTriPerimeterAnsTV.setText("");

            }
        });


        // Area Clear button
        scaleneTriArearClearButton = (Button)
                findViewById(R.id.scalene_triangle_area_clear_button);
        scaleneTriArearClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scaleneTriAreaBaseET.setText("");
                scaleneTriAreaHeightET.setText("");
                scaleneTriAreaAnsTV.setText("");

            }
        });

        // Side Clear button
        scaleneTriSideAClearButton = (Button)
                findViewById(R.id.scalene_tri_side_clear_button);
        scaleneTriSideAClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scaleneTriSideABaseET.setText("");
                scaleneTriSideASideCET.setText("");
                scaleneTriSideAPerimeterET.setText("");
                scaleneTriSideAAnsTV.setText("");

            }
        });

        // Base Clear button
        scaleneTriSideBClearButton = (Button)
                findViewById(R.id.scalene_tri_base_clear_button);
        scaleneTriSideBClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scaleneTriBaseSideAET.setText("");
                scaleneTriBaseSideCET.setText("");
                scaleneTriBasePerimeterET.setText("");
                scaleneTriBaseAnsTV.setText("");

            }
        });



        /**   Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Take cover.ttf");
           TextView myTextView = (TextView)findViewById(R.id.scalene_triangle_title);
           assert myTextView != null;
           myTextView.setTypeface(myTypeFace);

           myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
           myTextView = (TextView)findViewById(R.id.scalene_triangle_define_id);
           assert myTextView != null;
           myTextView.setTypeface(myTypeFace);

           myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
           myTextView=(TextView)findViewById(R.id.scalene_tr_def_str_id);
           assert myTextView != null;
           myTextView.setTypeface(myTypeFace);

           myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
           myTextView=(TextView)findViewById(R.id.scalene_tr_type_str);
           assert myTextView != null;
           myTextView.setTypeface(myTypeFace);

           myTypeFace=Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
           myTextView=(TextView)findViewById(R.id.scalene_tr_type_id);
           assert myTextView != null;
           myTextView.setTypeface(myTypeFace);



           myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
           myTextView=(TextView)findViewById(R.id.scalene_tri_formula_id);
           assert myTextView != null;
           myTextView.setTypeface(myTypeFace);

           myTypeFace = Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
           myTextView = (TextView)findViewById(R.id.scalene_tr_prop_id);
           assert myTextView != null;
           myTextView.setTypeface(myTypeFace);

           myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
           myTextView = (TextView)findViewById(R.id.scalene_tr_prop_1_id);
           assert myTextView != null;
           myTextView.setTypeface(myTypeFace);

           scalene_triangle_paramter =(MathView)findViewById(R.id.scalene_triangle_paramter);
           assert scalene_triangle_paramter != null;
           scalene_triangle_paramter.setText(s_t_paramter);

           scalene_triangle_area = (MathView)findViewById(R.id.scalene_triangle_area);
           assert scalene_triangle_area != null;
           scalene_triangle_area.setText(s_t_area);

           scalene_triangle_side_a =(MathView)findViewById(R.id.scalene_triangle_side_a);
           assert scalene_triangle_side_a != null;
           scalene_triangle_side_a.setText(s_t_side_a);

           scalene_triangle_height =(MathView)findViewById(R.id.scalene_triangle_height);
           assert scalene_triangle_height != null;
           scalene_triangle_height.setText(s_t_height);

       }

   }


           Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Take cover.ttf");
           TextView myTextView = (TextView)findViewById(R.id.perimeter_text);
           assert myTextView != null;
           myTextView.setTypeface(myTypeFace);
   */
        //initialize the EditText
        scaleneTriPerimeterSideAET = (EditText) findViewById(R.id.scalene_tri_perimeter_sideA_et);
        scaleneTriPerimeterBaseET = (EditText) findViewById(R.id.scalene_tri_perimeter_sideB_et);
        scaleneTriPerimeterSideCET = (EditText) findViewById(R.id.scalene_tri_perimeter_sideC_et);
        scaleneTriPerimeterAnsTV = (TextView) findViewById(R.id.scalene_tri_perimeter_ans_tv);
        scaleneTriPerimeterCalcButton = (Button) findViewById(R.id.scalene_tri_perimeter_calc_button);
        scaleneTriPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(scaleneTriPerimeterSideAET)) {
                    scaleneTriPerimeterSideAET.setError("Enter Value");
                } else if (Model.isEmpty(scaleneTriPerimeterBaseET)) {
                    scaleneTriPerimeterBaseET.setError("Enter Value");
                } else if (Model.isEmpty(scaleneTriPerimeterSideCET)) {
                    scaleneTriPerimeterSideCET.setError("Enter Value");
                } else {
                    double sideA, baseB, sideC, scaleneTriPerimeter;
                    sideA = Double.parseDouble(scaleneTriPerimeterSideAET.getText().toString());
                    baseB = Double.parseDouble(scaleneTriPerimeterBaseET.getText().toString());
                    sideC = Double.parseDouble(scaleneTriPerimeterSideCET.getText().toString());
                    if (sideA <= 0) {
                        scaleneTriPerimeterAnsTV.setText("The variable a should be positive");
                    } else if (baseB <= 0) {
                        scaleneTriPerimeterAnsTV.setText("The variable b should be positive");
                    } else if (sideC <= 0) {
                        scaleneTriPerimeterAnsTV.setText("The variable c should be positive");
                    } else if (sideA >= (baseB + sideC)) {
                        scaleneTriPerimeterAnsTV.setText("Invalid input: make sure b+c>a");
                    } else {
                        scaleneTriPerimeter = sideA + baseB + sideC;
                        scaleneTriPerimeterAnsTV.setText(String.format("%.02f", scaleneTriPerimeter));
                    }
                }
            }
        });


        //acute triangle area

        scaleneTriAreaBaseET = (EditText) findViewById(R.id.scalene_tri_area_base_et);
        scaleneTriAreaHeightET = (EditText) findViewById(R.id.scalene_tri_area_height_et);
        scaleneTriAreaAnsTV = (TextView) findViewById(R.id.scalene_tri_area_ans_tv);
        scaleneTriAreaCalcButton = (Button) findViewById(R.id.scalene_tri_area_calc_button);
        scaleneTriAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(scaleneTriAreaBaseET)) {
                    scaleneTriAreaBaseET.setError("Enter Value");
                } else if (Model.isEmpty(scaleneTriAreaHeightET)) {
                    scaleneTriAreaHeightET.setError("Enter Value");
                } else {
                    double baseB, height, scaleneTriArea;
                    baseB = Double.parseDouble(scaleneTriAreaBaseET.getText().toString());
                    height = Double.parseDouble(scaleneTriAreaHeightET.getText().toString());
                    if (baseB <= 0) {
                        scaleneTriAreaAnsTV.setText("The variable b should be positive");
                    } else if (height <= 0) {
                        scaleneTriAreaAnsTV.setText("The variable h should be positive");
                    } else {
                        scaleneTriArea = (height * baseB) / 2;
                        scaleneTriAreaAnsTV.setText(String.format("%.02f", scaleneTriArea));
                    }
                }
            }
        });

        //acute triangle side A calculatro

        scaleneTriSideABaseET = (EditText) findViewById(R.id.scalene_tri_sideA_base_et);
        scaleneTriSideASideCET = (EditText) findViewById(R.id.scalene_tri_sideA_sideC_et);
        scaleneTriSideAPerimeterET = (EditText) findViewById(R.id.scalene_tri_sideA_perimeter_et);
        scaleneTriSideAAnsTV = (TextView) findViewById(R.id.scalene_tri_sideA_ans_tv);
        scaleneTriSideACalcButton = (Button) findViewById(R.id.scalene_tri_sideA_calc_button);
        scaleneTriSideACalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(scaleneTriSideABaseET)) {
                    scaleneTriSideABaseET.setError("Enter Value");
                } else if (Model.isEmpty(scaleneTriSideASideCET)) {
                    scaleneTriSideASideCET.setError("Enter Value");
                } else if (Model.isEmpty(scaleneTriSideAPerimeterET)) {
                    scaleneTriSideAPerimeterET.setError("Enter Value");
                } else {
                    double sideC, baseB, perimeter, scaleneTriSideA;
                    sideC = Double.parseDouble(scaleneTriSideABaseET.getText().toString());
                    baseB = Double.parseDouble(scaleneTriSideASideCET.getText().toString());
                    perimeter = Double.parseDouble(scaleneTriSideAPerimeterET.getText().toString());
                    if (sideC <= 0) {
                        scaleneTriSideAAnsTV.setText("The variable a should be positive");
                    } else if (baseB <= 0) {
                        scaleneTriSideAAnsTV.setText("The variable b should be positive");
                    } else if (perimeter <= 0) {
                        scaleneTriSideAAnsTV.setText("The variable P should be positive");
                    } else if (perimeter <= (baseB + sideC)) {
                        scaleneTriSideAAnsTV.setText("Invalid input: make sure P>b+c");
                    } else {
                        scaleneTriSideA = perimeter - baseB - sideC;
                        scaleneTriSideAAnsTV.setText(String.format("%.02f", scaleneTriSideA));
                    }
                }
            }
        });

        //acute triangle side B calculator

        scaleneTriBaseSideAET = (EditText) findViewById(R.id.scalene_tri_base_sideA_et);
        scaleneTriBaseSideCET = (EditText) findViewById(R.id.scalene_tri_base_sideC_et);
        scaleneTriBasePerimeterET = (EditText) findViewById(R.id.scalene_tri_base_perimeter_et);
        scaleneTriBaseAnsTV = (TextView) findViewById(R.id.scalene_tri_base_ans_tv);
        scaleneTriBaseCalcButton = (Button) findViewById(R.id.scalene_tri_base_calc_button);
        scaleneTriBaseCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(scaleneTriBaseSideAET)) {
                    scaleneTriBaseSideAET.setError("Enter Value");
                } else if (Model.isEmpty(scaleneTriBaseSideCET)) {
                    scaleneTriBaseSideCET.setError("Enter Value");
                } else if (Model.isEmpty(scaleneTriBasePerimeterET)) {
                    scaleneTriBasePerimeterET.setError("Enter Value");
                } else {
                    double sideA, sideC, perimeter, scaleneTrisideB;
                    sideA = Double.parseDouble(scaleneTriBaseSideAET.getText().toString());
                    sideC = Double.parseDouble(scaleneTriBaseSideCET.getText().toString());
                    perimeter = Double.parseDouble(scaleneTriBasePerimeterET.getText().toString());
                    if (sideA <= 0) {
                        scaleneTriBaseAnsTV.setText("The variable a should be positive");
                    } else if (sideC <= 0) {
                        scaleneTriBaseAnsTV.setText("The variable b should be positive");
                    } else if (perimeter <= 0) {
                        scaleneTriBaseAnsTV.setText("The variable P should be positive");
                    } else if (perimeter <= (sideA + sideC)) {
                        scaleneTriBaseAnsTV.setText("Invalid input: make sure P>b+c");
                    } else {
                        scaleneTrisideB = perimeter - sideA - sideC;
                        scaleneTriBaseAnsTV.setText(String.format("%.02f", scaleneTrisideB));
                    }
                }
            }
        });

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");

        TextView myTextView = (TextView) findViewById(R.id.scalene_tri_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_perimeter_sideA_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_perimeter_sideB_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_perimeter_sideC_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_area_base_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_area_height_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_sideA_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_sideA_base_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_sideA_sideC_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_sideA_perimeter_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_base_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_base_sideA_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_base_sideC_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_base_perimeter_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        scaleneTriPerimeterSideAET.setTypeface(myTypeFace);
        scaleneTriPerimeterBaseET.setTypeface(myTypeFace);
        scaleneTriPerimeterSideCET.setTypeface(myTypeFace);
        scaleneTriPerimeterAnsTV.setTypeface(myTypeFace);
        scaleneTriPerimeterCalcButton.setTypeface(myTypeFace);
        scaleneTriPerimeterClearButton.setTypeface(myTypeFace);



        scaleneTriAreaBaseET.setTypeface(myTypeFace);
        scaleneTriAreaHeightET.setTypeface(myTypeFace);
        scaleneTriAreaAnsTV.setTypeface(myTypeFace);
        scaleneTriAreaCalcButton.setTypeface(myTypeFace);
        scaleneTriArearClearButton.setTypeface(myTypeFace);


        scaleneTriSideABaseET.setTypeface(myTypeFace);
        scaleneTriSideASideCET.setTypeface(myTypeFace);
        scaleneTriSideAPerimeterET.setTypeface(myTypeFace);
        scaleneTriSideAAnsTV.setTypeface(myTypeFace);
        scaleneTriSideACalcButton.setTypeface(myTypeFace);
        scaleneTriSideAClearButton.setTypeface(myTypeFace);

        scaleneTriBaseSideAET.setTypeface(myTypeFace);
        scaleneTriBaseSideCET.setTypeface(myTypeFace);
        scaleneTriBasePerimeterET.setTypeface(myTypeFace);
        scaleneTriBaseAnsTV.setTypeface(myTypeFace);
        scaleneTriBaseCalcButton.setTypeface(myTypeFace);
        scaleneTriSideBClearButton.setTypeface(myTypeFace);

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

    @Override
    protected void onResume() {
        super.onResume();
    }
}
