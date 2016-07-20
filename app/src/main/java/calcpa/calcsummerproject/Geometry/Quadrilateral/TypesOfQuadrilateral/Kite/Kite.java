package calcpa.calcsummerproject.Geometry.Quadrilateral.TypesOfQuadrilateral.Kite;

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

import calcpa.calcsummerproject.R;

public class Kite extends AppCompatActivity {

    //Perimeter
    EditText kitePerimeterAET;
    EditText kitePerimeterBET;
    TextView kitePerimeterAnswerTV;
    Button kitePerimeterCalcButton;

    //Area
    EditText kiteAreaPET;
    EditText kiteAreaQET;
    TextView kiteAreaAnswerTV;
    Button kiteAreaCalcButton;

    //Side A
    EditText kiteASideBET;
    EditText kiteASidePerimterET;
    TextView kiteASideAnswerTV;
    Button kiteASideCalcButton;

    //Side B
    EditText kiteBSideAET;
    EditText kiteBSidePerimeterET;
    TextView kiteBSideAnswerTV;
    Button kiteBSideCalcButton;


    //Diagonal P
    EditText kitePDiagonalAreaET;
    EditText kitePDiagonalQET;
    TextView kitePDiagonalAnswerTV;
    Button kitePDiagonalCalcButton;


    //Diagonal Q
    EditText kiteQDiagonalAreaET;
    EditText kiteQDiagonalPET;
    TextView kiteQDiagonalAnswerTV;
    Button kiteQDiagonalCalcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kite);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Perimeter
        kitePerimeterAET = (EditText)findViewById(R.id.kite_perimeter_side_a_et);
        kitePerimeterBET = (EditText)findViewById(R.id.kite_perimeter_side_b_et);
        kitePerimeterAnswerTV = (TextView)findViewById(R.id.kite_perimeter_calc_answer_tx);
        kitePerimeterCalcButton = (Button)findViewById(R.id.kite_perimeter_calc_button);
        kitePerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = kitePerimeterAET.getText().toString();
                String volume = kitePerimeterBET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                kitePerimeterAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Area
        kiteAreaPET = (EditText)findViewById(R.id.kite_area_diagonal_p_et);
        kiteAreaQET = (EditText)findViewById(R.id.kite_area_diagonal_q_et);
        kiteAreaAnswerTV= (TextView)findViewById(R.id.kite_area_calc_answer_tx);
        kiteAreaCalcButton = (Button)findViewById(R.id.kite_area_calc_button);
        kiteAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = kiteAreaPET.getText().toString();
                String volume = kiteAreaQET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                kiteAreaAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });



        //Side A
        kiteASideBET = (EditText)findViewById(R.id.kite_side_a_bside_et);
        kiteASidePerimterET = (EditText)findViewById(R.id.kite_side_a_perimeter_et);
        kiteASideAnswerTV = (TextView)findViewById(R.id.kite_side_a_calc_answer_tx);
        kiteASideCalcButton = (Button)findViewById(R.id.kite_side_a_calc_button);
        kiteASideCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = kiteASideBET.getText().toString();
                String volume = kiteASidePerimterET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                kiteASideAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //Side B
        kiteBSideAET = (EditText)findViewById(R.id.kite_side_b_aside_et);
        kiteBSidePerimeterET = (EditText)findViewById(R.id.kite_side_b_perimeter_et);
        kiteBSideAnswerTV= (TextView)findViewById(R.id.kite_side_b_calc_answer_tx);
        kiteBSideCalcButton= (Button)findViewById(R.id.kite_side_b_calc_button);
        kiteBSideCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = kiteBSideAET.getText().toString();
                String volume = kiteBSidePerimeterET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                kiteBSideAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //Diagonal P
        kitePDiagonalAreaET = (EditText)findViewById(R.id.kite_p_diaognal_area_et);
        kitePDiagonalQET = (EditText)findViewById(R.id.kite_p_diaognal_q_et);
        kitePDiagonalAnswerTV= (TextView)findViewById(R.id.kite_p_diaognal_calc_answer_tx);
        kitePDiagonalCalcButton= (Button)findViewById(R.id.kite_p_diaognal_calc_button);
        kitePDiagonalCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = kitePDiagonalAreaET.getText().toString();
                String volume = kitePDiagonalQET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                kitePDiagonalAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //Diagonal Q
        kiteQDiagonalAreaET = (EditText)findViewById(R.id.kite_q_diaognal_p_et);
        kiteQDiagonalPET = (EditText)findViewById(R.id.kite_q_diaognal_perimeter_et);
        kiteQDiagonalAnswerTV = (TextView)findViewById(R.id.kite_q_diaognal_calc_answer_tx);
        kiteQDiagonalCalcButton= (Button)findViewById(R.id.kite_q_diaognal_calc_button);
        kiteQDiagonalCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = kiteQDiagonalAreaET.getText().toString();
                String volume = kiteQDiagonalPET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                kiteQDiagonalAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}
