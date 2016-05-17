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


    char operator;
    String str = "";
    double num1;
    double num2;
    double result;
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
    NumberFormat format = new DecimalFormat("0.#");


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


        nZeroButton = (Button) findViewById(R.id.zero);
        nOneButton = (Button) findViewById(R.id.one);
        nTwoButton = (Button) findViewById(R.id.two);
        nThreeButton = (Button) findViewById(R.id.three);
        nFourButton = (Button) findViewById(R.id.four);
        nFiveButton = (Button) findViewById(R.id.five);
        nSixButton = (Button) findViewById(R.id.six);
        nSevenButton = (Button) findViewById(R.id.seven);
        nEightButton = (Button) findViewById(R.id.eight);
        nNineButton = (Button) findViewById(R.id.nine);

        pointButton = (Button) findViewById(R.id.point);
        equalButton = (Button) findViewById(R.id.equal);
        plusButton = (Button) findViewById(R.id.plus);
        minuButton = (Button) findViewById(R.id.minus);
        timesButton = (Button) findViewById(R.id.multiplication);
        divideButton = (Button) findViewById(R.id.division);
        clearButton = (Button) findViewById(R.id.clear);
        plusMinusButton = (Button) findViewById(R.id.plusMinus);
        powerButton = (Button) findViewById(R.id.powerTwo);
        squareRootButton = (Button) findViewById(R.id.squareRoot);

        output = (EditText) findViewById(R.id.text_view);


        nZeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insert(0);
            }
        });

        nOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insert(1);
            }
        });

        nTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insert(2);
            }
        });

        nThreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insert(3);
            }
        });

        nFourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insert(4);
            }
        });

        nFiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insert(5);
            }
        });

        nSixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insert(6);
            }
        });

        nSevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insert(7);
            }
        });

        nEightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insert(8);
            }
        });

        nNineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insert(9);
            }
        });

        pointButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // if(num1 == 0){
                   // num1 = Double.parseDouble(output.getText().toString());
                    output.setText(num1+".");
                output.setText(num1+".");
              //  }
              //  else if (num2 == 0) {
                    //num2 = Double.parseDouble(output.getText().toString());
                //    output.setText(num2+".");
              //  }
            }
        });

        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = '+';

                output.setText("+");
                perform();
            }
        });

        minuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText("-");
                perform();
                operator = '-';
            }
        });

        timesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText("*");
                perform();
                operator = '*';
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                perform();
                output.setText("/");
                operator = '/';

            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });

        plusMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do nothing for now
            }
        });

        powerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do nothing for now
            }
        });

        squareRootButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do nothing for nowd
                 Math.sqrt(num1);
                output.setText("");
            }
        });
    }

    private void insert(int k) {
        str = str + Integer.toString(k);
        num1 = Integer.valueOf(str).intValue();
        output.setText(str);
    }


    private void perform() {
        str = "";
        num2 = num1;
    }

    private void reset() {
        str = "";
        //operator = '';
        num1 = 0;
        num2 = 0;
        output.setText("");
    }

    private void calculate() {
        String first = String.valueOf(num2);
        String second = String.valueOf(num1);
        if (operator == '+') {


            result = num2 + num1;
            output.setText(first + operator + second + "=" + result);
            str = "";

        } else if (operator == '-') {

            result = num1 - num2;
            output.setText(first + operator + second + "=" + result);
            str = "";

        } else if (operator == '*') {

            result = num1 * num2;
            output.setText(first + operator + second + "=" +result);
            str = "";

        } else if (operator == '/') {


           if (num1 == 0) {
                num1 = Double.parseDouble(output.getText().toString());
                output.setText("∞");
            } else if (num2 != 0) {
                num2 = 0;
                output.setText("0");
            } else {
                result = num2 / num1;
                output.setText(first + operator + second + "=" + result);
                str = "";
            }


        }
        else if (operator == '.'){
            if (result == num1) {
                output.setText(first + "."+second);
                str ="";
            }
            else if (result == num2) {
                output.setText(first +"." +second);
                str = "";
            }
        }

    }

    @Override
    public void onStart(){
        super.onStart();
    }

    @Override
    public void onPause(){
        super.onPause();
    }

    @Override
    public void onStop(){
        super.onStop();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
    }
}
