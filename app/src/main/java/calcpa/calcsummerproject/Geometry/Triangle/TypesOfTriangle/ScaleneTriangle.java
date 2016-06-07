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

public class ScaleneTriangle extends AppCompatActivity {
    MathView scalene_triangle_paramter;
    String s_t_paramter = "$$P =2a+b$$";

    MathView scalene_triangle_area;
    String s_t_area = "$$A =\\frac{bh_{b}}{2}$$";

    MathView scalene_triangle_side_a;
    String s_t_side_a = "$$a =\\frac{p}{2}-\\frac{b}{2}$$";

    MathView scalene_triangle_height;
    String s_t_height = "$$h_{b} = \\sqrt{a^{2}-\\frac{b_{2}}{4}}$$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scalene_triangle);


        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Take cover.ttf");
        TextView myTextView = (TextView)findViewById(R.id.scalene_triangle_title);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
        myTextView = (TextView)findViewById(R.id.scalene_triangle_define_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.scalene_tr_def_str_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.scalene_tr_type_str);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace=Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
        myTextView=(TextView)findViewById(R.id.scalene_tr_type_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);



        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.scalene_tri_formula_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView = (TextView)findViewById(R.id.scalene_tr_prop_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
        myTextView = (TextView)findViewById(R.id.scalene_tr_prop_1_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        scalene_triangle_paramter =(MathView)findViewById(R.id.scalene_triangle_paramter);
        assert scalene_triangle_paramter != null;
        scalene_triangle_paramter.setText(s_t_paramter);

        scalene_triangle_area = (MathView)findViewById(R.id.scalene_triangle_area);
        assert scalene_triangle_area != null;
        scalene_triangle_area.setText(s_t_area);

        scalene_triangle_side_a =(MathView)findViewById(R.id.scalene_triangle_side_a);
        assert scalene_triangle_side_a != null;
        scalene_triangle_side_a.setText(s_t_side_a);

        scalene_triangle_height =(MathView)findViewById(R.id.scalene_triangle_height);
        assert scalene_triangle_height != null;
        scalene_triangle_height.setText(s_t_height);

    }

}
