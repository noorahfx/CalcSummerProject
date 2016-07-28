package calcpa.calcsummerproject.Geometry.Cube;

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

public class Cube extends AppCompatActivity {

    //Volume
    EditText cubeVolumeET;
    TextView cubeVolumeTV;
    Button cubeVolumeCalcButton;


    //Edge
    EditText cubeEdgeET;
    TextView cubeEdgeTV;
    Button cubeEdgeCalcButton;


    //Special Diagonal

    EditText cubeSpecialDiagonalET;
    TextView cubeSpecialDiagonalTV;
    Button cubeSpecialDiagonalCalcButton;

    //Surface Area
    EditText cubeSurfaceAreaET;
    TextView cubeSurfaceAreaTV;
    Button cubeSurfaceAreaCalcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Volume
        cubeVolumeET = (EditText) findViewById(R.id.cube_volume_a_et);
        cubeVolumeTV = (TextView) findViewById(R.id.cube_volume_calc_answer_tx);
        cubeVolumeCalcButton = (Button) findViewById(R.id.cube_volume_calc_button);
        cubeVolumeCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(cubeVolumeET)) {
                    cubeVolumeET.setError("Enter value");
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


        //Edge
        cubeEdgeET = (EditText) findViewById(R.id.cube_edge_v_et);
        cubeEdgeTV = (TextView) findViewById(R.id.cube_edge_calc_answer_tx);
        cubeEdgeCalcButton = (Button) findViewById(R.id.cube_edge_calc_button);
        cubeEdgeCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(cubeEdgeET)) {
                    cubeEdgeET.setError("Enter value");
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

        //Special Diagonal

        cubeSpecialDiagonalET = (EditText) findViewById(R.id.cube_special_diagonal_a_et);
        cubeSpecialDiagonalTV = (TextView) findViewById(R.id.cube_special_diagonal_calc_answer_tx);
        cubeSpecialDiagonalCalcButton = (Button) findViewById(R.id.cube_special_diagonal_calc_button);
        cubeSpecialDiagonalCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check to make sure field is not empty
                if (Model.isEmpty(cubeSpecialDiagonalET)) {
                    cubeSpecialDiagonalET.setError("Enter Volume");
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

        //Surface Area
        cubeSurfaceAreaET = (EditText) findViewById(R.id.cube_surface_area_a_et);
        cubeSurfaceAreaTV = (TextView) findViewById(R.id.cube_surface_area_calc_answer_tx);
        cubeSurfaceAreaCalcButton = (Button) findViewById(R.id.cube_surface_area_calc_button);
        cubeSurfaceAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(cubeSurfaceAreaET)) {
                    cubeSurfaceAreaET.setError("Enter Value");
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


    }

}
