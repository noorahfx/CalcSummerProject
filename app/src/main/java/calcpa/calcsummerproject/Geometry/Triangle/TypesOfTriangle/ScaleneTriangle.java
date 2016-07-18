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

import calcpa.calcsummerproject.R;
import io.github.kexanie.library.MathView;

public class ScaleneTriangle extends AppCompatActivity {
 /**   MathView scalene_triangle_paramter;
    String s_t_paramter = "$$P =2a+b$$";

    MathView scalene_triangle_area;
    String s_t_area = "$$A =\\frac{bh_{b}}{2}$$";

    MathView scalene_triangle_side_a;
    String s_t_side_a = "$$a =\\frac{p}{2}-\\frac{b}{2}$$";

    MathView scalene_triangle_height;
    String s_t_height = "$$h_{b} = \\sqrt{a^{2}-\\frac{b_{2}}{4}}$$";
*/
    EditText sideAEditText;
    EditText sideBEditText;
    TextView answerEditText;
    Button calculateResultButton;


    //scalene triangle area
    EditText areaSideAET;
    EditText areaSideBET;
    TextView areaAnswerTV;
    Button calculateAreaButton;

    //scalene triangle hypotenuse
    EditText hypSideAET;
    EditText hypSideBET;
    TextView hypAnswerTV;
    Button calculateHypButton;

    //scalene triangle side A calculatro
    EditText sideAAreaET;
    EditText sideALegBET;
    TextView sideAAnswerTV;
    Button calculateSideAButton;

    //scalene triangle side B calculator
    EditText sideBAreaET;
    EditText sideBLegAET;
    TextView sideBAnswerTV;
    Button calculateSideBButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scalene_triangle);


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
**/

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Take cover.ttf");
        TextView myTextView = (TextView)findViewById(R.id.perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        //initialize the EditText
        sideAEditText = (EditText) findViewById(R.id.sidAEditText);
        sideBEditText = (EditText) findViewById(R.id.sidBEditText);
        answerEditText = (TextView) findViewById(R.id.answerEditText);
        calculateResultButton = (Button) findViewById(R.id.calculateButtonID);
        calculateResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sideA = sideAEditText.getText().toString();
                String sideB = sideBEditText.getText().toString();

                double perimeter = Double.parseDouble(sideA) + Double.parseDouble(sideB) +
                        Math.sqrt(Math.pow(Double.parseDouble(sideA), 2) +
                                Math.pow(Double.parseDouble(sideB), 2));
                answerEditText.setText(String.format("%.02f",perimeter));

                if (TextUtils.isEmpty(sideA)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(sideB)) {
                    Toast.makeText(getApplicationContext(), "Enter base", Toast.LENGTH_SHORT).show();
                }
            }
        });

        areaSideAET = (EditText)findViewById(R.id.area_base_et);
        areaSideBET = (EditText)findViewById(R.id.area_height_et);
        areaAnswerTV = (TextView)findViewById(R.id.area_answer_tv);
        calculateAreaButton = (Button)findViewById(R.id.area_click_botton);
        calculateAreaButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                String sideA = areaSideAET.getText().toString();
                String sideB =areaSideBET.getText().toString();

                double area = (Double.parseDouble(sideA)*Double.parseDouble(sideB))/2;
                areaAnswerTV.setText(String.format(".02f",area));

                if (TextUtils.isEmpty(sideA)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(sideB)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter base", Toast.LENGTH_SHORT).show();
                }
            }
        });

        hypSideAET =(EditText)findViewById(R.id.hyp_side_a_et);
        hypSideBET =(EditText)findViewById(R.id.hyp_side_b_et);
        hypAnswerTV=(TextView)findViewById(R.id.hyp_answer_tv);
        calculateHypButton =(Button)findViewById(R.id.hyp_calculate_button);
        calculateHypButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sideA = areaSideAET.getText().toString();
                String sideB =areaSideBET.getText().toString();

                double hyp = Math.sqrt(Math.pow(Double.parseDouble(sideA),2)+
                        Math.pow(Double.parseDouble(sideB),2));
                areaAnswerTV.setText(String.format(".02f",hyp));

                if (TextUtils.isEmpty(sideA)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(sideB)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter base", Toast.LENGTH_SHORT).show();
                }
            }
        });

        sideAAreaET =(EditText)findViewById(R.id.scalene_triangle__area_et);
        sideALegBET =(EditText)findViewById(R.id.scalene_triangle_side_b_et);
        sideAAnswerTV =(TextView)findViewById(R.id.scalene_triangle_answer_tv);
        calculateSideAButton =(Button)findViewById(R.id.scalene_triangle_calc_button);
        calculateSideAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sideA = areaSideAET.getText().toString();
                String sideB =areaSideBET.getText().toString();

                double sideAFormula = 2*((Double.parseDouble(sideA)*
                        Double.parseDouble(sideB))/2)/Double.parseDouble(sideB);
                areaAnswerTV.setText(String.format(".02f",sideAFormula));

                if (TextUtils.isEmpty(sideA)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(sideB)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter base", Toast.LENGTH_SHORT).show();
                }
            }
        });
        sideBAreaET =(EditText)findViewById(R.id.scalene_triangle_sid_b_area_et);
        sideBLegAET =(EditText)findViewById(R.id.scalene_triangle_side_a_et);
        sideBAnswerTV =(TextView)findViewById(R.id.scalene_triangle_side_b_answer_tv);
        calculateSideBButton =(Button)findViewById(R.id.scalene_triangle_sid_b_calc_button);
        calculateSideBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sideA = areaSideAET.getText().toString();
                String sideB =areaSideBET.getText().toString();

                double sideBFormula = 2*((Double.parseDouble(sideA)*
                        Double.parseDouble(sideB))/2)/Double.parseDouble(sideA);
                areaAnswerTV.setText(String.format(".02f",sideBFormula));

                if (TextUtils.isEmpty(sideA)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(sideB)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter base", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
