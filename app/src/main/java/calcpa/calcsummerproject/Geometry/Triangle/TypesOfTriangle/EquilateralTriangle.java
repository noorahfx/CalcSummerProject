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

public class EquilateralTriangle extends AppCompatActivity {
  /**  MathView equilateral_triangle_paramter;
    String e_t_paramter = "$$P=3a$$";

    MathView equilateral_triangle_area;
    String e_t_area = "$$A=\\frac{\\sqrt{3}}{4}{a^{2}}$$";

    MathView equilateral_triangle_side_a;
    String e_t_side_a = "$$a=\\frac{P}{3}$$";


*/

  EditText sideAEditText;
    TextView answerEditText;
    Button calculateResultButton;


    //right triangle area
    EditText areaSideAET;
    EditText areaSideBET;
    TextView areaAnswerTV;
    Button calculateAreaButton;



    //right triangle side A calculatro
    EditText sideAAreaET;
    EditText sideALegBET;
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
/**
        //initialize the EditText
        sideAEditText = (EditText) findViewById(R.id.sidAEditText);
         answerEditText = (TextView) findViewById(R.id.answerEditText);
        calculateResultButton = (Button) findViewById(R.id.calculateButtonID);
        calculateResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sideA = sideAEditText.getText().toString();

                double perimeter = 3*Double.parseDouble(sideA)/3;
                answerEditText.setText(String.format("%.02f",perimeter));

                if (TextUtils.isEmpty(sideA)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
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

                double area = (Math.sqrt(3) / 4) * Math.pow(Double.parseDouble(sideA),2);

                areaAnswerTV.setText(String.format(".02f",area));

                if (TextUtils.isEmpty(sideA)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });


        sideAAreaET =(EditText)findViewById(R.id.right_triangle__area_et);
        sideALegBET =(EditText)findViewById(R.id.right_triangle_side_b_et);
        sideAAnswerTV =(TextView)findViewById(R.id.right_triangle_answer_tv);
        calculateSideAButton =(Button)findViewById(R.id.right_triangle_calc_button);
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

*/

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}