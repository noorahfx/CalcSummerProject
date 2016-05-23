package calcpa.calcsummerproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class TipCalculator extends AppCompatActivity {

    // Constants used when saving and restoring

    private static final String FINAL_BILL = "FINAL_BILL";
    private static final String TOTAL_TIP = "TOTAL_TIP";
    private static final String BILL_WITHOUT_TIP = "BILL_WITHOUT_TIP";

    private double billWithoutTip; // Users bill before tip
    private double totalTip; // Tip amount
    private double finalBill; // Bill plus Tip

    EditText billWilthoutTipET;
    EditText totalTipET;
    EditText finalBillET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
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

        if(savedInstanceState == null){
            // Just started
            billWithoutTip = 0.0;
            totalTip = .15;
            finalBill = 0.0;
        } else {
            // App is being restored
            billWithoutTip = savedInstanceState.getDouble(BILL_WITHOUT_TIP);
            totalTip = savedInstanceState.getDouble(TOTAL_TIP);
            finalBill = savedInstanceState.getDouble(FINAL_BILL);

        }
        // Initialize the EditTexts
        billWilthoutTipET = (EditText) findViewById(R.id.billEditText); // Users bill before tip
        totalTipET = (EditText) findViewById(R.id.tipEditText); // Tip amount
        finalBillET = (EditText) findViewById(R.id.finalBillEditText); // Bill plus tip


        // Initialize the SeekBar and add a ChangeListener
        tipSeekBar = (SeekBar) findViewById(R.id.changeTipSeekBar);
        tipSeekBar.setOnSeekBarChangeListener(tipSeekBarListener);

        // Add change listener for when the bill before tip is changed
        billWilthoutTipET.addTextChangedListener(billWithoutTipListener);
    }

    // Called when the bill before tip amount is changed

    private TextWatcher billWithoutTipListener = new TextWatcher(){

        @Override
        public void afterTextChanged(Editable arg0) {
            // TODO Auto-generated method stub

        }
        @Override
        public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                      int arg3) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onTextChanged(CharSequence arg0, int arg1, int arg2,
                                  int arg3) {
            try{

                // Change the billBeforeTip to the new input

                billWithoutTip = Double.parseDouble(arg0.toString());

            }
            catch(NumberFormatException e){
                billWithoutTip = 0.0;

            }
            updateTipAndFinalBill();
        }

    };

    // Update the tip amount and add tip to bill to
    // find the final bill amount

    private void updateTipAndFinalBill(){

        // Get tip amount
        double tipAmount = Double.parseDouble(totalTipET.getText().toString());

        // The bill before tip amount was set in billBeforeTipListener
        // Get the bill plus the tip
        double finalBill = billWithoutTip + (billWithoutTip * tipAmount);

        // Set the total bill amount including the tip
        // Convert into a 2 decimal place String
        finalBillET.setText(String.format("%.02f", finalBill));

    }

    // Called when a device changes in some way.
    protected void onSaveInstanceState(Bundle outState){

        super.onSaveInstanceState(outState);
        outState.putDouble(FINAL_BILL, finalBill);
        outState.putDouble(TOTAL_TIP, totalTip);
        outState.putDouble(BILL_WITHOUT_TIP, billWithoutTip);

    }

    // SeekBar used to make a custom tip
    private SeekBar tipSeekBar;

    private OnSeekBarChangeListener tipSeekBarListener = new OnSeekBarChangeListener(){

        @Override
        public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {

            // Get the value set on the SeekBar
            totalTip = (tipSeekBar.getProgress()) * .01;

            // Set tipAmountET with the value from the SeekBar

            totalTipET.setText(String.format("%.02f", totalTip));

            // Update all the other EditTexts

            updateTipAndFinalBill();

        }

        @Override
        public void onStartTrackingTouch(SeekBar arg0) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onStopTrackingTouch(SeekBar arg0) {
            // TODO Auto-generated method stub

        }

    };





}
