package calcpa.calcsummerproject.Geometry.Hexagon.TypesOfHexagon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import calcpa.calcsummerproject.R;

public class RegularHexagon extends AppCompatActivity {

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
        setContentView(R.layout.activity_regular_hexagon);

        sideAEditText =(EditText)findViewById(R.id.hex_perimeter_side_a_et);
        answerTextView =(TextView)findViewById(R.id.hex_calc_answer_tx);
        calculatePerimeterButton=(Button)findViewById(R.id.hex_perimeter_calc_button);
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

        areaSideET =(EditText)findViewById(R.id.hex_area_side_a_et);
        areaAnswerTV =(TextView)findViewById(R.id.hex_calc_area_answer_tx);
        calculateAreaButton=(Button)findViewById(R.id.hex_area_calc_button);
        calculateAreaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
///change formula its incorrect
                //do it later
                String sideA = areaAnswerTV.getText().toString();


                double perimeter = 6*Double.parseDouble(sideA);
                areaAnswerTV.setText(String.format("%.02f",perimeter));

                if (TextUtils.isEmpty(sideA)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });


        sideAPerimeterET =(EditText)findViewById(R.id.hex_side_et);
        sideAAnswerTV =(TextView)findViewById(R.id.hex_calc_side_answer_tx);
        calculateAreaButton=(Button)findViewById(R.id.hex_side_calc_button);
        calculateSideAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sideA = sideAAnswerTV.getText().toString();

//REcheck
                double perimeter = Double.parseDouble(sideA)/6;
                sideAAnswerTV.setText(String.format("%.02f",perimeter));

                if (TextUtils.isEmpty(sideA)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}

