package calcpa.calcsummerproject.Geometry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import calcpa.calcsummerproject.Geometry.Circle.CircleActivity;
import calcpa.calcsummerproject.Geometry.Cone.ConeActivity;
import calcpa.calcsummerproject.Geometry.Cube.CubeActivity;
import calcpa.calcsummerproject.Geometry.Cuboid.CuboidActivity;
import calcpa.calcsummerproject.Geometry.Cylinder.CylinderActivity;
import calcpa.calcsummerproject.Geometry.Decagon.DecagonActivity;
import calcpa.calcsummerproject.Geometry.Eclipse.EllipseActivity;
import calcpa.calcsummerproject.Geometry.Heptagon.HeptagonActivity;
import calcpa.calcsummerproject.Geometry.Hexagon.HexagonActivity;
import calcpa.calcsummerproject.Geometry.Kite.KiteActivity;
import calcpa.calcsummerproject.Geometry.Nonagon.NonagonActivity;
import calcpa.calcsummerproject.Geometry.Octagon.OctagonActivity;
import calcpa.calcsummerproject.Geometry.Parallelogram.ParallelogramActivity;
import calcpa.calcsummerproject.Geometry.Pentagon.PentagonActivity;
import calcpa.calcsummerproject.Geometry.Rectangle.RectangleActivity;
import calcpa.calcsummerproject.Geometry.Rhombus.RhombusActivity;
import calcpa.calcsummerproject.Geometry.Square.SquareActivity;
import calcpa.calcsummerproject.Geometry.Trapezoid.TrapezoidActivity;
import calcpa.calcsummerproject.Geometry.Triangle.Triangle;
import calcpa.calcsummerproject.R;


public class GeometryActivity extends AppCompatActivity {
    ListView list;
    String[] shapeText = {

            "Circle", "Cone", "Cube", "Cuboid",
            "Cylinder", "Decagon", "Ellipse",
            "Heptagon", "Hexagon", "Kite", "Nonagon",
            "Octagon", "Parallelogram", "Pentagon",
            "Rectangle", "Rhombus", "Square", "Trapezoid", "Triangle"};
    int[] imageId = {
            R.drawable.circle_logo_xxxhdpi,
            R.drawable.cone_logo_xxxhdpi,
            R.drawable.cube_logoxxxhdpi,
            R.drawable.cuboid_logoxxxhdpi,
            R.drawable.cylinder_logo_xxxhdpi,
            R.drawable.decagon_logoxxxhdpi,
            R.drawable.ellipse_logoxxxhdpi,
            R.drawable.helptagon_logo_xxxhdpi,
            R.drawable.hexagon_logoxxxhdpi,
            R.drawable.kite_logo_xxxhdpi,
            R.drawable.nonagon_logo_xxxhdpi,
            R.drawable.octagon_logo_xxxhdpi,
            R.drawable.parallelogram_logo_xxxhdpi,
            R.drawable.pentagon_logo_xxxhdpi,
            R.drawable.rectangle_logoxxxhdpi,
            R.drawable.rhombus_logo_xxxhdpi,
            R.drawable.square_logoxxxhdpi,
            R.drawable.trapezoid_logoxxxhdpi,
            R.drawable.triangle_logoxxxhdpi,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_geometry);
        // getSupportActionBar().setIcon(R.drawable.back_button_tb);
        //enable button in toolbar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        CustomList adapter = new CustomList(GeometryActivity.this, shapeText, imageId);
        list = (ListView) findViewById(R.id.list);
        assert list != null;
        list.setAdapter(adapter);

      //  Typeface myTypeFace = Typeface.createFromAsset(getAssets(),  "OptimusPrinceps.ttf");
       //  shapeText.setTypeface(myTypeFace);




        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //Open new activity when clicked using (switch statement);
                switch (position) {
                    case 0:
                        Intent intent = new Intent(GeometryActivity.this, CircleActivity.class);
                        startActivity(intent);
                        break;


                    case 1:
                        intent = new Intent(GeometryActivity.this, ConeActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(GeometryActivity.this, CubeActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(GeometryActivity.this, CuboidActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(GeometryActivity.this, CylinderActivity.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(GeometryActivity.this, DecagonActivity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(GeometryActivity.this, EllipseActivity.class);
                        startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(GeometryActivity.this, HeptagonActivity.class);
                        startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(GeometryActivity.this, HexagonActivity.class);
                        startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(GeometryActivity.this, KiteActivity.class);
                        startActivity(intent);
                        break;
                    case 10:
                        intent = new Intent(GeometryActivity.this, NonagonActivity.class);
                        startActivity(intent);
                        break;
                    case 11:
                        intent = new Intent(GeometryActivity.this, OctagonActivity.class);
                        startActivity(intent);
                        break;
                    case 12:
                        intent = new Intent(GeometryActivity.this, ParallelogramActivity.class);
                        startActivity(intent);
                        break;
                    case 13:
                        intent = new Intent(GeometryActivity.this, PentagonActivity.class);
                        startActivity(intent);
                        break;

                    case 14:
                        intent = new Intent(GeometryActivity.this, RectangleActivity.class);
                        startActivity(intent);
                        break;
                    case 15:
                        intent = new Intent(GeometryActivity.this, RhombusActivity.class);
                        startActivity(intent);
                        break;
                    case 16:
                        intent = new Intent(GeometryActivity.this, SquareActivity.class);
                        startActivity(intent);
                        break;
                    case 17:
                        intent = new Intent(GeometryActivity.this, TrapezoidActivity.class);
                        startActivity(intent);
                        break;
                    case 18:
                        intent = new Intent(GeometryActivity.this, Triangle.class);
                        startActivity(intent);
                        break;


                }
            }
        });
    }


}




