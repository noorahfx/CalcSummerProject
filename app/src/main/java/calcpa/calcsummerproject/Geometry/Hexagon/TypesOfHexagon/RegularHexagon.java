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

import calcpa.calcsummerproject.Model;
import calcpa.calcsummerproject.R;

public class RegularHexagon extends AppCompatActivity {



    //perimeter
    EditText hexPerimeterSideAET;
    TextView hexPerimeterAnswerTV;
    Button hexPerimeterCalcButton;

    //area
    EditText hexAreaSideAET;
    TextView hexAreaAnswerTV;
    Button hexAreaCalcButton;

    //side A
    EditText hexSideAET;
    TextView hexSideAAnswerTV;
    Button hexSideACalcButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_hexagon);

        hexPerimeterSideAET =(EditText)findViewById(R.id.hex_perimeter_side_a_et);
        hexPerimeterAnswerTV =(TextView)findViewById(R.id.hex_perimeter_calc_answer_tx);
        hexPerimeterCalcButton=(Button)findViewById(R.id.hex_perimeter_calc_button);
        hexPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(hexPerimeterSideAET)) {
                    hexPerimeterSideAET.setError("Enter Value");
                } else {
                    double aSide, hexASide;
                    aSide = Double.parseDouble(hexPerimeterSideAET.getText().toString());
                    if (aSide <= 0) {
                        hexPerimeterAnswerTV.setText("The variable a should be positive");
                    }
                     hexASide = 6*aSide;
                    hexPerimeterAnswerTV.setText(String.format("%.02f", hexASide));
                }

            }
        });

        hexAreaSideAET =(EditText)findViewById(R.id.hex_area_side_a_et);
        hexAreaAnswerTV =(TextView)findViewById(R.id.hex_calc_area_answer_tx);
        hexAreaCalcButton=(Button)findViewById(R.id.hex_area_calc_button);
        hexAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(hexAreaSideAET)) {
                    hexAreaSideAET.setError("Enter Value");
                } else {
                    double aSide, hexArea;
                    aSide = Double.parseDouble(hexAreaSideAET.getText().toString());
                    if (aSide <= 0) {
                        hexAreaAnswerTV.setText("The variable a should be positive");
                    }
                    hexArea = ((3*Math.sqrt(3))/2)*(Math.pow(aSide,2));
                    hexAreaAnswerTV.setText(String.format("%.02f", hexArea));
                }


            }
        });


        hexSideAET =(EditText)findViewById(R.id.hex_side_et);
        hexSideAAnswerTV =(TextView)findViewById(R.id.hex_calc_side_answer_tx);
        hexSideACalcButton=(Button)findViewById(R.id.hex_side_calc_button);
        hexSideACalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(hexSideAET)) {
                    hexSideAET.setError("Enter Value");
                } else {
                    double aSide, hexASide;
                    aSide = Double.parseDouble(hexSideAET.getText().toString());
                    if (aSide <= 0) {
                        hexSideAAnswerTV.setText("The variable a should be positive");
                    }
                    hexASide = aSide/6;
                    hexSideAAnswerTV.setText(String.format("%.02f", hexASide));
                }


            }
        });






    }

}

