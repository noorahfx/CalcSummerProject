package calcpa.calcsummerproject.Geometry.Nonagon;

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
import calcpa.calcsummerproject.Geometry.Nonagon.TypesOfNonagon.IrregularNonagon;
import calcpa.calcsummerproject.Geometry.Nonagon.TypesOfNonagon.RegularNonagon;
import calcpa.calcsummerproject.R;

public class Nonagon extends AppCompatActivity {
    ListView list;
    String[] nonagonListText = {
            "Regular Nonagon",
            "Irregular Nonagon"
    };
    int [] imagID = {
            R.drawable.image1,
            R.drawable.image2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonagon);

        CustomList adapter = new CustomList(Nonagon.this, nonagonListText,imagID);
        list = (ListView)findViewById(R.id.nonagon_list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //open new activity when clicked;

                switch(position) {
                    case 0:
                        Intent intent = new Intent(Nonagon.this, RegularNonagon.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(Nonagon.this, IrregularNonagon.class);
                        startActivity(intent);
                        break;


                }
            }
        });

    }

}
