package calcpa.calcsummerproject.Geometry.Pentagon;

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
import calcpa.calcsummerproject.Geometry.Pentagon.TypesOfPentagon.IrregularPentagon;
import calcpa.calcsummerproject.Geometry.Pentagon.TypesOfPentagon.RegularPentagon;
import calcpa.calcsummerproject.R;

public class Pentagon extends AppCompatActivity {
    ListView list;
    String [] pentagonListText = {
            "Regular Pentagon",
            "Irregular Pentagon",
    };

    int [] imageID = {
            R.drawable.image1,
            R.drawable.image2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pentagon);

        CustomList adapter = new CustomList(Pentagon.this, pentagonListText, imageID);
        list = (ListView)findViewById(R.id.pentagon_list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id){
                //open new activity when clicked
                switch(position){
                    case 0:
                        Intent intent = new Intent(Pentagon.this, RegularPentagon.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(Pentagon.this, IrregularPentagon.class);
                        startActivity(intent);
                        break;
                }
            }
        });

    }

}
