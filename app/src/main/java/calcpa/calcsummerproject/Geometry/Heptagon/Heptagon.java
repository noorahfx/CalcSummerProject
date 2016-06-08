package calcpa.calcsummerproject.Geometry.Heptagon;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import calcpa.calcsummerproject.Geometry.CustomList;
import calcpa.calcsummerproject.Geometry.Heptagon.TypesOfHeptagon.IrregularHeptagon;
import calcpa.calcsummerproject.Geometry.Heptagon.TypesOfHeptagon.RegularHeptagon;
import calcpa.calcsummerproject.Geometry.Hexagon.TypesOfHexagon.IrregularHexagon;
import calcpa.calcsummerproject.Geometry.Octagon.TypesOfOctagon.IrregularOctagon;
import calcpa.calcsummerproject.R;

public class Heptagon extends AppCompatActivity {
    ListView list;
    String[] heptagonTextList  ={
            "Regular Heptagon",
            "Irregular Heptagon"
    };
    int [] imageID = {
            R.drawable.image1,
            R.drawable.image2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heptagon);

        CustomList adapter = new CustomList(Heptagon.this, heptagonTextList, imageID);
        list= (ListView)findViewById(R.id.heptagon_list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id){
                //open new activity when clicked
                switch (position){
                    case 0:
                        Intent intent = new Intent(Heptagon.this, RegularHeptagon.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(Heptagon.this, IrregularHeptagon.class);
                        startActivity(intent);
                        break;
                    
                }
            }
        });

    }

}
