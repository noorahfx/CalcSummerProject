package calcpa.calcsummerproject.Geometry.Triangle;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import calcpa.calcsummerproject.Geometry.CustomList;
import calcpa.calcsummerproject.Geometry.Triangle.TypesOfTriangle.AcuteTriangle;
import calcpa.calcsummerproject.Geometry.Triangle.TypesOfTriangle.EquilateralTriangle;
import calcpa.calcsummerproject.Geometry.Triangle.TypesOfTriangle.IsoscelesTriangle;
import calcpa.calcsummerproject.Geometry.Triangle.TypesOfTriangle.ObtuseTriangle;
import calcpa.calcsummerproject.Geometry.Triangle.TypesOfTriangle.RightTriangle;
import calcpa.calcsummerproject.Geometry.Triangle.TypesOfTriangle.ScaleneTriangle;
import calcpa.calcsummerproject.R;
import io.github.kexanie.library.MathView;

public class Triangle extends AppCompatActivity {
    MathView sid_a;
    MathView sid_b;
    MathView hypothenous_side_c;
    MathView parameter;
    MathView area;



    ListView list;
    String[] triangle_type = {
            "Right Triangle", "Acute Triangle",
            "Obtuse Triangle", "Equilateral Triangle",
            "Isosceles Triangle", "Scalene Triangle"};

    int[] imageID = {
            R.drawable.right_triangle_logoxxxhdpi,
            R.drawable.acute_trianglexxxhdpi,
            R.drawable.obtuse_trianglexxxhdpi,
            R.drawable.equilateral_trianglexxxhdpi,
            R.drawable.isosceles_trianglexxhdpi,
            R.drawable.scalene_triangle_xxxhdpi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_triangle);
        // getSupportActionBar().setIcon(R.drawable.back_button_tb);
        //enable button in toolbar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        CustomList adapter = new CustomList(Triangle.this, triangle_type, imageID);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //open new activity when clicked
                switch (position) {
                    case 0:
                        Intent intent = new Intent(Triangle.this, RightTriangle.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(Triangle.this, AcuteTriangle.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(Triangle.this, ObtuseTriangle.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(Triangle.this, EquilateralTriangle.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(Triangle.this, IsoscelesTriangle.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(Triangle.this, ScaleneTriangle.class);
                        startActivity(intent);
                        break;
                }
            }

        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {

        } else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {

        }

    }
}

