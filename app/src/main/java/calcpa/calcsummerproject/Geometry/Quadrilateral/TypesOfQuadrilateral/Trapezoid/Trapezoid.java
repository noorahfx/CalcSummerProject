package calcpa.calcsummerproject.Geometry.Quadrilateral.TypesOfQuadrilateral.Trapezoid;

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

public class Trapezoid extends AppCompatActivity {

    //Perimeter
    EditText trapezoidPerimeterAET;
    EditText trapezoidPerimeterBET;
    EditText trapezoidPerimeterCET;
    EditText trapezoidPerimeterDET;
    TextView trapezoidPerimeterAnswerTV;
    Button trapezoidPerimeterCalcButton;


    //Area
    EditText trapezoidAreaAET;
    EditText trapezoidAreaBET;
    EditText trapezoidAreahET;
    TextView trapezoidAreaAnswerTV;
    Button trapezoidAreaCalcButton;

    //Height
    EditText trapezoidHeightAET;
    EditText trapezoidHeightBET;
    EditText trapezoidHeightAreaET;
    TextView trapezoidHeightAnswerTV;
    Button trapezoidHeightCalcButton;

    //Base A
    EditText trapezoidABaseBET;
    EditText trapezoidABaseHET;
    EditText trapezoidABaseAreaET;
    TextView trapezoidABaseAnswerTV;
    Button trapezoidABaseCalcButton;


    //Base B
    EditText trapezoidBBaseAET;
    EditText trapezoidBBaseHET;
    EditText trapezoidBBaseAreaET;
    TextView trapezoidBBaseAnswerTV;
    Button trapezoidBBaseCalcButton;


    //Side C
    EditText trapezoidCSideAET;
    EditText trapezoidCSideBET;
    EditText trapezoidCSideDET;
    EditText trapezoidCSidePET;
    TextView trapezoidCSideAnswerTV;
    Button trapezoidCSideCalcButton;

    //Side D
    EditText trapezoidDSideAET;
    EditText trapezoidDSideBET;
    EditText trapezoidDSideCET;
    EditText trapezoidDSidePET;
    TextView trapezoidDSideAnswerTV;
    Button trapezoidDSideCalcButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezoid);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Perimeter
          trapezoidPerimeterAET =(EditText)findViewById(R.id.trapezoid_perimeter_a_et);
          trapezoidPerimeterBET =(EditText)findViewById(R.id.trapezoid_perimeter_b_et);
          trapezoidPerimeterCET=(EditText)findViewById(R.id.trapezoid_perimeter_c_et);
          trapezoidPerimeterDET=(EditText)findViewById(R.id.trapezoid_perimeter_d_et);
          trapezoidPerimeterAnswerTV=(TextView)findViewById(R.id.trapezoid_perimeter_calc_answer_tx);
          trapezoidPerimeterCalcButton=(Button)findViewById(R.id.trapezoid_perimeter_calc_button);
        trapezoidPerimeterCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
              //  String height = coneVolumeRET.getText().toString();
               // String volume = coneVolumeRET.getText().toString();



                //double area = 6 * Double.parseDouble(height);
//                coneVolumeAnswerTV.setText(String.format("%.02f", area));

          //      if (TextUtils.isEmpty(height)) {
            //        Toast.makeText(getApplicationContext(),
              //              "Enter height", Toast.LENGTH_SHORT).show();
                //}
            }
        });

        //Area
          trapezoidAreaAET =(EditText)findViewById(R.id.trapezoid_area_a_et);
          trapezoidAreaBET=(EditText)findViewById(R.id.trapezoid_area_b_et);
          trapezoidAreahET=(EditText)findViewById(R.id.trapezoid_area_h_et);
          trapezoidAreaAnswerTV =(TextView)findViewById(R.id.trapezoid_area_calc_answer_tx);
          trapezoidAreaCalcButton = (Button)findViewById(R.id.trapezoid_area_calc_button);
        trapezoidAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                //  String height = coneVolumeRET.getText().toString();
                // String volume = coneVolumeRET.getText().toString();



                //double area = 6 * Double.parseDouble(height);
//                coneVolumeAnswerTV.setText(String.format("%.02f", area));

                //      if (TextUtils.isEmpty(height)) {
                //        Toast.makeText(getApplicationContext(),
                //              "Enter height", Toast.LENGTH_SHORT).show();
                //}
            }
        });

        //Height
          trapezoidHeightAET=(EditText)findViewById(R.id.trapezoid_height_a_et);
          trapezoidHeightBET=(EditText)findViewById(R.id.trapezoid_height_b_et);
          trapezoidHeightAreaET=(EditText)findViewById(R.id.trapezoid_height_area_et);
          trapezoidHeightAnswerTV=(TextView)findViewById(R.id.trapezoid_height_calc_answer_tx);
          trapezoidHeightCalcButton=(Button)findViewById(R.id.trapezoid_height_calc_button);
        trapezoidHeightCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                //  String height = coneVolumeRET.getText().toString();
                // String volume = coneVolumeRET.getText().toString();



                //double area = 6 * Double.parseDouble(height);
//                coneVolumeAnswerTV.setText(String.format("%.02f", area));

                //      if (TextUtils.isEmpty(height)) {
                //        Toast.makeText(getApplicationContext(),
                //              "Enter height", Toast.LENGTH_SHORT).show();
                //}
            }
        });

        //Base A
          trapezoidABaseBET=(EditText)findViewById(R.id.trapezoid_baseA_b_et);
          trapezoidABaseHET=(EditText)findViewById(R.id.trapezoid_baseA_h_et);
          trapezoidABaseAreaET=(EditText)findViewById(R.id.trapezoid_baseA_area_et);
          trapezoidABaseAnswerTV=(TextView)findViewById(R.id.trapezoid_baseA_calc_answer_tx);
          trapezoidABaseCalcButton=(Button)findViewById(R.id.trapezoid_baseA_calc_button);
        trapezoidABaseCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                //  String height = coneVolumeRET.getText().toString();
                // String volume = coneVolumeRET.getText().toString();



                //double area = 6 * Double.parseDouble(height);
//                coneVolumeAnswerTV.setText(String.format("%.02f", area));

                //      if (TextUtils.isEmpty(height)) {
                //        Toast.makeText(getApplicationContext(),
                //              "Enter height", Toast.LENGTH_SHORT).show();
                //}
            }
        });



        //Base B
          trapezoidBBaseAET=(EditText)findViewById(R.id.trapezoid_baseB_a_et);
          trapezoidBBaseHET=(EditText)findViewById(R.id.trapezoid_baseB_h_et);
          trapezoidBBaseAreaET=(EditText)findViewById(R.id.trapezoid_baseB_area_et);
          trapezoidBBaseAnswerTV=(TextView)findViewById(R.id.trapezoid_baseB_calc_answer_tx);
          trapezoidBBaseCalcButton=(Button)findViewById(R.id.trapezoid_baseB_calc_button);
        trapezoidBBaseCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                //  String height = coneVolumeRET.getText().toString();
                // String volume = coneVolumeRET.getText().toString();



                //double area = 6 * Double.parseDouble(height);
//                coneVolumeAnswerTV.setText(String.format("%.02f", area));

                //      if (TextUtils.isEmpty(height)) {
                //        Toast.makeText(getApplicationContext(),
                //              "Enter height", Toast.LENGTH_SHORT).show();
                //}
            }
        });


        //Side C
          trapezoidCSideAET=(EditText)findViewById(R.id.trapezoid_sideC_a_et);
          trapezoidCSideBET=(EditText)findViewById(R.id.trapezoid_sideC_b_et);
          trapezoidCSideDET=(EditText)findViewById(R.id.trapezoid_sideC_d_et);
          trapezoidCSidePET=(EditText)findViewById(R.id.trapezoid_sideC_p_et);
          trapezoidCSideAnswerTV=(TextView)findViewById(R.id.trapezoid_sideC_calc_answer_tx);
          trapezoidCSideCalcButton=(Button)findViewById(R.id.trapezoid_sideC_calc_button);
        trapezoidCSideCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                //  String height = coneVolumeRET.getText().toString();
                // String volume = coneVolumeRET.getText().toString();



                //double area = 6 * Double.parseDouble(height);
//                coneVolumeAnswerTV.setText(String.format("%.02f", area));

                //      if (TextUtils.isEmpty(height)) {
                //        Toast.makeText(getApplicationContext(),
                //              "Enter height", Toast.LENGTH_SHORT).show();
                //}
            }
        });

        //Side D
          trapezoidDSideAET=(EditText)findViewById(R.id.trapezoid_sideD_a_et);
          trapezoidDSideBET=(EditText)findViewById(R.id.trapezoid_sideD_b_et);
          trapezoidDSideCET=(EditText)findViewById(R.id.trapezoid_sideD_c_et);
          trapezoidDSidePET=(EditText)findViewById(R.id.trapezoid_sideD_p_et);
          trapezoidDSideAnswerTV=(TextView)findViewById(R.id.trapezoid_sideD_calc_answer_tx);
          trapezoidDSideCalcButton=(Button)findViewById(R.id.trapezoid_sideD_calc_button);
        trapezoidDSideCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                //  String height = coneVolumeRET.getText().toString();
                // String volume = coneVolumeRET.getText().toString();



                //double area = 6 * Double.parseDouble(height);
//                coneVolumeAnswerTV.setText(String.format("%.02f", area));

                //      if (TextUtils.isEmpty(height)) {
                //        Toast.makeText(getApplicationContext(),
                //              "Enter height", Toast.LENGTH_SHORT).show();
                //}
            }
        });



    }

}
