package calcpa.calcsummerproject.Geometry.Quadrilateral.TypesOfQuadrilateral.Rhombus;

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

import calcpa.calcsummerproject.R;

public class Rhombus extends AppCompatActivity {

    //Perimeter
    EditText rhombusPerimeterAET;
    TextView rhombusPerimeterAnswerTV;
    Button rhombusPerimeterCalcButton;

    //Area
    EditText rhombusAreaPET;
    EditText rhombusAreaQET;
    TextView rhombusAreaAnswerTV;
    Button rhombusAreaCalcButton;

    //Sides
    EditText rhombusSidesPET;
    EditText rhombusSidesQET;
    TextView rhombusSidesAnswerTV;
    Button rhombusSidesCalcButton;

    //Diagonal P
    EditText rhombusPDiaognalQET;
    EditText rhombusPDiaognalAreaET;
    TextView rhombusPDiaognalAnswerTV;
    Button rhombusPDiaognalCalcButton;


    //Diagonal Q
    EditText rhombusQDiagonalPET;
    EditText rhombusQDiagonalAreaET;
    TextView rhombusQDiagonalAnswerTV;
    Button rhombusQDiagonalCalcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhombus);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Perimeter
        rhombusPerimeterAET = (EditText)findViewById(R.id.rhombus_perimeter_a_et);
        rhombusPerimeterAnswerTV  = (TextView)findViewById(R.id.rhombus_perimeter_calc_answer_tx);
        rhombusPerimeterCalcButton =(Button)findViewById(R.id.rhombus_perimeter_calc_button);
        rhombusPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = rhombusPerimeterAET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                rhombusPerimeterAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Area
        rhombusAreaPET = (EditText)findViewById(R.id.rhombus_area_p_et);
        rhombusAreaQET = (EditText)findViewById(R.id.rhombus_area_q_et);
        rhombusAreaAnswerTV = (TextView)findViewById(R.id.rhombus_area_calc_answer_tx);
        rhombusAreaCalcButton=(Button)findViewById(R.id.kite_area_calc_button);
        rhombusAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = rhombusAreaPET.getText().toString();
                String volume = rhombusAreaQET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                rhombusAreaAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //Sides
        rhombusSidesPET = (EditText)findViewById(R.id.rhombus_sides_p_et);
        rhombusSidesQET = (EditText)findViewById(R.id.rhombus_sides_q_et);
        rhombusSidesAnswerTV = (TextView)findViewById(R.id.rhombus_sides_calc_answer_tx);
        rhombusSidesCalcButton =(Button)findViewById(R.id.rhombus_sides_calc_button);
        rhombusSidesCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = rhombusSidesPET.getText().toString();
                String volume = rhombusSidesQET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                rhombusSidesAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //Diagonal P
        rhombusPDiaognalQET = (EditText)findViewById(R.id.rhombus_p_diagonal_q_et);
        rhombusPDiaognalAreaET= (EditText)findViewById(R.id.rhombus_p_diagonal_area_et);
        rhombusPDiaognalAnswerTV =(TextView)findViewById(R.id.rhombus_p_diagonal_calc_answer_tx);
        rhombusPDiaognalCalcButton=(Button)findViewById(R.id.rhombus_p_diagonal_calc_button);
        rhombusPDiaognalCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = rhombusPDiaognalQET.getText().toString();
                String volume = rhombusPDiaognalAreaET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                rhombusPDiaognalAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });



        //Diagonal Q
        rhombusQDiagonalPET = (EditText)findViewById(R.id.rhombus_q_diagonal_p_et);
        rhombusQDiagonalAreaET = (EditText)findViewById(R.id.rhombus_q_diagonal_area_et);
        rhombusQDiagonalAnswerTV = (TextView)findViewById(R.id.rhombus_q_diagonal_calc_answer_tx);
        rhombusQDiagonalCalcButton =(Button)findViewById(R.id.rhombus_q_diagonal_calc_button);
        rhombusQDiagonalCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = rhombusQDiagonalPET.getText().toString();
                String volume = rhombusQDiagonalAreaET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                rhombusQDiagonalAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

}
