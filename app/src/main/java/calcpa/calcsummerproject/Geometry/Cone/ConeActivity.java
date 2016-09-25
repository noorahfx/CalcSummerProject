package calcpa.calcsummerproject.Geometry.Cone;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import calcpa.calcsummerproject.Model;
import calcpa.calcsummerproject.R;

public class ConeActivity extends AppCompatActivity {

    //Volume
    EditText coneVolumeRET;
    EditText coneVolumeHET;
    TextView coneVolumeAnswerTV;
    Button coneVolumeCalcButton;
    Button coneVOlumeClearButton;

    //Radius
    EditText coneRadiusHET;
    EditText coneRadiusVET;
    TextView coneRadiusAnswerTV;
    Button coneRadiusCalcButton;
    Button coneRadiusClearButton;

    //Height
    EditText coneHeightRET;
    EditText coneHeightVET;
    TextView coneHeightAnswerTV;
    Button coneHeightCalcButton;
    Button coneHeightClearButton;


    //Slant height
    EditText coneSlantHeightRET;
    EditText coneSLantHeightHET;
    TextView coneSlantHeightAnswerTV;
    Button coneSlantHeightCalcButton;
    Button coneSlantHeightClearButton;


    //Surface Area
    EditText coneSurfaceAreatRET;
    EditText coneSurfaceAreaHET;
    TextView coneSurfaceAreaAnswerTV;
    Button coneSurfaceAreaCalcButton;
    Button coneSurfaceAreaClearButton;


    //Base
    EditText coneBaseAreaRET;
    TextView coneBaseAreaAnswerTV;
    Button coneBaseAreaCalcButton;
    Button coneBaseClearButton;


    //Lateral Surface
    EditText coneLateralSurfaceRET;
    EditText coneLateralSurfaceHET;
    TextView coneLateralSurfaceAnswerTV;
    Button coneLateralSurfaceCalcButton;
    Button coneLateralSurfaceClearButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_cone);
        // getSupportActionBar().setIcon(R.drawable.back_button_tb);
        //enable button in toolbar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        setVolumeResource();
        setRadiusResource();
        setHeightResource();
        setSlantHeighResource();
        setSurfaceAreaResource();
        setBaseAreaResource();
        setLateralSurfaceResource();
        setFontResource();



    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("volume_et1", coneVolumeRET.getText().toString());
        outState.putString("volume_et2", coneVolumeHET.getText().toString());
        outState.putString("volume_tv", coneVolumeAnswerTV.getText().toString());
        outState.putString("radius_et1", coneRadiusHET.getText().toString());
        outState.putString("radius_et2", coneRadiusVET.getText().toString());
        outState.putString("radius_tv", coneRadiusAnswerTV.getText().toString());
        outState.putString("height_et1", coneHeightRET.getText().toString());
        outState.putString("height_et2", coneHeightVET.getText().toString());
        outState.putString("height_tv", coneHeightAnswerTV.getText().toString());
        outState.putString("slant_height_et1", coneSlantHeightRET.getText().toString());
        outState.putString("slant_height_et2", coneSLantHeightHET.getText().toString());
        outState.putString("slant_height_tv", coneSlantHeightAnswerTV.getText().toString());
        outState.putString("surface_area_et1", coneSurfaceAreatRET.getText().toString());
        outState.putString("surface_area_et2", coneSurfaceAreaHET.getText().toString());
        outState.putString("surface_area_tv", coneSurfaceAreaAnswerTV.getText().toString());
        outState.putString("base_area_et1", coneBaseAreaRET.getText().toString());
        outState.putString("base_tv", coneBaseAreaAnswerTV.getText().toString());
        outState.putString("lateral_surface_et1", coneLateralSurfaceRET.getText().toString());
        outState.putString("lateral_surface_et2", coneLateralSurfaceHET.getText().toString());
        outState.putString("lateral_surface_tv", coneLateralSurfaceAnswerTV.getText().toString());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        coneVolumeRET.setText(savedInstanceState.getString("volume_et1"));
        coneVolumeHET.setText(savedInstanceState.getString("volume_et2"));
        coneVolumeAnswerTV.setText(savedInstanceState.getString("volume_tv"));
        coneRadiusHET.setText(savedInstanceState.getString("radius_et1"));
        coneRadiusVET.setText(savedInstanceState.getString("radius_et2"));
        coneRadiusAnswerTV.setText(savedInstanceState.getString("radius_tv"));
        coneHeightRET.setText(savedInstanceState.getString("height_et1"));
        coneHeightVET.setText(savedInstanceState.getString("height_et2"));
        coneHeightAnswerTV.setText(savedInstanceState.getString("height_tv"));
        coneSlantHeightRET.setText(savedInstanceState.getString("slant_height_et1"));
        coneSLantHeightHET.setText(savedInstanceState.getString("slant_height_et2"));
        coneSlantHeightAnswerTV.setText(savedInstanceState.getString("slant_height_tv"));
        coneSurfaceAreatRET.setText(savedInstanceState.getString("surface_area_et1"));
        coneSurfaceAreaHET.setText(savedInstanceState.getString("surface_area_et2"));
        coneSurfaceAreaAnswerTV.setText(savedInstanceState.getString("surface_area_tv"));
        coneBaseAreaRET.setText(savedInstanceState.getString("base_area_et1"));
        coneBaseAreaAnswerTV.setText(savedInstanceState.getString("base_tv"));
        coneLateralSurfaceRET.setText(savedInstanceState.getString("lateral_surface_et1"));
        coneLateralSurfaceHET.setText(savedInstanceState.getString("lateral_surface_et2"));
        coneLateralSurfaceAnswerTV.setText(savedInstanceState.getString("lateral_surface_tv"));

    }



    private void setVolumeResource() {
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
                    coneVolumeRET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else if (Model.isEmpty(coneVolumeHET)) {
                    coneVolumeHET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
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

        //Clear button
        coneVOlumeClearButton = (Button) findViewById(R.id.cone_volume_clear_button);
        coneVOlumeClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coneVolumeRET.setText("");
                coneVolumeHET.setText("");
                coneVolumeAnswerTV.setText("");
            }
        });
    }

    private void setRadiusResource() {
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
                    coneRadiusHET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else if (Model.isEmpty(coneRadiusVET)) {
                    coneRadiusVET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
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
        //  Clear button
        coneRadiusClearButton = (Button) findViewById(R.id.cone_radius_clear_button);
        coneRadiusClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coneRadiusHET.setText("");
                coneRadiusVET.setText("");
                coneRadiusAnswerTV.setText("");
            }
        });
    }

    private void setHeightResource() {
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
                    coneHeightRET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else if (Model.isEmpty(coneHeightVET)) {
                    coneHeightVET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
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

        //Clear button
        coneHeightClearButton = (Button) findViewById(R.id.cone_height_clear_button);
        coneHeightClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coneHeightRET.setText("");
                coneHeightVET.setText("");
                coneHeightAnswerTV.setText("");
            }
        });

    }

    private void setSlantHeighResource() {
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
                    coneSlantHeightRET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else if (Model.isEmpty(coneSLantHeightHET)) {
                    coneSLantHeightHET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
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

        // Clear button
        coneSlantHeightClearButton = (Button) findViewById(R.id.cone_slant_height_clear_button);
        coneSlantHeightClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coneSlantHeightRET.setText("");
                coneSLantHeightHET.setText("");
                coneSlantHeightAnswerTV.setText("");
            }
        });
    }

    private void setSurfaceAreaResource() {
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
                    coneSurfaceAreatRET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else if (Model.isEmpty(coneSurfaceAreaHET)) {
                    coneSurfaceAreaHET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
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
        // Surface Area Clear button
        coneSurfaceAreaClearButton = (Button) findViewById(R.id.cone_surface_area_clear_button);
        coneSurfaceAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coneSurfaceAreatRET.setText("");
                coneSurfaceAreaHET.setText("");
                coneSurfaceAreaAnswerTV.setText("");
            }
        });
    }

    private void setBaseAreaResource() {
        //Base Area
        coneBaseAreaRET = (EditText) findViewById(R.id.cone_base_area_r_et);
        coneBaseAreaAnswerTV = (TextView) findViewById(R.id.cone_base_area_calc_answer_tx);
        coneBaseAreaCalcButton = (Button) findViewById(R.id.cone_base_area_calc_button);
        coneBaseAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(coneBaseAreaRET)) {
                    coneBaseAreaRET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
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

        // Base Area Clear button
        coneBaseClearButton = (Button) findViewById(R.id.cone_base_area_clear_button);
        coneBaseClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coneBaseAreaRET.setText("");
                coneBaseAreaAnswerTV.setText("");
            }
        });
    }

    private void setLateralSurfaceResource() {
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
                    coneLateralSurfaceRET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else if (Model.isEmpty(coneLateralSurfaceHET)) {
                    coneLateralSurfaceHET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
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

        //Clear button
        coneLateralSurfaceClearButton = (Button) findViewById(R.id.cone_lateral_surface_clear_button);
        coneLateralSurfaceClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coneLateralSurfaceRET.setText("");
                coneLateralSurfaceHET.setText("");
                coneLateralSurfaceAnswerTV.setText("");
            }
        });
    }

    private void setFontResource() {
        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");
        TextView myTextView = (TextView) findViewById(R.id.cone_volume_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cone_volume_r_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cone_volume_h_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cone_radius_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cone_radius_h_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cone_radius_v_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cone_height_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cone_height_r_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cone_height_v_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cone_slant_height_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cone_slant_height_r_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cone_slant_height_h_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cone_surface_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cone_surface_area_r_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cone_surface_area_h_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cone_base_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cone_base_area_r_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cone_lateral_surface_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cone_lateral_surface_r_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cone_lateral_surface_h_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        coneVolumeRET.setTypeface(myTypeFace);
        coneVolumeHET.setTypeface(myTypeFace);
        coneVolumeCalcButton.setTypeface(myTypeFace);
        coneVolumeAnswerTV.setTypeface(myTypeFace);
        coneVOlumeClearButton.setTypeface(myTypeFace);

        coneRadiusHET.setTypeface(myTypeFace);
        coneRadiusVET.setTypeface(myTypeFace);
        coneRadiusCalcButton.setTypeface(myTypeFace);
        coneRadiusClearButton.setTypeface(myTypeFace);
        coneRadiusAnswerTV.setTypeface(myTypeFace);

        coneHeightVET.setTypeface(myTypeFace);
        coneHeightRET.setTypeface(myTypeFace);
        coneHeightCalcButton.setTypeface(myTypeFace);
        coneHeightClearButton.setTypeface(myTypeFace);
        coneHeightAnswerTV.setTypeface(myTypeFace);

        coneSLantHeightHET.setTypeface(myTypeFace);
        coneSlantHeightRET.setTypeface(myTypeFace);
        coneSlantHeightCalcButton.setTypeface(myTypeFace);
        coneSlantHeightClearButton.setTypeface(myTypeFace);
        coneSlantHeightAnswerTV.setTypeface(myTypeFace);

        coneSurfaceAreaHET.setTypeface(myTypeFace);
        coneSurfaceAreatRET.setTypeface(myTypeFace);
        coneSurfaceAreaCalcButton.setTypeface(myTypeFace);
        coneSurfaceAreaClearButton.setTypeface(myTypeFace);
        coneSurfaceAreaAnswerTV.setTypeface(myTypeFace);

        coneBaseAreaRET.setTypeface(myTypeFace);
        coneBaseAreaCalcButton.setTypeface(myTypeFace);
        coneBaseAreaAnswerTV.setTypeface(myTypeFace);
        coneBaseClearButton.setTypeface(myTypeFace);

        coneLateralSurfaceRET.setTypeface(myTypeFace);
        coneLateralSurfaceHET.setTypeface(myTypeFace);
        coneLateralSurfaceCalcButton.setTypeface(myTypeFace);
        coneLateralSurfaceAnswerTV.setTypeface(myTypeFace);
        coneLateralSurfaceClearButton.setTypeface(myTypeFace);
    }


}
