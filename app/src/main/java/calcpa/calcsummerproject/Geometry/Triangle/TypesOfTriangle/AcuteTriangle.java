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

public class AcuteTriangle extends AppCompatActivity {



    //perimeter
    EditText acuteTriPerimeterSideAET;
    EditText acuteTriPerimeterBaseET;
    EditText acuteTriPerimeterSideCET;
    TextView acuteTriPerimeterAnsTV;
    Button acuteTriPerimeterCalcButton;
    Button acuteTriPerimClearButton;


    //acute triangle area
    EditText acuteTriAreaBaseET;
    EditText acuteTriAreaHeightET;
    TextView acuteTriAreaAnsTV;
    Button acuteTriAreaCalcButton;
    Button acuteTriAreaClearButton;


    //acute triangle hypotenuse
    EditText acuteTriHypSideAET;
    EditText acuteTriHypBaseET;
    TextView acuteTriHypAnsTV;
    Button acuteTriHypCalcButton;
    Button acuteTriHypClearButton;


    //acute triangle side A calculatro
    EditText acuteTriSideABaseET;
    EditText acuteTriSideASideCET;
    EditText acuteTriSideAPerimeterET;
    TextView acuteTriSideAAnsTV;
    Button acuteTriSideACalcButton;
    Button acuteTriSideAClearButton;



    //acute triangle side B calculator
    EditText acuteTriBaseSideAET;
    EditText acuteTriBaseSideCET;
    EditText acuteTriBasePerimeterET;
    TextView acuteTriBaseAnsTV;
    Button acuteTriBaseCalcButton;
    Button acuteTriBasesClearButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acute_triangle);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_acute_triangle);
        // getSupportActionBar().setIcon(R.drawable.back_button_tb);
        //enable button in toolbar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        perimeterResource();
        areaResource();
        sideAResource();
        sideBResource();
        hypotenousResource();
        fontResource();



    }



    private void perimeterResource(){

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





        // Perimeter Clear button
        acuteTriPerimClearButton = (Button) findViewById(R.id.acute_tri_perimeter_clear_button);
        acuteTriPerimClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acuteTriPerimeterSideAET.setText("");
                acuteTriPerimeterBaseET.setText("");
                acuteTriPerimeterSideCET.setText("");
                acuteTriPerimeterAnsTV.setText("");

            }
        });


    }

    private void areaResource(){


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

        // Area Clear button
        acuteTriAreaClearButton = (Button) findViewById(R.id.acute_tri_area_clear_button);
        acuteTriAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acuteTriAreaBaseET.setText("");
                acuteTriAreaHeightET.setText("");
                acuteTriAreaAnsTV.setText("");
            }
        });



    }



    private void hypotenousResource(){
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


        // Hyp Clear button
        acuteTriHypClearButton = (Button) findViewById(R.id.acute_tri_hyp_clear_button);
        acuteTriHypClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acuteTriHypSideAET.setText("");
                acuteTriHypBaseET.setText("");
                acuteTriHypAnsTV.setText("");
            }
        });



    }

    private void sideAResource(){
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

        // Side A Clear button
        acuteTriSideAClearButton = (Button) findViewById(R.id.acute_tri_sideA_clear_button);
        acuteTriSideAClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acuteTriSideABaseET.setText("");
                acuteTriSideASideCET.setText("");
                acuteTriSideAPerimeterET.setText("");
                acuteTriSideAAnsTV.setText("");
            }
        });

    }

    private void sideBResource(){
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


        // Side B Clear button
        acuteTriBasesClearButton = (Button) findViewById(R.id.acute_tri_base_clear_button);
        acuteTriBasesClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acuteTriBaseSideAET.setText("");
                acuteTriBaseSideCET.setText("");
                acuteTriBasePerimeterET.setText("");
                acuteTriBaseAnsTV.setText("");
            }
        });




    }
    private void fontResource(){

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");

        TextView myTextView = (TextView) findViewById(R.id.acute_tri_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.acute_tri_perimeter_sideA_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.acute_tri_perimeter_sideB_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.acute_tri_perimeter_sideC_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.acute_tri_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.acute_tri_area_base_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.acute_tri_area_height_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.acute_tri_hyp_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.acute_tri_hyp_sideA_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.acute_tri_hyp_sideB_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.acute_tri_sideA_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.acute_tri_sideA_base_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.acute_tri_sideA_sideC_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.acute_tri_sideA_perimeter_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.acute_tri_base_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.acute_tri_base_sideA_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.acute_tri_base_sideC_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.acute_tri_base_perimeter_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        acuteTriPerimeterSideAET.setTypeface(myTypeFace);
        acuteTriPerimeterBaseET.setTypeface(myTypeFace);
        acuteTriPerimeterSideCET.setTypeface(myTypeFace);
        acuteTriPerimeterAnsTV.setTypeface(myTypeFace);
        acuteTriPerimeterCalcButton.setTypeface(myTypeFace);
        acuteTriPerimClearButton.setTypeface(myTypeFace);

        acuteTriAreaBaseET.setTypeface(myTypeFace);
        acuteTriAreaHeightET.setTypeface(myTypeFace);
        acuteTriAreaAnsTV.setTypeface(myTypeFace);
        acuteTriAreaCalcButton.setTypeface(myTypeFace);
        acuteTriAreaClearButton.setTypeface(myTypeFace);

        acuteTriHypSideAET.setTypeface(myTypeFace);
        acuteTriHypBaseET.setTypeface(myTypeFace);
        acuteTriHypAnsTV.setTypeface(myTypeFace);
        acuteTriHypCalcButton.setTypeface(myTypeFace);
        acuteTriHypClearButton.setTypeface(myTypeFace);

        acuteTriSideABaseET.setTypeface(myTypeFace);
        acuteTriSideASideCET.setTypeface(myTypeFace);
        acuteTriSideAPerimeterET.setTypeface(myTypeFace);
        acuteTriSideAAnsTV.setTypeface(myTypeFace);
        acuteTriSideACalcButton.setTypeface(myTypeFace);
        acuteTriSideAClearButton.setTypeface(myTypeFace);

        acuteTriBaseSideAET.setTypeface(myTypeFace);
        acuteTriBaseSideCET.setTypeface(myTypeFace);
        acuteTriBasePerimeterET.setTypeface(myTypeFace);
        acuteTriBaseAnsTV.setTypeface(myTypeFace);
        acuteTriBaseCalcButton.setTypeface(myTypeFace);
        acuteTriBasesClearButton.setTypeface(myTypeFace);

    }
}
