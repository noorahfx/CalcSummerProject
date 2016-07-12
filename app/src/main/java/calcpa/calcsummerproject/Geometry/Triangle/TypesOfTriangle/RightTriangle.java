package calcpa.calcsummerproject.Geometry.Triangle.TypesOfTriangle;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import calcpa.calcsummerproject.R;
import io.github.kexanie.library.MathView;


public class RightTriangle extends AppCompatActivity {

    EditText sideAEditText;
    EditText sideBEditText;
    TextView answerEditText;

    Button calculateResultButton;

  //  private double sideA;
    //private double sideB;
    //private  final double hypotenuse = Math.sqrt(Math.pow(sideA,2)+ Math.pow(sideB,2));

    //right triangle area
    EditText areaSideAET;
    EditText areaSideBET;
    TextView areaAnswerTV;
    Button calculateAreaButton;



    /**
       MathView right_triangle_paramter;
       String r_t_paramter = "$$P=a+b+(\\sqrt{a^2+b^2})$$";

      MathView right_triangle_area;
       String r_t_area = "$$A=\\frac{ab}{2}$$";

       MathView right_triangle_side_a;
       String r_t_side_a = "$$a = 2 \\frac{A}{b}$$";

       MathView right_triangle_side_b;
       String r_t_side_b = "$$b = 2 \\frac{A}{a}$$";

       MathView righ_triangle_side_c;
       String r_t_side_c = "$$c=\\sqrt{a^{2}+b^{2}}$$";

   */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right_triangle);
/**
        right_triangle_paramter = (MathView)findViewById(R.id.right_triangle_perimeter_formula);
        assert right_triangle_paramter != null;
        right_triangle_paramter.setText(r_t_paramter);
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
                    Toast.makeText(getApplicationContext(), "Enter height", Toast.LENGTH_SHORT).show();

                }
                if (TextUtils.isEmpty(sideB)) {
                    Toast.makeText(getApplicationContext(), "Enter base", Toast.LENGTH_SHORT).show();
                    return;
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
                    Toast.makeText(getApplicationContext(), "Enter height", Toast.LENGTH_SHORT).show();

                }
                if (TextUtils.isEmpty(sideB)) {
                    Toast.makeText(getApplicationContext(), "Enter base", Toast.LENGTH_SHORT).show();
                    return;
                }

            }

        });




    }


    @Override
    protected void onResume() {
        super.onResume();
    }
}
