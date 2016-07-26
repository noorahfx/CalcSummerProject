package calcpa.calcsummerproject;

import android.widget.EditText;

/**
 * Created by Fahim NoorAhmad on 7/25/2016.
 */
public class Model {

    public static boolean isEmpty (EditText field) {
        if(field.getText().length() ==0) {

            return true;
        }
        else {
            return false;
        }

    }

}
