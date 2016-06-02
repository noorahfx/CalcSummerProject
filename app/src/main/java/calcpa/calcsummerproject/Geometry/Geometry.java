package calcpa.calcsummerproject.Geometry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import calcpa.calcsummerproject.Geometry.Circle.Circle;
import calcpa.calcsummerproject.Geometry.Cone.Cone;
import calcpa.calcsummerproject.Geometry.Cresent.Cresent;
import calcpa.calcsummerproject.Geometry.Cube.Cube;
import calcpa.calcsummerproject.Geometry.Cuboid.Cuboid;
import calcpa.calcsummerproject.Geometry.Cylinder.Cylinder;
import calcpa.calcsummerproject.Geometry.Decagon.Decagon;
import calcpa.calcsummerproject.Geometry.Eclipse.Eclipse;
import calcpa.calcsummerproject.Geometry.Heptagon.Heptagon;
import calcpa.calcsummerproject.Geometry.Hexagon.Hexagon;
import calcpa.calcsummerproject.Geometry.Kite.Kite;
import calcpa.calcsummerproject.Geometry.Nonagon.Nonagon;
import calcpa.calcsummerproject.Geometry.Octagon.Octagon;
import calcpa.calcsummerproject.Geometry.Parallelogram.Parallelogram;
import calcpa.calcsummerproject.Geometry.Pentagon.Pentagon;
import calcpa.calcsummerproject.Geometry.Polygon.Polygon;
import calcpa.calcsummerproject.Geometry.Quadrilateral.Quadrilatreral;
import calcpa.calcsummerproject.Geometry.Rectangle.Rectangle;
import calcpa.calcsummerproject.Geometry.Rhombus.Rhombus;
import calcpa.calcsummerproject.Geometry.Sphere.Sphere;
import calcpa.calcsummerproject.Geometry.Square.Square;
import calcpa.calcsummerproject.Geometry.Trapezoid.Trapezoid;
import calcpa.calcsummerproject.Geometry.Triangle.Triangle;
import calcpa.calcsummerproject.R;


public class Geometry extends AppCompatActivity {
    ListView list;
    String[] shapeText = {
            "Triangle", "Square", "Rectangle", "Rhombus",
            "Parallelogram", "Trapezoid", "Kite", "Hexagon",
            "Pentagon", "Octagon", "Heptagon", "Nonagon",
            "Decagon", "Circle", "Eclipse", "Cresent",
            "Cube", "Cuboid", "Sphere", "Cylinder",
            "Cone", "Quadrilateral", "Polygon"
    };
    int[] imageId = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image1,
            R.drawable.image2,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry);
        CustomList adapter = new CustomList(Geometry.this, shapeText, imageId);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
               //Open new activity when clicked using (switch statement);
                switch (position) {
                    case 0:
                        Intent intent = new Intent(Geometry.this, Triangle.class);
                        startActivity(intent);
                        break;
                    case 1:
                         intent = new Intent(Geometry.this, Square.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(Geometry.this, Rectangle.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(Geometry.this, Rhombus.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(Geometry.this, Parallelogram.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(Geometry.this, Trapezoid.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(Geometry.this, Kite.class);
                        startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(Geometry.this, Hexagon.class);
                        startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(Geometry.this, Pentagon.class);
                        startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(Geometry.this, Octagon.class);
                        startActivity(intent);
                        break;
                    case 10:
                        intent = new Intent(Geometry.this, Heptagon.class);
                        startActivity(intent);
                        break;
                    case 11:
                        intent = new Intent(Geometry.this, Nonagon.class);
                        startActivity(intent);
                        break;
                    case 12:
                        intent = new Intent(Geometry.this, Decagon.class);
                        startActivity(intent);
                        break;
                    case 13:
                        intent = new Intent(Geometry.this, Circle.class);
                        startActivity(intent);
                        break;
                    case 14:
                        intent = new Intent(Geometry.this, Eclipse.class);
                        startActivity(intent);
                        break;
                    case 15:
                        intent = new Intent(Geometry.this, Cresent.class);
                        startActivity(intent);
                        break;
                    case 16:
                        intent = new Intent(Geometry.this, Cube.class);
                        startActivity(intent);
                        break;
                    case 17:
                        intent = new Intent(Geometry.this, Cuboid.class);
                        startActivity(intent);
                        break;
                    case 18:
                        intent = new Intent(Geometry.this, Sphere.class);
                        startActivity(intent);
                        break;
                    case 19:
                        intent = new Intent(Geometry.this, Cylinder.class);
                        startActivity(intent);
                        break;
                    case 20:
                        intent = new Intent(Geometry.this, Cone.class);
                        startActivity(intent);
                        break;
                    case 21:
                        intent = new Intent(Geometry.this, Quadrilatreral.class);
                        startActivity(intent);
                        break;
                    case 22:
                        intent = new Intent(Geometry.this, Polygon.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}


