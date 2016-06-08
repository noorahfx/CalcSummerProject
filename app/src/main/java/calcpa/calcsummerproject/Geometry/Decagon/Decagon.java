package calcpa.calcsummerproject.Geometry.Decagon;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import calcpa.calcsummerproject.Geometry.CustomList;
import calcpa.calcsummerproject.Geometry.Decagon.TypesOfDecagon.IrregularDecagon;
import calcpa.calcsummerproject.Geometry.Decagon.TypesOfDecagon.RegularDecagon;
import calcpa.calcsummerproject.R;

public class Decagon extends AppCompatActivity {
    ListView list;
    String[] decagonTypeText = {
            "Reuglar Decagon",
            "Irregular Decagon"
    };
    int[] imageID = {
            R.drawable.image1,
            R.drawable.image2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decagon);

        CustomList adapter = new CustomList(Decagon.this, decagonTypeText, imageID);
        list = (ListView)findViewById(R.id.decagon_list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //opne new activity when clicked
                switch (position) {
                    case 0:
                        Intent intent = new Intent(Decagon.this, RegularDecagon.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(Decagon.this, IrregularDecagon.class);
                        startActivity(intent);
                        break;
                }
            }


        });

    }

}
