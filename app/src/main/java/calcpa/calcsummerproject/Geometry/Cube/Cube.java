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

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String area = cubeVolumeET.getText().toString();


                double volume = 6 * Double.parseDouble(area);
                cubeVolumeTV.setText(String.format("%.02f", volume));

                if (TextUtils.isEmpty(area)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
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

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String area = cubeEdgeET.getText().toString();


                double edge = 6 * Double.parseDouble(area);
                cubeEdgeTV.setText(String.format("%.02f", edge));

                if (TextUtils.isEmpty(area)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
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

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String area = cubeSpecialDiagonalET.getText().toString();


                double diagonal = 6 * Double.parseDouble(area);
                cubeSpecialDiagonalTV.setText(String.format("%.02f", diagonal));

                if (TextUtils.isEmpty(area)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
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

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String area = cubeSurfaceAreaET.getText().toString();


                double surfaceArea = 6 * Double.parseDouble(area);
                cubeSurfaceAreaTV.setText(String.format("%.02f", surfaceArea));

                if (TextUtils.isEmpty(area)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}
