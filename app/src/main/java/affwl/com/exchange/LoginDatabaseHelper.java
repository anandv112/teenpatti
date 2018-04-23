package affwl.com.exchange;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;


public class LoginDatabaseHelper {
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "UserInfo";
    // Contacts table name
    private static final String TABLE_NAME = "User";
    static String CREATE_TABLE = "create table User (id integer primary key,image text,name text)";
    Context context;
    SQLiteDatabase db;
    DBHandler dbHandler;
    public LoginDatabaseHelper(Context context)
    {
        dbHandler=new DBHandler(context,DATABASE_NAME,null,1);

        this.context=context;
    }
    // Adding new shop
    public long add(String image,String name) {

        db = dbHandler.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("image", image); // Shop Name
        values.put("name",name); // Shop Phone Number

// Inserting Row
        long result= db.insert(TABLE_NAME, null, values);
        db.close(); // Closing database connection
        return result;
    }



}
