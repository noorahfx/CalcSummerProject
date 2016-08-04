package calcpa.calcsummerproject.Geometry.Kite;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import calcpa.calcsummerproject.Model;
import calcpa.calcsummerproject.R;

public class Kite extends AppCompatActivity {

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
                    kitePerimeterAET.setError("Enter Value");
                } else if (Model.isEmpty(kitePerimeterBET)) {
                    kitePerimeterBET.setError("Enter Value");
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
                    kiteAreaPET.setError("Enter Value");
                } else if (Model.isEmpty(kiteAreaQET)) {
                    kiteAreaQET.setError("Enter Value");
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
                    kiteASideBET.setError("Enter Value");
                } else if (Model.isEmpty(kiteASidePerimterET)) {
                    kiteASidePerimterET.setError("Enter Value");
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
                    kiteBSideAET.setError("Enter Value");
                } else if (Model.isEmpty(kiteBSidePerimeterET)) {
                    kiteBSidePerimeterET.setError("Enter Value");
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
                    kitePDiagonalQET.setError("Enter Value");
                } else if (Model.isEmpty(kitePDiagonalAreaET)) {
                    kitePDiagonalAreaET.setError("Enter Value");
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
                    kiteQDiagonalAreaET.setError("Enter Value");
                } else if (Model.isEmpty(kiteQDiagonalPET)) {
                    kiteQDiagonalPET.setError("Enter Value");
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
