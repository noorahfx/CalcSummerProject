package calcpa.calcsummerproject.Geometry.Cuboid;

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

public class Cuboid extends AppCompatActivity {
    MathView cuboidVolumeFormula;
    String volumeFormula ="$$A=\\pi r^{2}$$";

    MathView cuboidAreaFormula;
    String areaFormula ="$$d =2r$$";


    //Volume
    EditText cuboidVolumeLET;
    EditText cuboidVolumeWET;
    EditText cuboidVolumeHET;
    TextView cuboidVolumeAnswerTV;
    Button cuboidVolumeCalcButton;
    Button cuboidVolumeClearButton;



    //Area

    EditText cuboidAreaLET;
    EditText cuboidAreaWET;
    EditText cuboidAreaHET;
    TextView cuboidAreaAnswerTV;
    Button cuboidAreaCalcButton;
    Button CuboidAreaCalcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuboid);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cuboidVolumeFormula =(MathView)findViewById(R.id.cuboid_volume_formula);
        assert cuboidVolumeFormula != null;
        cuboidVolumeFormula.setText(volumeFormula);

        cuboidAreaFormula =(MathView)findViewById(R.id.cuboid_area_formula);
        assert cuboidAreaFormula != null;
        cuboidAreaFormula.setText(areaFormula);



        // Volume Clear button
        cuboidVolumeClearButton = (Button) findViewById(R.id.cuboid_volume_clear_button);
        cuboidVolumeClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuboidVolumeLET.setText("");
                cuboidVolumeWET.setText("");
                cuboidVolumeHET.setText("");
                cuboidVolumeAnswerTV.setText("");
            }
        });
        // Area Clear button
        CuboidAreaCalcButton = (Button) findViewById(R.id.cuboid_area_clear_button);
        CuboidAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuboidAreaLET.setText("");
                cuboidAreaWET.setText("");
                cuboidAreaHET.setText("");
                cuboidAreaAnswerTV.setText("");
            }
        });



        //Volume
        cuboidVolumeLET = (EditText) findViewById(R.id.cuboid_volume_l_et);
        cuboidVolumeWET = (EditText) findViewById(R.id.cuboid_volume_w_et);
        cuboidVolumeHET = (EditText) findViewById(R.id.cuboid_volume_h_et);
        cuboidVolumeAnswerTV = (TextView) findViewById(R.id.cuboid_volume_calc_answer_tx);
        cuboidVolumeCalcButton = (Button) findViewById(R.id.cuboid_volume_calc_button);
        cuboidVolumeCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(cuboidVolumeLET)) {
                    cuboidVolumeLET.setError("Enter Length");
                } else if (Model.isEmpty(cuboidVolumeWET)) {
                    cuboidVolumeWET.setError("Enter Width");
                } else if (Model.isEmpty(cuboidVolumeHET)) {
                    cuboidVolumeHET.setError("Enter Height");
                } else {
                    double length, width, height, cuboidVolume;
                    length = Double.parseDouble(cuboidVolumeLET.getText().toString());
                    width = Double.parseDouble(cuboidVolumeWET.getText().toString());
                    height = Double.parseDouble(cuboidVolumeHET.getText().toString());
                    if (length <= 0) {
                        cuboidVolumeAnswerTV.setText("The variable l should be positive");
                    } else if (width <= 0) {
                        cuboidVolumeAnswerTV.setText("The variable w should be positive");
                    } else if (height <= 0) {
                        cuboidVolumeAnswerTV.setText("The variable w should be positive");
                    } else {
                        cuboidVolume = length * width * height;
                        cuboidVolumeAnswerTV.setText(String.format("%.02f", cuboidVolume));
                    }
                }
            }
        });

        //Area

        cuboidAreaLET = (EditText) findViewById(R.id.cuboid_area_l_et);
        cuboidAreaWET = (EditText) findViewById(R.id.cuboid_area_w_et);
        cuboidAreaHET = (EditText) findViewById(R.id.cuboid_area_h_et);
        cuboidAreaAnswerTV = (TextView) findViewById(R.id.cuboid_area_calc_answer_tx);
        cuboidAreaCalcButton = (Button) findViewById(R.id.cuboid_area_calc_button);
        cuboidAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(cuboidAreaLET)) {
                    cuboidAreaLET.setError("Enter Radius");
                } else if (Model.isEmpty(cuboidAreaWET)) {
                    cuboidAreaWET.setError("Enter Height");
                } else if (Model.isEmpty(cuboidAreaHET)) {
                    cuboidAreaHET.setError("Enter Radius");
                } else {
                    double length, width, height, cuboidArea;
                    length = Double.parseDouble(cuboidAreaLET.getText().toString());
                    width = Double.parseDouble(cuboidAreaWET.getText().toString());
                    height = Double.parseDouble(cuboidAreaHET.getText().toString());
                    if (length <= 0) {
                        cuboidAreaAnswerTV.setText("The variable l should be positive");
                    } else if (width <= 0) {
                        cuboidAreaAnswerTV.setText("The variable w should be positive");
                    } else if (height <= 0) {
                        cuboidAreaAnswerTV.setText("The variable w should be positive");
                    } else {
                        cuboidArea = 2 * ((length * width) + (width * height) + (height * length));
                        cuboidAreaAnswerTV.setText(String.format("%.02f", cuboidArea));
                    }
                }
            }
        });





        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),  "OptimusPrinceps.ttf");
        TextView myTextView = (TextView) findViewById(R.id.cuboid_volume_text);
        myTextView.setTypeface(myTypeFace);



        myTextView = (TextView) findViewById(R.id.cuboid_volume_l_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cuboid_volume_w_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cuboid_volume_h_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cuboid_area_l_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cuboid_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cuboid_area_w_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cuboid_area_h_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);


        cuboidVolumeLET.setTypeface(myTypeFace);
        cuboidVolumeWET.setTypeface(myTypeFace);
        cuboidVolumeHET.setTypeface(myTypeFace);
        cuboidVolumeAnswerTV.setTypeface(myTypeFace);
        cuboidVolumeCalcButton.setTypeface(myTypeFace);
        cuboidVolumeClearButton.setTypeface(myTypeFace);

        cuboidAreaLET.setTypeface(myTypeFace);
        cuboidAreaWET.setTypeface(myTypeFace);
        cuboidAreaHET.setTypeface(myTypeFace);
        cuboidAreaAnswerTV.setTypeface(myTypeFace);
        cuboidAreaCalcButton.setTypeface(myTypeFace);
        CuboidAreaCalcButton.setTypeface(myTypeFace);


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
