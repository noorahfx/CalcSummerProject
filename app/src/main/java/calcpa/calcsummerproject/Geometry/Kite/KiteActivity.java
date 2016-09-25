package calcpa.calcsummerproject.Geometry.Kite;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import calcpa.calcsummerproject.Model;
import calcpa.calcsummerproject.R;

public class KiteActivity extends AppCompatActivity {

    //Perimeter
    EditText kitePerimeterAET;
    EditText kitePerimeterBET;
    TextView kitePerimeterAnswerTV;
    Button kitePerimeterCalcButton;
    Button kitePerimeterClearButton;

    //Area
    EditText kiteAreaPET;
    EditText kiteAreaQET;
    TextView kiteAreaAnswerTV;
    Button kiteAreaCalcButton;
    Button kiteAreaClearButton;

    //Side A
    EditText kiteASideBET;
    EditText kiteASidePerimterET;
    TextView kiteASideAnswerTV;
    Button kiteASideCalcButton;
    Button kiteASideClearButton;

    //Side B
    EditText kiteBSideAET;
    EditText kiteBSidePerimeterET;
    TextView kiteBSideAnswerTV;
    Button kiteBSideCalcButton;
    Button kiteBSideClearButton;


    //Diagonal P
    EditText kitePDiagonalAreaET;
    EditText kitePDiagonalQET;
    TextView kitePDiagonalAnswerTV;
    Button kitePDiagonalCalcButton;
    Button kitePDiagonalClearButton;


    //Diagonal Q
    EditText kiteQDiagonalAreaET;
    EditText kiteQDiagonalPET;
    TextView kiteQDiagonalAnswerTV;
    Button kiteQDiagonalCalcButton;
    Button kiteQDiagonalClearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kite);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_kite);
        // getSupportActionBar().setIcon(R.drawable.back_button_tb);
        //enable button in toolbar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setPerimeterResource();
        setAreaResource();
        setSideAResource();
        setSideBResource();
        sedDiagonalPResource();
        setDiagonalQResource();
        setFontResource();


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("perimeter_et1", kitePerimeterAET.getText().toString());
        outState.putString("perimeter_et2", kitePerimeterBET.getText().toString());
        outState.putString("perimeter_tv", kitePerimeterAnswerTV.getText().toString());
        outState.putString("area_et1", kiteAreaPET.getText().toString());
        outState.putString("area_et2", kiteAreaQET.getText().toString());
        outState.putString("area_tv", kiteAreaAnswerTV.getText().toString());
        outState.putString("sidea_et1", kiteASideBET.getText().toString());
        outState.putString("sidea_et2", kiteASidePerimterET.getText().toString());
        outState.putString("sidea_tv", kiteASideAnswerTV.getText().toString());
        outState.putString("sideb_et1", kiteBSideAET.getText().toString());
        outState.putString("sideb_et2", kiteBSidePerimeterET.getText().toString());
        outState.putString("sideb_tv", kiteBSideAnswerTV.getText().toString());
        outState.putString("pdiagonal_et1", kitePDiagonalAreaET.getText().toString());
        outState.putString("pdiagonal_et2", kitePDiagonalQET.getText().toString());
        outState.putString("pdiagonal_tv", kitePDiagonalAnswerTV.getText().toString());
        outState.putString("qdiagonal_et1", kiteQDiagonalAreaET.getText().toString());
        outState.putString("qdiagonal_et2", kiteQDiagonalPET.getText().toString());
        outState.putString("qdiagonal_tv", kiteQDiagonalAnswerTV.getText().toString());


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        kitePerimeterAET.setText(savedInstanceState.getString("perimeter_et1"));
        kitePerimeterBET.setText(savedInstanceState.getString("perimeter_et2"));
        kitePerimeterAnswerTV.setText(savedInstanceState.getString("perimeter_tv"));
        kiteAreaPET.setText(savedInstanceState.getString("area_et1"));
        kiteAreaQET.setText(savedInstanceState.getString("area_et2"));
        kiteAreaAnswerTV.setText(savedInstanceState.getString("area_tv"));
        kiteASideBET.setText(savedInstanceState.getString("sidea_et1"));
        kiteASidePerimterET.setText(savedInstanceState.getString("sidea_et2"));
        kiteASideAnswerTV.setText(savedInstanceState.getString("sidea_tv"));
        kiteBSideAET.setText(savedInstanceState.getString("sideb_et1"));
        kiteBSidePerimeterET.setText(savedInstanceState.getString("sideb_et2"));
        kiteBSideAnswerTV.setText(savedInstanceState.getString("sideb_tv"));
        kitePDiagonalAreaET.setText(savedInstanceState.getString("pdiagonal_et1"));
        kitePDiagonalQET.setText(savedInstanceState.getString("pdiagonal_et2"));
        kitePDiagonalAnswerTV.setText(savedInstanceState.getString("pdiagonal_tv"));
        kiteQDiagonalAreaET.setText(savedInstanceState.getString("qdiagonal_et1"));
        kiteQDiagonalPET.setText(savedInstanceState.getString("qdiagonal_et2"));
        kiteQDiagonalAnswerTV.setText(savedInstanceState.getString("qdiagonal_tv"));

    }


    private void setPerimeterResource() {
        //Perimeter
        kitePerimeterAET = (EditText) findViewById(R.id.kite_perimeter_side_a_et);
        kitePerimeterBET = (EditText) findViewById(R.id.kite_perimeter_side_b_et);
        kitePerimeterAnswerTV = (TextView) findViewById(R.id.kite_perimeter_calc_answer_tx);
        kitePerimeterCalcButton = (Button) findViewById(R.id.kite_perimeter_calc_button);
        kitePerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(kitePerimeterAET)) {
                    kitePerimeterAET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else if (Model.isEmpty(kitePerimeterBET)) {
                    kitePerimeterBET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double aSide, bSide, kitePerimeter;
                    aSide = Double.parseDouble(kitePerimeterAET.getText().toString());
                    bSide = Double.parseDouble(kitePerimeterBET.getText().toString());
                    if (aSide <= 0) {
                        kitePerimeterAnswerTV.setText("The variable a should be positive");
                    } else if (bSide <= 0) {
                        kitePerimeterAnswerTV.setText("The variable b should be positive");
                    } else {
                        kitePerimeter = 2 * (aSide + bSide);
                        kitePerimeterAnswerTV.setText(String.format("%.02f", kitePerimeter));
                    }
                }
            }
        });

        // Perimeter Clear button
        kitePerimeterClearButton = (Button) findViewById(R.id.kite_perimeter_clear_button);
        kitePerimeterClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kitePerimeterAET.setText("");
                kitePerimeterBET.setText("");
                kitePerimeterAnswerTV.setText("");
            }
        });


    }

    private void setAreaResource() {
        //Area
        kiteAreaPET = (EditText) findViewById(R.id.kite_area_diagonal_p_et);
        kiteAreaQET = (EditText) findViewById(R.id.kite_area_diagonal_q_et);
        kiteAreaAnswerTV = (TextView) findViewById(R.id.kite_area_calc_answer_tx);
        kiteAreaCalcButton = (Button) findViewById(R.id.kite_area_calc_button);
        kiteAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(kiteAreaPET)) {
                    kiteAreaPET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else if (Model.isEmpty(kiteAreaQET)) {
                    kiteAreaQET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double pDiagonal, qDiagonal, kiteArea;
                    pDiagonal = Double.parseDouble(kiteAreaPET.getText().toString());
                    qDiagonal = Double.parseDouble(kiteAreaQET.getText().toString());
                    if (pDiagonal <= 0) {
                        kiteAreaAnswerTV.setText("The variable p should be positive");
                    } else if (qDiagonal <= 0) {
                        kiteAreaAnswerTV.setText("The variable q should be positive");
                    } else {
                        kiteArea = (pDiagonal * qDiagonal) / 2;
                        kiteAreaAnswerTV.setText(String.format("%.02f", kiteArea));
                    }
                }
            }
        });


        // Area Clear button
        kiteAreaClearButton = (Button) findViewById(R.id.kite_area_clear_button);
        kiteAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kiteAreaPET.setText("");
                kiteAreaQET.setText("");
                kiteAreaAnswerTV.setText("");
            }
        });


    }

    private void setSideAResource() {
        //Side A
        kiteASideBET = (EditText) findViewById(R.id.kite_side_a_bside_et);
        kiteASidePerimterET = (EditText) findViewById(R.id.kite_side_a_perimeter_et);
        kiteASideAnswerTV = (TextView) findViewById(R.id.kite_side_a_calc_answer_tx);
        kiteASideCalcButton = (Button) findViewById(R.id.kite_side_a_calc_button);
        kiteASideCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //check to make sure field is not empty
                if (Model.isEmpty(kiteASideBET)) {
                    kiteASideBET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else if (Model.isEmpty(kiteASidePerimterET)) {
                    kiteASidePerimterET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double bSide, perimeter, kiteSideA;
                    bSide = Double.parseDouble(kiteASideBET.getText().toString());
                    perimeter = Double.parseDouble(kiteASidePerimterET.getText().toString());
                    if (bSide <= 0) {
                        kiteASideAnswerTV.setText("The variable b should be positive");
                    } else if (perimeter <= 0) {
                        kiteASideAnswerTV.setText("The variable P should be positive");
                    } else if (perimeter <= (2 * bSide)) {
                        kiteASideAnswerTV.setText("Invalid input: make sure P >2xb");
                    } else {
                        kiteSideA = (perimeter / 2) - bSide;
                        kiteASideAnswerTV.setText(String.format("%.02f", kiteSideA));
                    }
                }

            }
        });

        // Side A Clear button
        kiteASideClearButton = (Button) findViewById(R.id.kite_side_a_clear_button);
        kiteASideClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kiteASideBET.setText("");
                kiteASidePerimterET.setText("");
                kiteASideAnswerTV.setText("");
            }
        });


    }

    private void setSideBResource() {


        //Side B
        kiteBSideAET = (EditText) findViewById(R.id.kite_side_b_aside_et);
        kiteBSidePerimeterET = (EditText) findViewById(R.id.kite_side_b_perimeter_et);
        kiteBSideAnswerTV = (TextView) findViewById(R.id.kite_side_b_calc_answer_tx);
        kiteBSideCalcButton = (Button) findViewById(R.id.kite_side_b_calc_button);
        kiteBSideCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(kiteBSideAET)) {
                    kiteBSideAET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else if (Model.isEmpty(kiteBSidePerimeterET)) {
                    kiteBSidePerimeterET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double aSide, perimeter, kiteSideB;
                    aSide = Double.parseDouble(kiteBSideAET.getText().toString());
                    perimeter = Double.parseDouble(kiteBSidePerimeterET.getText().toString());
                    if (perimeter <= (2 * aSide)) {
                        kiteBSideAnswerTV.setText("Invalid input: make sure P >2xa");
                    } else if (perimeter <= 0) {
                        kiteBSideAnswerTV.setText("The variable P should be positive");
                    } else if (aSide <= 0) {
                        kiteBSideAnswerTV.setText("The variable A should be positive");
                    } else {
                        kiteSideB = (perimeter / 2) - aSide;
                        kiteBSideAnswerTV.setText(String.format("%.02f", kiteSideB));
                    }
                }

            }

        });

        // Side B Clear button
        kiteBSideClearButton = (Button) findViewById(R.id.kite_side_b_clear_button);
        kiteBSideClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kiteBSideAET.setText("");
                kiteBSidePerimeterET.setText("");
                kiteBSideAnswerTV.setText("");
            }
        });


    }

    private void sedDiagonalPResource() {
        //Diagonal P
        kitePDiagonalQET = (EditText) findViewById(R.id.kite_p_diaognal_q_et);
        kitePDiagonalAreaET = (EditText) findViewById(R.id.kite_p_diaognal_area_et);
        kitePDiagonalAnswerTV = (TextView) findViewById(R.id.kite_p_diaognal_calc_answer_tx);
        kitePDiagonalCalcButton = (Button) findViewById(R.id.kite_p_diaognal_calc_button);
        kitePDiagonalCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(kitePDiagonalQET)) {
                    kitePDiagonalQET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else if (Model.isEmpty(kitePDiagonalAreaET)) {
                    kitePDiagonalAreaET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double qDiagonal, area, kiteDiaognalP;
                    qDiagonal = Double.parseDouble(kitePDiagonalQET.getText().toString());
                    area = Double.parseDouble(kitePDiagonalAreaET.getText().toString());

                    if (qDiagonal <= 0) {
                        kitePDiagonalAnswerTV.setText("The variable q should be positive");
                    } else if (area <= 0) {
                        kitePDiagonalAnswerTV.setText("The variable A should be positive");
                    } else {

                        kiteDiaognalP = 2 * (area / qDiagonal);
                        kitePDiagonalAnswerTV.setText(String.format("%.02f", kiteDiaognalP));
                    }
                }
            }
        });

        // Diagonal P Clear button
        kitePDiagonalClearButton = (Button) findViewById(R.id.kite_p_diaognal_clear_button);
        kitePDiagonalClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kitePDiagonalAreaET.setText("");
                kitePDiagonalQET.setText("");
                kitePDiagonalAnswerTV.setText("");
            }
        });


    }

    private void setDiagonalQResource() {
        //Diagonal Q
        kiteQDiagonalAreaET = (EditText) findViewById(R.id.kite_q_diaognal_p_et);
        kiteQDiagonalPET = (EditText) findViewById(R.id.kite_q_diaognal_perimeter_et);
        kiteQDiagonalAnswerTV = (TextView) findViewById(R.id.kite_q_diaognal_calc_answer_tx);
        kiteQDiagonalCalcButton = (Button) findViewById(R.id.kite_q_diaognal_calc_button);
        kiteQDiagonalCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //check to make sure field is not empty
                if (Model.isEmpty(kiteQDiagonalAreaET)) {
                    kiteQDiagonalAreaET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else if (Model.isEmpty(kiteQDiagonalPET)) {
                    kiteQDiagonalPET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double pDiagonal, area, kiteDiaognalQ;
                    pDiagonal = Double.parseDouble(kiteQDiagonalAreaET.getText().toString());
                    area = Double.parseDouble(kiteQDiagonalPET.getText().toString());

                    if (pDiagonal <= 0) {
                        kitePDiagonalAnswerTV.setText("The variable p should be positive");
                    } else if (area <= 0) {
                        kitePDiagonalAnswerTV.setText("The variable A should be positive");
                    } else {

                        kiteDiaognalQ = 2 * area / pDiagonal;
                        kiteQDiagonalAnswerTV.setText(String.format("%.02f", kiteDiaognalQ));
                    }
                }
            }
        });

        // Diagonal Q Clear button
        kiteQDiagonalClearButton = (Button) findViewById(R.id.kite_q_diaognal_clear_button);
        kiteQDiagonalClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kiteQDiagonalAreaET.setText("");
                kiteQDiagonalPET.setText("");
                kiteQDiagonalAnswerTV.setText("");
            }
        });


    }

    private void setFontResource() {

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");

        TextView myTextView = (TextView) findViewById(R.id.kite_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.kite_perimeter_side_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.kite_perimeter_side_b_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.kite_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.kite_area_diagonal_p_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.kite_area_diagonal_q_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.kite_side_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.kite_side_a_bside_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.kite_side_a_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.kite_side_b_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.kite_side_b_aside_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.kite_side_b_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.kite_p_diaognal_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.kite_p_diaognal_q_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.kite_p_diaognal_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.kite_q_diaognal_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.kite_q_diaognal_p_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.kite_q_diaognal_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        kitePerimeterAET.setTypeface(myTypeFace);
        kitePerimeterBET.setTypeface(myTypeFace);
        kitePerimeterAnswerTV.setTypeface(myTypeFace);
        kitePerimeterCalcButton.setTypeface(myTypeFace);
        kitePerimeterClearButton.setTypeface(myTypeFace);

        kiteAreaPET.setTypeface(myTypeFace);
        kiteAreaQET.setTypeface(myTypeFace);
        kiteAreaAnswerTV.setTypeface(myTypeFace);
        kiteAreaCalcButton.setTypeface(myTypeFace);
        kiteAreaClearButton.setTypeface(myTypeFace);

        kiteASideBET.setTypeface(myTypeFace);
        kiteASidePerimterET.setTypeface(myTypeFace);
        kiteASideAnswerTV.setTypeface(myTypeFace);
        kiteASideCalcButton.setTypeface(myTypeFace);
        kiteASideClearButton.setTypeface(myTypeFace);

        kiteBSideAET.setTypeface(myTypeFace);
        kiteBSidePerimeterET.setTypeface(myTypeFace);
        kiteBSideAnswerTV.setTypeface(myTypeFace);
        kiteBSideCalcButton.setTypeface(myTypeFace);
        kiteBSideClearButton.setTypeface(myTypeFace);

        kitePDiagonalAreaET.setTypeface(myTypeFace);
        kitePDiagonalQET.setTypeface(myTypeFace);
        kitePDiagonalAnswerTV.setTypeface(myTypeFace);
        kitePDiagonalCalcButton.setTypeface(myTypeFace);
        kitePDiagonalClearButton.setTypeface(myTypeFace);

        kiteQDiagonalAreaET.setTypeface(myTypeFace);
        kiteQDiagonalPET.setTypeface(myTypeFace);
        kiteQDiagonalAnswerTV.setTypeface(myTypeFace);
        kiteQDiagonalCalcButton.setTypeface(myTypeFace);
        kiteQDiagonalClearButton.setTypeface(myTypeFace);


    }


}
