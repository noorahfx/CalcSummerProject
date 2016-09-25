package calcpa.calcsummerproject.Geometry.Square;

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

public class SquareActivity extends AppCompatActivity {


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
        getSupportActionBar().setTitle(R.string.title_activity_square);
        // getSupportActionBar().setIcon(R.drawable.back_button_tb);
        //enable button in toolbar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setPerimeterResource();
        setAreaResource();
        setSideResource();
        setDiagonalResource();
        setFontResource();


    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("perimeter_et", squarePerimeterET.getText().toString());
        outState.putString("perimeter_tv", squarePerimeterAnswerTV.getText().toString());
        outState.putString("area_et", squareAreaET.getText().toString());
        outState.putString("area_tv", squareAreaTV.getText().toString());
        outState.putString("side_et", squareSideET.getText().toString());
        outState.putString("side_tv", squareSideTV.getText().toString());
        outState.putString("diagonal_et1", squareDiagonalET.getText().toString());
        outState.putString("diagonal_tv", squareDiagonalTV.getText().toString());


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        squarePerimeterET.setText(savedInstanceState.getString("perimeter_et"));
        squarePerimeterAnswerTV.setText(savedInstanceState.getString("perimeter_tv"));
        squareAreaET.setText(savedInstanceState.getString("area_et"));
        squareAreaTV.setText(savedInstanceState.getString("area_tv"));
        squareSideET.setText(savedInstanceState.getString("side_et"));
        squareSideTV.setText(savedInstanceState.getString("side_tv"));
        squareDiagonalET.setText(savedInstanceState.getString("diagonal_et"));
        squareDiagonalTV.setText(savedInstanceState.getString("diagonal_tv"));

    }


    private void setPerimeterResource() {
        //Perimeter
        squarePerimeterET = (EditText) findViewById(R.id.square_perimeter_a_et);
        squarePerimeterAnswerTV = (TextView) findViewById(R.id.square_perimeter_calc_answer_tx);
        squarePerimeterCalculateButton = (Button) findViewById(R.id.square_perimeter_calc_button);
        squarePerimeterCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(squarePerimeterET)) {
                    squarePerimeterET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
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


        // Perimeter Clear button
        squarePerimClearButton = (Button) findViewById(R.id.square_perimeter_clear_button);
        squarePerimClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                squarePerimeterET.setText("");
                squarePerimeterAnswerTV.setText("");
            }
        });


    }

    private void setAreaResource() {
        //Area
        squareAreaET = (EditText) findViewById(R.id.square_area_a_et);
        squareAreaTV = (TextView) findViewById(R.id.square_calc_area_answer_tx);
        squareAreaCalculateButton = (Button) findViewById(R.id.square_area_calc_button);
        squareAreaCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(squareAreaET)) {
                    squareAreaET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
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

        // Area Clear button
        squareAreaClearButton = (Button) findViewById(R.id.square_area_clear_button);
        squareAreaClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                squareAreaET.setText("");
                squareAreaTV.setText("");
            }
        });


    }

    private void setSideResource() {
        //Sides
        squareSideET = (EditText) findViewById(R.id.square_side_a_et);
        squareSideTV = (TextView) findViewById(R.id.square_calc_side_answer_tx);
        squareSideCalculateButton = (Button) findViewById(R.id.square_side_calc_button);
        squareSideCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(squareSideET)) {
                    squareSideET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
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

        // Sides Clear button
        squareSidesClearButton = (Button) findViewById(R.id.square_side_clear_button);
        squareSidesClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                squareSideET.setText("");
                squareSideTV.setText("");
            }
        });


    }

    private void setDiagonalResource() {
        //diagonal
        squareDiagonalET = (EditText) findViewById(R.id.square_diagonal_d_et);
        squareDiagonalTV = (TextView) findViewById(R.id.square_calc_diagonal_answer_tx);
        squareDiagonalCalculateButton = (Button) findViewById(R.id.square_diagonal_calc_button);
        squareDiagonalCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check to make sure field is not empty
                if (Model.isEmpty(squareDiagonalET)) {
                    squareDiagonalET.setError(Html.fromHtml ("<font color='red'>Enter value</font>"));
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


        // Diagonal Clear button
        squareDiagonalClearButton = (Button) findViewById(R.id.square_diagonal_clear_button);
        squareDiagonalClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                squareDiagonalET.setText("");
                squareDiagonalTV.setText("");
            }
        });


    }

    private void setFontResource() {
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



}