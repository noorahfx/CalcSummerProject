package calcpa.calcsummerproject.Geometry.Pentagon.TypesOfPentagon;

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

public class RegularPentagon extends AppCompatActivity {
    //perimeter
    EditText sideAEditText;
    TextView answerTextView;
    Button calculatePerimeterButton;

    //area
    EditText areaSideET;
    TextView areaAnswerTV;
    Button calculateAreaButton;

    //side A
    EditText sideAPerimeterET;
    TextView sideAAnswerTV;
    Button calculateSideAButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_pentagon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        sideAEditText =(EditText)findViewById(R.id.pen_perimeter_side_a_et);
        answerTextView =(TextView)findViewById(R.id.pen_calc_answer_tx);
        calculatePerimeterButton=(Button)findViewById(R.id.pen_perimeter_calc_button);
        calculatePerimeterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sideA = sideAEditText.getText().toString();


                double perimeter = 6 * Double.parseDouble(sideA);
                answerTextView.setText(String.format("%.02f", perimeter));

                if (TextUtils.isEmpty(sideA)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });

        areaSideET =(EditText)findViewById(R.id.pen_area_side_a_et);
        areaAnswerTV =(TextView)findViewById(R.id.pen_calc_area_answer_tx);
        calculateAreaButton=(Button)findViewById(R.id.pen_area_calc_button);
        calculateAreaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
///change formula its incorrect
                //do it later
                String sideA = areaAnswerTV.getText().toString();


                double perimeter = 5*Double.parseDouble(sideA);
                areaAnswerTV.setText(String.format("%.02f",perimeter));

                if (TextUtils.isEmpty(sideA)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });


        sideAPerimeterET =(EditText)findViewById(R.id.pen_side_et);
        sideAAnswerTV =(TextView)findViewById(R.id.pen_calc_side_answer_tx);
        calculateAreaButton=(Button)findViewById(R.id.pen_side_calc_button);
        calculateSideAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sideA = sideAAnswerTV.getText().toString();

//REcheck
                double area = Double.parseDouble(sideA)/6;
                sideAAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(sideA)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });


        /**
         * DIAGONAL FORMAL PART LEFT OUT ADD THAT ON COLLECTION TOO
         */

    }

}
