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

import org.w3c.dom.Text;

import calcpa.calcsummerproject.Model;
import calcpa.calcsummerproject.R;
import io.github.kexanie.library.MathView;

public class IsoscelesTriangle extends AppCompatActivity {
    /**
     * MathView isosceles_triangle_paramter;
     * String i_t_paramter = "$$P =2a+b$$";
     * <p/>
     * MathView isosceles_triangle_area;
     * String i_t_area = "$$A =\\frac{bh_{b}}{2}$$";
     * <p/>
     * MathView isosceles_triangle_side_a;
     * String i_t_side_a = "$$a =\\frac{p}{2}-\\frac{b}{2}$$";
     * <p/>
     * MathView isosceles_triangle_height;
     * String i_t_height = "$$h_{b} = \\sqrt{a^{2}-\\frac{b_{2}}{4}}$$";
     */

    //perimeter
    EditText isoTriPerimeterSideET;
    EditText isoTriPerimeterBaseET;
    TextView isoTriPerimeterAnswerTV;
    Button isoTriPerimeterCalcButton;


    //Area
    EditText isoTriAreaBaseET;
    EditText isoTriAreaHeightET;
    TextView isoTriAreaAnswerTV;
    Button isoTriAreaCalcButton;


    //Side
    EditText isoTriSideBaseET;
    EditText isoTriSidePerimeterET;
    TextView isoTriSideAnswerTV;
    Button isoTriSideCalcButton;

    //Base
    EditText isoTriBaseSideET;
    EditText isoTriBasePerimeterET;
    TextView isoTriBaseAnswerTV;
    Button isoTriBaseCalcButton;

    //Height
    //Side
    EditText isoTriHeightBaseET;
    EditText isoTriHeightPerimeterET;
    TextView isoTriHeightAnswerTV;
    Button isoTriHeightCalcButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isosceles_triangle);

        /**  Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Take cover.ttf");
         TextView myTextView = (TextView)findViewById(R.id.isosceles_triangle_title);
         assert myTextView != null;
         myTextView.setTypeface(myTypeFace);

         myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
         myTextView = (TextView)findViewById(R.id.isosceles_triangle_define_id);
         assert myTextView != null;
         myTextView.setTypeface(myTypeFace);

         myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
         myTextView=(TextView)findViewById(R.id.isosceles_tr_def_str_id);
         assert myTextView != null;
         myTextView.setTypeface(myTypeFace);



         myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
         myTextView=(TextView)findViewById(R.id.isosceles_tri_formula_id);
         assert myTextView != null;
         myTextView.setTypeface(myTypeFace);

         myTypeFace = Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
         myTextView = (TextView)findViewById(R.id.isosceles_tr_prop_id);
         assert myTextView != null;
         myTextView.setTypeface(myTypeFace);

         myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
         myTextView = (TextView)findViewById(R.id.isosceles_tr_prop_1_id);
         assert myTextView != null;
         myTextView.setTypeface(myTypeFace);

         isosceles_triangle_paramter =(MathView)findViewById(R.id.isosceles_triangle_paramter);
         assert isosceles_triangle_paramter != null;
         isosceles_triangle_paramter.setText(i_t_paramter);

         isosceles_triangle_area = (MathView)findViewById(R.id.isosceles_triangle_area);
         assert isosceles_triangle_area != null;
         isosceles_triangle_area.setText(i_t_area);

         isosceles_triangle_side_a =(MathView)findViewById(R.id.isosceles_triangle_side_a);
         assert isosceles_triangle_side_a != null;
         isosceles_triangle_side_a.setText(i_t_side_a);

         isosceles_triangle_height =(MathView)findViewById(R.id.isosceles_triangle_height);
         assert isosceles_triangle_height != null;
         isosceles_triangle_height.setText(i_t_height);



         }

         }

         Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Take cover.ttf");
         TextView myTextView = (TextView)findViewById(R.id.perimeter_text);
         assert myTextView != null;
         myTextView.setTypeface(myTypeFace);
         */
        //initialize the EditText
        //perimeter
        isoTriPerimeterSideET = (EditText) findViewById(R.id.iso_triangle_perimeter_sideA_et);
        isoTriPerimeterBaseET = (EditText) findViewById(R.id.iso_triangle_perimeter_base_et);
        isoTriPerimeterAnswerTV = (TextView) findViewById(R.id.iso_triangle_perimeter_ans_tv);
        isoTriPerimeterCalcButton = (Button) findViewById(R.id.iso_triangle_perimeter_calc_button);
        isoTriPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(isoTriPerimeterSideET)) {
                    isoTriPerimeterSideET.setError("Enter Value");
                } else if (Model.isEmpty(isoTriPerimeterBaseET)) {
                    isoTriPerimeterBaseET.setError("Enter Value");
               } else {
                    double sideA, baseB,isoTriPerimeter;
                    sideA = Double.parseDouble(isoTriPerimeterSideET.getText().toString());
                    baseB = Double.parseDouble(isoTriPerimeterBaseET.getText().toString());
                      if (sideA <= 0) {
                        isoTriPerimeterAnswerTV.setText("The variable a should be positive");
                    } else if (baseB <= 0) {
                        isoTriPerimeterAnswerTV.setText("The variable b should be positive");
                    } else if (baseB >=(2 * sideA)) {
                        isoTriPerimeterAnswerTV.setText("Invalid input: make sure b<2*a");
                  } else {
                          isoTriPerimeter = 2 * sideA + baseB;
                        isoTriPerimeterAnswerTV.setText(String.format("%.02f", isoTriPerimeter));
                    }
                }
            }
        });


        //Area
        isoTriAreaBaseET = (EditText)findViewById(R.id.iso_triangle_area_base_et);
        isoTriAreaHeightET = (EditText)findViewById(R.id.iso_triangle_area_height_et);
        isoTriAreaAnswerTV = (TextView)findViewById(R.id.iso_triangle_area_ans_tv);
        isoTriAreaCalcButton = (Button)findViewById(R.id.iso_triangle_area_calc_button);
        isoTriAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(isoTriAreaBaseET)) {
                    isoTriAreaBaseET.setError("Enter Value");
                } else if (Model.isEmpty(isoTriAreaHeightET)) {
                    isoTriAreaHeightET.setError("Enter Value");
                } else {
                    double baseB, height,isoTriArea;
                    baseB = Double.parseDouble(isoTriAreaBaseET.getText().toString());
                    height = Double.parseDouble(isoTriAreaHeightET.getText().toString());
                    if (baseB <= 0) {
                        isoTriAreaAnswerTV.setText("The variable b should be positive");
                    } else if (height <= 0) {
                        isoTriAreaAnswerTV.setText("The variable h should be positive");
                    } else {
                        isoTriArea = (baseB * height)/2;
                        isoTriAreaAnswerTV.setText(String.format("%.02f", isoTriArea));
                    }
                }
            }
        });


        //Side
        isoTriSideBaseET = (EditText)findViewById(R.id.iso_triangle_side_base_et);
        isoTriSidePerimeterET = (EditText)findViewById(R.id.iso_triangle_side_perimeter_et);
        isoTriSideAnswerTV = (TextView)findViewById(R.id.iso_triangle_side_ans_tv);
        isoTriSideCalcButton = (Button)findViewById(R.id.iso_triangle_side_calc_button);
        isoTriSideCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(isoTriSideBaseET)) {
                    isoTriSideBaseET.setError("Enter Value");
                } else if (Model.isEmpty(isoTriSidePerimeterET)) {
                    isoTriSidePerimeterET.setError("Enter Value");
                } else {
                    double baseB, perimeter,isoTriSide;
                    baseB = Double.parseDouble(isoTriSideBaseET.getText().toString());
                    perimeter = Double.parseDouble(isoTriSidePerimeterET.getText().toString());
                    if (baseB <= 0) {
                        isoTriSideAnswerTV.setText("The variable a should be positive");
                    } else if (perimeter <= 0) {
                        isoTriSideAnswerTV.setText("The variable b should be positive");
                    } else if (perimeter <=(2 * baseB)) {
                        isoTriSideAnswerTV.setText("Invalid input: make sure P<2*a");
                    }else {
                        isoTriSide = (perimeter/2)-(baseB/2);
                        isoTriSideAnswerTV.setText(String.format("%.02f", isoTriSide));
                    }
                }
            }
        });


        //Base
        isoTriBaseSideET =(EditText)findViewById(R.id.iso_triangle_base_side_et);
        isoTriBasePerimeterET =(EditText)findViewById(R.id.iso_triangle_base_perimeter_et);
        isoTriBaseAnswerTV = (TextView)findViewById(R.id.iso_triangle_base_ans_tv);
        isoTriBaseCalcButton =(Button)findViewById(R.id.iso_triangle_base_calc_button);
        isoTriBaseCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(isoTriBaseSideET)) {
                    isoTriBaseSideET.setError("Enter Value");
                } else if (Model.isEmpty(isoTriBasePerimeterET)) {
                    isoTriBasePerimeterET.setError("Enter Value");
                } else {
                    double sideA, perimeter, isoTriBase;
                    sideA = Double.parseDouble(isoTriBaseSideET.getText().toString());
                    perimeter = Double.parseDouble(isoTriBasePerimeterET.getText().toString());
                    if (sideA <= 0) {
                        isoTriBaseAnswerTV.setText("The variable a should be positive");
                    } else if (perimeter <= 0) {
                        isoTriBaseAnswerTV.setText("The variable b should be positive");
                    } else if (perimeter <= (2 * sideA)) {
                        isoTriBaseAnswerTV.setText("Invalid input: make sure P<2*a");
                    } else {
                        isoTriBase = perimeter - 2*sideA;
                        isoTriBaseAnswerTV.setText(String.format("%.02f", isoTriBase));
                    }
                }
            }
        });


        //Height
        isoTriHeightBaseET =(EditText)findViewById(R.id.iso_triangle_height_base_et);
        isoTriHeightPerimeterET =(EditText)findViewById(R.id.iso_triangle_height_area_et);
        isoTriHeightAnswerTV = (TextView)findViewById(R.id.iso_triangle_height_ans_tv);
        isoTriHeightCalcButton =(Button)findViewById(R.id.iso_triangle_height_calc_button);
        isoTriHeightCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(isoTriHeightBaseET)) {
                    isoTriHeightBaseET.setError("Enter Value");
                } else if (Model.isEmpty(isoTriHeightPerimeterET)) {
                    isoTriHeightPerimeterET.setError("Enter Value");
                } else {
                    double base, area, isoTriHeight;
                    base = Double.parseDouble(isoTriHeightBaseET.getText().toString());
                    area = Double.parseDouble(isoTriHeightPerimeterET.getText().toString());
                    if (base <= 0) {
                        isoTriHeightAnswerTV.setText("The variable a should be positive");
                    } else if (area <= 0) {
                        isoTriHeightAnswerTV.setText("The variable b should be positive");
                    } else {
                        isoTriHeight = 2*(area/base);
                        isoTriHeightAnswerTV.setText(String.format("%.02f", isoTriHeight));
                    }
                }
            }
        });

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

