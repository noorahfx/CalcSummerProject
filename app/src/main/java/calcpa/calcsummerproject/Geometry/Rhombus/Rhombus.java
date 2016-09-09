package calcpa.calcsummerproject.Geometry.Rhombus;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import calcpa.calcsummerproject.Model;
import calcpa.calcsummerproject.R;
import io.github.kexanie.library.MathView;

public class Rhombus extends AppCompatActivity {


    //Perimeter
    EditText rhombusPerimeterAET;
    TextView rhombusPerimeterAnswerTV;
    Button rhombusPerimeterCalcButton;
    Button rhombusPerimeterClearButton;

    //Area
    EditText rhombusAreaPET;
    EditText rhombusAreaQET;
    TextView rhombusAreaAnswerTV;
    Button rhombusAreaCalcButton;
    Button rhombusAreaClearButton;

    //Sides
    EditText rhombusSidesPET;
    TextView rhombusSidesAnswerTV;
    Button rhombusSidesCalcButton;
    Button rhombusSidesClearButton;

    //Diagonal P
    EditText rhombusPDiaognalQET;
    EditText rhombusPDiaognalAreaET;
    TextView rhombusPDiaognalAnswerTV;
    Button rhombusPDiaognalCalcButton;
    Button rhombusPDiaognalClearButton;


    //Diagonal Q
    EditText rhombusQDiagonalPET;
    EditText rhombusQDiagonalAreaET;
    TextView rhombusQDiagonalAnswerTV;
    Button rhombusQDiagonalCalcButton;
    Button rhombusQDiagonalClearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhombus);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        perimeterResource();
        areaResource();
        sideResource();
        diagonalPResource();
        diaognalQResource();
        fontResource();


    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("perimeter_et", rhombusPerimeterAET.getText().toString());
        outState.putString("perimeter_tv", rhombusPerimeterAnswerTV.getText().toString());
        outState.putString("area_et1", rhombusAreaPET.getText().toString());
        outState.putString("area_et2", rhombusAreaQET.getText().toString());
        outState.putString("area_tv", rhombusAreaAnswerTV.getText().toString());
        outState.putString("side_et", rhombusSidesPET.getText().toString());
        outState.putString("side_tv", rhombusSidesAnswerTV.getText().toString());
        outState.putString("pdiagonal_et1", rhombusPDiaognalQET.getText().toString());
        outState.putString("pdiagonal_et2", rhombusPDiaognalAreaET.getText().toString());
        outState.putString("pdiagonal_tv", rhombusPDiaognalAnswerTV.getText().toString());
        outState.putString("qdiagonal_et1", rhombusQDiagonalPET.getText().toString());
        outState.putString("qdiagonal_et2", rhombusQDiagonalAreaET.getText().toString());
        outState.putString("qdiagonal_tv", rhombusQDiagonalAnswerTV.getText().toString());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        rhombusPerimeterAET.setText(savedInstanceState.getString("perimeter_et"));
        rhombusPerimeterAnswerTV.setText(savedInstanceState.getString("perimeter_tv"));
        rhombusAreaPET.setText(savedInstanceState.getString("area_et1"));
        rhombusAreaQET.setText(savedInstanceState.getString("area_et2"));
        rhombusAreaAnswerTV.setText(savedInstanceState.getString("area_tv"));
        rhombusSidesPET.setText(savedInstanceState.getString("side_et"));
        rhombusSidesAnswerTV.setText(savedInstanceState.getString("side_tv"));
        rhombusPDiaognalQET.setText(savedInstanceState.getString("pdiagonal_et1"));
        rhombusPDiaognalAreaET.setText(savedInstanceState.getString("pdiagonal_et2"));
        rhombusPDiaognalAnswerTV.setText(savedInstanceState.getString("pdiagonal_tv"));
        rhombusQDiagonalPET.setText(savedInstanceState.getString("qdiagonal_et1"));
        rhombusQDiagonalAreaET.setText(savedInstanceState.getString("qdiagonal_et2"));
        rhombusQDiagonalAnswerTV.setText(savedInstanceState.getString("qdiagonal_tv"));

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

    private void perimeterResource() {
        //Perimeter
        rhombusPerimeterAET = (EditText) findViewById(R.id.rhombus_perimeter_a_et);
        rhombusPerimeterAnswerTV = (TextView) findViewById(R.id.rhombus_perimeter_calc_answer_tx);
        rhombusPerimeterCalcButton = (Button) findViewById(R.id.rhombus_perimeter_calc_button);
        rhombusPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(rhombusPerimeterAET)) {
                    rhombusPerimeterAET.setError("Enter Value");
                } else {
                    double aSide, rhombusPerimeter;
                    aSide = Double.parseDouble(rhombusPerimeterAET.getText().toString());
                    if (aSide <= 0) {
                        rhombusPerimeterAnswerTV.setText("The variable a should be positive");
                    } else {
                        rhombusPerimeter = 4 * aSide;
                        rhombusPerimeterAnswerTV.setText(String.format("%.02f", rhombusPerimeter));
                    }
                }
            }
        });

        // Perimeter Clear button
        rhombusPerimeterClearButton = (Button) findViewById(R.id.rhombus_perimeter_clear_button);
        rhombusPerimeterClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rhombusPerimeterAET.setText("");
                rhombusPerimeterAnswerTV.setText("");
            }
        });

    }

    private void areaResource() {
        //Area
        rhombusAreaPET = (EditText) findViewById(R.id.rhombus_area_p_et);
        rhombusAreaQET = (EditText) findViewById(R.id.rhombus_area_q_et);
        rhombusAreaAnswerTV = (TextView) findViewById(R.id.rhombus_area_calc_answer_tx);
        rhombusAreaCalcButton = (Button) findViewById(R.id.rhombus_area_calc_button);
        rhombusAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(rhombusAreaPET)) {
                    rhombusAreaPET.setError("Enter Value");
                } else if (Model.isEmpty(rhombusAreaQET)) {
                    rhombusAreaQET.setError("Enter Value");
                } else {
                    double pDiaognal, qDiaognal, rhombusArea;
                    pDiaognal = Double.parseDouble(rhombusAreaPET.getText().toString());
                    qDiaognal = Double.parseDouble(rhombusAreaQET.getText().toString());
                    if (pDiaognal <= 0) {
                        rhombusAreaAnswerTV.setText("The variable p should be positive");
                    } else if (qDiaognal <= 0) {
                        rhombusAreaAnswerTV.setText("The variable q should be positive");
                    } else {
                        rhombusArea = (pDiaognal * qDiaognal) / 2;
                        rhombusAreaAnswerTV.setText(String.format("%.02f", rhombusArea));
                    }
                }
            }
        });


        // Area Clear button
        rhombusAreaClearButton = (Button) findViewById(R.id.rhombus_area_clear_button);
        rhombusAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rhombusAreaPET.setText("");
                rhombusAreaQET.setText("");
                rhombusAreaAnswerTV.setText("");
            }
        });


    }

    private void sideResource() {

        //Sides
        rhombusSidesPET = (EditText) findViewById(R.id.rhombus_sides_perimeter_et);
        rhombusSidesAnswerTV = (TextView) findViewById(R.id.rhombus_sides_calc_answer_tx);
        rhombusSidesCalcButton = (Button) findViewById(R.id.rhombus_sides_calc_button);
        rhombusSidesCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(rhombusSidesPET)) {
                    rhombusSidesPET.setError("Enter Value");
                } else {
                    double perimeter, rhombusSide;
                    perimeter = Double.parseDouble(rhombusSidesPET.getText().toString());
                    if (perimeter <= 0) {
                        rhombusSidesAnswerTV.setText("The variable a should be positive");
                    } else {
                        rhombusSide = perimeter / 4;
                        rhombusSidesAnswerTV.setText(String.format("%.02f", rhombusSide));
                    }
                }
            }
        });


        // Sides Clear button
        rhombusSidesClearButton = (Button) findViewById(R.id.rhombus_sides_clear_button);
        rhombusSidesClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rhombusSidesPET.setText("");
                rhombusSidesAnswerTV.setText("");
            }
        });


    }

    private void diagonalPResource() {
        //Diagonal P
        rhombusPDiaognalQET = (EditText) findViewById(R.id.rhombus_p_diagonal_q_et);
        rhombusPDiaognalAreaET = (EditText) findViewById(R.id.rhombus_p_diagonal_area_et);
        rhombusPDiaognalAnswerTV = (TextView) findViewById(R.id.rhombus_p_diagonal_calc_answer_tx);
        rhombusPDiaognalCalcButton = (Button) findViewById(R.id.rhombus_p_diagonal_calc_button);
        rhombusPDiaognalCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(rhombusPDiaognalQET)) {
                    rhombusPDiaognalQET.setError("Enter Value");
                } else if (Model.isEmpty(rhombusPDiaognalAreaET)) {
                    rhombusPDiaognalAreaET.setError("Enter Value");
                } else {
                    double qDiaognal, area, rhombusPDiagonal;
                    qDiaognal = Double.parseDouble(rhombusPDiaognalQET.getText().toString());
                    area = Double.parseDouble(rhombusPDiaognalAreaET.getText().toString());
                    if (qDiaognal <= 0) {
                        rhombusPDiaognalAnswerTV.setText("The variable q should be positive");
                    } else if (area <= 0) {
                        rhombusPDiaognalAnswerTV.setText("The variable A should be positive");
                    } else {
                        rhombusPDiagonal = 2 * (area / qDiaognal);
                        rhombusPDiaognalAnswerTV.setText(String.format("%.02f", rhombusPDiagonal));
                    }
                }
            }
        });
        // P Diagonal Clear button
        rhombusPDiaognalClearButton = (Button) findViewById(R.id.rhombus_p_diagonal_clear_button);
        rhombusPDiaognalClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rhombusPDiaognalQET.setText("");
                rhombusPDiaognalAreaET.setText("");
                rhombusPDiaognalAnswerTV.setText("");
            }
        });


    }

    private void diaognalQResource() {
        //Diagonal Q
        rhombusQDiagonalPET = (EditText) findViewById(R.id.rhombus_q_diagonal_p_et);
        rhombusQDiagonalAreaET = (EditText) findViewById(R.id.rhombus_q_diagonal_area_et);
        rhombusQDiagonalAnswerTV = (TextView) findViewById(R.id.rhombus_q_diagonal_calc_answer_tx);
        rhombusQDiagonalCalcButton = (Button) findViewById(R.id.rhombus_q_diagonal_calc_button);
        rhombusQDiagonalCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(rhombusQDiagonalPET)) {
                    rhombusQDiagonalPET.setError("Enter Value");
                } else if (Model.isEmpty(rhombusQDiagonalAreaET)) {
                    rhombusQDiagonalAreaET.setError("Enter Value");
                } else {
                    double pDiaognal, area, rhombusQDiagonal;
                    pDiaognal = Double.parseDouble(rhombusQDiagonalPET.getText().toString());
                    area = Double.parseDouble(rhombusQDiagonalAreaET.getText().toString());
                    if (pDiaognal <= 0) {
                        rhombusQDiagonalAnswerTV.setText("The variable p should be positive");
                    } else if (area <= 0) {
                        rhombusQDiagonalAnswerTV.setText("The variable A should be positive");
                    } else {
                        rhombusQDiagonal = 2 * (area / pDiaognal);
                        rhombusQDiagonalAnswerTV.setText(String.format("%.02f", rhombusQDiagonal));
                    }
                }
            }
        });

        // Q Diagonal Clear button
        rhombusQDiagonalClearButton = (Button) findViewById(R.id.rhombus_q_diagonal_clear_button);
        rhombusQDiagonalClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rhombusQDiagonalPET.setText("");
                rhombusQDiagonalAreaET.setText("");
                rhombusQDiagonalAnswerTV.setText("");
            }
        });


    }

    private void fontResource() {


        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");

        TextView myTextView = (TextView) findViewById(R.id.rhombus_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rhombus_perimeter_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rhombus_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rhombus_area_p_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rhombus_area_q_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rhombus_sides_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rhombus_sides_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rhombus_sides_calc_answer_tx);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rhombus_p_diagonal_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rhombus_p_diagonal_q_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rhombus_p_diagonal_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rhombus_q_diagonal_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rhombus_q_diagonal_p_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.rhombus_q_diagonal_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);


        rhombusPerimeterAET.setTypeface(myTypeFace);
        rhombusPerimeterAnswerTV.setTypeface(myTypeFace);
        rhombusPerimeterCalcButton.setTypeface(myTypeFace);
        rhombusPerimeterClearButton.setTypeface(myTypeFace);

        rhombusAreaPET.setTypeface(myTypeFace);
        rhombusAreaQET.setTypeface(myTypeFace);
        rhombusAreaAnswerTV.setTypeface(myTypeFace);
        rhombusAreaCalcButton.setTypeface(myTypeFace);
        rhombusAreaClearButton.setTypeface(myTypeFace);

        rhombusSidesPET.setTypeface(myTypeFace);
        rhombusSidesAnswerTV.setTypeface(myTypeFace);
        rhombusSidesCalcButton.setTypeface(myTypeFace);
        rhombusSidesClearButton.setTypeface(myTypeFace);

        rhombusPDiaognalQET.setTypeface(myTypeFace);
        rhombusPDiaognalAreaET.setTypeface(myTypeFace);
        rhombusPDiaognalAnswerTV.setTypeface(myTypeFace);
        rhombusPDiaognalCalcButton.setTypeface(myTypeFace);
        rhombusPDiaognalClearButton.setTypeface(myTypeFace);

        rhombusQDiagonalPET.setTypeface(myTypeFace);
        rhombusQDiagonalAreaET.setTypeface(myTypeFace);
        rhombusQDiagonalAnswerTV.setTypeface(myTypeFace);
        rhombusQDiagonalCalcButton.setTypeface(myTypeFace);
        rhombusQDiagonalClearButton.setTypeface(myTypeFace);


    }




}
