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

import org.w3c.dom.Text;

import calcpa.calcsummerproject.Model;
import calcpa.calcsummerproject.R;
import io.github.kexanie.library.MathView;

public class IsoscelesTriangle extends AppCompatActivity {


    //perimeter
    EditText isoTriPerimeterSideET;
    EditText isoTriPerimeterBaseET;
    TextView isoTriPerimeterAnswerTV;
    Button isoTriPerimeterCalcButton;
    Button isoTriPerimClearButton;


    //Area
    EditText isoTriAreaBaseET;
    EditText isoTriAreaHeightET;
    TextView isoTriAreaAnswerTV;
    Button isoTriAreaCalcButton;
    Button isoTriAreaClearButton;


    //Side
    EditText isoTriSideBaseET;
    EditText isoTriSidePerimeterET;
    TextView isoTriSideAnswerTV;
    Button isoTriSideCalcButton;
    Button isoTriSideClearButton;

    //Base
    EditText isoTriBaseSideET;
    EditText isoTriBasePerimeterET;
    TextView isoTriBaseAnswerTV;
    Button isoTriBaseCalcButton;
    Button isoTriBaseClearButton;

    //Height
    EditText isoTriHeightBaseET;
    EditText isoTriHeightPerimeterET;
    TextView isoTriHeightAnswerTV;
    Button isoTriHeightCalcButton;
    Button isoTriHeightClearButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isosceles_triangle);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_isosceles_triangle);
        // getSupportActionBar().setIcon(R.drawable.back_button_tb);
        //enable button in toolbar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        perimeterResource();
        areaResource();
        baseResource();
        heightResource();
        sideReesource();
        fontResource();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("perimeter_et1", isoTriPerimeterSideET.getText().toString());
        outState.putString("perimeter_et2", isoTriPerimeterBaseET.getText().toString());
        outState.putString("perimeter_tv", isoTriPerimeterAnswerTV.getText().toString());

        outState.putString("area_et1", isoTriAreaBaseET.getText().toString());
        outState.putString("area_et2", isoTriAreaHeightET.getText().toString());
        outState.putString("area_tv", isoTriAreaAnswerTV.getText().toString());

        outState.putString("base_et1", isoTriBaseSideET.getText().toString());
        outState.putString("base_et2", isoTriBasePerimeterET.getText().toString());
        outState.putString("base_tv", isoTriBaseAnswerTV.getText().toString());

        outState.putString("sidea_et1", isoTriSideBaseET.getText().toString());
        outState.putString("sidea_et2", isoTriSidePerimeterET.getText().toString());
        outState.putString("sidea_tv", isoTriSideAnswerTV.getText().toString());

        outState.putString("height_et1", isoTriHeightBaseET.getText().toString());
        outState.putString("height_et2", isoTriHeightPerimeterET.getText().toString());
        outState.putString("height_tv", isoTriHeightAnswerTV.getText().toString());


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);


        isoTriPerimeterSideET.setText(savedInstanceState.getString("perimeter_et1"));
        isoTriPerimeterBaseET.setText(savedInstanceState.getString("perimeter_et2"));
        isoTriPerimeterAnswerTV.setText(savedInstanceState.getString("perimeter_tv"));

        isoTriAreaBaseET.setText(savedInstanceState.getString("area_et1"));
        isoTriAreaHeightET.setText(savedInstanceState.getString("area_et2"));
        isoTriAreaAnswerTV.setText(savedInstanceState.getString("area_tv"));


        isoTriBaseSideET.setText(savedInstanceState.getString("base_et1"));
        isoTriBasePerimeterET.setText(savedInstanceState.getString("base_et2"));
        isoTriBaseAnswerTV.setText(savedInstanceState.getString("base_tv"));

        isoTriSideBaseET.setText(savedInstanceState.getString("sidea_et1"));
        isoTriSidePerimeterET.setText(savedInstanceState.getString("sidea_et2"));
        isoTriSideAnswerTV.setText(savedInstanceState.getString("sidea_tv"));
        isoTriHeightBaseET.setText(savedInstanceState.getString("height_et1"));
        isoTriHeightPerimeterET.setText(savedInstanceState.getString("height_et2"));
        isoTriHeightAnswerTV.setText(savedInstanceState.getString("height_tv"));
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
        //perimeter
        isoTriPerimeterSideET = (EditText) findViewById(R.id.iso_triangle_perimeter_sideA_et);
        isoTriPerimeterBaseET = (EditText) findViewById(R.id.iso_triangle_perimeter_base_et);
        isoTriPerimeterAnswerTV = (TextView) findViewById(R.id.iso_triangle_perimeter_ans_tv);
        isoTriPerimeterCalcButton = (Button) findViewById(R.id.iso_triangle_perimeter_calc_button);
        isoTriPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(isoTriPerimeterSideET)) {
                    isoTriPerimeterSideET.setError("Enter Value");
                } else if (Model.isEmpty(isoTriPerimeterBaseET)) {
                    isoTriPerimeterBaseET.setError("Enter Value");
                } else {
                    double sideA, baseB, isoTriPerimeter;
                    sideA = Double.parseDouble(isoTriPerimeterSideET.getText().toString());
                    baseB = Double.parseDouble(isoTriPerimeterBaseET.getText().toString());
                    if (sideA <= 0) {
                        isoTriPerimeterAnswerTV.setText("The variable a should be positive");
                    } else if (baseB <= 0) {
                        isoTriPerimeterAnswerTV.setText("The variable b should be positive");
                    } else if (baseB >= (2 * sideA)) {
                        isoTriPerimeterAnswerTV.setText("Invalid input: make sure b<2*a");
                    } else {
                        isoTriPerimeter = 2 * sideA + baseB;
                        isoTriPerimeterAnswerTV.setText(String.format("%.02f", isoTriPerimeter));
                    }
                }
            }
        });


        // Perimeter Clear button
        isoTriPerimClearButton = (Button) findViewById(R.id.iso_tri_perimeter_clear_button);
        isoTriPerimClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isoTriPerimeterSideET.setText("");
                isoTriPerimeterBaseET.setText("");
                isoTriPerimeterAnswerTV.setText("");
            }
        });


    }

    public void areaResource() {
        //Area
        isoTriAreaBaseET = (EditText) findViewById(R.id.iso_triangle_area_base_et);
        isoTriAreaHeightET = (EditText) findViewById(R.id.iso_triangle_area_height_et);
        isoTriAreaAnswerTV = (TextView) findViewById(R.id.iso_triangle_area_ans_tv);
        isoTriAreaCalcButton = (Button) findViewById(R.id.iso_triangle_area_calc_button);
        isoTriAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(isoTriAreaBaseET)) {
                    isoTriAreaBaseET.setError("Enter Value");
                } else if (Model.isEmpty(isoTriAreaHeightET)) {
                    isoTriAreaHeightET.setError("Enter Value");
                } else {
                    double baseB, height, isoTriArea;
                    baseB = Double.parseDouble(isoTriAreaBaseET.getText().toString());
                    height = Double.parseDouble(isoTriAreaHeightET.getText().toString());
                    if (baseB <= 0) {
                        isoTriAreaAnswerTV.setText("The variable b should be positive");
                    } else if (height <= 0) {
                        isoTriAreaAnswerTV.setText("The variable h should be positive");
                    } else {
                        isoTriArea = (baseB * height) / 2;
                        isoTriAreaAnswerTV.setText(String.format("%.02f", isoTriArea));
                    }
                }
            }
        });


        // Area Clear button
        isoTriAreaClearButton = (Button) findViewById(R.id.iso_triangle_area_clear_button);
        isoTriAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isoTriAreaBaseET.setText("");
                isoTriAreaHeightET.setText("");
                isoTriAreaAnswerTV.setText("");
            }
        });


    }

    public void sideReesource() {
        //Side
        isoTriSideBaseET = (EditText) findViewById(R.id.iso_triangle_side_base_et);
        isoTriSidePerimeterET = (EditText) findViewById(R.id.iso_triangle_side_perimeter_et);
        isoTriSideAnswerTV = (TextView) findViewById(R.id.iso_triangle_side_ans_tv);
        isoTriSideCalcButton = (Button) findViewById(R.id.iso_triangle_side_calc_button);
        isoTriSideCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(isoTriSideBaseET)) {
                    isoTriSideBaseET.setError("Enter Value");
                } else if (Model.isEmpty(isoTriSidePerimeterET)) {
                    isoTriSidePerimeterET.setError("Enter Value");
                } else {
                    double baseB, perimeter, isoTriSide;
                    baseB = Double.parseDouble(isoTriSideBaseET.getText().toString());
                    perimeter = Double.parseDouble(isoTriSidePerimeterET.getText().toString());
                    if (baseB <= 0) {
                        isoTriSideAnswerTV.setText("The variable a should be positive");
                    } else if (perimeter <= 0) {
                        isoTriSideAnswerTV.setText("The variable b should be positive");
                    } else if (perimeter <= (2 * baseB)) {
                        isoTriSideAnswerTV.setText("Invalid input: make sure P<2*a");
                    } else {
                        isoTriSide = (perimeter / 2) - (baseB / 2);
                        isoTriSideAnswerTV.setText(String.format("%.02f", isoTriSide));
                    }
                }
            }
        });


        // Side Clear button
        isoTriSideClearButton = (Button) findViewById(R.id.iso_triangle_side_clear_button);
        isoTriSideClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isoTriSideBaseET.setText("");
                isoTriSidePerimeterET.setText("");
                isoTriSideAnswerTV.setText("");
            }
        });


    }


    public void baseResource() {
        //Base
        isoTriBaseSideET = (EditText) findViewById(R.id.iso_triangle_base_side_et);
        isoTriBasePerimeterET = (EditText) findViewById(R.id.iso_triangle_base_perimeter_et);
        isoTriBaseAnswerTV = (TextView) findViewById(R.id.iso_triangle_base_ans_tv);
        isoTriBaseCalcButton = (Button) findViewById(R.id.iso_triangle_base_calc_button);
        isoTriBaseCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(isoTriBaseSideET)) {
                    isoTriBaseSideET.setError("Enter Value");
                } else if (Model.isEmpty(isoTriBasePerimeterET)) {
                    isoTriBasePerimeterET.setError("Enter Value");
                } else {
                    double sideA, perimeter, isoTriBase;
                    sideA = Double.parseDouble(isoTriBaseSideET.getText().toString());
                    perimeter = Double.parseDouble(isoTriBasePerimeterET.getText().toString());
                    if (sideA <= 0) {
                        isoTriBaseAnswerTV.setText("The variable a should be positive");
                    } else if (perimeter <= 0) {
                        isoTriBaseAnswerTV.setText("The variable b should be positive");
                    } else if (perimeter <= (2 * sideA)) {
                        isoTriBaseAnswerTV.setText("Invalid input: make sure P<2*a");
                    } else {
                        isoTriBase = perimeter - 2 * sideA;
                        isoTriBaseAnswerTV.setText(String.format("%.02f", isoTriBase));
                    }
                }
            }
        });


        // Base Clear button
        isoTriBaseClearButton = (Button) findViewById(R.id.iso_triangle_base_clear_button);
        isoTriBaseClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isoTriBaseSideET.setText("");
                isoTriBasePerimeterET.setText("");
                isoTriBaseAnswerTV.setText("");
            }
        });


    }

    public void heightResource() {
        //Height
        isoTriHeightBaseET = (EditText) findViewById(R.id.iso_triangle_height_base_et);
        isoTriHeightPerimeterET = (EditText) findViewById(R.id.iso_triangle_height_area_et);
        isoTriHeightAnswerTV = (TextView) findViewById(R.id.iso_triangle_height_ans_tv);
        isoTriHeightCalcButton = (Button) findViewById(R.id.iso_triangle_height_calc_button);
        isoTriHeightCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(isoTriHeightBaseET)) {
                    isoTriHeightBaseET.setError("Enter Value");
                } else if (Model.isEmpty(isoTriHeightPerimeterET)) {
                    isoTriHeightPerimeterET.setError("Enter Value");
                } else {
                    double base, area, isoTriHeight;
                    base = Double.parseDouble(isoTriHeightBaseET.getText().toString());
                    area = Double.parseDouble(isoTriHeightPerimeterET.getText().toString());
                    if (base <= 0) {
                        isoTriHeightAnswerTV.setText("The variable a should be positive");
                    } else if (area <= 0) {
                        isoTriHeightAnswerTV.setText("The variable b should be positive");
                    } else {
                        isoTriHeight = 2 * (area / base);
                        isoTriHeightAnswerTV.setText(String.format("%.02f", isoTriHeight));
                    }
                }
            }
        });

        // Height Clear button
        isoTriHeightClearButton = (Button) findViewById(R.id.iso_triangle_height_clear_button);
        isoTriHeightClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isoTriHeightBaseET.setText("");
                isoTriHeightPerimeterET.setText("");
                isoTriHeightAnswerTV.setText("");
            }
        });
    }

    public void fontResource() {
        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");

        TextView myTextView = (TextView) findViewById(R.id.iso_triangle_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.iso_triangle_perimeter_sideA_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.iso_triangle_perimeter_base_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.iso_triangle_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.iso_triangle_area_base_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.iso_triangle_area_height_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.iso_triangle_side_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.iso_triangle_side_base_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.iso_triangle_side_perimeter_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.iso_triangle_base_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.iso_triangle_base_side_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.iso_triangle_base_perimeter_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.iso_triangle_height_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.iso_triangle_height_base_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.iso_triangle_height_area_tv);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        isoTriPerimeterSideET.setTypeface(myTypeFace);
        isoTriPerimeterBaseET.setTypeface(myTypeFace);
        isoTriPerimeterAnswerTV.setTypeface(myTypeFace);
        isoTriPerimeterCalcButton.setTypeface(myTypeFace);
        isoTriPerimClearButton.setTypeface(myTypeFace);

        isoTriAreaBaseET.setTypeface(myTypeFace);
        isoTriAreaHeightET.setTypeface(myTypeFace);
        isoTriAreaAnswerTV.setTypeface(myTypeFace);
        isoTriAreaCalcButton.setTypeface(myTypeFace);
        isoTriAreaClearButton.setTypeface(myTypeFace);

        isoTriSideBaseET.setTypeface(myTypeFace);
        isoTriSidePerimeterET.setTypeface(myTypeFace);
        isoTriSideAnswerTV.setTypeface(myTypeFace);
        isoTriSideCalcButton.setTypeface(myTypeFace);
        isoTriSideClearButton.setTypeface(myTypeFace);

        isoTriBaseSideET.setTypeface(myTypeFace);
        isoTriBasePerimeterET.setTypeface(myTypeFace);
        isoTriBaseAnswerTV.setTypeface(myTypeFace);
        isoTriBaseCalcButton.setTypeface(myTypeFace);
        isoTriBaseClearButton.setTypeface(myTypeFace);

        isoTriHeightBaseET.setTypeface(myTypeFace);
        isoTriHeightPerimeterET.setTypeface(myTypeFace);
        isoTriHeightAnswerTV.setTypeface(myTypeFace);
        isoTriHeightCalcButton.setTypeface(myTypeFace);
        isoTriHeightClearButton.setTypeface(myTypeFace);

    }
}

