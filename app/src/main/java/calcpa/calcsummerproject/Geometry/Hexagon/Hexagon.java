package calcpa.calcsummerproject.Geometry.Hexagon;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import calcpa.calcsummerproject.Geometry.CustomList;
import calcpa.calcsummerproject.Geometry.Geometry;
import calcpa.calcsummerproject.Geometry.Hexagon.TypesOfHexagon.ConcaveHexagon;
import calcpa.calcsummerproject.Geometry.Hexagon.TypesOfHexagon.ConvexHexagon;
import calcpa.calcsummerproject.Geometry.Hexagon.TypesOfHexagon.IrregularHexagon;
import calcpa.calcsummerproject.Geometry.Hexagon.TypesOfHexagon.RegularHexagon;
import calcpa.calcsummerproject.R;

public class Hexagon extends AppCompatActivity {
    ListView list;
    String [] hexagonTypeText = {
            "Regular Hexagon",
            "Irregular Hexagon",
            "Concave Hexagon",
            "Convex Hexagon" };

    int [] imageID =  {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexagon);

        CustomList adapter = new CustomList(Hexagon.this, hexagonTypeText, imageID);
        list = (ListView) findViewById(R.id.hex_list);
        assert list != null;
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>parent, View view,
                                    int position, long id) {
                //open new activity when clicked
                switch(position) {
                    case 0:
                        Intent intent = new Intent(Hexagon.this, RegularHexagon.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(Hexagon.this, IrregularHexagon.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(Hexagon.this, ConcaveHexagon.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(Hexagon.this, ConvexHexagon.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
