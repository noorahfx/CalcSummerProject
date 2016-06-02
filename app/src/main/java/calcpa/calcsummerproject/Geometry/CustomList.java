package calcpa.calcsummerproject.Geometry;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import calcpa.calcsummerproject.R;

/**
 * Created by Fahim NoorAhmad on 5/31/2016.
 */
public class CustomList extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] shapeText;
    private final int[] imageId;

    public CustomList(Activity context, String[] shapeText, int[] imageId) {
        super(context, R.layout.row_layout, shapeText);
        this.context = context;
        this.shapeText = shapeText;
        this.imageId = imageId;
    }


    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.row_layout, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(shapeText[position]);

        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}



