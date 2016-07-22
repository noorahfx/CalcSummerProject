package calcpa.calcsummerproject.Geometry.Quadrilateral.TypesOfQuadrilateral.Square;

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

public class Square extends AppCompatActivity {

    //Perimeter
    EditText squarePerimeterET;
    TextView squarePerimeterAnswerTV;
    Button squarePerimeterCalculateButton;


    //Area
    EditText squareAreaET;
    TextView squareAreaTV;
    Button squareAreaCalculateButton;


    //Sides
    EditText squareSideET;
    TextView squareSideTV;
    Button squareSideCalculateButton;

    //Sides
    EditText squareDiagonalET;
    TextView squareDiagonalTV;
    Button squareDiagonalCalculateButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Perimeter
        squarePerimeterET = (EditText)findViewById(R.id.square_perimeter_a_et);
        squarePerimeterAnswerTV =(TextView)findViewById(R.id.square_perimeter_calc_answer_tx);
        squarePerimeterCalculateButton =(Button)findViewById(R.id.square_perimeter_calc_button);
        squarePerimeterCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //fix the formula
                String sideA = squarePerimeterET.getText().toString();


                double area = 6 * Double.parseDouble(sideA);
                squarePerimeterAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(sideA)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });



        //Area
        squareAreaET= (EditText)findViewById(R.id.square_area_a_et);
        squareAreaTV  =(TextView)findViewById(R.id.square_calc_area_answer_tx);
        squareAreaCalculateButton =(Button)findViewById(R.id.square_area_calc_button);
        squareAreaCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //fix the formula
                String sideA = squareAreaET.getText().toString();


                double area = 6 * Double.parseDouble(sideA);
                squareAreaTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(sideA)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });



        //Sides
        squareSideET = (EditText)findViewById(R.id.square_side_a_et);
        squareSideTV  =(TextView)findViewById(R.id.square_calc_area_answer_tx);
        squareSideCalculateButton =(Button)findViewById(R.id.square_side_calc_button);
        squareSideCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //fix the formula
                String sideA = squareSideET.getText().toString();


                double area = 6 * Double.parseDouble(sideA);
                squareSideTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(sideA)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //diameter
        squareDiagonalET = (EditText)findViewById(R.id.square_diameter_d_et);
        squareDiagonalTV  =(TextView)findViewById(R.id.square_calc_diamter_answer_tx);
        squareDiagonalCalculateButton =(Button)findViewById(R.id.square_diameter_calc_button);
        squareDiagonalCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //fix the formula
                String sideA = squareDiagonalET.getText().toString();


                double area = 6 * Double.parseDouble(sideA);
                squareDiagonalTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(sideA)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

}
