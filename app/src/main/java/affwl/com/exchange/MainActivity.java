package affwl.com.exchange;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    ImageView showPopupBtn, closeRateus, closeHelpBtn, closeTrophyBtn;
    PopupWindow RateuspopupWindow, HelpUspopupWindow, TrophypopupWindow;
    RelativeLayout RelativeLayoutloader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Popup for RateUS
        showPopupBtn = (ImageView) findViewById(R.id.rateus_btn_loader);
        RelativeLayoutloader = (RelativeLayout) findViewById(R.id.linearLayoutloader);

        showPopupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml layout file
                LayoutInflater layoutInflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.rateus_popup,null);

                closeRateus = (ImageView) customView.findViewById(R.id.close_rateus);

                //instantiate popup window
                RateuspopupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

                //display the popup window
                RateuspopupWindow.showAtLocation(RelativeLayoutloader, Gravity.CENTER, 0, 0);

                //close the popup window on button click
                closeRateus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        RateuspopupWindow.dismiss();
                    }
                });

            }
        });

        // Popup for Help
        showPopupBtn = (ImageView) findViewById(R.id.help_btn_loader);
        RelativeLayoutloader = (RelativeLayout) findViewById(R.id.linearLayoutloader);

        showPopupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml layout file
                LayoutInflater layoutInflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.help_popup,null);

                closeHelpBtn = (ImageView) customView.findViewById(R.id.close_helpus);

                //instantiate popup window
                HelpUspopupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

                //display the popup window
                HelpUspopupWindow.showAtLocation(RelativeLayoutloader, Gravity.CENTER, 0, 0);

                //close the popup window on button click
                closeHelpBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        HelpUspopupWindow.dismiss();
                    }
                });

            }
        });

        // Popup for Leaderboard
        showPopupBtn = (ImageView) findViewById(R.id.trophy_btn_loader);
        RelativeLayoutloader = (RelativeLayout) findViewById(R.id.linearLayoutloader);

        showPopupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml layout file
                LayoutInflater layoutInflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.rateus_popup,null);

                closeTrophyBtn = (ImageView) customView.findViewById(R.id.close_rateus);

                //instantiate popup window
                TrophypopupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

                //display the popup window
                TrophypopupWindow.showAtLocation(RelativeLayoutloader, Gravity.CENTER, 0, 0);

                //close the popup window on button click
                closeTrophyBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TrophypopupWindow.dismiss();
                    }
                });
            }
        });



        // Animation of chips on main page

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.mainactivity_chips_rotate);
        findViewById(R.id.mainychips).startAnimation(animation);
//        findViewById(R.id.mainbchips).startAnimation(animation);
        findViewById(R.id.mainlimegchips).startAnimation(animation);
//        findViewById(R.id.mainorgchips).startAnimation(animation);
        findViewById(R.id.darkbluechips).startAnimation(animation);
        findViewById(R.id.cyanchips).startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
//                finish();
//                startActivity(new Intent(String.valueOf(MainActivity.this)));

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        Animation antianimation = AnimationUtils.loadAnimation(this, R.anim.mainactivity_chips_rotate_anticlockwise);
        findViewById(R.id.mainbchips).startAnimation(antianimation);
        findViewById(R.id.mainorgchips).startAnimation(antianimation);
        findViewById(R.id.blackchips).startAnimation(antianimation);
        findViewById(R.id.ygreenchips).startAnimation(antianimation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
//                finish();
//                startActivity(new Intent(String.valueOf(MainActivity.this)));

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

//////////// Onclick method for table
    public void sendTeenpattiPage(View view)
    {
        Intent intent = new Intent(MainActivity.this, TeenpattiActivity.class);
        startActivity(intent);
    }
}
