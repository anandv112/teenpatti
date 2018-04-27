package affwl.com.exchange;

import android.Manifest;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class PlayasguestActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView selectimage,avatarimage,avatar1,avatar2,avatar3,avatar4,avatar5,avatar6,avatar7,avatar8,camera,choosepic;
    Session session;
    TextView login;
    EditText nametext;
    LoginDatabaseHelper loginDatabaseHelper;
    DBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playasguest);
        selectimage=findViewById(R.id.selectimage);
        avatarimage=findViewById(R.id.avatarimage);
        avatar1=findViewById(R.id.avatar1);
        avatar2=findViewById(R.id.avatar2);
        avatar3=findViewById(R.id.avatar3);
        avatar4=findViewById(R.id.avatar4);
        avatar5=findViewById(R.id.avatar5);
        avatar6=findViewById(R.id.avatar6);
        avatar7=findViewById(R.id.avatar7);
        avatar8=findViewById(R.id.avatar8);
        camera=findViewById(R.id.camera);
        choosepic=findViewById(R.id.choosepic);
        nametext=findViewById(R.id.nametext);
        login=findViewById(R.id.login);

        avatar1.setOnClickListener(this);
        avatar2.setOnClickListener(this);
        avatar3.setOnClickListener(this);
        avatar4.setOnClickListener(this);
        avatar5.setOnClickListener(this);
        avatar6.setOnClickListener(this);
        avatar7.setOnClickListener(this);
        avatar8.setOnClickListener(this);
        camera.setOnClickListener(this);
        choosepic.setOnClickListener(this);
        login.setOnClickListener(this);
        session=new Session(this);
        loginDatabaseHelper=new LoginDatabaseHelper(this);
        dbHandler=new DBHandler(this,"UserInfo",null,1);
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)== PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(this,Manifest.permission.WRITE_EXTERNAL_STORAGE)==PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(this,Manifest.permission.READ_EXTERNAL_STORAGE)==PackageManager.PERMISSION_GRANTED)
        {
            Toast.makeText(this, "permission granted", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "not", Toast.LENGTH_SHORT).show();
            requestPermission();
        }
    }



    //    Implementation of selecting avatar
    @Override
    public void onClick(View v) {
        ImageView image;
        int id= v.getId();
        Drawable img;
        if (id==R.id.avatar1)
        {
            image=findViewById(R.id.avatar1);
            img=image.getDrawable();
            avatarimage.setImageDrawable(img);
        }
        if (id==R.id.avatar2)
        {
            image=findViewById(R.id.avatar2);
            img=image.getDrawable();
            avatarimage.setImageDrawable(img);
        }
        if (id==R.id.avatar3)
        {
            image=findViewById(R.id.avatar3);
            img=image.getDrawable();
            avatarimage.setImageDrawable(img);
        }
        if (id==R.id.avatar4)
        {
            image=findViewById(R.id.avatar4);
            img=image.getDrawable();
            avatarimage.setImageDrawable(img);
        }
        if (id==R.id.avatar5)
        {
            image=findViewById(R.id.avatar5);
            img=image.getDrawable();
            avatarimage.setImageDrawable(img);
        }
        if (id==R.id.avatar6)
        {
            image=findViewById(R.id.avatar6);
            img=image.getDrawable();
            avatarimage.setImageDrawable(img);
        }
        if (id==R.id.avatar7)
        {
            image=findViewById(R.id.avatar7);
            img=image.getDrawable();
            avatarimage.setImageDrawable(img);
        }
        if (id==R.id.avatar8)
        {
            image=findViewById(R.id.avatar8);
            img=image.getDrawable();
            avatarimage.setImageDrawable(img);
        }
        if (id==R.id.camera)
        {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent,1);
        }
        if (id==R.id.choosepic)
        {
            Intent intent=new Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(intent,6);
        }
        if (id==R.id.login) {
            //SQLiteDatabase db=dbHandler.getWritableDatabase();

            if (avatarimage.getDrawable() == null) {
                displayAlertMessage("Teenpatti","Please select a image");
            } else {
                Bitmap bmp = ((BitmapDrawable) avatarimage.getDrawable()).getBitmap();
                Intent intent = new Intent(PlayasguestActivity.this, MainActivity.class);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bmp.compress(Bitmap.CompressFormat.JPEG, 100, baos);
                byte[] b = baos.toByteArray();
                String encodeimage = Base64.encodeToString(b, Base64.DEFAULT);
                String setNameHere=nametext.getText().toString().trim();

                if (setNameHere.equalsIgnoreCase("") || setNameHere.equalsIgnoreCase(null)) {
                    displayAlertMessage("Teenpatti","Name can't be empty");
                } else {
                    session.put(encodeimage, setNameHere);
                    long result = loginDatabaseHelper.add(encodeimage, setNameHere);
                    Toast.makeText(this, String.valueOf(result), Toast.LENGTH_SHORT).show();
                    //intent.putExtra("img",bmp);
                    //db.execSQL("insert into User id,image,name values " + "(" + 1 +"," + "" + ","  + String.valueOf(nametext.getText()) + ")");
                    startActivity(intent);
                    finish();
                    Toast.makeText(this, String.valueOf(bmp), Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    private void displayAlertMessage(String title, String message) {

            TextView tv_alert_ok,tv_alert_title,tv_alert_message,tv_alert_cancel;
            ImageView alert_box_close;

            final Dialog myAlertDialog = new Dialog(this);
            myAlertDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            myAlertDialog.setCanceledOnTouchOutside(false);
            myAlertDialog.setContentView(R.layout.alert_box);

        tv_alert_ok = myAlertDialog.findViewById(R.id.tv_alert_ok);
        tv_alert_cancel=myAlertDialog.findViewById(R.id.tv_alert_cancel);
        alert_box_close=myAlertDialog.findViewById(R.id.alert_box_close);
        tv_alert_title=myAlertDialog.findViewById(R.id.tv_alert_title);
        tv_alert_message=myAlertDialog.findViewById(R.id.tv_alert_message);

        tv_alert_title.setText(title);
        tv_alert_message.setText(message);

        alert_box_close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    myAlertDialog.dismiss();
                }
            });

        tv_alert_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myAlertDialog.dismiss();
            }
        });

        tv_alert_cancel.setVisibility(View.GONE);
            myAlertDialog.show();

    }

    //    Implementation of camera
    @Override
    protected void onActivityResult(int requestCode,int resultcode,Intent data)
    {
        if (requestCode==1)
        {
            Bitmap bitmap=(Bitmap) data .getExtras().get("data");
            avatarimage.setImageBitmap(bitmap);

        }
        if (requestCode==6)
        {
//            Implementaion of Gallary
            Bitmap bitmap= null;
            if (resultcode==RESULT_OK)
            {
                Uri selectedimageuri=data.getData();
                String selectedimagepath=getPath(selectedimageuri);
                Toast.makeText(this, selectedimagepath, Toast.LENGTH_SHORT).show();
                avatarimage.setImageURI(selectedimageuri);
            }


            //avatarimage.setImageBitmap(bitmap);
        }
    }
    public String getPath(Uri uri) {
        String[] projection = { MediaStore.Images.Media.DATA };
        Cursor cursor = managedQuery(uri, projection, null, null, null);
        int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
        cursor.moveToFirst();
        return cursor.getString(column_index);
    }
    public void requestPermission()
    {
        if (ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.CAMERA))
        {
            new AlertDialog.Builder(this)
                    .setTitle("")
                    .setMessage("This permission is required for camera and gallery")
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions(PlayasguestActivity.this,new String[]{Manifest.permission.CAMERA},1);
                        }
                    })
                    .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .create().show();
        }
        else
        {
            ActivityCompat.requestPermissions(PlayasguestActivity.this,new String[]{Manifest.permission.CAMERA},1);
        }
    }
}
