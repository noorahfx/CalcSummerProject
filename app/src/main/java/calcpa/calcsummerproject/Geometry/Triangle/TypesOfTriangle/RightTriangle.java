package calcpa.calcsummerproject.Geometry.Triangle.TypesOfTriangle;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import calcpa.calcsummerproject.R;
import io.github.kexanie.library.MathView;

public class RightTriangle extends AppCompatActivity {
    MathView right_triangle_paramter;
    String r_t_paramter = "$$P=a+b+(\\sqrt{a^2+b^2})$$";

    MathView right_triangle_area;
    String r_t_area = "$$A=\\frac{ab}{2}$$";

    MathView right_triangle_side_a;
    String r_t_side_a = "$$a = 2 \\frac{A}{b}$$";

    MathView right_triangle_side_b;
    String r_t_side_b = "$$b = 2 \\frac{A}{a}$$";

    MathView righ_triangle_side_c;
    String r_t_side_c = "$$c=\\sqrt{a^{2}+b^{2}}$$";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right_triangle);

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Take cover.ttf");
        TextView myTextView = (TextView)findViewById(R.id.right_triangle_title);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
        myTextView = (TextView)findViewById(R.id.right_triangle_define_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
        myTextView = (TextView)findViewById(R.id.right_tr_att_1_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);




        myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
        myTextView = (TextView)findViewById(R.id.right_tr_prop_1_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.right_tr_def_str_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.right_tr_attr_str);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.right_tr_prop_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.right_tri_formula_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        TextView tv = (TextView) findViewById(R.id.right_tr_def_str_id);
        assert tv != null;
        tv.setMovementMethod(new ScrollingMovementMethod());

        right_triangle_paramter =(MathView)findViewById(R.id.right_triangle_paramter);
        assert right_triangle_paramter != null;
        right_triangle_paramter.setText(r_t_paramter);

        right_triangle_area = (MathView)findViewById(R.id.right_triangle_area);
        assert right_triangle_area != null;
        right_triangle_area.setText(r_t_area);

        righ_triangle_side_c = (MathView)findViewById(R.id.right_triangle_side_c);
        assert righ_triangle_side_c != null;
        righ_triangle_side_c.setText(r_t_side_c);

        right_triangle_side_a =(MathView)findViewById(R.id.right_triangle_side_a);
        assert right_triangle_side_a != null;
        right_triangle_side_a.setText(r_t_side_a);

        right_triangle_side_b =(MathView)findViewById(R.id.right_triangle_side_b);
        assert right_triangle_side_b != null;
        right_triangle_side_b.setText(r_t_side_b);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
