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

import calcpa.calcsummerproject.Model;
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
        coneVolumeRET = (EditText) findViewById(R.id.cone_volume_r_et);
        coneVolumeHET = (EditText) findViewById(R.id.cone_volume_h_et);
        coneVolumeAnswerTV = (TextView) findViewById(R.id.cone_volume_calc_answer_tx);
        coneVolumeCalcButton = (Button) findViewById(R.id.cone_volume_calc_button);
        coneVolumeCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(coneVolumeRET)) {
                    coneVolumeRET.setError("Enter Radius");
                } else if (Model.isEmpty(coneVolumeHET)) {
                    coneVolumeHET.setError("Enter Height");
                } else {

                    double radius, height, answer;
                    radius = Double.parseDouble(coneVolumeRET.getText().toString());
                    height = Double.parseDouble(coneVolumeHET.getText().toString());
                    if (radius <= 0) {
                        coneVolumeAnswerTV.setText("The variable r should be positive");
                    } else if (height <= 0) {
                        coneVolumeAnswerTV.setText("The variable h should be positive");
                    } else {

                        answer = Math.PI * (radius * radius) * (height / 3);
                        coneVolumeAnswerTV.setText(String.format("%.02f", answer));
                    }
                }
            }
        });

        //Radius
        coneRadiusHET = (EditText) findViewById(R.id.cone_radius_h_et);
        coneRadiusVET = (EditText) findViewById(R.id.cone_radius_v_et);
        coneRadiusAnswerTV = (TextView) findViewById(R.id.cone_radius_calc_answer_tx);
        coneRadiusCalcButton = (Button) findViewById(R.id.cone_radius_calc_button);
        coneRadiusCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(coneRadiusHET)) {
                    coneRadiusHET.setError("Enter Height");
                } else if (Model.isEmpty(coneRadiusVET)) {
                    coneRadiusVET.setError("Enter Volume");
                } else {

                    double height, volume, answer;
                    height = Double.parseDouble(coneRadiusHET.getText().toString());
                    volume = Double.parseDouble(coneRadiusVET.getText().toString());
                    if (height <= 0) {
                        coneRadiusAnswerTV.setText("The variable h should be positive");
                    } else if (volume <= 0) {
                        coneRadiusAnswerTV.setText("The variable v should be positive");
                    } else {
                        answer = Math.sqrt(3 * (volume / (Math.PI * height)));
                        coneRadiusAnswerTV.setText(String.format("%.02f", answer));
                    }
                }
            }
        });


        //Height
        coneHeightRET = (EditText) findViewById(R.id.cone_height_r_et);
        coneHeightVET = (EditText) findViewById(R.id.cone_height_v_et);
        coneHeightAnswerTV = (TextView) findViewById(R.id.cone_height_calc_answer_tx);
        coneHeightCalcButton = (Button) findViewById(R.id.cone_height_calc_button);
        coneHeightCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(coneHeightRET)) {
                    coneHeightRET.setError("Enter Radius");
                } else if (Model.isEmpty(coneHeightVET)) {
                    coneHeightVET.setError("Enter Volume");
                } else {

                    double radius, volume, answer;
                    radius = Double.parseDouble(coneHeightRET.getText().toString());
                    volume = Double.parseDouble(coneHeightVET.getText().toString());
                    if (radius <= 0) {
                        coneHeightAnswerTV.setText("The variable r should be positive");
                    } else if (volume <= 0) {
                        coneHeightAnswerTV.setText("The variable v should be positive");
                    } else {
                        answer = (3 * (volume / (Math.PI * (radius * radius))));
                        coneHeightAnswerTV.setText(String.format("%.02f", answer));
                    }
                }
            }
        });

        //Slant height
        coneSlantHeightRET = (EditText) findViewById(R.id.cone_slant_height_r_et);
        coneSLantHeightHET = (EditText) findViewById(R.id.cone_slant_height_h_et);
        coneSlantHeightAnswerTV = (TextView) findViewById(R.id.cone_slant_height_calc_answer_tx);
        coneSlantHeightCalcButton = (Button) findViewById(R.id.cone_slant_height_calc_button);
        coneSlantHeightCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(coneSlantHeightRET)) {
                    coneSlantHeightRET.setError("Enter Radius");
                } else if (Model.isEmpty(coneSLantHeightHET)) {
                    coneSLantHeightHET.setError("Enter Height");
                } else {

                    double radius, height, answer;
                    radius = Double.parseDouble(coneSlantHeightRET.getText().toString());
                    height = Double.parseDouble(coneSLantHeightHET.getText().toString());
                    if (radius <= 0) {
                        coneSlantHeightAnswerTV.setText("The variable r should be positive");
                    } else if (height <= 0) {
                        coneSlantHeightAnswerTV.setText("The variable h should be positive");
                    } else {
                        answer = Math.sqrt((radius * radius) + (height * height));
                        coneSlantHeightAnswerTV.setText(String.format("%.02f", answer));
                    }
                }
            }
        });


        //Surface Area
        coneSurfaceAreatRET = (EditText) findViewById(R.id.cone_surface_area_r_et);
        coneSurfaceAreaHET = (EditText) findViewById(R.id.cone_surface_area_h_et);
        coneSurfaceAreaAnswerTV = (TextView) findViewById(R.id.cone_surface_area_calc_answer_tx);
        coneSurfaceAreaCalcButton = (Button) findViewById(R.id.cone_surface_area_calc_button);
        coneSurfaceAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(coneSurfaceAreatRET)) {
                    coneSurfaceAreatRET.setError("Enter Radius");
                } else if (Model.isEmpty(coneSurfaceAreaHET)) {
                    coneSurfaceAreaHET.setError("Enter Height");
                } else {

                    double radius, height, answer;
                    radius = Double.parseDouble(coneSurfaceAreatRET.getText().toString());
                    height = Double.parseDouble(coneSurfaceAreaHET.getText().toString());
                    if (radius <= 0) {
                        coneSurfaceAreaAnswerTV.setText("The variable r should be positive");
                    } else if (height <= 0) {
                        coneSurfaceAreaAnswerTV.setText("The variable h should be positive");
                    } else {
                        answer = (Math.PI * radius * (radius + Math.sqrt((height * height)
                                + (radius * radius))));
                        coneSurfaceAreaAnswerTV.setText(String.format("%.02f", answer));
                    }
                }
            }
        });


        //Base Area
        coneBaseAreaRET = (EditText) findViewById(R.id.cone_base_area_r_et);
        coneBaseAreaAnswerTV = (TextView) findViewById(R.id.cone_base_area_calc_answer_tx);
        coneBaseAreaCalcButton = (Button) findViewById(R.id.cone_base_area_calc_button);
        coneBaseAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(coneBaseAreaRET)) {
                    coneBaseAreaRET.setError("Enter Radius");
                } else {

                    double radius, answer;
                    radius = Double.parseDouble(coneBaseAreaRET.getText().toString());
                    if (radius <= 0) {
                        coneBaseAreaAnswerTV.setText("The variable r should be positive");
                    }
                    answer = Math.PI * (radius * radius);
                    coneBaseAreaAnswerTV.setText(String.format("%.02f", answer));
                }

            }

        });


        //Lateral Surface
        coneLateralSurfaceRET = (EditText) findViewById(R.id.cone_lateral_surface_r_et);
        coneLateralSurfaceHET = (EditText) findViewById(R.id.cone_lateral_surface_h_et);
        coneLateralSurfaceAnswerTV = (TextView) findViewById(R.id.cone_lateral_surface_calc_answer_tx);
        coneLateralSurfaceCalcButton = (Button) findViewById(R.id.cone_lateral_surface_calc_button);
        coneLateralSurfaceCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(coneLateralSurfaceRET)) {
                    coneLateralSurfaceRET.setError("Enter Radius");
                } else if (Model.isEmpty(coneLateralSurfaceHET)) {
                    coneLateralSurfaceHET.setError("Enter Height");
                } else {

                    double radius, height, answer;
                    radius = Double.parseDouble(coneLateralSurfaceRET.getText().toString());
                    height = Double.parseDouble(coneLateralSurfaceHET.getText().toString());

                    if (radius <= 0) {
                        coneLateralSurfaceAnswerTV.setText("The variable r should be positive");
                    } else if (height <= 0) {
                        coneLateralSurfaceAnswerTV.setText("The variable h should be positive");
                    } else {
                        answer = Math.PI * radius *
                                (Math.sqrt((height * height) + (radius * radius)));
                        coneLateralSurfaceAnswerTV.setText(String.format("%.02f", answer));
                    }
                }

            }
        });

    }

}
