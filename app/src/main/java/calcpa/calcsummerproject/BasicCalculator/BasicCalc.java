package calcpa.calcsummerproject.BasicCalculator;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import calcpa.calcsummerproject.R;


public class BasicCalc extends AppCompatActivity {

    TextView display_box;

    //Number buttons IDs
    private int[] numButtons = {
            R.id.btnZero,
            R.id.btnOne,
            R.id.btnTwo,
            R.id.btnThree,
            R.id.btnFour,
            R.id.btnFive,
            R.id.btnSix,
            R.id.btnSeven,
            R.id.btnEight,
            R.id.btnNine };

    //Operator Buttons ID
    private int[] oprButtons = {
            R.id.btnPlus,
            R.id.btnMinus,
            R.id.btnDivision,
            R.id.btnMultiplication,
            // R.id.btnPlusMinus,
            R.id.btnPowerTwo,
            //R.id.btnSquareRoot
    };

    //TextView to display the output
    private TextView output;

    //represent whetehr the lastly pressed key is number or not
    private boolean lastNume;
    // Represent that current state is in error or not
    private boolean stateError;
    // If true, do not allow to add another DOT
    private boolean lastPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_calc);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.calculator);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        display_box =(TextView)findViewById(R.id.text_view);



        // Find the TextView
        this.output = display_box;

        // Find and set OnClickListener to numeric buttons
        setNumericOnClickListener();
        // Find and set OnClickListener to operator buttons, equal button and decimal point button
        setOperatorOnClickListener();

        fontResource();



    }

    private void fontResource(){

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "CaviarDreams.ttf");
        TextView myTextView = (TextView) findViewById(R.id.text_view);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.btnPowerTwo);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.btnClear);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);


        myTextView = (TextView) findViewById(R.id.btnSeven);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.btnEight);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.btnNine);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.btnDivision);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.btnFour);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.btnFive);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.btnSix);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.btnMultiplication);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.btnOne);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.btnTwo);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.btnThree);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.btnMinus);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.btnZero);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.btnPoint);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTextView = (TextView) findViewById(R.id.btnEqual);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);


        myTextView = (TextView) findViewById(R.id.btnPlus);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);


    }

    //  Find and set OnClickListener to numeric buttons.

    private void setNumericOnClickListener() {
        // Create a  OnClickListener
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Just append/set the text of clicked button
                Button button = (Button) view;
                if (stateError) {
                    // If current state is Error, replace the error message
                    output.setText(button.getText());
                    stateError = false;
                } else {
                    // If not, already there is a valid expression so append to it
                    output.append(button.getText());
                }
                // Set the flag
                lastNume = true;
            }
        };
        // Assign the listener to all the numeric buttons
        for (int id : numButtons) {
            findViewById(id).setOnClickListener(listener);
        }
    }

    // set OnClickListener to operator , equal, and decimal point buttons.

    private void setOperatorOnClickListener() {
        // Create a common OnClickListener for operators
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the current state is Error do not append the operator
                // If the last input is number only, append the operator
                if (lastNume && !stateError) {
                    Button button = (Button) view;
                    output.append(button.getText());
                    lastNume = false;
                    lastPoint = false;    // Reset the DOT flag
                }
            }
        };
        // Assign the listener to all the operator buttons
        for (int id : oprButtons) {
            findViewById(id).setOnClickListener(listener);
        }

        // Decimal point
        findViewById(R.id.btnPoint).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lastNume && !stateError && !lastPoint) {
                    output.append(".");
                    lastNume = false;
                    lastPoint = true;
                }
            }
        });
        // Clear button
        findViewById(R.id.btnClear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText("");  // Clear the screen
                // Reset all the states and flags6
                lastNume = false;
                stateError = false;
                lastPoint = false;
            }
        });
        // Equal button
        findViewById(R.id.btnEqual).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onEqual();
            }
        });
    }


     // Logic to calculate .

    private void onEqual() {
        // If the current state is error, nothing to do.
        // If the last input is a number only, solution can be found.
        if (lastNume && !stateError) {
            // Read the expression
            String txt = output.getText().toString();
            // Create an Expression (A class from exp4j library)
            Expression expression = new ExpressionBuilder(txt).build();
            try {
                // Calculate the result and display
                double result = expression.evaluate();
                output.setText(Double.toString(result));//consider changing to stringformat
                lastPoint = true; // Result contains a dot
            } catch (ArithmeticException ex) {
                // Display an error message
                output.setText("Error");
                stateError = true;
                lastNume = false;
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("display_output", display_box.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        display_box.setText(savedInstanceState.getString("display_output"));

    }
}
