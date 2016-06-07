package calcpa.calcsummerproject.Geometry.Triangle.TypesOfTriangle;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import calcpa.calcsummerproject.R;
import io.github.kexanie.library.MathView;

public class AcuteTriangle extends AppCompatActivity {
    MathView acute_triangle_paramter;
    String a_t_paramter = "$$P=a+b+c$$";

    MathView acute_triangle_area;
    String a_t_area = "$$A=\\frac{hb}{2}$$";

    MathView acute_triangle_side_a;
    String a_t_side_a = "$$a = 2 \\frac{A}{b}$$";

    MathView acute_triangle_side_b;
    String a_t_side_b = "$$b = 2 \\frac{A}{a}$$";

   // MathView righ_triangle_side_c;
   // String r_t_side_c = "$$c=\\sqrt{a^{2}+b^{2}}$$";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acute_triangle);



        Typeface myTypeFace = Typeface.createFromAsset(getAssets(),"Take cover.ttf");
        TextView myTextView = (TextView)findViewById(R.id.acute_triangle_title);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
        myTextView = (TextView)findViewById(R.id.acute_triangle_define_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace = Typeface.createFromAsset(getAssets(),"CaviarDreams.ttf");
        myTextView = (TextView)findViewById(R.id.acute_tr_att_1_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);


        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.acute_tr_def_str_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.acute_tr_attr_str);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);

        myTypeFace=Typeface.createFromAsset(getAssets(),"[TOP_SECRET].ttf");
        myTextView=(TextView)findViewById(R.id.acute_tri_formula_id);
        assert myTextView != null;
        myTextView.setTypeface(myTypeFace);




        acute_triangle_paramter =(MathView)findViewById(R.id.acute_triangle_paramter);
        assert acute_triangle_paramter != null;
        acute_triangle_paramter.setText(a_t_paramter);

        acute_triangle_area = (MathView)findViewById(R.id.acute_triangle_area);
        assert acute_triangle_area != null;
        acute_triangle_area.setText(a_t_area);



        acute_triangle_side_a =(MathView)findViewById(R.id.acute_triangle_side_a);
        assert acute_triangle_side_a != null;
        acute_triangle_side_a.setText(a_t_side_a);

        acute_triangle_side_b =(MathView)findViewById(R.id.acute_triangle_side_b);
        assert acute_triangle_side_b != null;
        acute_triangle_side_b.setText(a_t_side_b);



    }

}
