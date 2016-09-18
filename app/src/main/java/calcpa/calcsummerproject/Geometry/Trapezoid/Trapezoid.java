package calcpa.calcsummerproject.Geometry.Trapezoid;

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

public class Trapezoid extends AppCompatActivity {


    //Perimeter
    EditText trapezoidPerimeterAET;
    EditText trapezoidPerimeterBET;
    EditText trapezoidPerimeterCET;
    EditText trapezoidPerimeterDET;
    TextView trapezoidPerimeterAnswerTV;
    Button trapezoidPerimeterCalcButton;
    Button trapezoidPerimClearButton;


    //Area
    EditText trapezoidAreaAET;
    EditText trapezoidAreaBET;
    EditText trapezoidAreahET;
    TextView trapezoidAreaAnswerTV;
    Button trapezoidAreaCalcButton;
    Button trapezoidAreaClearButton;


    //Height
    EditText trapezoidHeightAET;
    EditText trapezoidHeightBET;
    EditText trapezoidHeightAreaET;
    TextView trapezoidHeightAnswerTV;
    Button trapezoidHeightCalcButton;
    Button trapezoidHeightClearButton;


    //Base A
    EditText trapezoidABaseBET;
    EditText trapezoidABaseCET;
    EditText trapezoidABaseDET;
    EditText trapezoidABasePerimeterET;
    TextView trapezoidABaseAnswerTV;
    Button trapezoidABaseCalcButton;
    Button trapezoidBaseAClearButton;


    //Base B
    EditText trapezoidBBaseAET;
    EditText trapezoidBBaseCET;
    EditText trapezoidBBaseDET;
    EditText trapezoidBBasePerimeterET;
    TextView trapezoidBBaseAnswerTV;
    Button trapezoidBBaseCalcButton;
    Button trapezoidBaseBClearButton;


    //Side C
    EditText trapezoidCSideAET;
    EditText trapezoidCSideBET;
    EditText trapezoidCSideDET;
    EditText trapezoidCSidePET;
    TextView trapezoidCSideAnswerTV;
    Button trapezoidCSideCalcButton;
    Button trapezoidSideCClearButton;


    //Side D
    EditText trapezoidDSideAET;
    EditText trapezoidDSideBET;
    EditText trapezoidDSideCET;
    EditText trapezoidDSidePET;
    TextView trapezoidDSideAnswerTV;
    Button trapezoidDSideCalcButton;
    Button trapezoidSideDClearButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezoid);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_trapezoid);
        // getSupportActionBar().setIcon(R.drawable.back_button_tb);
        //enable button in toolbar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        areaResource();
        baseAResource();
        baseBResource();
         heightResource();
        sideCResource();
        sideDResource();
        perimeterResource();
        fontResource();



    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("perimeter_et1", trapezoidPerimeterAET.getText().toString());
        outState.putString("perimeter_et2", trapezoidPerimeterBET.getText().toString());
        outState.putString("perimeter_et3", trapezoidPerimeterCET.getText().toString());
        outState.putString("perimeter_et4", trapezoidPerimeterDET.getText().toString());
        outState.putString("perimeter_tv", trapezoidPerimeterAnswerTV.getText().toString());

        outState.putString("area_et1", trapezoidAreaAET.getText().toString());
        outState.putString("area_et2", trapezoidAreaBET.getText().toString());
        outState.putString("area_et3", trapezoidAreahET.getText().toString());
        outState.putString("area_tv", trapezoidAreaAnswerTV.getText().toString());

        outState.putString("height_et1", trapezoidHeightAET.getText().toString());
        outState.putString("height_et2", trapezoidHeightBET.getText().toString());
        outState.putString("height_et3", trapezoidHeightAreaET.getText().toString());
        outState.putString("height_tv", trapezoidHeightAnswerTV.getText().toString());

        outState.putString("basea_et1", trapezoidABaseBET.getText().toString());
        outState.putString("bsaea_et2", trapezoidABaseCET.getText().toString());
        outState.putString("basea_et3", trapezoidABaseDET.getText().toString());
        outState.putString("basea_et4", trapezoidABasePerimeterET.getText().toString());
        outState.putString("basea_tv", trapezoidABaseAnswerTV.getText().toString());

        outState.putString("baseb_et1", trapezoidBBaseAET.getText().toString());
        outState.putString("baseb_et2", trapezoidBBaseCET.getText().toString());
        outState.putString("baseb_et3", trapezoidBBaseDET.getText().toString());
        outState.putString("baseb_et4", trapezoidBBasePerimeterET.getText().toString());
        outState.putString("baseb_tv", trapezoidBBaseAnswerTV.getText().toString());

        outState.putString("sidec_et1", trapezoidCSideAET.getText().toString());
        outState.putString("sidec_et2", trapezoidCSideBET.getText().toString());
        outState.putString("sidec_et3", trapezoidCSideDET.getText().toString());
        outState.putString("sidec_et4", trapezoidCSidePET.getText().toString());
        outState.putString("sidec_tv", trapezoidCSideAnswerTV.getText().toString());

        outState.putString("sided_et1", trapezoidDSideAET.getText().toString());
        outState.putString("sided_et2", trapezoidDSideBET.getText().toString());
        outState.putString("sided_et3", trapezoidDSideCET.getText().toString());
        outState.putString("sided_et4", trapezoidDSidePET.getText().toString());
        outState.putString("sided_tv", trapezoidDSideAnswerTV.getText().toString());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);


        trapezoidPerimeterAET.setText(savedInstanceState.getString("perimeter_et1"));
        trapezoidPerimeterBET.setText(savedInstanceState.getString("perimeter_et2"));
        trapezoidPerimeterCET.setText(savedInstanceState.getString("perimeter_et3"));
        trapezoidPerimeterDET.setText(savedInstanceState.getString("perimeter_et4"));
        trapezoidPerimeterAnswerTV.setText(savedInstanceState.getString("perimeter_tv"));

        trapezoidAreaAET.setText(savedInstanceState.getString("area_et1"));
        trapezoidAreaBET.setText(savedInstanceState.getString("area_et2"));
        trapezoidAreahET.setText(savedInstanceState.getString("area_et3"));
        trapezoidAreaAnswerTV.setText(savedInstanceState.getString("area_tv"));

        trapezoidHeightAET.setText(savedInstanceState.getString("height_et1"));
        trapezoidHeightBET.setText(savedInstanceState.getString("height_et2"));
        trapezoidHeightAreaET.setText(savedInstanceState.getString("height_et3"));
        trapezoidHeightAnswerTV.setText(savedInstanceState.getString("height_tv"));

        trapezoidABaseBET.setText(savedInstanceState.getString("basea_et1"));
        trapezoidABaseCET.setText(savedInstanceState.getString("basea_et2"));
        trapezoidABaseDET.setText(savedInstanceState.getString("basea_et3"));
        trapezoidABasePerimeterET.setText(savedInstanceState.getString("basea_et4"));
        trapezoidABaseAnswerTV.setText(savedInstanceState.getString("basea_tv"));

        trapezoidBBaseAET.setText(savedInstanceState.getString("baseb_et1"));
        trapezoidBBaseCET.setText(savedInstanceState.getString("baseb_et2"));
        trapezoidBBaseDET.setText(savedInstanceState.getString("baseb_et3"));
        trapezoidBBasePerimeterET.setText(savedInstanceState.getString("baseb_et4"));
        trapezoidBBaseAnswerTV.setText(savedInstanceState.getString("baseb_tv"));

        trapezoidCSideAET.setText(savedInstanceState.getString("sidec_et1"));
        trapezoidCSideBET.setText(savedInstanceState.getString("sidec_et2"));
        trapezoidCSideDET.setText(savedInstanceState.getString("sidec_et3"));
        trapezoidCSidePET.setText(savedInstanceState.getString("sidec_et4"));
        trapezoidCSideAnswerTV.setText(savedInstanceState.getString("sidec_tv"));

        trapezoidDSideAET.setText(savedInstanceState.getString("sided_et1"));
        trapezoidDSideBET.setText(savedInstanceState.getString("sided_et2"));
        trapezoidDSideCET.setText(savedInstanceState.getString("sided_et3"));
        trapezoidDSidePET.setText(savedInstanceState.getString("sided_et4"));
        trapezoidDSideAnswerTV.setText(savedInstanceState.getString("sided_tv"));

    }

    private void perimeterResource() {
        //Perimeter
        trapezoidPerimeterAET = (EditText) findViewById(R.id.trapezoid_perimeter_a_et);
        trapezoidPerimeterBET = (EditText) findViewById(R.id.trapezoid_perimeter_b_et);
        trapezoidPerimeterCET = (EditText) findViewById(R.id.trapezoid_perimeter_c_et);
        trapezoidPerimeterDET = (EditText) findViewById(R.id.trapezoid_perimeter_d_et);
        trapezoidPerimeterAnswerTV = (TextView) findViewById(R.id.trapezoid_perimeter_calc_answer_tx);
        trapezoidPerimeterCalcButton = (Button) findViewById(R.id.trapezoid_perimeter_calc_button);
        trapezoidPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(trapezoidPerimeterAET)) {
                    trapezoidPerimeterAET.setError("Enter Value");
                } else if (Model.isEmpty(trapezoidPerimeterBET)) {
                    trapezoidPerimeterBET.setError("Enter Value");
                } else if (Model.isEmpty(trapezoidPerimeterCET)) {
                    trapezoidPerimeterCET.setError("Enter Value");
                } else if (Model.isEmpty(trapezoidPerimeterDET)) {
                    trapezoidPerimeterDET.setError("Enter Value");
                } else {
                    double baseA, baseB, sideC, sideD, trapezoidPerimeter;
                    baseA = Double.parseDouble(trapezoidPerimeterAET.getText().toString());
                    baseB = Double.parseDouble(trapezoidPerimeterBET.getText().toString());
                    sideC = Double.parseDouble(trapezoidPerimeterCET.getText().toString());
                    sideD = Double.parseDouble(trapezoidPerimeterDET.getText().toString());
                    if (baseA <= 0) {
                        trapezoidPerimeterAnswerTV.setText("The variable a should be positive");
                    } else if (baseB <= 0) {
                        trapezoidPerimeterAnswerTV.setText("The variable b should be positive");
                    } else if (sideC <= 0) {
                        trapezoidPerimeterAnswerTV.setText("The variable c should be positive");
                    } else if (sideD <= 0) {
                        trapezoidPerimeterAnswerTV.setText("The variable d should be positive");
                    } else {
                        trapezoidPerimeter = (baseA + baseB + sideC + sideD);
                        trapezoidPerimeterAnswerTV.setText(String.format("%.02f", trapezoidPerimeter));
                    }
                }
            }
        });

        // Perimeter Clear button
        trapezoidPerimClearButton = (Button) findViewById(R.id.trapezoid_perimeter_clear_button);
        trapezoidPerimClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trapezoidPerimeterAET.setText("");
                trapezoidPerimeterBET.setText("");
                trapezoidPerimeterCET.setText("");
                trapezoidPerimeterDET.setText("");
                trapezoidPerimeterAnswerTV.setText("");
            }
        });


    }

    private void areaResource() {

        //Area
        trapezoidAreaAET = (EditText) findViewById(R.id.trapezoid_area_a_et);
        trapezoidAreaBET = (EditText) findViewById(R.id.trapezoid_area_b_et);
        trapezoidAreahET = (EditText) findViewById(R.id.trapezoid_area_h_et);
        trapezoidAreaAnswerTV = (TextView) findViewById(R.id.trapezoid_area_calc_answer_tx);
        trapezoidAreaCalcButton = (Button) findViewById(R.id.trapezoid_area_calc_button);
        trapezoidAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(trapezoidAreaAET)) {
                    trapezoidAreaAET.setError("Enter Value");
                } else if (Model.isEmpty(trapezoidAreaBET)) {
                    trapezoidAreaBET.setError("Enter Value");
                } else if (Model.isEmpty(trapezoidAreahET)) {
                    trapezoidAreahET.setError("Enter Value");
                } else {
                    double baseA, baseB, height, trapezoidArea;
                    baseA = Double.parseDouble(trapezoidAreaAET.getText().toString());
                    baseB = Double.parseDouble(trapezoidAreaBET.getText().toString());
                    height = Double.parseDouble(trapezoidAreahET.getText().toString());
                    if (baseA <= 0) {
                        trapezoidAreaAnswerTV.setText("The variable a should be positive");
                    } else if (baseB <= 0) {
                        trapezoidAreaAnswerTV.setText("The variable b should be positive");
                    } else if (height <= 0) {
                        trapezoidAreaAnswerTV.setText("The variable h should be positive");
                    } else {
                        trapezoidArea = (baseA + baseB) / 2 * (height);
                        trapezoidAreaAnswerTV.setText(String.format("%.02f", trapezoidArea));
                    }
                }
            }
        });


        // Area Clear button
        trapezoidAreaClearButton = (Button) findViewById(R.id.trapezoid_area_clear_button);
        trapezoidAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trapezoidAreaAET.setText("");
                trapezoidAreaBET.setText("");
                trapezoidAreahET.setText("");
                trapezoidAreaAnswerTV.setText("");
            }
        });


    }

    private void heightResource() {
        //Height
        trapezoidHeightAET = (EditText) findViewById(R.id.trapezoid_height_a_et);
        trapezoidHeightBET = (EditText) findViewById(R.id.trapezoid_height_b_et);
        trapezoidHeightAreaET = (EditText) findViewById(R.id.trapezoid_height_area_et);
        trapezoidHeightAnswerTV = (TextView) findViewById(R.id.trapezoid_height_calc_answer_tx);
        trapezoidHeightCalcButton = (Button) findViewById(R.id.trapezoid_height_calc_button);
        trapezoidHeightCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(trapezoidHeightAET)) {
                    trapezoidHeightAET.setError("Enter Value");
                } else if (Model.isEmpty(trapezoidHeightBET)) {
                    trapezoidHeightBET.setError("Enter Value");
                } else if (Model.isEmpty(trapezoidHeightAreaET)) {
                    trapezoidHeightAreaET.setError("Enter Value");
                } else {
                    double baseA, baseB, area, trapezoidHeight;
                    baseA = Double.parseDouble(trapezoidHeightAET.getText().toString());
                    baseB = Double.parseDouble(trapezoidHeightBET.getText().toString());
                    area = Double.parseDouble(trapezoidHeightAreaET.getText().toString());
                    if (baseA <= 0) {
                        trapezoidHeightAnswerTV.setText("The variable a should be positive");
                    } else if (baseB <= 0) {
                        trapezoidHeightAnswerTV.setText("The variable b should be positive");
                    } else if (area <= 0) {
                        trapezoidHeightAnswerTV.setText("The variable h should be positive");
                    } else {
                        trapezoidHeight = 2 * (area / (baseA + baseB));
                        trapezoidHeightAnswerTV.setText(String.format("%.02f", trapezoidHeight));
                    }
                }
            }
        });

        // Height Clear button
        trapezoidHeightClearButton = (Button) findViewById(R.id.trapezoid_height_clear_button);
        trapezoidHeightClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trapezoidHeightAET.setText("");
                trapezoidHeightBET.setText("");
                trapezoidHeightAreaET.setText("");
                trapezoidHeightAnswerTV.setText("");
            }
        });


    }

    private void baseAResource() {


        //Base A
        trapezoidABaseBET = (EditText) findViewById(R.id.trapezoid_baseA_b_et);
        trapezoidABaseCET = (EditText) findViewById(R.id.trapezoid_baseA_sideC_et);
        trapezoidABaseDET = (EditText) findViewById(R.id.trapezoid_baseA_sideD_et);
        trapezoidABasePerimeterET = (EditText) findViewById(R.id.trapezoid_baseA_perimeter_et);
        trapezoidABaseAnswerTV = (TextView) findViewById(R.id.trapezoid_baseA_calc_answer_tx);
        trapezoidABaseCalcButton = (Button) findViewById(R.id.trapezoid_baseA_calc_button);
        trapezoidABaseCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(trapezoidABaseBET)) {
                    trapezoidABaseBET.setError("Enter Value");
                } else if (Model.isEmpty(trapezoidABaseCET)) {
                    trapezoidABaseCET.setError("Enter Value");
                } else if (Model.isEmpty(trapezoidABaseDET)) {
                    trapezoidABaseDET.setError("Enter Value");
                } else if (Model.isEmpty(trapezoidABasePerimeterET)) {
                    trapezoidABasePerimeterET.setError("Enter Value");
                } else {
                    double baseB, sideC, sideD, perimeter, trapezoidABase;
                    baseB = Double.parseDouble(trapezoidABaseBET.getText().toString());
                    sideC = Double.parseDouble(trapezoidABaseCET.getText().toString());
                    sideD = Double.parseDouble(trapezoidABaseDET.getText().toString());
                    perimeter = Double.parseDouble(trapezoidABasePerimeterET.getText().toString());
                    if (baseB <= 0) {
                        trapezoidABaseAnswerTV.setText("The variable b should be positive");
                    } else if (sideC <= 0) {
                        trapezoidABaseAnswerTV.setText("The variable c should be positive");
                    } else if (sideD <= 0) {
                        trapezoidABaseAnswerTV.setText("The variable d should be positive");
                    } else if (perimeter <= 0) {
                        trapezoidABaseAnswerTV.setText("The variable P should be positive");
                    } else if (perimeter <= (baseB + sideC + sideD)) {
                        trapezoidABaseAnswerTV.setText("Invalid input: make sure P>b+c+d");
                    } else if (perimeter <= (sideC + sideD)) {
                        trapezoidABaseAnswerTV.setText("Invalid input: make sure P>c+d");
                    } else if (perimeter <= (sideC + baseB)) {
                        trapezoidABaseAnswerTV.setText("Invalid input: make sure P>c+b");
                    } else if (perimeter <= (sideD + baseB)) {
                        trapezoidABaseAnswerTV.setText("Invalid input: make sure P>d+b");
                    } else if (perimeter <= (2 * baseB)) {
                        trapezoidABaseAnswerTV.setText("Invalid input: make sure P>2*b");
                    } else if (perimeter >= (2 * (baseB + sideC + sideD))) {
                        trapezoidABaseAnswerTV.setText("Invalid input: make sure P< 2*(b+c+d");
                    } else {
                        trapezoidABase = perimeter - baseB - sideC - sideD;
                        trapezoidABaseAnswerTV.setText(String.format("%.02f", trapezoidABase));
                    }
                }
            }
        });


        // Base A Clear button
        trapezoidBaseAClearButton = (Button) findViewById(R.id.trapezoid_baseA_clear_button);
        trapezoidBaseAClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trapezoidABaseBET.setText("");
                trapezoidABaseCET.setText("");
                trapezoidABaseDET.setText("");
                trapezoidABasePerimeterET.setText("");
                trapezoidABaseAnswerTV.setText("");
            }
        });


    }

    private void baseBResource() {

        //Base B
        trapezoidBBaseAET = (EditText) findViewById(R.id.trapezoid_baseB_a_et);
        trapezoidBBaseCET = (EditText) findViewById(R.id.trapezoid_baseB_sideC_et);
        trapezoidBBaseDET = (EditText) findViewById(R.id.trapezoid_baseB_sideD_et);
        trapezoidBBasePerimeterET = (EditText) findViewById(R.id.trapezoid_baseB_perimeter_et);
        trapezoidBBaseAnswerTV = (TextView) findViewById(R.id.trapezoid_baseB_calc_answer_tx);
        trapezoidBBaseCalcButton = (Button) findViewById(R.id.trapezoid_baseB_calc_button);
        trapezoidBBaseCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//check to make sure field is not empty
                if (Model.isEmpty(trapezoidBBaseAET)) {
                    trapezoidBBaseAET.setError("Enter Value");
                } else if (Model.isEmpty(trapezoidBBaseCET)) {
                    trapezoidBBaseCET.setError("Enter Value");
                } else if (Model.isEmpty(trapezoidBBaseDET)) {
                    trapezoidBBaseDET.setError("Enter Value");
                } else if (Model.isEmpty(trapezoidBBasePerimeterET)) {
                    trapezoidBBasePerimeterET.setError("Enter Value");
                } else {
                    double baseA, sideC, sideD, perimeter, trapezoidBBase;
                    baseA = Double.parseDouble(trapezoidBBaseAET.getText().toString());
                    sideC = Double.parseDouble(trapezoidBBaseCET.getText().toString());
                    sideD = Double.parseDouble(trapezoidBBaseDET.getText().toString());
                    perimeter = Double.parseDouble(trapezoidBBasePerimeterET.getText().toString());
                    if (baseA <= 0) {
                        trapezoidBBaseAnswerTV.setText("The variable a should be positive");
                    } else if (sideC <= 0) {
                        trapezoidBBaseAnswerTV.setText("The variable c should be positive");
                    } else if (sideD <= 0) {
                        trapezoidBBaseAnswerTV.setText("The variable d should be positive");
                    } else if (perimeter <= 0) {
                        trapezoidBBaseAnswerTV.setText("The variable P should be positive");
                    } else if (perimeter <= (baseA + sideC + sideD)) {
                        trapezoidBBaseAnswerTV.setText("Invalid input: make sure P>a+c+d");
                    } else if (perimeter <= (sideC + sideD)) {
                        trapezoidBBaseAnswerTV.setText("Invalid input: make sure P>c+d");
                    } else if (perimeter <= (sideC + baseA)) {
                        trapezoidBBaseAnswerTV.setText("Invalid input: make sure P>c+a");
                    } else if (perimeter <= (sideD + baseA)) {
                        trapezoidBBaseAnswerTV.setText("Invalid input: make sure P>d+a");
                    } else if (perimeter <= (2 * baseA)) {
                        trapezoidBBaseAnswerTV.setText("Invalid input: make sure P>2*a");
                    } else if (perimeter >= (2 * (baseA + sideC + sideD))) {
                        trapezoidBBaseAnswerTV.setText("Invalid input: make sure P< 2*(a+c+d)");
                    } else {
                        trapezoidBBase = perimeter - baseA - sideC - sideD;
                        trapezoidBBaseAnswerTV.setText(String.format("%.02f", trapezoidBBase));
                    }
                }
            }
        });
        // Base B Clear button
        trapezoidBaseBClearButton = (Button) findViewById(R.id.trapezoid_baseB_clear_button);
        trapezoidBaseBClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trapezoidBBaseAET.setText("");
                trapezoidBBaseCET.setText("");
                trapezoidBBaseDET.setText("");
                trapezoidBBasePerimeterET.setText("");
                trapezoidBBaseAnswerTV.setText("");
            }
        });


    }

    private void sideCResource() {

        //Side C
        trapezoidCSideAET = (EditText) findViewById(R.id.trapezoid_sideC_a_et);
        trapezoidCSideBET = (EditText) findViewById(R.id.trapezoid_sideC_b_et);
        trapezoidCSideDET = (EditText) findViewById(R.id.trapezoid_sideC_d_et);
        trapezoidCSidePET = (EditText) findViewById(R.id.trapezoid_sideC_p_et);
        trapezoidCSideAnswerTV = (TextView) findViewById(R.id.trapezoid_sideC_calc_answer_tx);
        trapezoidCSideCalcButton = (Button) findViewById(R.id.trapezoid_sideC_calc_button);
        trapezoidCSideCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(trapezoidCSideAET)) {
                    trapezoidCSideAET.setError("Enter Value");
                } else if (Model.isEmpty(trapezoidCSideBET)) {
                    trapezoidCSideBET.setError("Enter Value");
                } else if (Model.isEmpty(trapezoidCSideDET)) {
                    trapezoidCSideDET.setError("Enter Value");
                } else if (Model.isEmpty(trapezoidCSidePET)) {
                    trapezoidCSidePET.setError("Enter Value");
                } else {
                    double baseA, baseB, sideD, perimeter, trapezoidSideC;
                    baseA = Double.parseDouble(trapezoidCSideAET.getText().toString());
                    baseB = Double.parseDouble(trapezoidCSideBET.getText().toString());
                    sideD = Double.parseDouble(trapezoidCSideDET.getText().toString());
                    perimeter = Double.parseDouble(trapezoidCSidePET.getText().toString());
                    if (baseA <= 0) {
                        trapezoidCSideAnswerTV.setText("The variable a should be positive");
                    } else if (baseB <= 0) {
                        trapezoidCSideAnswerTV.setText("The variable b should be positive");
                    } else if (sideD <= 0) {
                        trapezoidCSideAnswerTV.setText("The variable d should be positive");
                    } else if (perimeter <= 0) {
                        trapezoidCSideAnswerTV.setText("The variable P should be positive");
                    } else if (perimeter <= (baseA + baseB + sideD)) {
                        trapezoidCSideAnswerTV.setText("Invalid input: make sure P>a+b+d");
                    } else if (perimeter <= (baseA + baseB)) {
                        trapezoidCSideAnswerTV.setText("Invalid input: make sure P>a+b");
                    } else if (perimeter <= (sideD + baseA)) {
                        trapezoidCSideAnswerTV.setText("Invalid input: make sure P>d+a");
                    } else if (perimeter <= (sideD + baseB)) {
                        trapezoidCSideAnswerTV.setText("Invalid input: make sure P>b+d");
                    } else if (perimeter <= (2 * baseA)) {
                        trapezoidCSideAnswerTV.setText("Invalid input: make sure P>2*a");
                    } else if (perimeter <= (2 * baseB)) {
                        trapezoidCSideAnswerTV.setText("Invalid input: make sure P>2*b");
                    } else if (perimeter <= (2 * (baseA + baseB + sideD))) {
                        trapezoidCSideAnswerTV.setText("Invalid input: make sure P< 2*(a+b+d)");
                    } else {
                        trapezoidSideC = (baseA + baseB + perimeter + sideD);
                        trapezoidCSideAnswerTV.setText(String.format("%.02f", trapezoidSideC));
                    }
                }
            }

        });


        // Side C Clear button
        trapezoidSideCClearButton = (Button) findViewById(R.id.trapezoid_sideC_clear_button);
        trapezoidSideCClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trapezoidCSideAET.setText("");
                trapezoidCSideBET.setText("");
                trapezoidCSideDET.setText("");
                trapezoidCSidePET.setText("");
                trapezoidCSideAnswerTV.setText("");
            }
        });


    }

    private void sideDResource() {

        //Side D
        trapezoidDSideAET = (EditText) findViewById(R.id.trapezoid_sideD_a_et);
        trapezoidDSideBET = (EditText) findViewById(R.id.trapezoid_sideD_b_et);
        trapezoidDSideCET = (EditText) findViewById(R.id.trapezoid_sideD_c_et);
        trapezoidDSidePET = (EditText) findViewById(R.id.trapezoid_sideD_p_et);
        trapezoidDSideAnswerTV = (TextView) findViewById(R.id.trapezoid_sideD_calc_answer_tx);
        trapezoidDSideCalcButton = (Button) findViewById(R.id.trapezoid_sideD_calc_button);
        trapezoidDSideCalcButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {


                //check to make sure field is not empty
                if (Model.isEmpty(trapezoidDSideAET)) {
                    trapezoidDSideAET.setError("Enter Value");
                } else if (Model.isEmpty(trapezoidDSideBET)) {
                    trapezoidDSideBET.setError("Enter Value");
                } else if (Model.isEmpty(trapezoidDSideCET)) {
                    trapezoidDSideCET.setError("Enter Value");
                } else if (Model.isEmpty(trapezoidDSidePET)) {
                    trapezoidDSidePET.setError("Enter Value");
                } else {
                    double baseA, baseB, sideC, perimeter, trapezoidSideD;
                    baseA = Double.parseDouble(trapezoidDSideAET.getText().toString());
                    baseB = Double.parseDouble(trapezoidDSideBET.getText().toString());
                    sideC = Double.parseDouble(trapezoidDSideCET.getText().toString());
                    perimeter = Double.parseDouble(trapezoidDSidePET.getText().toString());
                    if (baseA <= 0) {
                        trapezoidDSideAnswerTV.setText("The variable a should be positive");
                    } else if (baseB <= 0) {
                        trapezoidDSideAnswerTV.setText("The variable b should be positive");
                    } else if (sideC <= 0) {
                        trapezoidDSideAnswerTV.setText("The variable d should be positive");
                    } else if (perimeter <= 0) {
                        trapezoidDSideAnswerTV.setText("The variable P should be positive");
                    } else if (perimeter <= (baseA + baseB + sideC)) {
                        trapezoidDSideAnswerTV.setText("Invalid input: make sure P>a+b+d");
                    } else if (perimeter <= (baseA + baseB)) {
                        trapezoidDSideAnswerTV.setText("Invalid input: make sure P>a+b");
                    } else if (perimeter <= (sideC + baseA)) {
                        trapezoidDSideAnswerTV.setText("Invalid input: make sure P>d+a");
                    } else if (perimeter <= (sideC + baseB)) {
                        trapezoidDSideAnswerTV.setText("Invalid input: make sure P>b+d");
                    } else if (perimeter <= (2 * baseA)) {
                        trapezoidDSideAnswerTV.setText("Invalid input: make sure P>2*a");
                    } else if (perimeter <= (2 * baseB)) {
                        trapezoidDSideAnswerTV.setText("Invalid input: make sure P>2*b");
                    } else if (perimeter <= (2 * (baseA + baseB + sideC))) {
                        trapezoidDSideAnswerTV.setText("Invalid input: make sure P< 2*(a+b+c)");
                    } else {
                        trapezoidSideD = (baseA + baseB + perimeter + sideC);
                        trapezoidDSideAnswerTV.setText(String.format("%.02f", trapezoidSideD));
                    }
                }
            }

        });

        // Side D Clear button
        trapezoidSideDClearButton = (Button) findViewById(R.id.trapezoid_sideD_clear_button);
        trapezoidSideDClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trapezoidDSideAET.setText("");
                trapezoidDSideBET.setText("");
                trapezoidDSideCET.setText("");
                trapezoidDSidePET.setText("");
                trapezoidDSideAnswerTV.setText("");
            }
        });


    }

    private void fontResource() {

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");

        TextView myTextView = (TextView) findViewById(R.id.trapezoid_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_perimeter_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_perimeter_b_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_perimeter_c_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_perimeter_d_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_area_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_area_b_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_area_h_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_height_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_height_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_height_b_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_height_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_baseA_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_baseA_b_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_baseA_sideC_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_baseA_sideD_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_baseA_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_baseB_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_baseB_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_baseB_sideC_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_baseB_sideD_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_baseB_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_sideC_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_sideC_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_sideC_b_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_sideC_d_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_sideC_p_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_sideD_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_sideD_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_sideD_b_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_sideD_c_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.trapezoid_sideD_p_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        trapezoidPerimeterAET.setTypeface(myTypeFace);
        trapezoidPerimeterBET.setTypeface(myTypeFace);
        trapezoidPerimeterCET.setTypeface(myTypeFace);
        trapezoidPerimeterDET.setTypeface(myTypeFace);
        trapezoidPerimeterAnswerTV.setTypeface(myTypeFace);
        trapezoidPerimeterCalcButton.setTypeface(myTypeFace);
        trapezoidPerimClearButton.setTypeface(myTypeFace);

        trapezoidAreaAET.setTypeface(myTypeFace);
        trapezoidAreaBET.setTypeface(myTypeFace);
        trapezoidAreahET.setTypeface(myTypeFace);
        trapezoidAreaAnswerTV.setTypeface(myTypeFace);
        trapezoidAreaCalcButton.setTypeface(myTypeFace);
        trapezoidAreaClearButton.setTypeface(myTypeFace);

        trapezoidHeightAET.setTypeface(myTypeFace);
        trapezoidHeightBET.setTypeface(myTypeFace);
        trapezoidHeightAreaET.setTypeface(myTypeFace);
        trapezoidHeightAnswerTV.setTypeface(myTypeFace);
        trapezoidHeightCalcButton.setTypeface(myTypeFace);
        trapezoidHeightClearButton.setTypeface(myTypeFace);

        trapezoidABaseBET.setTypeface(myTypeFace);
        trapezoidABaseCET.setTypeface(myTypeFace);
        trapezoidABaseDET.setTypeface(myTypeFace);
        trapezoidABasePerimeterET.setTypeface(myTypeFace);
        trapezoidABaseAnswerTV.setTypeface(myTypeFace);
        trapezoidABaseCalcButton.setTypeface(myTypeFace);
        trapezoidBaseAClearButton.setTypeface(myTypeFace);

        trapezoidBBaseAET.setTypeface(myTypeFace);
        trapezoidBBaseCET.setTypeface(myTypeFace);
        trapezoidBBaseDET.setTypeface(myTypeFace);
        trapezoidBBasePerimeterET.setTypeface(myTypeFace);
        trapezoidBBaseAnswerTV.setTypeface(myTypeFace);
        trapezoidBBaseCalcButton.setTypeface(myTypeFace);
        trapezoidBaseBClearButton.setTypeface(myTypeFace);

        trapezoidCSideAET.setTypeface(myTypeFace);
        trapezoidCSideBET.setTypeface(myTypeFace);
        trapezoidCSideDET.setTypeface(myTypeFace);
        trapezoidCSidePET.setTypeface(myTypeFace);
        trapezoidCSideAnswerTV.setTypeface(myTypeFace);
        trapezoidCSideCalcButton.setTypeface(myTypeFace);
        trapezoidSideCClearButton.setTypeface(myTypeFace);


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


}
