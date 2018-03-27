package affwl.com.exchange;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class TeenpattiActivity extends AppCompatActivity {
    ImageView backbtn;
    TextView closebtn;
    PopupWindow popupWindow;
    RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teenpatti);

        backbtn=(ImageView) findViewById(R.id.back);
        relativeLayout= (RelativeLayout) findViewById(R.id.teenpattitble);


        //////////////// Popup for Backbutton ///////////////////

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml layout file
                LayoutInflater layoutInflater = (LayoutInflater) TeenpattiActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.backbutton_popup, null);

                closebtn = (TextView) customView.findViewById(R.id.close);

                //instantiate popup window
                popupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                popupWindow.showAtLocation(relativeLayout, Gravity.CENTER, 0, 0);

                //close the popup window on button click
                closebtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                    }
                });
            }
        });
    }


    /////////// Onclick for Backtolobby /////////////

    public void backtolobby(View view)
    {
        Intent intent = new Intent(TeenpattiActivity.this, MainActivity.class);
        startActivity(intent);
    }
}