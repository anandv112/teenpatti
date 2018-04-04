package affwl.com.exchange;

import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Dialog;
import android.app.DialogFragment;

public class MainActivity extends AppCompatActivity {

    ImageView showPopupBtn, closeRateus, closeHelpBtn, closeTrophyBtn,profile;
    PopupWindow RateuspopupWindow, HelpUspopupWindow, TrophypopupWindow;
    RelativeLayout RelativeLayoutloader;
    TextView loaderbuychips;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        ListView listView = (ListView) findViewById(R.id.ll);
//        listView.setAdapter(adapter);


        // Popup for RateUS
        showPopupBtn = findViewById(R.id.rateus_btn_loader);
        RelativeLayoutloader = findViewById(R.id.linearLayoutloader);
        profile=findViewById(R.id.profile);
        Intent intent=getIntent();
        Bitmap bmp=intent.getParcelableExtra("img");
        //Toast.makeText(this, String.valueOf(bmp), Toast.LENGTH_SHORT).show();
        profile.setImageBitmap(bmp);
        showPopupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml layout file
                LayoutInflater layoutInflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.rateus_popup,null);

                closeRateus = customView.findViewById(R.id.close_rateus);

                //instantiate popup window
                RateuspopupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

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
                HelpUspopupWindow.showAtLocation(RelativeLayoutloader, Gravity.TOP, 0, 0);

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
        ImageView showPopupBtnTropy = (ImageView) findViewById(R.id.trophy_btn_loader);
        RelativeLayoutloader = (RelativeLayout) findViewById(R.id.linearLayoutloader);

        showPopupBtnTropy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml layout file
                LayoutInflater layoutInflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.leaderboard_popup,null);


                closeTrophyBtn = customView.findViewById(R.id.leaderboardclose);

                //instantiate popup window
                TrophypopupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                TrophypopupWindow.showAtLocation(RelativeLayoutloader, Gravity.CENTER, 0, 0);

                //close the popup window on button click
                closeTrophyBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TrophypopupWindow.dismiss();
                    }
                });

                RecyclerView playerList = customView.findViewById(R.id.leaderboardlist);
                playerList.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                String[] values = {"Anand","Tejas","Anirudh","Ravi","Rohit","Francis"};
                playerList.setAdapter(new LeaderboardListAdapter(values));
            }
        });


        //Buy Chips Popup

        loaderbuychips = (findViewById(R.id.buy_chips_loader));
        loaderbuychips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                BuyChipsFragment frag = new BuyChipsFragment();
                frag.show(ft, "txn_tag");
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
