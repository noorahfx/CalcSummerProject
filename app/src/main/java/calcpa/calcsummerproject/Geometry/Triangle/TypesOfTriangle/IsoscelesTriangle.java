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

public class IsoscelesTriangle extends AppCompatActivity {

    MathView isosceles_triangle_paramter;
    String i_t_paramter = "$$P =2a+b$$";

    MathView isosceles_triangle_area;
    String i_t_area = "$$A =\\frac{bh_{b}}{2}$$";

    MathView isosceles_triangle_side_a;
    String i_t_side_a = "$$a =\\frac{p}{2}-\\frac{b}{2}$$";

    MathView isosceles_triangle_height;
    String i_t_height = "$$h_{b} = \\sqrt{a^{2}-\\frac{b_{2}}{4}}$$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isosceles_triangle);

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Take cover.ttf");
        TextView myTextView = (TextView)findViewById(R.id.isosceles_triangle_title);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
        myTextView = (TextView)findViewById(R.id.isosceles_triangle_define_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.isosceles_tr_def_str_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);



        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.isosceles_tri_formula_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView = (TextView)findViewById(R.id.isosceles_tr_prop_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
        myTextView = (TextView)findViewById(R.id.isosceles_tr_prop_1_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        isosceles_triangle_paramter =(MathView)findViewById(R.id.isosceles_triangle_paramter);
        assert isosceles_triangle_paramter != null;
        isosceles_triangle_paramter.setText(i_t_paramter);

        isosceles_triangle_area = (MathView)findViewById(R.id.isosceles_triangle_area);
        assert isosceles_triangle_area != null;
        isosceles_triangle_area.setText(i_t_area);

        isosceles_triangle_side_a =(MathView)findViewById(R.id.isosceles_triangle_side_a);
        assert isosceles_triangle_side_a != null;
        isosceles_triangle_side_a.setText(i_t_side_a);

        isosceles_triangle_height =(MathView)findViewById(R.id.isosceles_triangle_height);
        assert isosceles_triangle_height != null;
        isosceles_triangle_height.setText(i_t_height);



    }

}
