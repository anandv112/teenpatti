package affwl.com.exchange;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class PlayasguestActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView selectimage,avatarimage,avatar1,avatar2,avatar3,avatar4,avatar5,avatar6,avatar7,avatar8,camera,choosepic;
    Session session;
    TextView login;
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
        if (id==R.id.login)
        {
            Bitmap bmp=((BitmapDrawable)avatarimage.getDrawable()).getBitmap();
            Intent intent=new Intent(PlayasguestActivity.this,MainActivity.class);
            intent.putExtra("img",bmp);
            startActivity(intent);
            Toast.makeText(this, String.valueOf(bmp), Toast.LENGTH_SHORT).show();
        }
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
}
