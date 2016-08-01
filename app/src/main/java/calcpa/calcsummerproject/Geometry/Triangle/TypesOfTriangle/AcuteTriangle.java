package calcpa.calcsummerproject.Geometry.Triangle.TypesOfTriangle;

import android.content.res.Configuration;
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
import io.github.kexanie.library.MathView;

public class AcuteTriangle extends AppCompatActivity {

    //perimeter
    EditText acuteTriPerimeterSideAET;
    EditText acuteTriPerimeterBaseET;
    EditText acuteTriPerimeterSideCET;
    TextView acuteTriPerimeterAnsTV;
    Button acuteTriPerimeterCalcButton;


    //acute triangle area
    EditText acuteTriAreaBaseET;
    EditText acuteTriAreaHeightET;
    TextView acuteTriAreaAnsTV;
    Button acuteTriAreaCalcButton;

    //acute triangle hypotenuse
    EditText acuteTriHypSideAET;
    EditText acuteTriHypBaseET;
    TextView acuteTriHypAnsTV;
    Button acuteTriHypCalcButton;

    //acute triangle side A calculatro
    EditText acuteTriSideABaseET;
    EditText acuteTriSideASideCET;
    EditText acuteTriSideAPerimeterET;
    TextView acuteTriSideAAnsTV;
    Button acuteTriSideACalcButton;


    //acute triangle side B calculator
    EditText acuteTriBaseSideAET;
    EditText acuteTriBaseSideCET;
    EditText acuteTriBasePerimeterET;
    TextView acuteTriBaseAnsTV;
    Button acuteTriBaseCalcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acute_triangle);
/**
        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "Take cover.ttf");
        TextView myTextView = (TextView) findViewById(R.id.perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

*/
        //initialize the EditText
        acuteTriPerimeterSideAET = (EditText) findViewById(R.id.acute_tri_perimeter_sideA_et);
        acuteTriPerimeterBaseET = (EditText) findViewById(R.id.acute_tri_perimeter_sideB_et);
        acuteTriPerimeterSideCET = (EditText) findViewById(R.id.acute_tri_perimeter_sideC_et);
        acuteTriPerimeterAnsTV = (TextView) findViewById(R.id.acute_tri_perimeter_ans_tv);
        acuteTriPerimeterCalcButton = (Button) findViewById(R.id.acute_tri_perimeter_calc_button);
        acuteTriPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(acuteTriPerimeterSideAET)) {
                    acuteTriPerimeterSideAET.setError("Enter Value");
                } else if (Model.isEmpty(acuteTriPerimeterBaseET)) {
                    acuteTriPerimeterBaseET.setError("Enter Value");
                } else if (Model.isEmpty(acuteTriPerimeterSideCET)) {
                    acuteTriPerimeterSideCET.setError("Enter Value");
                } else {
                    double sideA, baseB, sideC, acuteTriPerimeter;
                    sideA = Double.parseDouble(acuteTriPerimeterSideAET.getText().toString());
                    baseB = Double.parseDouble(acuteTriPerimeterBaseET.getText().toString());
                    sideC = Double.parseDouble(acuteTriPerimeterSideCET.getText().toString());
                    if (sideA <= 0) {
                        acuteTriPerimeterAnsTV.setText("The variable a should be positive");
                    } else if (baseB <= 0) {
                        acuteTriPerimeterAnsTV.setText("The variable b should be positive");
                    } else if (sideC <= 0) {
                        acuteTriPerimeterAnsTV.setText("The variable c should be positive");
                    } else if (sideA >= (baseB + sideC)) {
                        acuteTriPerimeterAnsTV.setText("Invalid input: make sure b+c>a");
                    } else {
                        acuteTriPerimeter = sideA + baseB + sideC;
                        acuteTriPerimeterAnsTV.setText(String.format("%.02f", acuteTriPerimeter));
                    }
                }
            }
        });


        //acute triangle area

        acuteTriAreaBaseET = (EditText) findViewById(R.id.acute_tri_area_base_et);
        acuteTriAreaHeightET = (EditText) findViewById(R.id.acute_tri_area_height_et);
        acuteTriAreaAnsTV = (TextView) findViewById(R.id.acute_tri_area_ans_tv);
        acuteTriAreaCalcButton = (Button) findViewById(R.id.acute_tri_area_calc_button);
        acuteTriAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(acuteTriAreaBaseET)) {
                    acuteTriAreaBaseET.setError("Enter Value");
                } else if (Model.isEmpty(acuteTriAreaHeightET)) {
                    acuteTriAreaHeightET.setError("Enter Value");
                } else {
                    double baseB, height, acuteTriArea;
                    baseB = Double.parseDouble(acuteTriAreaBaseET.getText().toString());
                    height = Double.parseDouble(acuteTriAreaHeightET.getText().toString());
                    if (baseB <= 0) {
                        acuteTriAreaAnsTV.setText("The variable b should be positive");
                    } else if (height <= 0) {
                        acuteTriAreaAnsTV.setText("The variable h should be positive");
                    } else {
                        acuteTriArea = (height * baseB) / 2;
                        acuteTriAreaAnsTV.setText(String.format("%.02f", acuteTriArea));
                    }
                }
            }
        });
        //acute triangle hypotenuse
        acuteTriHypSideAET = (EditText) findViewById(R.id.acute_tri_hyp_sideA_et);
        acuteTriHypBaseET = (EditText) findViewById(R.id.acute_tri_hyp_sideB_et);
        acuteTriHypAnsTV = (TextView) findViewById(R.id.acute_tri_hyp_ans_tv);
        acuteTriHypCalcButton = (Button) findViewById(R.id.acute_tri_hyp_calc_button);
        acuteTriHypCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(acuteTriHypSideAET)) {
                    acuteTriHypSideAET.setError("Enter Value");
                } else if (Model.isEmpty(acuteTriHypBaseET)) {
                    acuteTriHypBaseET.setError("Enter Value");
                } else {
                    double sideA, baseB, acuteTriHyp;
                    sideA = Double.parseDouble(acuteTriHypSideAET.getText().toString());
                    baseB = Double.parseDouble(acuteTriHypBaseET.getText().toString());
                    if (sideA <= 0) {
                        acuteTriHypAnsTV.setText("The variable b should be positive");
                    } else if (baseB <= 0) {
                        acuteTriHypAnsTV.setText("The variable h should be positive");
                    } else {
                        acuteTriHyp = Math.sqrt((Math.pow(sideA, 2) + (Math.pow(baseB, 2))));
                        acuteTriHypAnsTV.setText(String.format("%.02f", acuteTriHyp));
                    }
                }
            }
        });

        //acute triangle side A calculatro

        acuteTriSideABaseET = (EditText) findViewById(R.id.acute_tri_sideA_base_et);
        acuteTriSideASideCET = (EditText) findViewById(R.id.acute_tri_sideA_sideC_et);
        acuteTriSideAPerimeterET = (EditText) findViewById(R.id.acute_tri_sideA_perimeter_et);
        acuteTriSideAAnsTV = (TextView) findViewById(R.id.acute_tri_sideA_ans_tv);
        acuteTriSideACalcButton = (Button) findViewById(R.id.acute_tri_sideA_calc_button);
        acuteTriSideACalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(acuteTriSideABaseET)) {
                    acuteTriSideABaseET.setError("Enter Value");
                } else if (Model.isEmpty(acuteTriSideASideCET)) {
                    acuteTriSideASideCET.setError("Enter Value");
                } else if (Model.isEmpty(acuteTriSideAPerimeterET)) {
                    acuteTriSideAPerimeterET.setError("Enter Value");
                } else {
                    double sideC, baseB, perimeter, acuteTriSideA;
                    sideC = Double.parseDouble(acuteTriSideABaseET.getText().toString());
                    baseB = Double.parseDouble(acuteTriSideASideCET.getText().toString());
                    perimeter = Double.parseDouble(acuteTriSideAPerimeterET.getText().toString());
                    if (sideC <= 0) {
                        acuteTriSideAAnsTV.setText("The variable a should be positive");
                    } else if (baseB <= 0) {
                        acuteTriSideAAnsTV.setText("The variable b should be positive");
                    } else if (perimeter <= 0) {
                        acuteTriSideAAnsTV.setText("The variable P should be positive");
                    } else if (perimeter <= (baseB + sideC)) {
                        acuteTriSideAAnsTV.setText("Invalid input: make sure P>b+c");
                    } else {
                        acuteTriSideA = perimeter - baseB - sideC;
                        acuteTriSideAAnsTV.setText(String.format("%.02f", acuteTriSideA));
                    }
                }
            }
        });

        //acute triangle side B calculator

        acuteTriBaseSideAET = (EditText) findViewById(R.id.acute_tri_base_sideA_et);
        acuteTriBaseSideCET = (EditText) findViewById(R.id.acute_tri_base_sideC_et);
        acuteTriBasePerimeterET = (EditText) findViewById(R.id.acute_tri_base_perimeter_et);
        acuteTriBaseAnsTV = (TextView) findViewById(R.id.acute_tri_base_ans_tv);
        acuteTriBaseCalcButton = (Button) findViewById(R.id.acute_tri_base_calc_button);
        acuteTriBaseCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(acuteTriBaseSideAET)) {
                    acuteTriBaseSideAET.setError("Enter Value");
                } else if (Model.isEmpty(acuteTriBaseSideCET)) {
                    acuteTriBaseSideCET.setError("Enter Value");
                } else if (Model.isEmpty(acuteTriBasePerimeterET)) {
                    acuteTriBasePerimeterET.setError("Enter Value");
                } else {
                    double sideA, sideC, perimeter, acuteTrisideB;
                    sideA = Double.parseDouble(acuteTriBaseSideAET.getText().toString());
                    sideC = Double.parseDouble(acuteTriBaseSideCET.getText().toString());
                    perimeter = Double.parseDouble(acuteTriBasePerimeterET.getText().toString());
                    if (sideA <= 0) {
                        acuteTriBaseAnsTV.setText("The variable a should be positive");
                    } else if (sideC <= 0) {
                        acuteTriBaseAnsTV.setText("The variable b should be positive");
                    } else if (perimeter <= 0) {
                        acuteTriBaseAnsTV.setText("The variable P should be positive");
                    } else if (perimeter <= (sideA + sideC)) {
                        acuteTriBaseAnsTV.setText("Invalid input: make sure P>b+c");
                    } else {
                        acuteTrisideB = perimeter - sideA - sideC;
                        acuteTriBaseAnsTV.setText(String.format("%.02f", acuteTrisideB));
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
