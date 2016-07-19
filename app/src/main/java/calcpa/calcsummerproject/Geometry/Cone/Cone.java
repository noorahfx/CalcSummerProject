package calcpa.calcsummerproject.Geometry.Cone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import calcpa.calcsummerproject.R;

public class Cone extends AppCompatActivity {

    //Volume
    EditText coneVolumeRET;
    EditText coneVolumeHET;
    TextView coneVolumeAnswerTV;
    Button coneVolumeCalcButton;

    //Radius
    EditText coneRadiusHET;
    EditText coneRadiusVET;
    TextView coneRadiusAnswerTV;
    Button coneRadiusCalcButton;

    //Height
    EditText coneHeightRET;
    EditText coneHeightVET;
    TextView coneHeightAnswerTV;
    Button coneHeightCalcButton;

    //Slant height
    EditText coneSlantHeightRET;
    EditText coneSLantHeightHET;
    TextView coneSlantHeightAnswerTV;
    Button coneSlantHeightCalcButton;


    //Surface Area
    EditText coneSurfaceAreatRET;
    EditText coneSurfaceAreaHET;
    TextView coneSurfaceAreaAnswerTV;
    Button coneSurfaceAreaCalcButton;

    //Base
    EditText coneBaseAreaRET;
    TextView coneBaseAreaAnswerTV;
    Button coneBaseAreaCalcButton;


    //Lateral Surface
    EditText coneLateralSurfaceRET;
    EditText coneLateralSurfaceHET;
    TextView coneLateralSurfaceAnswerTV;
    Button coneLateralSurfaceCalcButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Volume
        coneVolumeRET = (EditText)findViewById(R.id.cone_volume_r_et);
        coneVolumeHET = (EditText)findViewById(R.id.cone_volume_h_et);
        coneVolumeAnswerTV = (TextView)findViewById(R.id.cone_volume_calc_answer_tx);
        coneVolumeCalcButton =(Button)findViewById(R.id.cone_volume_calc_button);
        coneVolumeCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                  */
                String height = coneVolumeRET.getText().toString();
                String volume = coneVolumeRET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                coneVolumeAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Radius
        coneRadiusHET = (EditText)findViewById(R.id.cone_radius_h_et);
        coneRadiusVET = (EditText)findViewById(R.id.cone_radius_v_et);
        coneRadiusAnswerTV = (TextView)findViewById(R.id.cone_radius_calc_answer_tx);
        coneRadiusCalcButton =(Button)findViewById(R.id.cone_radius_calc_button);
        coneRadiusCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = coneRadiusHET.getText().toString();
                String volume = coneRadiusVET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                coneRadiusAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });



        //Height
        coneHeightRET = (EditText)findViewById(R.id.cone_height_r_et);
        coneHeightVET = (EditText)findViewById(R.id.cone_height_v_et);
        coneHeightAnswerTV = (TextView)findViewById(R.id.cone_height_calc_answer_tx);
        coneHeightCalcButton =(Button)findViewById(R.id.cone_height_calc_button);
        coneHeightCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = coneHeightRET.getText().toString();
                String volume = coneHeightVET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                coneHeightAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Slant height
        coneSlantHeightRET = (EditText)findViewById(R.id.cone_slant_height_r_et);
        coneSLantHeightHET = (EditText)findViewById(R.id.cone_slant_height_h_et);
        coneSlantHeightAnswerTV = (TextView)findViewById(R.id.cone_slant_height_calc_answer_tx);
        coneSlantHeightCalcButton =(Button)findViewById(R.id.cone_slant_height_calc_button);
        coneSlantHeightCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = coneSlantHeightRET.getText().toString();
                String volume = coneSLantHeightHET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                coneSlantHeightAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //Surface Area
        coneSurfaceAreatRET = (EditText)findViewById(R.id.cone_surface_area_r_et);
        coneSurfaceAreaHET = (EditText)findViewById(R.id.cone_surface_area_h_et);
        coneSurfaceAreaAnswerTV = (TextView)findViewById(R.id.cone_surface_area_calc_answer_tx);
        coneSurfaceAreaCalcButton =(Button)findViewById(R.id.cone_surface_area_calc_button);
        coneSurfaceAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = coneSurfaceAreatRET.getText().toString();
                String volume = coneSurfaceAreaHET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                coneSurfaceAreaAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });



        //Base Area
        coneBaseAreaRET = (EditText)findViewById(R.id.cone_base_area_r_et);
        coneBaseAreaAnswerTV = (TextView)findViewById(R.id.cone_base_area_calc_answer_tx);
        coneBaseAreaCalcButton =(Button)findViewById(R.id.cone_base_area_calc_button);
        coneBaseAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = coneBaseAreaRET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                coneBaseAreaAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });




        //Lateral Surface
        coneLateralSurfaceRET= (EditText)findViewById(R.id.cone_lateral_surface_r_et);
        coneLateralSurfaceHET = (EditText)findViewById(R.id.cone_lateral_surface_h_et);
        coneLateralSurfaceAnswerTV = (TextView)findViewById(R.id.cone_lateral_surface_calc_answer_tx);
        coneLateralSurfaceCalcButton =(Button)findViewById(R.id.cone_lateral_surface_calc_button);
        coneLateralSurfaceCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = coneLateralSurfaceRET.getText().toString();
                String volume = coneLateralSurfaceHET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                coneLateralSurfaceAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

}
