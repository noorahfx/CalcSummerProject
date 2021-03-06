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

import calcpa.calcsummerproject.Model;
import calcpa.calcsummerproject.R;
import io.github.kexanie.library.MathView;

public class ScaleneTriangle extends AppCompatActivity {


    //perimeter
    EditText scaleneTriPerimeterSideAET;
    EditText scaleneTriPerimeterBaseET;
    EditText scaleneTriPerimeterSideCET;
    TextView scaleneTriPerimeterAnsTV;
    Button scaleneTriPerimeterCalcButton;
    Button scaleneTriPerimeterClearButton;


    //    area
    EditText scaleneTriAreaBaseET;
    EditText scaleneTriAreaHeightET;
    TextView scaleneTriAreaAnsTV;
    Button scaleneTriAreaCalcButton;
    Button scaleneTriArearClearButton;


    //    side A
    EditText scaleneTriSideABaseET;
    EditText scaleneTriSideASideCET;
    EditText scaleneTriSideAPerimeterET;
    TextView scaleneTriSideAAnsTV;
    Button scaleneTriSideACalcButton;
    Button scaleneTriSideAClearButton;


    //    side B
    EditText scaleneTriBaseSideAET;
    EditText scaleneTriBaseSideCET;
    EditText scaleneTriBasePerimeterET;
    TextView scaleneTriBaseAnsTV;
    Button scaleneTriBaseCalcButton;
    Button scaleneTriSideBClearButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scalene_triangle);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_scalene_triangle);
        // getSupportActionBar().setIcon(R.drawable.back_button_tb);
        //enable button in toolbar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        perimeterResource();
        areaResource();
        sideAResource();
        sideBResource();
        fontResource();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("perimeter_et1", scaleneTriPerimeterSideAET.getText().toString());
        outState.putString("perimeter_et2", scaleneTriPerimeterBaseET.getText().toString());
        outState.putString("perimeter_et3", scaleneTriPerimeterSideCET.getText().toString());
        outState.putString("perimeter_tv", scaleneTriPerimeterAnsTV.getText().toString());

        outState.putString("area_et1", scaleneTriAreaBaseET.getText().toString());
        outState.putString("area_et2", scaleneTriAreaHeightET.getText().toString());
        outState.putString("area_tv", scaleneTriAreaAnsTV.getText().toString());

        outState.putString("sidea_et1", scaleneTriSideABaseET.getText().toString());
        outState.putString("sidea_et2", scaleneTriSideASideCET.getText().toString());
        outState.putString("sidea_et3", scaleneTriSideAPerimeterET.getText().toString());
        outState.putString("sidea_tv", scaleneTriSideAAnsTV.getText().toString());

        outState.putString("sideb_et1", scaleneTriBaseSideAET.getText().toString());
        outState.putString("sideb_et2", scaleneTriBaseSideCET.getText().toString());
        outState.putString("sideb_et3", scaleneTriBasePerimeterET.getText().toString());
        outState.putString("sideb_tv", scaleneTriBaseAnsTV.getText().toString());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        scaleneTriPerimeterSideAET.setText(savedInstanceState.getString("perimeter_et1"));
        scaleneTriPerimeterBaseET.setText(savedInstanceState.getString("perimeter_et2"));
        scaleneTriPerimeterSideCET.setText(savedInstanceState.getString("perimeter_et3"));
        scaleneTriPerimeterAnsTV.setText(savedInstanceState.getString("perimeter_tv"));

        scaleneTriAreaBaseET.setText(savedInstanceState.getString("area_et1"));
        scaleneTriAreaHeightET.setText(savedInstanceState.getString("area_et2"));
        scaleneTriAreaAnsTV.setText(savedInstanceState.getString("area_tv"));

        scaleneTriSideABaseET.setText(savedInstanceState.getString("sidea_et1"));
        scaleneTriSideASideCET.setText(savedInstanceState.getString("sidea_et2"));
        scaleneTriSideAPerimeterET.setText(savedInstanceState.getString("sidea_et3"));
        scaleneTriSideAAnsTV.setText(savedInstanceState.getString("sidea_tv"));

        scaleneTriBaseSideAET.setText(savedInstanceState.getString("sideb_et1"));
        scaleneTriBaseSideCET.setText(savedInstanceState.getString("sideb_et2"));
        scaleneTriBasePerimeterET.setText(savedInstanceState.getString("sideb_et3"));
        scaleneTriBaseAnsTV.setText(savedInstanceState.getString("sideb_tv"));

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
        scaleneTriPerimeterSideAET = (EditText) findViewById(R.id.scalene_tri_perimeter_sideA_et);
        scaleneTriPerimeterBaseET = (EditText) findViewById(R.id.scalene_tri_perimeter_sideB_et);
        scaleneTriPerimeterSideCET = (EditText) findViewById(R.id.scalene_tri_perimeter_sideC_et);
        scaleneTriPerimeterAnsTV = (TextView) findViewById(R.id.scalene_tri_perimeter_ans_tv);
        scaleneTriPerimeterCalcButton = (Button) findViewById(R.id.scalene_tri_perimeter_calc_button);
        scaleneTriPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(scaleneTriPerimeterSideAET)) {
                    scaleneTriPerimeterSideAET.setError("Enter Value");
                } else if (Model.isEmpty(scaleneTriPerimeterBaseET)) {
                    scaleneTriPerimeterBaseET.setError("Enter Value");
                } else if (Model.isEmpty(scaleneTriPerimeterSideCET)) {
                    scaleneTriPerimeterSideCET.setError("Enter Value");
                } else {
                    double sideA, baseB, sideC, scaleneTriPerimeter;
                    sideA = Double.parseDouble(scaleneTriPerimeterSideAET.getText().toString());
                    baseB = Double.parseDouble(scaleneTriPerimeterBaseET.getText().toString());
                    sideC = Double.parseDouble(scaleneTriPerimeterSideCET.getText().toString());
                    if (sideA <= 0) {
                        scaleneTriPerimeterAnsTV.setText("The variable a should be positive");
                    } else if (baseB <= 0) {
                        scaleneTriPerimeterAnsTV.setText("The variable b should be positive");
                    } else if (sideC <= 0) {
                        scaleneTriPerimeterAnsTV.setText("The variable c should be positive");
                    } else if (sideA >= (baseB + sideC)) {
                        scaleneTriPerimeterAnsTV.setText("Invalid input: make sure b+c>a");
                    } else {
                        scaleneTriPerimeter = sideA + baseB + sideC;
                        scaleneTriPerimeterAnsTV.setText(String.format("%.02f", scaleneTriPerimeter));
                    }
                }
            }
        });


        // Perimeter Clear button
        scaleneTriPerimeterClearButton = (Button)
                findViewById(R.id.scalene_tri_perimeter_clear_button);
        scaleneTriPerimeterClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scaleneTriPerimeterSideAET.setText("");
                scaleneTriPerimeterBaseET.setText("");
                scaleneTriPerimeterSideCET.setText("");
                scaleneTriPerimeterAnsTV.setText("");

            }
        });


    }

    public void areaResource() {

        //acute triangle area

        scaleneTriAreaBaseET = (EditText) findViewById(R.id.scalene_tri_area_base_et);
        scaleneTriAreaHeightET = (EditText) findViewById(R.id.scalene_tri_area_height_et);
        scaleneTriAreaAnsTV = (TextView) findViewById(R.id.scalene_tri_area_ans_tv);
        scaleneTriAreaCalcButton = (Button) findViewById(R.id.scalene_tri_area_calc_button);
        scaleneTriAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(scaleneTriAreaBaseET)) {
                    scaleneTriAreaBaseET.setError("Enter Value");
                } else if (Model.isEmpty(scaleneTriAreaHeightET)) {
                    scaleneTriAreaHeightET.setError("Enter Value");
                } else {
                    double baseB, height, scaleneTriArea;
                    baseB = Double.parseDouble(scaleneTriAreaBaseET.getText().toString());
                    height = Double.parseDouble(scaleneTriAreaHeightET.getText().toString());
                    if (baseB <= 0) {
                        scaleneTriAreaAnsTV.setText("The variable b should be positive");
                    } else if (height <= 0) {
                        scaleneTriAreaAnsTV.setText("The variable h should be positive");
                    } else {
                        scaleneTriArea = (height * baseB) / 2;
                        scaleneTriAreaAnsTV.setText(String.format("%.02f", scaleneTriArea));
                    }
                }
            }
        });

        // Area Clear button
        scaleneTriArearClearButton = (Button)
                findViewById(R.id.scalene_triangle_area_clear_button);
        scaleneTriArearClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scaleneTriAreaBaseET.setText("");
                scaleneTriAreaHeightET.setText("");
                scaleneTriAreaAnsTV.setText("");

            }
        });


    }

    public void sideAResource() {

        //acute triangle side A calculatro

        scaleneTriSideABaseET = (EditText) findViewById(R.id.scalene_tri_sideA_base_et);
        scaleneTriSideASideCET = (EditText) findViewById(R.id.scalene_tri_sideA_sideC_et);
        scaleneTriSideAPerimeterET = (EditText) findViewById(R.id.scalene_tri_sideA_perimeter_et);
        scaleneTriSideAAnsTV = (TextView) findViewById(R.id.scalene_tri_sideA_ans_tv);
        scaleneTriSideACalcButton = (Button) findViewById(R.id.scalene_tri_sideA_calc_button);
        scaleneTriSideACalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(scaleneTriSideABaseET)) {
                    scaleneTriSideABaseET.setError("Enter Value");
                } else if (Model.isEmpty(scaleneTriSideASideCET)) {
                    scaleneTriSideASideCET.setError("Enter Value");
                } else if (Model.isEmpty(scaleneTriSideAPerimeterET)) {
                    scaleneTriSideAPerimeterET.setError("Enter Value");
                } else {
                    double sideC, baseB, perimeter, scaleneTriSideA;
                    sideC = Double.parseDouble(scaleneTriSideABaseET.getText().toString());
                    baseB = Double.parseDouble(scaleneTriSideASideCET.getText().toString());
                    perimeter = Double.parseDouble(scaleneTriSideAPerimeterET.getText().toString());
                    if (sideC <= 0) {
                        scaleneTriSideAAnsTV.setText("The variable a should be positive");
                    } else if (baseB <= 0) {
                        scaleneTriSideAAnsTV.setText("The variable b should be positive");
                    } else if (perimeter <= 0) {
                        scaleneTriSideAAnsTV.setText("The variable P should be positive");
                    } else if (perimeter <= (baseB + sideC)) {
                        scaleneTriSideAAnsTV.setText("Invalid input: make sure P>b+c");
                    } else {
                        scaleneTriSideA = perimeter - baseB - sideC;
                        scaleneTriSideAAnsTV.setText(String.format("%.02f", scaleneTriSideA));
                    }
                }
            }
        });

        // Side Clear button
        scaleneTriSideAClearButton = (Button)
                findViewById(R.id.scalene_tri_side_clear_button);
        scaleneTriSideAClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scaleneTriSideABaseET.setText("");
                scaleneTriSideASideCET.setText("");
                scaleneTriSideAPerimeterET.setText("");
                scaleneTriSideAAnsTV.setText("");

            }
        });


    }

    public void sideBResource() {
        //acute triangle side B calculator

        scaleneTriBaseSideAET = (EditText) findViewById(R.id.scalene_tri_base_sideA_et);
        scaleneTriBaseSideCET = (EditText) findViewById(R.id.scalene_tri_base_sideC_et);
        scaleneTriBasePerimeterET = (EditText) findViewById(R.id.scalene_tri_base_perimeter_et);
        scaleneTriBaseAnsTV = (TextView) findViewById(R.id.scalene_tri_base_ans_tv);
        scaleneTriBaseCalcButton = (Button) findViewById(R.id.scalene_tri_base_calc_button);
        scaleneTriBaseCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(scaleneTriBaseSideAET)) {
                    scaleneTriBaseSideAET.setError("Enter Value");
                } else if (Model.isEmpty(scaleneTriBaseSideCET)) {
                    scaleneTriBaseSideCET.setError("Enter Value");
                } else if (Model.isEmpty(scaleneTriBasePerimeterET)) {
                    scaleneTriBasePerimeterET.setError("Enter Value");
                } else {
                    double sideA, sideC, perimeter, scaleneTrisideB;
                    sideA = Double.parseDouble(scaleneTriBaseSideAET.getText().toString());
                    sideC = Double.parseDouble(scaleneTriBaseSideCET.getText().toString());
                    perimeter = Double.parseDouble(scaleneTriBasePerimeterET.getText().toString());
                    if (sideA <= 0) {
                        scaleneTriBaseAnsTV.setText("The variable a should be positive");
                    } else if (sideC <= 0) {
                        scaleneTriBaseAnsTV.setText("The variable b should be positive");
                    } else if (perimeter <= 0) {
                        scaleneTriBaseAnsTV.setText("The variable P should be positive");
                    } else if (perimeter <= (sideA + sideC)) {
                        scaleneTriBaseAnsTV.setText("Invalid input: make sure P>b+c");
                    } else {
                        scaleneTrisideB = perimeter - sideA - sideC;
                        scaleneTriBaseAnsTV.setText(String.format("%.02f", scaleneTrisideB));
                    }
                }
            }
        });

        // Base Clear button
        scaleneTriSideBClearButton = (Button)
                findViewById(R.id.scalene_tri_base_clear_button);
        scaleneTriSideBClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scaleneTriBaseSideAET.setText("");
                scaleneTriBaseSideCET.setText("");
                scaleneTriBasePerimeterET.setText("");
                scaleneTriBaseAnsTV.setText("");

            }
        });


    }

    public void fontResource() {

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");

        TextView myTextView = (TextView) findViewById(R.id.scalene_tri_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_perimeter_sideA_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_perimeter_sideB_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_perimeter_sideC_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_area_base_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_area_height_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_sideA_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_sideA_base_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_sideA_sideC_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_sideA_perimeter_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_base_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_base_sideA_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_base_sideC_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.scalene_tri_base_perimeter_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        scaleneTriPerimeterSideAET.setTypeface(myTypeFace);
        scaleneTriPerimeterBaseET.setTypeface(myTypeFace);
        scaleneTriPerimeterSideCET.setTypeface(myTypeFace);
        scaleneTriPerimeterAnsTV.setTypeface(myTypeFace);
        scaleneTriPerimeterCalcButton.setTypeface(myTypeFace);
        scaleneTriPerimeterClearButton.setTypeface(myTypeFace);


        scaleneTriAreaBaseET.setTypeface(myTypeFace);
        scaleneTriAreaHeightET.setTypeface(myTypeFace);
        scaleneTriAreaAnsTV.setTypeface(myTypeFace);
        scaleneTriAreaCalcButton.setTypeface(myTypeFace);
        scaleneTriArearClearButton.setTypeface(myTypeFace);


        scaleneTriSideABaseET.setTypeface(myTypeFace);
        scaleneTriSideASideCET.setTypeface(myTypeFace);
        scaleneTriSideAPerimeterET.setTypeface(myTypeFace);
        scaleneTriSideAAnsTV.setTypeface(myTypeFace);
        scaleneTriSideACalcButton.setTypeface(myTypeFace);
        scaleneTriSideAClearButton.setTypeface(myTypeFace);

        scaleneTriBaseSideAET.setTypeface(myTypeFace);
        scaleneTriBaseSideCET.setTypeface(myTypeFace);
        scaleneTriBasePerimeterET.setTypeface(myTypeFace);
        scaleneTriBaseAnsTV.setTypeface(myTypeFace);
        scaleneTriBaseCalcButton.setTypeface(myTypeFace);
        scaleneTriSideBClearButton.setTypeface(myTypeFace);


    }
}
