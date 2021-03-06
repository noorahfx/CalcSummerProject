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

public class ObtuseTriangle extends AppCompatActivity {


    //perimeter
    EditText obtuseTriPerimeterSideAET;
    EditText obtuseTriPerimeterBaseET;
    EditText obtuseTriPerimeterSideCET;
    TextView obtuseTriPerimeterAnsTV;
    Button obtuseTriPerimeterCalcButton;
    Button obtuseTriPerimClearButton;


    // area
    EditText obtuseTriAreaBaseET;
    EditText obtuseTriAreaHeightET;
    TextView obtuseTriAreaAnsTV;
    Button obtuseTriAreaCalcButton;
    Button obtuseTriAreaClearButton;


    //side A calculatro
    EditText obtuseTriSideABaseET;
    EditText obtuseTriSideASideCET;
    EditText obtuseTriSideAPerimeterET;
    TextView obtuseTriSideAAnsTV;
    Button obtuseTriSideACalcButton;
    Button obtuseTriSideAClearButton;

    //side B calculator
    EditText obtuseTriBaseSideAET;
    EditText obtuseTriBaseSideCET;
    EditText obtuseTriBasePerimeterET;
    TextView obtuseTriBaseAnsTV;
    Button obtuseTriBaseCalcButton;
    Button obtuseTriBaseClearButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obtuse_triangle);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_obtuse_triangle);
        // getSupportActionBar().setIcon(R.drawable.back_button_tb);
        //enable button in toolbar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        perimeterResource();
        areaResource();
        baseResource();
        sideAResource();
        fontResource();


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("perimeter_et1", obtuseTriPerimeterSideAET.getText().toString());
        outState.putString("perimeter_et2", obtuseTriPerimeterBaseET.getText().toString());
        outState.putString("perimeter_et3", obtuseTriPerimeterSideCET.getText().toString());
        outState.putString("perimeter_tv", obtuseTriPerimeterAnsTV.getText().toString());

        outState.putString("area_et1", obtuseTriAreaBaseET.getText().toString());
        outState.putString("area_et2", obtuseTriAreaHeightET.getText().toString());
        outState.putString("area_tv", obtuseTriAreaAnsTV.getText().toString());

        outState.putString("sidea_et1", obtuseTriSideABaseET.getText().toString());
        outState.putString("sidea_et2", obtuseTriSideASideCET.getText().toString());
        outState.putString("sidea_et3", obtuseTriSideAPerimeterET.getText().toString());
        outState.putString("sidea_tv", obtuseTriSideAAnsTV.getText().toString());

        outState.putString("sideb_et1", obtuseTriBaseSideAET.getText().toString());
        outState.putString("sideb_et2", obtuseTriBaseSideCET.getText().toString());
        outState.putString("sideb_et3", obtuseTriBasePerimeterET.getText().toString());
        outState.putString("sideb_tv", obtuseTriBaseAnsTV.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        obtuseTriPerimeterSideAET.setText(savedInstanceState.getString("perimeter_et1"));
        obtuseTriPerimeterBaseET.setText(savedInstanceState.getString("perimeter_et2"));
        obtuseTriPerimeterSideCET.setText(savedInstanceState.getString("perimeter_et3"));
        obtuseTriPerimeterAnsTV.setText(savedInstanceState.getString("perimeter_tv"));

        obtuseTriAreaBaseET.setText(savedInstanceState.getString("area_et1"));
        obtuseTriAreaHeightET.setText(savedInstanceState.getString("area_et2"));
        obtuseTriAreaAnsTV.setText(savedInstanceState.getString("area_tv"));

        obtuseTriSideABaseET.setText(savedInstanceState.getString("sidea_et1"));
        obtuseTriSideASideCET.setText(savedInstanceState.getString("sidea_et2"));
        obtuseTriSideAPerimeterET.setText(savedInstanceState.getString("sidea_et3"));
        obtuseTriSideAAnsTV.setText(savedInstanceState.getString("sidea_tv"));

        obtuseTriBaseSideAET.setText(savedInstanceState.getString("sideb_et1"));
        obtuseTriBaseSideCET.setText(savedInstanceState.getString("sideb_et2"));
        obtuseTriBasePerimeterET.setText(savedInstanceState.getString("sideb_et3"));
        obtuseTriBaseAnsTV.setText(savedInstanceState.getString("sideb_tv"));

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
        obtuseTriPerimeterSideAET = (EditText) findViewById(R.id.obtuse_tri_perimeter_sideA_et);
        obtuseTriPerimeterBaseET = (EditText) findViewById(R.id.obtuse_tri_perimeter_sideB_et);
        obtuseTriPerimeterSideCET = (EditText) findViewById(R.id.obtuse_tri_perimeter_sideC_et);
        obtuseTriPerimeterAnsTV = (TextView) findViewById(R.id.obtuse_tri_perimeter_ans_tv);
        obtuseTriPerimeterCalcButton = (Button) findViewById(R.id.obtuse_tri_perimeter_calc_button);
        obtuseTriPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(obtuseTriPerimeterSideAET)) {
                    obtuseTriPerimeterSideAET.setError("Enter Value");
                } else if (Model.isEmpty(obtuseTriPerimeterBaseET)) {
                    obtuseTriPerimeterBaseET.setError("Enter Value");
                } else if (Model.isEmpty(obtuseTriPerimeterSideCET)) {
                    obtuseTriPerimeterSideCET.setError("Enter Value");
                } else {
                    double sideA, baseB, sideC, obtuseTriPerimeter;
                    sideA = Double.parseDouble(obtuseTriPerimeterSideAET.getText().toString());
                    baseB = Double.parseDouble(obtuseTriPerimeterBaseET.getText().toString());
                    sideC = Double.parseDouble(obtuseTriPerimeterSideCET.getText().toString());
                    if (sideA <= 0) {
                        obtuseTriPerimeterAnsTV.setText("The variable a should be positive");
                    } else if (baseB <= 0) {
                        obtuseTriPerimeterAnsTV.setText("The variable b should be positive");
                    } else if (sideC <= 0) {
                        obtuseTriPerimeterAnsTV.setText("The variable c should be positive");
                    } else if (sideA >= (baseB + sideC)) {
                        obtuseTriPerimeterAnsTV.setText("Invalid input: make sure b+c>a");
                    } else {
                        obtuseTriPerimeter = sideA + baseB + sideC;
                        obtuseTriPerimeterAnsTV.setText(String.format("%.02f", obtuseTriPerimeter));
                    }
                }
            }
        });

        // Perimeter Clear button
        obtuseTriPerimClearButton = (Button) findViewById(R.id.obtuse_tri_perimeter_clear_button);
        obtuseTriPerimClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtuseTriPerimeterSideAET.setText("");
                obtuseTriPerimeterBaseET.setText("");
                obtuseTriPerimeterSideCET.setText("");
                obtuseTriPerimeterAnsTV.setText("");
            }
        });


    }

    public void areaResource() {
        //acute triangle area

        obtuseTriAreaBaseET = (EditText) findViewById(R.id.obtuse_tri_area_base_et);
        obtuseTriAreaHeightET = (EditText) findViewById(R.id.obtuse_tri_area_height_et);
        obtuseTriAreaAnsTV = (TextView) findViewById(R.id.obtuse_tri_area_ans_tv);
        obtuseTriAreaCalcButton = (Button) findViewById(R.id.obtuse_tri_area_calc_button);
        obtuseTriAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(obtuseTriAreaBaseET)) {
                    obtuseTriAreaBaseET.setError("Enter Value");
                } else if (Model.isEmpty(obtuseTriAreaHeightET)) {
                    obtuseTriAreaHeightET.setError("Enter Value");
                } else {
                    double baseB, height, obtuseTriArea;
                    baseB = Double.parseDouble(obtuseTriAreaBaseET.getText().toString());
                    height = Double.parseDouble(obtuseTriAreaHeightET.getText().toString());
                    if (baseB <= 0) {
                        obtuseTriAreaAnsTV.setText("The variable b should be positive");
                    } else if (height <= 0) {
                        obtuseTriAreaAnsTV.setText("The variable h should be positive");
                    } else {
                        obtuseTriArea = (height * baseB) / 2;
                        obtuseTriAreaAnsTV.setText(String.format("%.02f", obtuseTriArea));
                    }
                }
            }
        });

        // Area Clear button
        obtuseTriAreaClearButton = (Button) findViewById(R.id.obtuse_tri_area_clear_button);
        obtuseTriAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtuseTriAreaBaseET.setText("");
                obtuseTriAreaHeightET.setText("");
                obtuseTriAreaAnsTV.setText("");
            }
        });


    }

    public void sideAResource() {
        //acute triangle side A calculatro

        obtuseTriSideABaseET = (EditText) findViewById(R.id.obtuse_tri_sideA_base_et);
        obtuseTriSideASideCET = (EditText) findViewById(R.id.obtuse_tri_sideA_sideC_et);
        obtuseTriSideAPerimeterET = (EditText) findViewById(R.id.obtuse_tri_sideA_perimeter_et);
        obtuseTriSideAAnsTV = (TextView) findViewById(R.id.obtuse_tri_sideA_ans_tv);
        obtuseTriSideACalcButton = (Button) findViewById(R.id.obtuse_tri_sideA_calc_button);
        obtuseTriSideACalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(obtuseTriSideABaseET)) {
                    obtuseTriSideABaseET.setError("Enter Value");
                } else if (Model.isEmpty(obtuseTriSideASideCET)) {
                    obtuseTriSideASideCET.setError("Enter Value");
                } else if (Model.isEmpty(obtuseTriSideAPerimeterET)) {
                    obtuseTriSideAPerimeterET.setError("Enter Value");
                } else {
                    double sideC, baseB, perimeter, obtuseTriSideA;
                    sideC = Double.parseDouble(obtuseTriSideABaseET.getText().toString());
                    baseB = Double.parseDouble(obtuseTriSideASideCET.getText().toString());
                    perimeter = Double.parseDouble(obtuseTriSideAPerimeterET.getText().toString());
                    if (sideC <= 0) {
                        obtuseTriSideAAnsTV.setText("The variable a should be positive");
                    } else if (baseB <= 0) {
                        obtuseTriSideAAnsTV.setText("The variable b should be positive");
                    } else if (perimeter <= 0) {
                        obtuseTriSideAAnsTV.setText("The variable P should be positive");
                    } else if (perimeter <= (baseB + sideC)) {
                        obtuseTriSideAAnsTV.setText("Invalid input: make sure P>b+c");
                    } else {
                        obtuseTriSideA = perimeter - baseB - sideC;
                        obtuseTriSideAAnsTV.setText(String.format("%.02f", obtuseTriSideA));
                    }
                }
            }
        });

        // Side A Clear button
        obtuseTriSideAClearButton = (Button) findViewById(R.id.obtuse_tri_sideA_clear_button);
        obtuseTriSideAClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtuseTriSideABaseET.setText("");
                obtuseTriSideASideCET.setText("");
                obtuseTriSideAPerimeterET.setText("");
                obtuseTriSideAAnsTV.setText("");
            }
        });


    }

    public void baseResource() {

        //acute triangle side B calculator

        obtuseTriBaseSideAET = (EditText) findViewById(R.id.obtuse_tri_base_sideA_et);
        obtuseTriBaseSideCET = (EditText) findViewById(R.id.obtuse_tri_base_sideC_et);
        obtuseTriBasePerimeterET = (EditText) findViewById(R.id.obtuse_tri_base_perimeter_et);
        obtuseTriBaseAnsTV = (TextView) findViewById(R.id.obtuse_tri_base_ans_tv);
        obtuseTriBaseCalcButton = (Button) findViewById(R.id.obtuse_tri_base_calc_button);
        obtuseTriBaseCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(obtuseTriBaseSideAET)) {
                    obtuseTriBaseSideAET.setError("Enter Value");
                } else if (Model.isEmpty(obtuseTriBaseSideCET)) {
                    obtuseTriBaseSideCET.setError("Enter Value");
                } else if (Model.isEmpty(obtuseTriBasePerimeterET)) {
                    obtuseTriBasePerimeterET.setError("Enter Value");
                } else {
                    double sideA, sideC, perimeter, obtuseTrisideB;
                    sideA = Double.parseDouble(obtuseTriBaseSideAET.getText().toString());
                    sideC = Double.parseDouble(obtuseTriBaseSideCET.getText().toString());
                    perimeter = Double.parseDouble(obtuseTriBasePerimeterET.getText().toString());
                    if (sideA <= 0) {
                        obtuseTriBaseAnsTV.setText("The variable a should be positive");
                    } else if (sideC <= 0) {
                        obtuseTriBaseAnsTV.setText("The variable b should be positive");
                    } else if (perimeter <= 0) {
                        obtuseTriBaseAnsTV.setText("The variable P should be positive");
                    } else if (perimeter <= (sideA + sideC)) {
                        obtuseTriBaseAnsTV.setText("Invalid input: make sure P>b+c");
                    } else {
                        obtuseTrisideB = perimeter - sideA - sideC;
                        obtuseTriBaseAnsTV.setText(String.format("%.02f", obtuseTrisideB));
                    }
                }
            }
        });
        // Side B Clear button
        obtuseTriBaseClearButton = (Button) findViewById(R.id.obtuse_tri_base_clear_button);
        obtuseTriBaseClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtuseTriBaseSideAET.setText("");
                obtuseTriBaseSideCET.setText("");
                obtuseTriBasePerimeterET.setText("");
                obtuseTriBaseAnsTV.setText("");
            }
        });


    }

    public void fontResource() {
        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");

        TextView myTextView = (TextView) findViewById(R.id.obtuse_tri_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.obtuse_tri_perimeter_sideA_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.obtuse_tri_perimeter_sideB_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.obtuse_tri_perimeter_sideC_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.obtuse_tri_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.obtuse_tri_area_base_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.obtuse_tri_area_height_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.obtuse_tri_sideA_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.obtuse_tri_sideA_base_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.obtuse_tri_sideA_sideC_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.obtuse_tri_sideA_perimeter_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.obtuse_tri_base_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.obtuse_tri_base_sideA_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.obtuse_tri_base_sideC_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.obtuse_tri_base_perimeter_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        obtuseTriPerimeterSideAET.setTypeface(myTypeFace);
        obtuseTriPerimeterBaseET.setTypeface(myTypeFace);
        obtuseTriPerimeterSideCET.setTypeface(myTypeFace);
        obtuseTriPerimeterAnsTV.setTypeface(myTypeFace);
        obtuseTriPerimeterCalcButton.setTypeface(myTypeFace);
        obtuseTriPerimClearButton.setTypeface(myTypeFace);

        obtuseTriAreaBaseET.setTypeface(myTypeFace);
        obtuseTriAreaHeightET.setTypeface(myTypeFace);
        obtuseTriAreaAnsTV.setTypeface(myTypeFace);
        obtuseTriAreaCalcButton.setTypeface(myTypeFace);
        obtuseTriAreaClearButton.setTypeface(myTypeFace);

        obtuseTriSideABaseET.setTypeface(myTypeFace);
        obtuseTriSideASideCET.setTypeface(myTypeFace);
        obtuseTriSideAPerimeterET.setTypeface(myTypeFace);
        obtuseTriSideAAnsTV.setTypeface(myTypeFace);
        obtuseTriSideACalcButton.setTypeface(myTypeFace);
        obtuseTriSideAClearButton.setTypeface(myTypeFace);

        obtuseTriBaseSideAET.setTypeface(myTypeFace);
        obtuseTriBaseSideCET.setTypeface(myTypeFace);
        obtuseTriBasePerimeterET.setTypeface(myTypeFace);
        obtuseTriBaseAnsTV.setTypeface(myTypeFace);
        obtuseTriBaseCalcButton.setTypeface(myTypeFace);
        obtuseTriBaseClearButton.setTypeface(myTypeFace);

    }

}

