package calcpa.calcsummerproject.Geometry.Cuboid;

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

public class Cuboid extends AppCompatActivity {


    //Volume
    EditText cuboidVolumeLET;
    EditText cuboidVolumeWET;
    EditText cuboidVolumeHET;
    TextView cuboidVolumeAnswerTV;
    Button cuboidVolumeCalcButton;


    //Area

    EditText cuboidAreaLET;
    EditText cuboidAreaWET;
    EditText cuboidAreaHET;
    TextView cuboidAreaAnswerTV;
    Button cuboidAreaCalcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuboid);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Volume
        cuboidVolumeLET = (EditText) findViewById(R.id.cuboid_volume_l_et);
        cuboidVolumeWET = (EditText) findViewById(R.id.cuboid_volume_w_et);
        cuboidVolumeHET = (EditText) findViewById(R.id.cuboid_volume_h_et);
        cuboidVolumeAnswerTV = (TextView) findViewById(R.id.cuboid_volume_calc_answer_tx);
        cuboidVolumeCalcButton = (Button) findViewById(R.id.cuboid_volume_calc_button);
        cuboidVolumeCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String length = cuboidVolumeLET.getText().toString();
                String weight = cuboidVolumeWET.getText().toString();
                String height = cuboidVolumeHET.getText().toString();



                double volume = 6 * Double.parseDouble(height);
                cuboidVolumeAnswerTV.setText(String.format("%.02f", volume));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Area

        cuboidAreaLET = (EditText) findViewById(R.id.cuboid_area_l_et);
        cuboidAreaWET = (EditText) findViewById(R.id.cuboid_area_l_et);
        cuboidAreaHET = (EditText) findViewById(R.id.cuboid_area_l_et);
        cuboidAreaAnswerTV = (TextView) findViewById(R.id.cuboid_area_calc_answer_tx);
        cuboidAreaCalcButton = (Button) findViewById(R.id.cuboid_area_calc_button);
        cuboidAreaCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * work on functionality
                 * formula is not integrated yet
                 */
                String length = cuboidAreaLET.getText().toString();
                String weight = cuboidAreaWET.getText().toString();
                String height = cuboidAreaHET.getText().toString();



                double area = 6 * Double.parseDouble(height);
                cuboidAreaAnswerTV.setText(String.format("%.02f", area));

                if (TextUtils.isEmpty(height)) {
                    Toast.makeText(getApplicationContext(),
                            "Enter height", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
