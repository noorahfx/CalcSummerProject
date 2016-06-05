package calcpa.calcsummerproject.Geometry.Triangle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);


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
}

