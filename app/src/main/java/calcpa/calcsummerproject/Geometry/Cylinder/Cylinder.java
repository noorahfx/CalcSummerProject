package calcpa.calcsummerproject.Geometry.Cylinder;

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

public class Cylinder extends AppCompatActivity {

    //Volume
    EditText cylinderVolumeRET;
    EditText cylinderVolumeHET;
    TextView cylinderVolumeAnswerTV;
    Button cylinderVolumeCalcButton;
    Button cylinderVolumeClearButton;


    //Radius
    EditText cylinderRadiusHET;
    EditText cylinderRadiusVET;
    TextView cylinderRadiusAnswerTV;
    Button cylinderRadiusCalcButton;
    Button cylinderRadiusClearButton;


    //Height
    EditText cylinderHeightRET;
    EditText cylinderHeightVET;
    TextView cylinderHeightAnswerTV;
    Button cylinderHeightCalcButton;
    Button cylinderHeightClearButton;


    //Surface Area
    EditText cylinderSurfaceAreatRET;
    EditText cylinderSurfaceAreaHET;
    TextView cylinderSurfaceAreaAnswerTV;
    Button cylinderSurfaceAreaCalcButton;
    Button cylinderSurfaceAreaClearButton;


    //Base
    EditText cylinderBaseAreaRET;
    TextView cylinderBaseAreaAnswerTV;
    Button cylinderBaseAreaCalcButton;
    Button cylinderBaseClearButton;


    //Lateral Surface
    EditText cylinderLateralSurfaceRET;
    EditText cylinderLateralSurfaceHET;
    TextView cylinderLateralSurfaceAnswerTV;
    Button cylinderLateralSurfaceCalcButton;
    Button cylinderLateralSurfaceClearButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        // Volume Clear button
        cylinderVolumeClearButton = (Button) findViewById(R.id.cylinder_volume_clear_button);
        cylinderVolumeClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cylinderVolumeRET.setText("");
                cylinderVolumeHET.setText("");
                cylinderVolumeAnswerTV.setText("");

            }
        });

        // Radius clear button
        cylinderRadiusClearButton = (Button) findViewById(R.id.cylinder_radius_clear_button);
        cylinderRadiusClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cylinderRadiusHET.setText("");
                cylinderRadiusVET.setText("");
                cylinderRadiusAnswerTV.setText("");

            }
        });

        // Height Clear button
        cylinderHeightClearButton = (Button)
                findViewById(R.id.cylinder_height_clear_button);
        cylinderHeightClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cylinderHeightRET.setText("");
                cylinderHeightVET.setText("");
                cylinderHeightAnswerTV.setText("");

            }
        });

        // Surface Area Clear button
        cylinderSurfaceAreaClearButton = (Button)
                findViewById(R.id.cylinder_surface_area_clear_button);
        cylinderSurfaceAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cylinderSurfaceAreatRET.setText("");
                cylinderSurfaceAreaHET.setText("");
                cylinderSurfaceAreaAnswerTV.setText("");

            }
        });

        // Base Clear button
        cylinderBaseClearButton = (Button) findViewById(R.id.cylinder_base_area_clear_button);
        cylinderBaseClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cylinderBaseAreaRET.setText("");
                cylinderBaseAreaAnswerTV.setText("");

            }
        });
        // Lateral Surface Clear button
        cylinderLateralSurfaceClearButton = (Button)
                findViewById(R.id.cylinder_lateral_surface_clear_button);
        cylinderLateralSurfaceClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cylinderLateralSurfaceRET.setText("");
                cylinderLateralSurfaceHET.setText("");
                cylinderLateralSurfaceAnswerTV.setText("");

            }
        });


        //Volume
        cylinderVolumeRET = (EditText) findViewById(R.id.cylinder_volume_r_et);
        cylinderVolumeHET = (EditText) findViewById(R.id.cylinder_volume_h_et);
        cylinderVolumeAnswerTV = (TextView) findViewById(R.id.cylinder_volume_calc_answer_tx);
        cylinderVolumeCalcButton = (Button) findViewById(R.id.cylinder_volume_calc_button);
        cylinderVolumeCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(cylinderVolumeRET)) {
                    cylinderVolumeRET.setError("Enter Radius");
                } else if (Model.isEmpty(cylinderVolumeHET)) {
                    cylinderVolumeHET.setError("Enter Height");
                } else {
                    double radius, height, cylinderVolume;
                    radius = Double.parseDouble(cylinderVolumeRET.getText().toString());
                    height = Double.parseDouble(cylinderVolumeHET.getText().toString());
                    if (radius <= 0) {
                        cylinderVolumeAnswerTV.setText("The variable r should be positive");
                    } else if (height <= 0) {
                        cylinderVolumeAnswerTV.setText("The variable h should be positive");
                    } else {
                        cylinderVolume = Math.PI * (Math.pow(radius, 2) * height);
                        cylinderVolumeAnswerTV.setText(String.format("%.02f", cylinderVolume));
                    }
                }
            }
        });

        //Radius
        cylinderRadiusHET = (EditText) findViewById(R.id.cylinder_radius_h_et);
        cylinderRadiusVET = (EditText) findViewById(R.id.cylinder_radius_v_et);
        cylinderRadiusAnswerTV = (TextView) findViewById(R.id.cylinder_radius_calc_answer_tx);
        cylinderRadiusCalcButton = (Button) findViewById(R.id.cylinder_radius_calc_button);
        cylinderRadiusCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(cylinderRadiusHET)) {
                    cylinderRadiusHET.setError("Enter Height");
                } else if (Model.isEmpty(cylinderRadiusVET)) {
                    cylinderRadiusVET.setError("Enter Volume");
                } else {
                    double height, volume, cylinderRadius;
                    height = Double.parseDouble(cylinderRadiusHET.getText().toString());
                    volume = Double.parseDouble(cylinderRadiusVET.getText().toString());
                    if (height <= 0) {
                        cylinderRadiusAnswerTV.setText("The variable h should be positive");
                    } else if (volume <= 0) {
                        cylinderRadiusAnswerTV.setText("The variable v should be positive");
                    } else {
                        cylinderRadius = Math.sqrt(volume / (Math.PI * height));
                        cylinderRadiusAnswerTV.setText(String.format("%.02f", cylinderRadius));
                    }
                }
            }
        });


        //Height
        cylinderHeightRET = (EditText) findViewById(R.id.cylinder_height_r_et);
        cylinderHeightVET = (EditText) findViewById(R.id.cylinder_height_v_et);
        cylinderHeightAnswerTV = (TextView) findViewById(R.id.cylinder_height_calc_answer_tx);
        cylinderHeightCalcButton = (Button) findViewById(R.id.cylinder_height_calc_button);
        cylinderHeightCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(cylinderHeightRET)) {
                    cylinderHeightRET.setError("Enter Radius");
                } else if (Model.isEmpty(cylinderHeightVET)) {
                    cylinderHeightVET.setError("Enter Volume");
                } else {
                    double radius, volume, cylinderHeight;
                    radius = Double.parseDouble(cylinderHeightRET.getText().toString());
                    volume = Double.parseDouble(cylinderHeightVET.getText().toString());
                    if (radius <= 0) {
                        cylinderHeightAnswerTV.setText("The variable r should be positive");
                    } else if (volume <= 0) {
                        cylinderHeightAnswerTV.setText("The variable v should be positive");
                    } else {
                        cylinderHeight = volume / (Math.PI * (Math.pow(radius, 2)));
                        cylinderHeightAnswerTV.setText(String.format("%.02f", cylinderHeight));
                    }
                }
            }
        });


        //Surface Area
        cylinderSurfaceAreatRET = (EditText) findViewById(R.id.cylinder_surface_area_r_et);
        cylinderSurfaceAreaHET = (EditText) findViewById(R.id.cylinder_surface_area_h_et);
        cylinderSurfaceAreaAnswerTV = (TextView) findViewById(R.id.cylinder_surface_area_calc_answer_tx);
        cylinderSurfaceAreaCalcButton = (Button) findViewById(R.id.cylinder_surface_area_calc_button);
        cylinderSurfaceAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(cylinderSurfaceAreatRET)) {
                    cylinderSurfaceAreatRET.setError("Enter Radius");
                } else if (Model.isEmpty(cylinderSurfaceAreaHET)) {
                    cylinderSurfaceAreaHET.setError("Enter Height");
                } else {
                    double radius, height, cylinderSurfaceArea;
                    radius = Double.parseDouble(cylinderSurfaceAreatRET.getText().toString());
                    height = Double.parseDouble(cylinderSurfaceAreaHET.getText().toString());
                    if (radius <= 0) {
                        cylinderSurfaceAreaAnswerTV.setText("The variable r should be positive");
                    } else if (height <= 0) {
                        cylinderSurfaceAreaAnswerTV.setText("The variable h should be positive");
                    } else {
                        cylinderSurfaceArea = (2 * Math.PI * radius * height + 2 *
                                Math.PI * (Math.pow(radius, 2)));
                        cylinderSurfaceAreaAnswerTV.setText
                                (String.format("%.02f", cylinderSurfaceArea));
                    }
                }
            }
        });


        //Base Area
        cylinderBaseAreaRET = (EditText) findViewById(R.id.cylinder_base_area_r_et);
        cylinderBaseAreaAnswerTV = (TextView) findViewById(R.id.cylinder_base_area_calc_answer_tx);
        cylinderBaseAreaCalcButton = (Button) findViewById(R.id.cylinder_base_area_calc_button);
        cylinderBaseAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(cylinderBaseAreaRET)) {
                    cylinderBaseAreaRET.setError("Enter Radius");
                } else {
                    double radius, cylinderBaseArea;
                    radius = Double.parseDouble(cylinderBaseAreaRET.getText().toString());
                    cylinderBaseArea = Math.PI * Math.pow(radius, 2);
                    if (radius <= 0) {
                        cylinderBaseAreaAnswerTV.setText("The variable r should be positive");
                    }
                    cylinderBaseAreaAnswerTV.setText(String.format("%.02f", cylinderBaseArea));
                }
            }
        });


        //Lateral Surface
        cylinderLateralSurfaceRET = (EditText) findViewById(R.id.cylinder_lateral_surface_r_et);
        cylinderLateralSurfaceHET = (EditText) findViewById(R.id.cylinder_lateral_surface_h_et);
        cylinderLateralSurfaceAnswerTV = (TextView) findViewById
                (R.id.cylinder_lateral_surface_calc_answer_tx);
        cylinderLateralSurfaceCalcButton = (Button) findViewById
                (R.id.cylinder_lateral_surface_calc_button);
        cylinderLateralSurfaceCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(cylinderLateralSurfaceRET)) {
                    cylinderLateralSurfaceRET.setError("Enter Radius");
                } else if (Model.isEmpty(cylinderLateralSurfaceHET)) {
                    cylinderLateralSurfaceHET.setError("Enter Height");
                } else {
                    double radius, height, cylinderLateralSurfaceArea;
                    radius = Double.parseDouble(cylinderLateralSurfaceRET.getText().toString());
                    height = Double.parseDouble(cylinderLateralSurfaceHET.getText().toString());
                    if (radius <= 0) {
                        cylinderSurfaceAreaAnswerTV.setText("The variable r should be positive");
                    } else if (height <= 0) {
                        cylinderSurfaceAreaAnswerTV.setText("The variable h should be positive");
                    } else {
                        cylinderLateralSurfaceArea = 2 * Math.PI * radius * height;
                        cylinderLateralSurfaceAnswerTV.setText(String.format
                                ("%.02f", cylinderLateralSurfaceArea));
                    }
                }
            }
        });



        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),  "OptimusPrinceps.ttf");

        TextView myTextView = (TextView) findViewById(R.id.cylinder_volume_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cylinder_volume_r_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cylinder_volume_h_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cylinder_radius_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cylinder_radius_h_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cylinder_radius_v_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cylinder_height_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cylinder_height_r_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cylinder_height_v_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);



        myTextView = (TextView) findViewById(R.id.cylinder_surface_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cylinder_surface_area_r_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cylinder_surface_area_h_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cylinder_base_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cylinder_base_area_r_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cylinder_lateral_surface_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cylinder_lateral_surface_r_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cylinder_lateral_surface_h_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        cylinderVolumeRET.setTypeface(myTypeFace);
        cylinderVolumeHET.setTypeface(myTypeFace);
        cylinderVolumeAnswerTV.setTypeface(myTypeFace);
        cylinderVolumeCalcButton.setTypeface(myTypeFace);
        cylinderVolumeClearButton.setTypeface(myTypeFace);

        cylinderRadiusHET.setTypeface(myTypeFace);
        cylinderRadiusVET.setTypeface(myTypeFace);
        cylinderRadiusAnswerTV.setTypeface(myTypeFace);
        cylinderRadiusCalcButton.setTypeface(myTypeFace);
        cylinderRadiusClearButton.setTypeface(myTypeFace);

        cylinderHeightRET.setTypeface(myTypeFace);
        cylinderHeightVET.setTypeface(myTypeFace);
        cylinderHeightAnswerTV.setTypeface(myTypeFace);
        cylinderHeightCalcButton.setTypeface(myTypeFace);
        cylinderHeightClearButton.setTypeface(myTypeFace);

        cylinderSurfaceAreatRET.setTypeface(myTypeFace);
        cylinderSurfaceAreaHET.setTypeface(myTypeFace);
        cylinderSurfaceAreaAnswerTV.setTypeface(myTypeFace);
        cylinderSurfaceAreaCalcButton.setTypeface(myTypeFace);
        cylinderSurfaceAreaClearButton.setTypeface(myTypeFace);

        cylinderBaseAreaRET.setTypeface(myTypeFace);
        cylinderBaseAreaAnswerTV.setTypeface(myTypeFace);
        cylinderBaseAreaCalcButton.setTypeface(myTypeFace);
        cylinderBaseClearButton.setTypeface(myTypeFace);

        cylinderLateralSurfaceRET.setTypeface(myTypeFace);
        cylinderLateralSurfaceHET.setTypeface(myTypeFace);
        cylinderLateralSurfaceAnswerTV.setTypeface(myTypeFace);
        cylinderLateralSurfaceCalcButton.setTypeface(myTypeFace);
        cylinderLateralSurfaceClearButton.setTypeface(myTypeFace);



    }


    @Override
    public void onStart(){
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    public void onStop(){
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {

        } else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {

        }

    }


}
