package calcpa.calcsummerproject.Geometry.Polygon;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import calcpa.calcsummerproject.Geometry.CustomList;
import calcpa.calcsummerproject.Geometry.Polygon.TypesOfPolygon.ConcavePolygon;
import calcpa.calcsummerproject.Geometry.Polygon.TypesOfPolygon.ConvexPolygon;
import calcpa.calcsummerproject.Geometry.Polygon.TypesOfPolygon.RegularPolygon;
import calcpa.calcsummerproject.R;

public class Polygon extends AppCompatActivity {
    ListView list;
    String[] polygonTextList = {
            "Regular Polygon",
            "Concave Polygon",
            "Convex Polygon"
    };
    int[] imageID = {
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polygon);

        CustomList adapter = new CustomList(Polygon.this, polygonTextList, imageID);
        list = (ListView)findViewById(R.id.polygon_list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //open new activity when clicked
                switch(position) {
                    case 0:
                        Intent intent =new Intent(Polygon.this, RegularPolygon.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(Polygon.this, ConcavePolygon.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(Polygon.this, ConvexPolygon.class);
                        startActivity(intent);
                        break;
                }

            }
        });

    }

}
