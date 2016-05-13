package calcpa.calcsummerproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BasicCalculator extends AppCompatActivity {

    char operator = 'q';
    String str = "";
    int num;
    int numtemp;
    EditText output;

    private Button nZeroButton;
    private Button nOneButton;
    private Button nTwoButton;
    private Button nThreeButton;
    private Button nFourButton;
    private Button nFiveButton;
    private Button nSixButton;
    private Button nSevenButton;
    private Button nEightButton;
    private Button nNineButton;

    private Button pointButton;
    private Button equalButton;
    private Button plusButton;
    private Button minuButton;
    private Button timesButton;
    private Button divideButton;
    private Button clearButton;
    private Button plusMinusButton;
    private Button powerButton;
    private Button squareRootButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TextView textView =(TextView)findViewById(R.id.text_view);

        nZeroButton = (Button)findViewById(R.id.zero);
        nOneButton = (Button)findViewById(R.id.one);
        nTwoButton = (Button)findViewById(R.id.two);
        nThreeButton = (Button)findViewById(R.id.three);
        nFourButton = (Button)findViewById(R.id.four);
        nFiveButton = (Button)findViewById(R.id.five);
        nSixButton = (Button)findViewById(R.id.six);
        nSevenButton = (Button)findViewById(R.id.seven);
        nEightButton = (Button)findViewById(R.id.eight);
        nNineButton =(Button)findViewById(R.id.nine);

        pointButton = (Button)findViewById(R.id.point);
        equalButton = (Button)findViewById(R.id.equal);
        plusButton = (Button)findViewById(R.id.plusMinus);
        minuButton = (Button)findViewById(R.id.minus);
        timesButton = (Button)findViewById(R.id.multiplication);
        divideButton = (Button)findViewById(R.id.division);
        clearButton = (Button)findViewById(R.id.clear);
        plusMinusButton = (Button)findViewById(R.id.plusMinus);
        powerButton = (Button)findViewById(R.id.powerTwo);
        squareRootButton = (Button)findViewById(R.id.squareRoot);

         output = (EditText)findViewById(R.id.text_view);


        nZeroButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                insert(0);
            }
        });

        nOneButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //ouput 1 when 1 pressed
                insert(1);
            }
        });

        nTwoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // display 2 when pressed
               // EditText output = (EditText)findViewById(R.id.text_view);
                insert(2);
            }
        });

        nThreeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //display 3 when pressed
               // EditText output = (EditText)findViewById(R.id.text_view);
                insert(3);
            }
        });

        nFourButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //display 4 when pressed
              //  EditText output = (EditText)findViewById(R.id.text_view);
                insert(4);
            }
        });

        nFiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //display 5 when pressed
              //  EditText output = (EditText)findViewById(R.id.text_view);
                insert(5);
            }
        });

        nSixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //display six when pressed
              //  EditText output = (EditText)findViewById(R.id.text_view);
                insert(6);
            }
        });

        nSevenButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                ///display seven when pressed
             //   EditText output = (EditText)findViewById(R.id.text_view);
                insert(7);
            }
        });

        nEightButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //display 8 when pressed
               // EditText output = (EditText)findViewById(R.id.text_view);
                insert(8);
            }
        });

        nNineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //display nine when pressed
              //  EditText output = (EditText)findViewById(R.id.text_view);
                insert(9);
            }
        });

        pointButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                output.append(".");
            }
        });

        equalButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //do nothing for now
                calculate();
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //display + when pressed and do addition
                //   EditText output = (EditText)findViewById(R.id.text_view);
                output.setText("+");
                perform();
                operator = '+';
            }
        });

        minuButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                output.setText("-");
                perform();
                operator = '-';
            }
        });

        timesButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                output.setText("*");
                perform();
                operator ='*';
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                output.setText("/");
                perform();
                operator ='/';

            }
        });

        clearButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                reset();
            }
        });

        plusMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick (View view) {
                //do nothing for now
            }
        });

        powerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do nothing for now
            }
        });

        squareRootButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //do nothing for now
            }
        });







    }

    private void insert (int k) {
        str = str + Integer.toString(k);
        num = Integer.valueOf(str).intValue();
        output.setText(str);
    }

    private void perform() {
        str = "";
        numtemp = num;
    }

    private void reset(){
        str = "";
        operator ='q';
        num = 0;
        numtemp = 0;
        output.setText("");
    }

    private void calculate () {
        String first = String.valueOf(numtemp);
        String second = String.valueOf(num);
        if (operator == '+') {

            num = numtemp + num;
        }
        else if (operator == '-') {
            num = numtemp - num;
        }
        else if (operator == '*') {
            num = numtemp * num;
        }
        else if (operator == '/') {
            num = numtemp / num;
        }

        output.setText(first + operator + second + "="+num);


    }



}
