package calcpa.calcsummerproject.Geometry.Cube;

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

public class CubeActivity extends AppCompatActivity {

    //Volume
    EditText cubeVolumeET;
    TextView cubeVolumeTV;
    Button cubeVolumeCalcButton;
    Button cubeVolumeClearButton;

    //Edge
    EditText cubeEdgeET;
    TextView cubeEdgeTV;
    Button cubeEdgeCalcButton;
    Button cubeEdgeClearButton;

    //Special Diagonal
    EditText cubeSpecialDiagonalET;
    TextView cubeSpecialDiagonalTV;
    Button cubeSpecialDiagonalCalcButton;
    Button cubeSpecialDiagonalClearButton;

    //Surface Area
    EditText cubeSurfaceAreaET;
    TextView cubeSurfaceAreaTV;
    Button cubeSurfaceAreaCalcButton;
    Button cubeSurfaceAreaClearButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_cube);
        // getSupportActionBar().setIcon(R.drawable.back_button_tb);
        //enable button in toolbar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        setVolumeResource();
        setEdgeResource();
        setSpecialDiagonalResource();
        setSurfaceAreaResource();
        setFontResource();


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("volume_et", cubeVolumeET.getText().toString());
        outState.putString("volume_tv", cubeVolumeTV.getText().toString());
        outState.putString("edge_et", cubeEdgeET.getText().toString());
        outState.putString("edge_tv", cubeEdgeTV.getText().toString());
        outState.putString("special_dg_et", cubeSpecialDiagonalET.getText().toString());
        outState.putString("special_dg_tv", cubeSpecialDiagonalTV.getText().toString());
        outState.putString("surface_ar_et", cubeSurfaceAreaET.getText().toString());
        outState.putString("surface_ar_tv", cubeSurfaceAreaTV.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        cubeVolumeET.setText(savedInstanceState.getString("volume_et"));
        cubeVolumeTV.setText(savedInstanceState.getString("volume_tv"));
        cubeEdgeET.setText(savedInstanceState.getString("edge_et"));
        cubeEdgeTV.setText(savedInstanceState.getString("edge_tv"));
        cubeSpecialDiagonalET.setText(savedInstanceState.getString("special_dg_et"));
        cubeSpecialDiagonalTV.setText(savedInstanceState.getString("special_dg_tv"));
        cubeSurfaceAreaET.setText(savedInstanceState.getString("surface_ar_et"));
        cubeSurfaceAreaTV.setText(savedInstanceState.getString("surface_ar_tv"));
    }


    private void setVolumeResource() {
        //Volume
        cubeVolumeET = (EditText) findViewById(R.id.cube_volume_a_et);
        cubeVolumeTV = (TextView) findViewById(R.id.cube_volume_calc_answer_tx);
        cubeVolumeCalcButton = (Button) findViewById(R.id.cube_volume_calc_button);
        cubeVolumeCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(cubeVolumeET)) {
                    cubeVolumeET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double edge, volume;
                    edge = Double.parseDouble(cubeVolumeET.getText().toString());
                    if (edge <= 0) {
                        cubeVolumeTV.setText("The variable a should be positive");
                    }
                    volume = Math.pow(edge, 3);
                    cubeVolumeTV.setText(String.format("%.02f", volume));
                }
            }
        });

        //Clear button
        cubeVolumeClearButton = (Button) findViewById(R.id.cube_volume_clear_button);
        cubeVolumeClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cubeVolumeET.setText("");
                cubeVolumeTV.setText("");
            }
        });
    }

    private void setEdgeResource() {

        //Edge
        cubeEdgeET = (EditText) findViewById(R.id.cube_edge_v_et);
        cubeEdgeTV = (TextView) findViewById(R.id.cube_edge_calc_answer_tx);
        cubeEdgeCalcButton = (Button) findViewById(R.id.cube_edge_calc_button);
        cubeEdgeCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(cubeEdgeET)) {
                    cubeEdgeET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double exp, edge;
                    exp = Double.parseDouble(cubeEdgeET.getText().toString());
                    if (exp <= 0) {
                        cubeEdgeTV.setText("The variable a should be positive");
                    }
                    edge = Math.pow(exp, 0.333333333);
                    cubeEdgeTV.setText(String.format("%.02f", edge));
                }
            }
        });


        // Edge Clear button
        cubeEdgeClearButton = (Button) findViewById(R.id.cube_edge_clear_button);
        cubeEdgeClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cubeEdgeET.setText("");
                cubeEdgeTV.setText("");
            }
        });


    }

    private void setSpecialDiagonalResource() {

        //Special Diagonal
        cubeSpecialDiagonalET = (EditText) findViewById(R.id.cube_special_diagonal_a_et);
        cubeSpecialDiagonalTV = (TextView) findViewById(R.id.cube_special_diagonal_calc_answer_tx);
        cubeSpecialDiagonalCalcButton = (Button) findViewById(R.id.cube_special_diagonal_calc_button);
        cubeSpecialDiagonalCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(cubeSpecialDiagonalET)) {
                    cubeSpecialDiagonalET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double edge, specialDiagonal;
                    edge = Double.parseDouble(cubeSpecialDiagonalET.getText().toString());
                    if (edge <= 0) {
                        cubeSpecialDiagonalTV.setText("The variable a should be positive");
                    }
                    specialDiagonal = Math.sqrt(3) * edge;
                    cubeSpecialDiagonalTV.setText(String.format("%.02f", specialDiagonal));
                }
            }
        });

        //Clear button
        cubeSpecialDiagonalClearButton = (Button)
                findViewById(R.id.cube_special_diagonal_clear_button);
        cubeSpecialDiagonalClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cubeSpecialDiagonalET.setText("");
                cubeSpecialDiagonalTV.setText("");
            }
        });
    }

    private void setSurfaceAreaResource() {
        //Surface Area
        cubeSurfaceAreaET = (EditText) findViewById(R.id.cube_surface_area_a_et);
        cubeSurfaceAreaTV = (TextView) findViewById(R.id.cube_surface_area_calc_answer_tx);
        cubeSurfaceAreaCalcButton = (Button) findViewById(R.id.cube_surface_area_calc_button);
        cubeSurfaceAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(cubeSurfaceAreaET)) {
                    cubeSurfaceAreaET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
                } else {
                    double edge, surfaceArea;
                    edge = Double.parseDouble(cubeSurfaceAreaET.getText().toString());
                    if (edge <= 0) {
                        cubeSurfaceAreaTV.setText("The variable a should be positive");
                    }
                    surfaceArea = 6 * Math.pow(edge, 2);
                    cubeSurfaceAreaTV.setText(String.format("%.02f", surfaceArea));
                }
            }
        });

        //clear Button
        cubeSurfaceAreaClearButton = (Button) findViewById(R.id.cube_surface_area_clear_button);
        cubeSurfaceAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cubeSurfaceAreaET.setText("");
                cubeSurfaceAreaTV.setText("");
            }
        });
    }

    private void setFontResource() {

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");
        TextView myTextView = (TextView) findViewById(R.id.cube_volume_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cube_volume_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cube_edge_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cube_edge_v_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cube_special_diagonal_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cube_special_diagonal_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cube_surface_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.cube_surface_area_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        cubeVolumeET.setTypeface(myTypeFace);
        cubeVolumeCalcButton.setTypeface(myTypeFace);
        cubeVolumeClearButton.setTypeface(myTypeFace);
        cubeVolumeTV.setTypeface(myTypeFace);

        cubeEdgeET.setTypeface(myTypeFace);
        cubeEdgeCalcButton.setTypeface(myTypeFace);
        cubeEdgeClearButton.setTypeface(myTypeFace);
        cubeEdgeTV.setTypeface(myTypeFace);

        cubeSpecialDiagonalET.setTypeface(myTypeFace);
        cubeSpecialDiagonalTV.setTypeface(myTypeFace);
        cubeSpecialDiagonalCalcButton.setTypeface(myTypeFace);
        cubeSpecialDiagonalClearButton.setTypeface(myTypeFace);

        cubeSurfaceAreaET.setTypeface(myTypeFace);
        cubeSurfaceAreaTV.setTypeface(myTypeFace);
        cubeSurfaceAreaCalcButton.setTypeface(myTypeFace);
        cubeSurfaceAreaClearButton.setTypeface(myTypeFace);
    }
}
