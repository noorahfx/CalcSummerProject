package calcpa.calcsummerproject.Geometry.Quadrilateral;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import calcpa.calcsummerproject.Geometry.CustomList;
import calcpa.calcsummerproject.Geometry.Quadrilateral.TypesOfQuadrilateral.Kite.Kite;
import calcpa.calcsummerproject.Geometry.Quadrilateral.TypesOfQuadrilateral.Rectangle.Rectangle;
import calcpa.calcsummerproject.Geometry.Quadrilateral.TypesOfQuadrilateral.Rhombus.Rhombus;
import calcpa.calcsummerproject.Geometry.Quadrilateral.TypesOfQuadrilateral.Square.Square;
import calcpa.calcsummerproject.Geometry.Quadrilateral.TypesOfQuadrilateral.Trapezoid.Trapezoid;
import calcpa.calcsummerproject.R;

public class Quadrilatreral extends AppCompatActivity {
    ListView list;
    String[] quad_type = {
            "Parallelogram", "Rectangle", "Rhombus",
            "Square", "Trapezoid", "Kite"
    };

    int[] imageID = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadrilatreral);

        CustomList adapter = new CustomList(Quadrilatreral.this, quad_type, imageID);
        list = (ListView) findViewById(R.id.list);
        assert list != null;
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Open new activity when clicked using (switch statement);
                switch (position) {
                    case 0:
                        Intent intent = new Intent(Quadrilatreral.this, Kite.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(Quadrilatreral.this, Rectangle.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(Quadrilatreral.this, Rhombus.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(Quadrilatreral.this, Square.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(Quadrilatreral.this, Trapezoid.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
