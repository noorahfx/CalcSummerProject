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

public class ObtuseTriangle extends AppCompatActivity {
  /**  MathView obtuse_triangle_paramter;
    String o_t_paramter = "$$P=a+b+c$$";
    
    MathView obtuse_triangle_area;
    String o_t_area = "$$A=\\frac{hb}{2}$$";

    MathView obtuse_triangle_side_a;
    String o_t_side_a = "$$a = 2 \\frac{A}{b}$$";

    MathView obtuse_triangle_side_b;
    String o_t_side_b = "$$b = 2 \\frac{A}{a}$$";

   */

  //perimeter
    EditText obtuseTriPerimeterSideAET;
    EditText obtuseTriPerimeterBaseET;
    EditText obtuseTriPerimeterSideCET;
    TextView obtuseTriPerimeterAnsTV;
    Button obtuseTriPerimeterCalcButton;
    Button obtuseTriPerimClearButton;


    // area
    EditText obtuseTriAreaBaseET;
    EditText obtuseTriAreaHeightET;
    TextView obtuseTriAreaAnsTV;
    Button obtuseTriAreaCalcButton;
    Button obtuseTriAreaClearButton;




    //side A calculatro
    EditText obtuseTriSideABaseET;
    EditText obtuseTriSideASideCET;
    EditText obtuseTriSideAPerimeterET;
    TextView obtuseTriSideAAnsTV;
    Button obtuseTriSideACalcButton;
    Button obtuseTriSideAClearButton;

    //side B calculator
    EditText obtuseTriBaseSideAET;
    EditText obtuseTriBaseSideCET;
    EditText obtuseTriBasePerimeterET;
    TextView obtuseTriBaseAnsTV;
    Button obtuseTriBaseCalcButton;
    Button obtuseTriBaseClearButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obtuse_triangle);
/**
        // Perimeter Clear button
        obtuseTriPerimClearButton = (Button) findViewById(R.id.iso_tri_perimeter_clear_button);
        obtuseTriPerimClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtuseTriPerimeterSideAET.setText("");
                obtuseTriPerimeterBaseET.setText("");
                obtuseTriPerimeterSideCET.setText("");
                obtuseTriPerimeterAnsTV.setText("");
            }
        });

        // Area Clear button
        obtuseTriAreaClearButton = (Button) findViewById(R.id.iso_triangle_area_clear_button);
        obtuseTriAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtuseTriAreaBaseET.setText("");
                obtuseTriAreaHeightET.setText("");
                obtuseTriAreaAnsTV.setText("");
            }
        });

        // Side A Clear button
        obtuseTriSideAClearButton = (Button) findViewById(R.id.iso_triangle_side_clear_button);
        obtuseTriSideAClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtuseTriSideABaseET.setText("");
                obtuseTriSideASideCET.setText("");
                obtuseTriSideAPerimeterET.setText("");
                obtuseTriSideAAnsTV.setText("");
            }
        });

        // Side B Clear button
        obtuseTriBaseClearButton = (Button) findViewById(R.id.iso_triangle_base_clear_button);
        obtuseTriBaseClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtuseTriBaseSideAET.setText("");
                obtuseTriBaseSideCET.setText("");
                obtuseTriBasePerimeterET.setText("");
                obtuseTriBaseAnsTV.setText("");
            }
        });



        //initialize the EditText
        obtuseTriPerimeterSideAET = (EditText) findViewById(R.id.obtuse_tri_perimeter_sideA_et);
        obtuseTriPerimeterBaseET = (EditText) findViewById(R.id.obtuse_tri_perimeter_sideB_et);
        obtuseTriPerimeterSideCET = (EditText) findViewById(R.id.obtuse_tri_perimeter_sideC_et);
        obtuseTriPerimeterAnsTV = (TextView) findViewById(R.id.obtuse_tri_perimeter_ans_tv);
        obtuseTriPerimeterCalcButton = (Button) findViewById(R.id.obtuse_tri_perimeter_calc_button);
        obtuseTriPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(obtuseTriPerimeterSideAET)) {
                    obtuseTriPerimeterSideAET.setError("Enter Value");
                } else if (Model.isEmpty(obtuseTriPerimeterBaseET)) {
                    obtuseTriPerimeterBaseET.setError("Enter Value");
                } else if (Model.isEmpty(obtuseTriPerimeterSideCET)) {
                    obtuseTriPerimeterSideCET.setError("Enter Value");
                } else {
                    double sideA, baseB, sideC, obtuseTriPerimeter;
                    sideA = Double.parseDouble(obtuseTriPerimeterSideAET.getText().toString());
                    baseB = Double.parseDouble(obtuseTriPerimeterBaseET.getText().toString());
                    sideC = Double.parseDouble(obtuseTriPerimeterSideCET.getText().toString());
                    if (sideA <= 0) {
                        obtuseTriPerimeterAnsTV.setText("The variable a should be positive");
                    } else if (baseB <= 0) {
                        obtuseTriPerimeterAnsTV.setText("The variable b should be positive");
                    } else if (sideC <= 0) {
                        obtuseTriPerimeterAnsTV.setText("The variable c should be positive");
                    } else if (sideA >= (baseB + sideC)) {
                        obtuseTriPerimeterAnsTV.setText("Invalid input: make sure b+c>a");
                    } else {
                        obtuseTriPerimeter = sideA + baseB + sideC;
                        obtuseTriPerimeterAnsTV.setText(String.format("%.02f", obtuseTriPerimeter));
                    }
                }
            }
        });


        //acute triangle area

        obtuseTriAreaBaseET = (EditText) findViewById(R.id.obtuse_tri_area_base_et);
        obtuseTriAreaHeightET = (EditText) findViewById(R.id.obtuse_tri_area_height_et);
        obtuseTriAreaAnsTV = (TextView) findViewById(R.id.obtuse_tri_area_ans_tv);
        obtuseTriAreaCalcButton = (Button) findViewById(R.id.obtuse_tri_area_calc_button);
        obtuseTriAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(obtuseTriAreaBaseET)) {
                    obtuseTriAreaBaseET.setError("Enter Value");
                } else if (Model.isEmpty(obtuseTriAreaHeightET)) {
                    obtuseTriAreaHeightET.setError("Enter Value");
                } else {
                    double baseB, height, obtuseTriArea;
                    baseB = Double.parseDouble(obtuseTriAreaBaseET.getText().toString());
                    height = Double.parseDouble(obtuseTriAreaHeightET.getText().toString());
                    if (baseB <= 0) {
                        obtuseTriAreaAnsTV.setText("The variable b should be positive");
                    } else if (height <= 0) {
                        obtuseTriAreaAnsTV.setText("The variable h should be positive");
                    } else {
                        obtuseTriArea = (height * baseB) / 2;
                        obtuseTriAreaAnsTV.setText(String.format("%.02f", obtuseTriArea));
                    }
                }
            }
        });


        //acute triangle side A calculatro

        obtuseTriSideABaseET = (EditText) findViewById(R.id.obtuse_tri_sideA_base_et);
        obtuseTriSideASideCET = (EditText) findViewById(R.id.obtuse_tri_sideA_sideC_et);
        obtuseTriSideAPerimeterET = (EditText) findViewById(R.id.obtuse_tri_sideA_perimeter_et);
        obtuseTriSideAAnsTV = (TextView) findViewById(R.id.obtuse_tri_sideA_ans_tv);
        obtuseTriSideACalcButton = (Button) findViewById(R.id.obtuse_tri_sideA_calc_button);
        obtuseTriSideACalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(obtuseTriSideABaseET)) {
                    obtuseTriSideABaseET.setError("Enter Value");
                } else if (Model.isEmpty(obtuseTriSideASideCET)) {
                    obtuseTriSideASideCET.setError("Enter Value");
                } else if (Model.isEmpty(obtuseTriSideAPerimeterET)) {
                    obtuseTriSideAPerimeterET.setError("Enter Value");
                } else {
                    double sideC, baseB, perimeter, obtuseTriSideA;
                    sideC = Double.parseDouble(obtuseTriSideABaseET.getText().toString());
                    baseB = Double.parseDouble(obtuseTriSideASideCET.getText().toString());
                    perimeter = Double.parseDouble(obtuseTriSideAPerimeterET.getText().toString());
                    if (sideC <= 0) {
                        obtuseTriSideAAnsTV.setText("The variable a should be positive");
                    } else if (baseB <= 0) {
                        obtuseTriSideAAnsTV.setText("The variable b should be positive");
                    } else if (perimeter <= 0) {
                        obtuseTriSideAAnsTV.setText("The variable P should be positive");
                    } else if (perimeter <= (baseB + sideC)) {
                        obtuseTriSideAAnsTV.setText("Invalid input: make sure P>b+c");
                    } else {
                        obtuseTriSideA = perimeter - baseB - sideC;
                        obtuseTriSideAAnsTV.setText(String.format("%.02f", obtuseTriSideA));
                    }
                }
            }
        });

        //acute triangle side B calculator

        obtuseTriBaseSideAET = (EditText) findViewById(R.id.obtuse_tri_base_sideA_et);
        obtuseTriBaseSideCET = (EditText) findViewById(R.id.obtuse_tri_base_sideC_et);
        obtuseTriBasePerimeterET = (EditText) findViewById(R.id.obtuse_tri_base_perimeter_et);
        obtuseTriBaseAnsTV = (TextView) findViewById(R.id.obtuse_tri_base_ans_tv);
        obtuseTriBaseCalcButton = (Button) findViewById(R.id.obtuse_tri_base_calc_button);
        obtuseTriBaseCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(obtuseTriBaseSideAET)) {
                    obtuseTriBaseSideAET.setError("Enter Value");
                } else if (Model.isEmpty(obtuseTriBaseSideCET)) {
                    obtuseTriBaseSideCET.setError("Enter Value");
                } else if (Model.isEmpty(obtuseTriBasePerimeterET)) {
                    obtuseTriBasePerimeterET.setError("Enter Value");
                } else {
                    double sideA, sideC, perimeter, obtuseTrisideB;
                    sideA = Double.parseDouble(obtuseTriBaseSideAET.getText().toString());
                    sideC = Double.parseDouble(obtuseTriBaseSideCET.getText().toString());
                    perimeter = Double.parseDouble(obtuseTriBasePerimeterET.getText().toString());
                    if (sideA <= 0) {
                        obtuseTriBaseAnsTV.setText("The variable a should be positive");
                    } else if (sideC <= 0) {
                        obtuseTriBaseAnsTV.setText("The variable b should be positive");
                    } else if (perimeter <= 0) {
                        obtuseTriBaseAnsTV.setText("The variable P should be positive");
                    } else if (perimeter <= (sideA + sideC)) {
                        obtuseTriBaseAnsTV.setText("Invalid input: make sure P>b+c");
                    } else {
                        obtuseTrisideB = perimeter - sideA - sideC;
                        obtuseTriBaseAnsTV.setText(String.format("%.02f", obtuseTrisideB));
                    }
                }
            }
        });

*/

      /**  Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Take cover.ttf");
        TextView myTextView = (TextView)findViewById(R.id.obtuse_triangle_title);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
        myTextView = (TextView)findViewById(R.id.obtuse_triangle_define_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
        myTextView = (TextView)findViewById(R.id.obtuse_tr_att_1_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);


        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.obtuse_tr_def_str_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.obtuse_tr_attr_str);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.obtuse_tri_formula_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView = (TextView)findViewById(R.id.obtuse_tr_prop_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
        myTextView = (TextView)findViewById(R.id.obtuse_tr_prop_1_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);



        obtuse_triangle_paramter =(MathView)findViewById(R.id.obtuse_triangle_paramter);
        assert obtuse_triangle_paramter != null;
        obtuse_triangle_paramter.setText(o_t_paramter);

        obtuse_triangle_area = (MathView)findViewById(R.id.obtuse_triangle_area);
        assert obtuse_triangle_area != null;
        obtuse_triangle_area.setText(o_t_area);



        obtuse_triangle_side_a =(MathView)findViewById(R.id.obtuse_triangle_side_a);
        assert obtuse_triangle_side_a != null;
        obtuse_triangle_side_a.setText(o_t_side_a);

        obtuse_triangle_side_b =(MathView)findViewById(R.id.obtuse_triangle_side_b);
        assert obtuse_triangle_side_b != null;
        obtuse_triangle_side_b.setText(o_t_side_b);



    }

} 

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Take cover.ttf");
        TextView myTextView = (TextView)findViewById(R.id.perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

  */      
    }
  /**  @Override
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

    } */
}

