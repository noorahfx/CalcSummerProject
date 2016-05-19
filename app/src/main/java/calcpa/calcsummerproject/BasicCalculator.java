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

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BasicCalculator extends AppCompatActivity {

    String operation = "";
    double num1;
    double num2;
    double result;

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
    private Button minusButton;
    private Button timesButton;
    private Button divideButton;
    private Button clearButton;
    private Button plusMinusButton;
    private Button squareButton;
    private Button squareRootButton;
   // private TextView output;



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

        nZeroButton = (Button)findViewById(R.id.zero);
        nOneButton = (Button)findViewById(R.id.one);
        nTwoButton = (Button)findViewById(R.id.two);
        nThreeButton = (Button)findViewById(R.id.three);
        nFourButton = (Button)findViewById(R.id.four);
        nFiveButton = (Button)findViewById(R.id.five);
        nSixButton = (Button)findViewById(R.id.six);
        nSevenButton = (Button)findViewById(R.id.seven);
        nEightButton = (Button)findViewById(R.id.eight);
        nNineButton = (Button)findViewById(R.id.nine);

        pointButton = (Button)findViewById(R.id.point);
        equalButton = (Button)findViewById(R.id.equal);
        plusButton = (Button)findViewById(R.id.plus);
        minusButton = (Button)findViewById(R.id.minus);
        timesButton = (Button)findViewById(R.id.multiplication);
        divideButton = (Button)findViewById(R.id.division);
        clearButton = (Button)findViewById(R.id.clear);
        plusMinusButton = (Button)findViewById(R.id.plusMinus);
        squareButton = (Button)findViewById(R.id.powerTwo);
        squareRootButton = (Button)findViewById(R.id.squareRoot);

        final TextView textView = (TextView)findViewById(R.id.text_view);

        nZeroButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                //do nothing for now
                textView.append("0");
            }
        });

        nOneButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                //do nothing for now
                textView.append("1");
            }
        });

        nTwoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                textView.append("2");
            }
        });

        nThreeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                textView.append("3");
            }
        });

        nFourButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textView.append("4");
            }
        });

        nFiveButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick (View view) {
                textView.append("5");
            }
        });

        nSixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("6");
            }
        });

        nSevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                textView.append("7");
            }
        });

        nEightButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                textView.append("8");
            }
        });

        nNineButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //do nothing for now
                textView.append("9");

            }
        });

        pointButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView.append(".");
            }
        });



        plusButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                TextView output = (TextView)findViewById(R.id.text_view);
                output.setText("+");
                operation="+";
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView output = (TextView)findViewById(R.id.text_view);
                output.setText("-");
                operation = "-";
            }
        });

        timesButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                TextView output = (TextView)findViewById(R.id.text_view);
                output.setText("*");
                operation = "*";
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                TextView output = (TextView)findViewById(R.id.text_view);
                output.setText("/");
                operation = "/";
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick (View view) {
                textView.setText("C");
            }
        });

        plusMinusButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textView.setText("+/-");
            }
        });

        squareButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                TextView output = (TextView)findViewById(R.id.text_view);
                output.setText("^");
                operation ="^";
            }
        });

        squareRootButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                TextView output = (TextView)findViewById(R.id.text_view);
                output.setText("√");
                operation = "√";
            }
        });

        equalButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //  textView.append("=");
                TextView output = (TextView)findViewById(R.id.text_view);
                num1 = Double.parseDouble(output.getText().toString());
                num2 = Double.parseDouble(output.getText().toString());
                if (operation.equals("+")) {
                    result = num1+num2;
                    output.setText(Double.toString(result));
                }
                else if (operation.equals("-")) {
                    result = num1 - num2;
                    output.setText(Double.toString(result));
                }
                else if (operation.equals("*")){
                    result = num1*num2;
                    output.setText(Double.toString(result));
                }
                else if (operation.equals("/")) {
                    if(num1 == 0){
                        output.setText("∞");
                    }
                    else if (num2 != 0) {
                        output.setText("0");
                    } else {
                        result = num2 / num1;
                        output.setText(Double.toString(result));
                    }
                }
                else if (operation.equals("^")){
                    result = num1*num1;
                    output.setText(Double.toString(result));
                }
                else if (operation.equals("√")) {
                    result = num1;
                    output.setText(Double.toString(result));
                }
                operation ="";
            }
        });

    }



    }

