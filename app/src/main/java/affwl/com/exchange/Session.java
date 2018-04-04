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
    public String get()
        {
            String name=preferences.getString("url","");
            return name;
        }
    public void put()
    {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("url","");
        editor.putString("name","");
        editor.commit();
    }
}
