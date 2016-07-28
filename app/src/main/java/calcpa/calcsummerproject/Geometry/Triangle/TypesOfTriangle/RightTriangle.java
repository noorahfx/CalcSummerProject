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

import calcpa.calcsummerproject.Model;
import calcpa.calcsummerproject.R;

public class RightTriangle extends AppCompatActivity {

    EditText sideAEditText;
    EditText sideBEditText;
    TextView answerEditText;
    Button calculateResultButton;


    //right triangle area
    EditText areaSideAET;
    EditText areaSideBET;
    TextView areaAnswerTV;
    Button calculateAreaButton;

    //right triangle hypotenuse
    EditText hypSideAET;
    EditText hypSideBET;
    TextView hypAnswerTV;
    Button calculateHypButton;

    //right triangle side A calculatro
    EditText sideAAreaET;
    EditText sideALegBET;
    TextView sideAAnswerTV;
    Button calculateSideAButton;

    //right triangle side B calculator
    EditText sideBAreaET;
    EditText sideBLegAET;
    TextView sideBAnswerTV;
    Button calculateSideBButton;

    public static boolean isNullOrEmpty(String input) {
        return input == null || input.isEmpty();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right_triangle);

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "Take cover.ttf");
        TextView myTextView = (TextView) findViewById(R.id.perimeter_text);
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
                //check to make sure field is not empty
                if (Model.isEmpty(sideAEditText)) {
                    sideAEditText.setError("Enter Value");
                } else if (Model.isEmpty(sideBEditText)) {
                    sideBEditText.setError("Enter Value");
                } else {
                    double legA, legB, rightTrianglePerimeter;
                    legA = Double.parseDouble(sideAEditText.getText().toString());
                    legB = Double.parseDouble(sideBEditText.getText().toString());
                    if (legA <= 0) {
                        answerEditText.setText("The variable a should be positive");
                    } else if (legB <= 0) {
                        answerEditText.setText("The variable b should be positive");
                    } else {
                        rightTrianglePerimeter = legA + +legB +
                                (Math.sqrt((Math.pow(legA, 2) + (Math.pow(legB, 2)))));
                        answerEditText.setText(String.format("%.02f", rightTrianglePerimeter));
                    }
                }
            }
        });

        areaSideAET = (EditText) findViewById(R.id.area_base_et);
        areaSideBET = (EditText) findViewById(R.id.area_height_et);
        areaAnswerTV = (TextView) findViewById(R.id.area_answer_tv);
        calculateAreaButton = (Button) findViewById(R.id.area_click_botton);
        calculateAreaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(areaSideAET)) {
                    areaSideAET.setError("Enter Value");
                } else if (Model.isEmpty(areaSideBET)) {
                    areaSideBET.setError("Enter Value");
                } else {
                    double legA, legB, rightTriangleArea;
                    legA = Double.parseDouble(areaSideAET.getText().toString());
                    legB = Double.parseDouble(areaSideBET.getText().toString());
                    if (legA <= 0) {
                        areaAnswerTV.setText("The variable a should be positive");
                    } else if (legB <= 0) {
                        areaAnswerTV.setText("The variable b should be positive");
                    } else {
                        rightTriangleArea = (legA * legB) / 2;
                        areaAnswerTV.setText(String.format("%.02f", rightTriangleArea));
                    }
                }
            }
        });


        hypSideAET = (EditText) findViewById(R.id.hyp_side_a_et);
        hypSideBET = (EditText) findViewById(R.id.hyp_side_b_et);
        hypAnswerTV = (TextView) findViewById(R.id.hyp_answer_tv);
        calculateHypButton = (Button) findViewById(R.id.hyp_calculate_button);
        calculateHypButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(hypSideAET)) {
                    hypSideAET.setError("Enter Value");
                } else if (Model.isEmpty(hypSideBET)) {
                    hypSideBET.setError("Enter Value");
                } else {
                    double legA, legB, rightTriangleHyp;
                    legA = Double.parseDouble(hypSideAET.getText().toString());
                    legB = Double.parseDouble(hypSideBET.getText().toString());
                    if (legA <= 0) {
                        hypAnswerTV.setText("The variable a should be positive");
                    } else if (legB <= 0) {
                        hypAnswerTV.setText("The variable b should be positive");
                    } else {
                        rightTriangleHyp = Math.sqrt((Math.pow(legA, 2) + (Math.pow(legB, 2))));
                        hypAnswerTV.setText(String.format("%.02f", rightTriangleHyp));
                    }
                }
            }
        });

//Leg A
        sideALegBET = (EditText) findViewById(R.id.right_triangle_side_b_et);
        sideAAreaET = (EditText) findViewById(R.id.right_triangle__area_et);
        sideAAnswerTV = (TextView) findViewById(R.id.right_triangle_answer_tv);
        calculateSideAButton = (Button) findViewById(R.id.right_triangle_calc_button);
        calculateSideAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(sideALegBET)) {
                    sideALegBET.setError("Enter Value");
                } else if (Model.isEmpty(sideAAreaET)) {
                    sideAAreaET.setError("Enter Value");
                } else {
                    double legB, area, rightTriangleLegA;
                    legB = Double.parseDouble(sideALegBET.getText().toString());
                    area = Double.parseDouble(sideAAreaET.getText().toString());
                    if (legB <= 0) {
                        sideAAnswerTV.setText("The variable b should be positive");
                    } else if (area <= 0) {
                        sideAAnswerTV.setText("The variable A should be positive");
                    } else {
                        rightTriangleLegA = 2*(area/legB);
                        sideAAnswerTV.setText(String.format("%.02f", rightTriangleLegA));
                    }
                }
            }
        });


         sideBLegAET = (EditText) findViewById(R.id.right_triangle_side_a_et);
        sideBAreaET = (EditText) findViewById(R.id.right_triangle_sid_b_area_et);
        sideBAnswerTV = (TextView) findViewById(R.id.right_triangle_side_b_answer_tv);
        calculateSideBButton = (Button) findViewById(R.id.right_triangle_sid_b_calc_button);
        calculateSideBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(sideBLegAET)) {
                    sideBLegAET.setError("Enter Value");
                } else if (Model.isEmpty(sideBAreaET)) {
                    sideBAreaET.setError("Enter Value");
                } else {
                    double legA, area, rightTriangleLegB;
                    legA = Double.parseDouble(sideBLegAET.getText().toString());
                    area = Double.parseDouble(sideBAreaET.getText().toString());
                    if (legA <= 0) {
                        sideBAnswerTV.setText("The variable b should be positive");
                    } else if (area <= 0) {
                        sideBAnswerTV.setText("The variable A should be positive");
                    } else {
                        rightTriangleLegB = 2*(area/legA);
                        sideBAnswerTV.setText(String.format("%.02f", rightTriangleLegB));
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
