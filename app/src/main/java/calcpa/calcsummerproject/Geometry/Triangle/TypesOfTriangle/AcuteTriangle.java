package calcpa.calcsummerproject.Geometry.Triangle.TypesOfTriangle;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import calcpa.calcsummerproject.R;
import io.github.kexanie.library.MathView;
public class AcuteTriangle extends AppCompatActivity {
    EditText sideAEditText;
    EditText sideBEditText;
    EditText sideCEditText;
    TextView answerEditText;
    Button calculateResultButton;


    //acute triangle area
    EditText areaSideAET;
    EditText areaSideBET;
    TextView areaAnswerTV;
    Button calculateAreaButton;

    //acute triangle hypotenuse
    EditText hypSideAET;
    EditText hypSideBET;
    TextView hypAnswerTV;
    Button calculateHypButton;

    //acute triangle side A calculatro
    EditText sideAAreaET;
    EditText sideALegBET;
    TextView sideAAnswerTV;
    Button calculateSideAButton;

    //acute triangle side B calculator
    EditText sideBAreaET;
    EditText sideBLegAET;
    TextView sideBAnswerTV;
    Button calculateSideBButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acute_triangle);

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Take cover.ttf");
        TextView myTextView = (TextView)findViewById(R.id.perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        //initialize the EditText
        sideAEditText = (EditText) findViewById(R.id.sidAEditText);

        sideBEditText = (EditText) findViewById(R.id.sidBEditText);
        sideCEditText =(EditText)findViewById(R.id.side_c_perimeter_edit_text);
        answerEditText = (TextView) findViewById(R.id.answerEditText);
        calculateResultButton = (Button) findViewById(R.id.calculateButtonID);
        calculateResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        areaSideAET = (EditText)findViewById(R.id.area_base_et);
        areaSideBET = (EditText)findViewById(R.id.area_height_et);
        areaAnswerTV = (TextView)findViewById(R.id.area_answer_tv);
        calculateAreaButton = (Button)findViewById(R.id.area_click_botton);
        calculateAreaButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){

            }
        });

        hypSideAET =(EditText)findViewById(R.id.hyp_side_a_et);
        hypSideBET =(EditText)findViewById(R.id.hyp_side_b_et);
        hypAnswerTV=(TextView)findViewById(R.id.hyp_answer_tv);
        calculateHypButton =(Button)findViewById(R.id.hyp_calculate_button);
        calculateHypButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        sideAAreaET =(EditText)findViewById(R.id.acute_triangle__area_et);
        sideALegBET =(EditText)findViewById(R.id.acute_triangle_side_b_et);
        sideAAnswerTV =(TextView)findViewById(R.id.acute_triangle_answer_tv);
        calculateSideAButton =(Button)findViewById(R.id.acute_triangle_calc_button);
        calculateSideAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        sideBAreaET =(EditText)findViewById(R.id.acute_triangle_sid_b_area_et);
        sideBLegAET =(EditText)findViewById(R.id.acute_triangle_side_a_et);
        sideBAnswerTV =(TextView)findViewById(R.id.acute_triangle_side_b_answer_tv);
        calculateSideBButton =(Button)findViewById(R.id.acute_triangle_sid_b_calc_button);
        calculateSideBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
