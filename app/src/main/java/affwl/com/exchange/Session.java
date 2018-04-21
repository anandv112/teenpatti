package affwl.com.exchange;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by user on 4/4/2018.
 */

public class Session {
    Context context;
    String data;
    SharedPreferences preferences;
    public Session(Context context)
    {
        preferences=context.getSharedPreferences("pref",Context.MODE_PRIVATE);
    }
    public String getName()
        {
            String name=preferences.getString("name","");
            return name;
        }
    public void put(String image,String name)
    {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("image",image);
        editor.putString("name",name);
        editor.commit();
    }
    public String getImage()
    {
        String image=preferences.getString("image","");
        return image;
    }
}
