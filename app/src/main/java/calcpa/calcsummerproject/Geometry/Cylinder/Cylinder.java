package calcpa.calcsummerproject.Geometry.Cylinder;

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

public class Cylinder extends AppCompatActivity {
    //Volume
    EditText cylinderVolumeRET;
    EditText cylinderVolumeHET;
    TextView cylinderVolumeAnswerTV;
    Button cylinderVolumeCalcButton;

    //Radius
    EditText cylinderRadiusHET;
    EditText cylinderRadiusVET;
    TextView cylinderRadiusAnswerTV;
    Button cylinderRadiusCalcButton;

    //Height
    EditText cylinderHeightRET;
    EditText cylinderHeightVET;
    TextView cylinderHeightAnswerTV;
    Button cylinderHeightCalcButton;



    //Surface Area
    EditText cylinderSurfaceAreatRET;
    EditText cylinderSurfaceAreaHET;
    TextView cylinderSurfaceAreaAnswerTV;
    Button cylinderSurfaceAreaCalcButton;

    //Base
    EditText cylinderBaseAreaRET;
    TextView cylinderBaseAreaAnswerTV;
    Button cylinderBaseAreaCalcButton;


    //Lateral Surface
    EditText cylinderLateralSurfaceRET;
    EditText cylinderLateralSurfaceHET;
    TextView cylinderLateralSurfaceAnswerTV;
    Button cylinderLateralSurfaceCalcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        //Volume
        cylinderVolumeRET = (EditText)findViewById(R.id.cylinder_volume_r_et);
        cylinderVolumeHET = (EditText)findViewById(R.id.cylinder_volume_h_et);
        cylinderVolumeAnswerTV = (TextView)findViewById(R.id.cylinder_volume_calc_answer_tx);
        cylinderVolumeCalcButton =(Button)findViewById(R.id.cylinder_volume_calc_button);
        cylinderVolumeCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = cylinderVolumeRET.getText().toString();
                String volume = cylinderVolumeRET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                cylinderVolumeAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Radius
        cylinderRadiusHET = (EditText)findViewById(R.id.cylinder_radius_h_et);
        cylinderRadiusVET = (EditText)findViewById(R.id.cylinder_radius_v_et);
        cylinderRadiusAnswerTV = (TextView)findViewById(R.id.cylinder_radius_calc_answer_tx);
        cylinderRadiusCalcButton =(Button)findViewById(R.id.cylinder_radius_calc_button);
        cylinderRadiusCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = cylinderRadiusHET.getText().toString();
                String volume = cylinderRadiusVET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                cylinderRadiusAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });



        //Height
        cylinderHeightRET = (EditText)findViewById(R.id.cylinder_height_r_et);
        cylinderHeightVET = (EditText)findViewById(R.id.cylinder_height_v_et);
        cylinderHeightAnswerTV = (TextView)findViewById(R.id.cylinder_height_calc_answer_tx);
        cylinderHeightCalcButton =(Button)findViewById(R.id.cylinder_height_calc_button);
        cylinderHeightCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = cylinderHeightRET.getText().toString();
                String volume = cylinderHeightVET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                cylinderHeightAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });



        //Surface Area
        cylinderSurfaceAreatRET = (EditText)findViewById(R.id.cylinder_surface_area_r_et);
        cylinderSurfaceAreaHET = (EditText)findViewById(R.id.cylinder_surface_area_h_et);
        cylinderSurfaceAreaAnswerTV = (TextView)findViewById(R.id.cylinder_surface_area_calc_answer_tx);
        cylinderSurfaceAreaCalcButton =(Button)findViewById(R.id.cylinder_surface_area_calc_button);
        cylinderSurfaceAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = cylinderSurfaceAreatRET.getText().toString();
                String volume = cylinderSurfaceAreaHET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                cylinderSurfaceAreaAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });



        //Base Area
        cylinderBaseAreaRET = (EditText)findViewById(R.id.cylinder_base_area_r_et);
        cylinderBaseAreaAnswerTV = (TextView)findViewById(R.id.cylinder_base_area_calc_answer_tx);
        cylinderBaseAreaCalcButton =(Button)findViewById(R.id.cylinder_base_area_calc_button);
        cylinderBaseAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = cylinderBaseAreaRET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                cylinderBaseAreaAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });




        //Lateral Surface
        cylinderLateralSurfaceRET= (EditText)findViewById(R.id.cylinder_lateral_surface_r_et);
        cylinderLateralSurfaceHET = (EditText)findViewById(R.id.cylinder_lateral_surface_h_et);
        cylinderLateralSurfaceAnswerTV = (TextView)findViewById(R.id.cylinder_lateral_surface_calc_answer_tx);
        cylinderLateralSurfaceCalcButton =(Button)findViewById(R.id.cylinder_lateral_surface_calc_button);
        cylinderLateralSurfaceCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String height = cylinderLateralSurfaceRET.getText().toString();
                String volume = cylinderLateralSurfaceHET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                cylinderLateralSurfaceAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
