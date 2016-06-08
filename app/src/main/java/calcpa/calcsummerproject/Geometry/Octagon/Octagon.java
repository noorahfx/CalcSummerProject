package calcpa.calcsummerproject.Geometry.Octagon;

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
import calcpa.calcsummerproject.Geometry.Octagon.TypesOfOctagon.ConvexOctagon;
import calcpa.calcsummerproject.Geometry.Octagon.TypesOfOctagon.IrregularOctagon;
import calcpa.calcsummerproject.Geometry.Octagon.TypesOfOctagon.RegularOctagon;
import calcpa.calcsummerproject.R;

public class Octagon extends AppCompatActivity {
    ListView list;
    String [] octagonListText = {
            "Regular Octagon",
            "Irregular Octagon",
            "Convex Octagon" };

    int[] imageID = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octagon);

        CustomList adapter = new CustomList(Octagon.this, octagonListText, imageID);
        list = (ListView)findViewById(R.id.octagon_list);
        assert list != null;
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //open new activity when clickd
                switch(position){
                    case 0:
                        Intent intent = new Intent(Octagon.this, RegularOctagon.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(Octagon.this, IrregularOctagon.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(Octagon.this, ConvexOctagon.class);
                        startActivity(intent);
                        break;
                }
            }
        });




    }

}
