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

public class ObtuseTriangle extends AppCompatActivity {
    MathView obtuse_triangle_paramter;
    String o_t_paramter = "$$P=a+b+c$$";
    
    MathView obtuse_triangle_area;
    String o_t_area = "$$A=\\frac{hb}{2}$$";

    MathView obtuse_triangle_side_a;
    String o_t_side_a = "$$a = 2 \\frac{A}{b}$$";

    MathView obtuse_triangle_side_b;
    String o_t_side_b = "$$b = 2 \\frac{A}{a}$$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obtuse_triangle);



        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Take cover.ttf");
        TextView myTextView = (TextView)findViewById(R.id.obtuse_triangle_title);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
        myTextView = (TextView)findViewById(R.id.obtuse_triangle_define_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
        myTextView = (TextView)findViewById(R.id.obtuse_tr_att_1_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);


        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.obtuse_tr_def_str_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.obtuse_tr_attr_str);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.obtuse_tri_formula_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView = (TextView)findViewById(R.id.obtuse_tr_prop_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
        myTextView = (TextView)findViewById(R.id.obtuse_tr_prop_1_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);



        obtuse_triangle_paramter =(MathView)findViewById(R.id.obtuse_triangle_paramter);
        assert obtuse_triangle_paramter != null;
        obtuse_triangle_paramter.setText(o_t_paramter);

        obtuse_triangle_area = (MathView)findViewById(R.id.obtuse_triangle_area);
        assert obtuse_triangle_area != null;
        obtuse_triangle_area.setText(o_t_area);



        obtuse_triangle_side_a =(MathView)findViewById(R.id.obtuse_triangle_side_a);
        assert obtuse_triangle_side_a != null;
        obtuse_triangle_side_a.setText(o_t_side_a);

        obtuse_triangle_side_b =(MathView)findViewById(R.id.obtuse_triangle_side_b);
        assert obtuse_triangle_side_b != null;
        obtuse_triangle_side_b.setText(o_t_side_b);



    }

}
