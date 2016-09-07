package calcpa.calcsummerproject.Geometry.Square;

import android.content.res.Configuration;
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
import io.github.kexanie.library.MathView;

public class Square extends AppCompatActivity {


    //Perimeter
    EditText squarePerimeterET;
    TextView squarePerimeterAnswerTV;
    Button squarePerimeterCalculateButton;
    Button squarePerimClearButton;

    //Area
    EditText squareAreaET;
    TextView squareAreaTV;
    Button squareAreaCalculateButton;
    Button squareAreaClearButton;

    //Sides
    EditText squareSideET;
    TextView squareSideTV;
    Button squareSideCalculateButton;
    Button squareSidesClearButton;


    //Diagonal
    EditText squareDiagonalET;
    TextView squareDiagonalTV;
    Button squareDiagonalCalculateButton;
    Button squareDiagonalClearButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        
        

        // Perimeter Clear button
        squarePerimClearButton = (Button) findViewById(R.id.square_perimeter_clear_button);
        squarePerimClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                squarePerimeterET.setText("");
                squarePerimeterAnswerTV.setText("");
            }
        });

        // Area Clear button
        squareAreaClearButton = (Button) findViewById(R.id.square_area_clear_button);
        squareAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                squareAreaET.setText("");
                squareAreaTV.setText("");
            }
        });

        // Sides Clear button
        squareSidesClearButton = (Button) findViewById(R.id.square_side_clear_button);
        squareSidesClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                squareSideET.setText("");
                squareSideTV.setText("");
            }
        });

        // Diagonal Clear button
        squareDiagonalClearButton = (Button) findViewById(R.id.square_diagonal_clear_button);
        squareDiagonalClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                squareDiagonalET.setText("");
                squareDiagonalTV.setText("");
            }
        });

        //Perimeter
        squarePerimeterET = (EditText) findViewById(R.id.square_perimeter_a_et);
        squarePerimeterAnswerTV = (TextView) findViewById(R.id.square_perimeter_calc_answer_tx);
        squarePerimeterCalculateButton = (Button) findViewById(R.id.square_perimeter_calc_button);
        squarePerimeterCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(squarePerimeterET)) {
                    squarePerimeterET.setError("Enter Value");
                } else {
                    double aSide, squarePerimeter;
                    aSide = Double.parseDouble(squarePerimeterET.getText().toString());
                    if (aSide <= 0) {
                        squarePerimeterAnswerTV.setText("The variable a should be positive");
                    } else {
                        squarePerimeter = 4 * aSide;
                        squarePerimeterAnswerTV.setText(String.format("%.02f", squarePerimeter));
                    }
                }
            }
        });

        //Area
        squareAreaET = (EditText) findViewById(R.id.square_area_a_et);
        squareAreaTV = (TextView) findViewById(R.id.square_calc_area_answer_tx);
        squareAreaCalculateButton = (Button) findViewById(R.id.square_area_calc_button);
        squareAreaCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(squareAreaET)) {
                    squareAreaET.setError("Enter Value");
                } else {
                    double aSide, squareArea;
                    aSide = Double.parseDouble(squareAreaET.getText().toString());
                    if (aSide <= 0) {
                        squareAreaTV.setText("The variable a should be positive");
                    } else {
                        squareArea = Math.pow(aSide, 2);
                        squareAreaTV.setText(String.format("%.02f", squareArea));
                    }
                }
            }
        });

        //Sides
        squareSideET = (EditText) findViewById(R.id.square_side_a_et);
        squareSideTV = (TextView) findViewById(R.id.square_calc_side_answer_tx);
        squareSideCalculateButton = (Button) findViewById(R.id.square_side_calc_button);
        squareSideCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(squareSideET)) {
                    squareSideET.setError("Enter Value");
                } else {
                    double perimeter, squareASide;
                    perimeter = Double.parseDouble(squareSideET.getText().toString());
                    if (perimeter <= 0) {
                        squareSideTV.setText("The variable a should be positive");
                    } else {
                        squareASide = perimeter / 4;
                        squareSideTV.setText(String.format("%.02f", squareASide));
                    }
                }
            }
        });

        //diagonal
        squareDiagonalET = (EditText) findViewById(R.id.square_diagonal_d_et);
        squareDiagonalTV = (TextView) findViewById(R.id.square_calc_diagonal_answer_tx);
        squareDiagonalCalculateButton = (Button) findViewById(R.id.square_diagonal_calc_button);
        squareDiagonalCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(squareDiagonalET)) {
                    squareDiagonalET.setError("Enter Value");
                } else {
                    double aSide, squareDiagonal;
                    aSide = Double.parseDouble(squareDiagonalET.getText().toString());
                    if (aSide <= 0) {
                        squareDiagonalTV.setText("The variable a should be positive");
                    } else {
                        squareDiagonal = Math.sqrt(2) * aSide;
                        squareDiagonalTV.setText(String.format("%.02f", squareDiagonal));
                    }
                }
            }
        });



        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");

        TextView myTextView = (TextView) findViewById(R.id.square_perimeter_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.square_perimeter_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.square_area_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.square_area_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.square_side_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.square_side_a_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.square_diagonal_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.square_diagonal_d_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);



        squarePerimeterET.setTypeface(myTypeFace);
        squarePerimeterAnswerTV.setTypeface(myTypeFace);
        squarePerimeterCalculateButton.setTypeface(myTypeFace);
        squarePerimClearButton.setTypeface(myTypeFace);

        squareAreaET.setTypeface(myTypeFace);
        squareAreaTV.setTypeface(myTypeFace);
        squareAreaCalculateButton.setTypeface(myTypeFace);
        squareAreaClearButton.setTypeface(myTypeFace);

        squareSideET.setTypeface(myTypeFace);
        squareSideTV.setTypeface(myTypeFace);
        squareSideCalculateButton.setTypeface(myTypeFace);
        squareSidesClearButton.setTypeface(myTypeFace);

        squareDiagonalET.setTypeface(myTypeFace);
        squareDiagonalTV.setTypeface(myTypeFace);
        squareDiagonalCalculateButton.setTypeface(myTypeFace);
        squareDiagonalClearButton.setTypeface(myTypeFace);

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