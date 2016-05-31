package calcpa.calcsummerproject;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;



public class Geometry extends AppCompatActivity {

    ListView list;
    String[] shapeText = {
            "Triangle","Square","Rectangle","Rhombus",
            "Parallelogram","Trapezoid","Kite","Hexagon",
            "Pentagon","Octagon","Heptagon","Nonagon",
            "Decagon","Circle","Eclipse","Cresent",
            "Cube","Cuboid","Sphere","Cylinder",
            "Cone","Puadrilateral","Polygon"
    } ;
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
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Geometry.this, "You Clicked at "
                                +shapeText[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }

}


