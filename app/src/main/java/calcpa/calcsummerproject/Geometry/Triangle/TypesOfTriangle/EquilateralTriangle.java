package calcpa.calcsummerproject.Geometry.Triangle.TypesOfTriangle;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import calcpa.calcsummerproject.R;
import io.github.kexanie.library.MathView;

public class EquilateralTriangle extends AppCompatActivity {
    MathView equilateral_triangle_paramter;
    String e_t_paramter = "$$P=3a$$";

    MathView equilateral_triangle_area;
    String e_t_area = "$$A=\\frac{\\sqrt{3}}{4}{a^{2}}$$";

    MathView equilateral_triangle_side_a;
    String e_t_side_a = "$$a=\\frac{P}{3}$$";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equilateral_triangle);

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Take cover.ttf");
        TextView myTextView = (TextView)findViewById(R.id.equilateral_triangle_title);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
        myTextView = (TextView)findViewById(R.id.equilateral_triangle_define_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.equilateral_tr_def_str_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);



        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.equilateral_tri_formula_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView = (TextView)findViewById(R.id.equilateral_tr_prop_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
        myTextView = (TextView)findViewById(R.id.equilateral_tr_prop_1_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        equilateral_triangle_paramter =(MathView)findViewById(R.id.equilateral_triangle_paramter);
        assert equilateral_triangle_paramter != null;
        equilateral_triangle_paramter.setText(e_t_paramter);

        equilateral_triangle_area = (MathView)findViewById(R.id.equilateral_triangle_area);
        assert equilateral_triangle_area != null;
        equilateral_triangle_area.setText(e_t_area);

        equilateral_triangle_side_a =(MathView)findViewById(R.id.equilateral_triangle_side_a);
        assert equilateral_triangle_side_a != null;
        equilateral_triangle_side_a.setText(e_t_side_a);


    }

}
