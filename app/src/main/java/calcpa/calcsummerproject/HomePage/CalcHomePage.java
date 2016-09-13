package calcpa.calcsummerproject.HomePage;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

 import calcpa.calcsummerproject.BasicCalculator.BasicCalc;
import calcpa.calcsummerproject.Geometry.Geometry;
import calcpa.calcsummerproject.R;
import calcpa.calcsummerproject.TipCalculator.TipCalculator;

public class CalcHomePage extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        /**  Button algebraIButton;
         Button algebraIIButton;
         Button statButton;
         Button calculusButton; */
        Button workPlzButton;
        Button tipCalculatorButton;

        Button geometryButton;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_home_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /**   algebraIButton = (Button)findViewById(R.id.algebraI);
         algebraIIButton = (Button)findViewById(R.id.algebraII);
         statButton = (Button)findViewById(R.id.statistic);
         calculusButton= (Button)findViewById(R.id.calcI); */
        tipCalculatorButton = (Button) findViewById(R.id.tipCalculator);
        geometryButton = (Button) findViewById(R.id.geomtery);

        workPlzButton = (Button) findViewById(R.id.basicCalcBtn);

        assert workPlzButton != null;
        workPlzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//do something
                Intent intent = new Intent(CalcHomePage.this, BasicCalc.class);
                startActivity(intent);
            }
        });


        assert tipCalculatorButton != null;
        tipCalculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalcHomePage.this, TipCalculator.class);
                startActivity(intent);
            }
        });

        assert geometryButton != null;
        geometryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalcHomePage.this, Geometry.class);
                startActivity(intent);

            }
        });


        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "OptimusPrinceps.ttf");
        TextView myTextView = (TextView) findViewById(R.id.home_page_text);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        workPlzButton.setTypeface(myTypeFace);
        tipCalculatorButton.setTypeface(myTypeFace);
        geometryButton.setTypeface(myTypeFace);
/**
 algebraIButton.setOnClickListener(new View.OnClickListener(){
@Override public void onClick(View view) {
//do something
}
});

 algebraIIButton.setOnClickListener(new View.OnClickListener(){
@Override public void onClick(View view){
//do something
}
});

 statButton.setOnClickListener(new View.OnClickListener(){
@Override public void onClick(View view) {
//do something
}
});

 calculusButton.setOnClickListener(new View.OnClickListener(){
@Override public void onClick(View view) {
//do something
}
});

 */


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
