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


    EditText sideAEditText;
    EditText sideBEditText;
    EditText sideCPerimeterEditText;
    TextView answerEditText;
    Button calculateResultButton;



    //obtuse triangle area
    EditText areaSideAET;
    EditText areaSideBET;
    TextView areaAnswerTV;
    Button calculateAreaButton;

    //obtuse triangle side A calculatro
    EditText sideAAreaET;
    EditText sideALegBET;
    TextView sideAAnswerTV;
    Button calculateSideAButton;

    //obtuse triangle side B calculator
    EditText sideBAreaET;
    EditText sideBLegAET;
    TextView sideBAnswerTV;
    Button calculateSideBButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obtuse_triangle);



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

} */

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Take cover.ttf");
        TextView myTextView = (TextView)findViewById(R.id.perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

  /**      //initialize the EditText
        sideAEditText = (EditText) findViewById(R.id.sidAEditText);
        sideBEditText = (EditText) findViewById(R.id.sidBEditText);
        answerEditText = (TextView) findViewById(R.id.answerEditText);
        sideCPerimeterEditText = (EditText)findViewById(R.id.side_c_perimeter_edit_text);
        calculateResultButton = (Button) findViewById(R.id.calculateButtonID);
        calculateResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sideA = sideAEditText.getText().toString();
                String sideB = sideBEditText.getText().toString();
                String sideC = sideCPerimeterEditText.getText().toString();

                double perimeter = Double.parseDouble(sideA) + Double.parseDouble(sideB) +
                        Double.parseDouble(sideC);
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


        sideAAreaET =(EditText)findViewById(R.id.obtuse_triangle__area_et);
        sideALegBET =(EditText)findViewById(R.id.obtuse_triangle_side_b_et);
        sideAAnswerTV =(TextView)findViewById(R.id.obtuse_triangle_answer_tv);
        calculateSideAButton =(Button)findViewById(R.id.obtuse_triangle_calc_button);
        calculateSideAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String height = areaSideAET.getText().toString();
                String sideB =areaSideBET.getText().toString();

                double sideAFormula = 2*(Double.parseDouble(height)/
                        Double.parseDouble(sideB));
                areaAnswerTV.setText(String.format(".02f",sideAFormula));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(sideB)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter base", Toast.LENGTH_SHORT).show();
                }
            }
        });
        sideBAreaET =(EditText)findViewById(R.id.obtuse_triangle_sid_b_area_et);
        sideBLegAET =(EditText)findViewById(R.id.obtuse_triangle_side_a_et);
        sideBAnswerTV =(TextView)findViewById(R.id.obtuse_triangle_side_b_answer_tv);
        calculateSideBButton =(Button)findViewById(R.id.obtuse_triangle_sid_b_calc_button);
        calculateSideBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sideA = areaSideAET.getText().toString();
                String sideB =areaSideBET.getText().toString();

                double sideBFormula = 2*(Double.parseDouble(sideA)/
                        Double.parseDouble(sideB));
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
        }); */
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}

