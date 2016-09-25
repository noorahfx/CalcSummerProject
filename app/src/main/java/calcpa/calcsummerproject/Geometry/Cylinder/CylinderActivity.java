package calcpa.calcsummerproject.Geometry.Cylinder;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import calcpa.calcsummerproject.Model;
import calcpa.calcsummerproject.R;

public class CylinderActivity extends AppCompatActivity {

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
        getSupportActionBar().setTitle(R.string.title_activity_cylinder);
        // getSupportActionBar().setIcon(R.drawable.back_button_tb);
        //enable button in toolbar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        setVolumeResource();
        setRadiusResource();
        setHeightResource();
        setSurfaceAreaResource();
        setBaseAreaResource();
        setLateralSurfaceResource();
        setFontResource();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("volume_et1", cylinderVolumeRET.getText().toString());
        outState.putString("volume_et2", cylinderVolumeHET.getText().toString());
        outState.putString("volume_tv", cylinderVolumeAnswerTV.getText().toString());
        outState.putString("radius_et1", cylinderRadiusHET.getText().toString());
        outState.putString("radius_et2", cylinderRadiusVET.getText().toString());
        outState.putString("radius_tv", cylinderRadiusAnswerTV.getText().toString());
        outState.putString("height_et1", cylinderHeightRET.getText().toString());
        outState.putString("height_et2", cylinderHeightVET.getText().toString());
        outState.putString("height_tv", cylinderHeightAnswerTV.getText().toString());
        outState.putString("surface_ar_et1", cylinderSurfaceAreatRET.getText().toString());
        outState.putString("surface_ar_et2", cylinderSurfaceAreaHET.getText().toString());
        outState.putString("surface_ar_tv", cylinderSurfaceAreaAnswerTV.getText().toString());
        outState.putString("base_ar_et1", cylinderBaseAreaRET.getText().toString());
        outState.putString("base_ar_tv", cylinderBaseAreaAnswerTV.getText().toString());
        outState.putString("lateral_sf_et1", cylinderLateralSurfaceRET.getText().toString());
        outState.putString("lateral_sf_et2", cylinderLateralSurfaceHET.getText().toString());
        outState.putString("lateral_sf_tv", cylinderLateralSurfaceAnswerTV.getText().toString());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        cylinderVolumeRET.setText(savedInstanceState.getString("volume_et1"));
        cylinderVolumeHET.setText(savedInstanceState.getString("volume_et2"));
        cylinderVolumeAnswerTV.setText(savedInstanceState.getString("volume_tv"));
        cylinderRadiusHET.setText(savedInstanceState.getString("radius_et1"));
        cylinderRadiusVET.setText(savedInstanceState.getString("radius_et2"));
        cylinderRadiusAnswerTV.setText(savedInstanceState.getString("radius_tv"));
        cylinderHeightRET.setText(savedInstanceState.getString("height_et1"));
        cylinderHeightVET.setText(savedInstanceState.getString("height_et2"));
        cylinderHeightAnswerTV.setText(savedInstanceState.getString("height_tv"));
        cylinderSurfaceAreatRET.setText(savedInstanceState.getString("surface_ar_et1"));
        cylinderSurfaceAreaHET.setText(savedInstanceState.getString("surface_ar_et2"));
        cylinderSurfaceAreaAnswerTV.setText(savedInstanceState.getString("surface_ar_tv"));
        cylinderBaseAreaRET.setText(savedInstanceState.getString("base_ar_et1"));
        cylinderBaseAreaAnswerTV.setText(savedInstanceState.getString("base_ar_tv"));
        cylinderLateralSurfaceRET.setText(savedInstanceState.getString("lateral_sf_et1"));
        cylinderLateralSurfaceHET.setText(savedInstanceState.getString("lateral_sf_et2"));
        cylinderLateralSurfaceAnswerTV.setText(savedInstanceState.getString("lateral_sf_tv"));

    }



    private void setVolumeResource() {
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


    }

    private void setRadiusResource() {
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


    }

    private void setHeightResource() {

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


    }

    private void setSurfaceAreaResource() {
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


    }

    private void setBaseAreaResource() {

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

        // Base Clear button
        cylinderBaseClearButton = (Button) findViewById(R.id.cylinder_base_area_clear_button);
        cylinderBaseClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cylinderBaseAreaRET.setText("");
                cylinderBaseAreaAnswerTV.setText("");

            }
        });


    }

    private void setLateralSurfaceResource() {
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


    }

    private void setFontResource() {


        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");

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


}
