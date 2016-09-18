package calcpa.calcsummerproject.Geometry.Triangle.TypesOfTriangle;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
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

public class RightTriangle extends AppCompatActivity {


    EditText sideAEditText;
    EditText sideBEditText;
    TextView answerEditText;
    Button calculateResultButton;
    Button rightTriPerimClearButton;


    // area
    EditText areaSideAET;
    EditText areaSideBET;
    TextView areaAnswerTV;
    Button calculateAreaButton;
    Button rightTriAreaClearButton;


    // hypotenuse
    EditText hypSideAET;
    EditText hypSideBET;
    TextView hypAnswerTV;
    Button calculateHypButton;
    Button rightTriHypClearButton;


    //side A
    EditText sideAAreaET;
    EditText sideALegBET;
    TextView sideAAnswerTV;
    Button calculateSideAButton;
    Button rightTriSideAClearButton;


    //side B
    EditText sideBAreaET;
    EditText sideBLegAET;
    TextView sideBAnswerTV;
    Button calculateSideBButton;
    Button rightTriSideBClearButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right_triangle);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_right_triangle);
        // getSupportActionBar().setIcon(R.drawable.back_button_tb);
        //enable button in toolbar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        perimeterResource();
        areaResource();
        hypotenouseResource();
        sideAResource();
        sideBResource();
        fontResource();


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("perimeter_et1", sideAEditText.getText().toString());
        outState.putString("perimeter_et2", sideBEditText.getText().toString());
        outState.putString("perimeter_tv", answerEditText.getText().toString());

        outState.putString("area_et1", areaSideAET.getText().toString());
        outState.putString("area_et2", areaSideBET.getText().toString());
        outState.putString("area_tv", areaAnswerTV.getText().toString());

        outState.putString("hyp_et1", hypSideAET.getText().toString());
        outState.putString("hyp_et2", hypSideBET.getText().toString());
        outState.putString("hyp_tv", hypAnswerTV.getText().toString());

        outState.putString("sidea_et1", sideAAreaET.getText().toString());
        outState.putString("sidea_et2", sideALegBET.getText().toString());
        outState.putString("sidea_tv", sideAAnswerTV.getText().toString());

        outState.putString("sideb_et1", sideBAreaET.getText().toString());
        outState.putString("sideb_et2", sideBLegAET.getText().toString());
        outState.putString("sideb_tv", sideBAnswerTV.getText().toString());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        sideAEditText.setText(savedInstanceState.getString("perimeter_et1"));
        sideBEditText.setText(savedInstanceState.getString("perimeter_et2"));
        answerEditText.setText(savedInstanceState.getString("perimeter_tv"));

        areaSideAET.setText(savedInstanceState.getString("area_et1"));
        areaSideBET.setText(savedInstanceState.getString("area_et2"));
        areaAnswerTV.setText(savedInstanceState.getString("area_tv"));

        hypSideAET.setText(savedInstanceState.getString("hyp_et1"));
        hypSideBET.setText(savedInstanceState.getString("hyp_et2"));
        hypAnswerTV.setText(savedInstanceState.getString("hyp_tv"));

        sideAAreaET.setText(savedInstanceState.getString("sidea_et1"));
        sideALegBET.setText(savedInstanceState.getString("sidea_et2"));
        sideAAnswerTV.setText(savedInstanceState.getString("sidea_tv"));

        sideBAreaET.setText(savedInstanceState.getString("sideb_et1"));
        sideBLegAET.setText(savedInstanceState.getString("sideb_et2"));
        sideBAnswerTV.setText(savedInstanceState.getString("sideb_tv"));

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }


    public void perimeterResource() {

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

        // Perimeter Clear button
        rightTriPerimClearButton = (Button) findViewById(R.id.right_tri_perimeter_clear_button);
        rightTriPerimClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sideAEditText.setText("");
                sideBEditText.setText("");
                answerEditText.setText("");
            }
        });


    }

    public void areaResource() {
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


        // Area Clear button
        rightTriAreaClearButton = (Button) findViewById(R.id.right_triangle_area_clear_button);
        rightTriAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                areaSideAET.setText("");
                areaSideBET.setText("");
                areaAnswerTV.setText("");
            }
        });


    }

    public void hypotenouseResource() {

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


        // Hypotenuse Clear button
        rightTriHypClearButton = (Button) findViewById(R.id.right_triangle_hyp_clear_button);
        rightTriHypClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hypSideAET.setText("");
                hypSideBET.setText("");
                hypAnswerTV.setText("");
            }
        });


    }

    public void sideAResource() {
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
                        rightTriangleLegA = 2 * (area / legB);
                        sideAAnswerTV.setText(String.format("%.02f", rightTriangleLegA));
                    }
                }
            }
        });

        // Side A Clear button
        rightTriSideAClearButton = (Button) findViewById(R.id.right_triangle_sideA_clear_button);
        rightTriSideAClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sideAAreaET.setText("");
                sideALegBET.setText("");
                sideAAnswerTV.setText("");
            }
        });
    }


    public void sideBResource() {
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
                        rightTriangleLegB = 2 * (area / legA);
                        sideBAnswerTV.setText(String.format("%.02f", rightTriangleLegB));
                    }
                }
            }
        });

        // Side B Clear button
        rightTriSideBClearButton = (Button) findViewById(R.id.right_triangle_sideB_clear_button);
        rightTriSideBClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sideBAreaET.setText("");
                sideBLegAET.setText("");
                sideBAnswerTV.setText("");
            }
        });


    }

    public void fontResource() {
        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");

        TextView myTextView = (TextView) findViewById(R.id.perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.sidAText);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.sideBText);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.area_side_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.area_side_b_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.side_c_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.hyp_side_a_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.hyp_side_b_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.right_triangle_a_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.right_triangle_side_b_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.right_triangle_area_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.right_triangle_b_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.right_triangle_side_a_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.right_triangle_sid_b_area_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        sideAEditText.setTypeface(myTypeFace);
        sideBEditText.setTypeface(myTypeFace);
        answerEditText.setTypeface(myTypeFace);
        calculateResultButton.setTypeface(myTypeFace);
        rightTriPerimClearButton.setTypeface(myTypeFace);

        areaSideAET.setTypeface(myTypeFace);
        areaSideBET.setTypeface(myTypeFace);
        areaAnswerTV.setTypeface(myTypeFace);
        calculateAreaButton.setTypeface(myTypeFace);
        rightTriAreaClearButton.setTypeface(myTypeFace);

        hypSideAET.setTypeface(myTypeFace);
        hypSideBET.setTypeface(myTypeFace);
        hypAnswerTV.setTypeface(myTypeFace);
        calculateHypButton.setTypeface(myTypeFace);
        rightTriHypClearButton.setTypeface(myTypeFace);

        sideAAreaET.setTypeface(myTypeFace);
        sideALegBET.setTypeface(myTypeFace);
        sideAAnswerTV.setTypeface(myTypeFace);
        calculateSideAButton.setTypeface(myTypeFace);
        rightTriSideAClearButton.setTypeface(myTypeFace);

        sideBAreaET.setTypeface(myTypeFace);
        sideBLegAET.setTypeface(myTypeFace);
        sideBAnswerTV.setTypeface(myTypeFace);
        calculateSideBButton.setTypeface(myTypeFace);
        rightTriSideBClearButton.setTypeface(myTypeFace);

    }
}
