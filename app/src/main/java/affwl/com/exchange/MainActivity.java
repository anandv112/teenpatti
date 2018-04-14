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


    ImageView showPopupBtn, closeRateus, closeHelpBtn, closeTrophyBtn,profile,orangechipsbtn,close312help,close321tour,short321info,close321shortinfo;
    PopupWindow RateuspopupWindow, HelpUspopupWindow, TrophypopupWindow, tounpopupWindow,howto321popup,threetwoonetour,infoshort321;
    RelativeLayout RelativeLayoutloader,relativelayout321;
    TextView loaderbuychips,joinnowbtn,howtoplay321btn;



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
        showPopupBtn = findViewById(R.id.help_btn_loader);
        RelativeLayoutloader = findViewById(R.id.linearLayoutloader);

        showPopupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml layout file
                LayoutInflater layoutInflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.help_popup,null);

                closeHelpBtn = customView.findViewById(R.id.close_helpus);

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
        ImageView showPopupBtnTropy = findViewById(R.id.trophy_btn_loader);
        RelativeLayoutloader = findViewById(R.id.linearLayoutloader);

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


        //////////////// Popup for 321 tournament ////////////////
        orangechipsbtn = findViewById(R.id.mainorgchips);
        RelativeLayoutloader = findViewById(R.id.linearLayoutloader);
        relativelayout321 = findViewById(R.id.relativelayout321);


        orangechipsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml layout file
                LayoutInflater layoutInflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.activity_how_to_play_three_two_one,null);
                short321info = findViewById(R.id.short312info);

                howtoplay321btn = customView.findViewById(R.id.howtoplay321btn);



                // onclick event
                howtoplay321btn.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        LayoutInflater layoutInflater1 = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                        View customView1 = layoutInflater1.inflate(R.layout.threetwoone_how_to_play_info,null);
                        close312help = customView1.findViewById(R.id.close312help);

                        //Instantiate the popup
                        howto321popup = new PopupWindow(customView1, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                        //display the popup window
                        howto321popup.showAtLocation(RelativeLayoutloader, Gravity.TOP, 0, 0);

                        //closing the popup
                        close312help.setOnClickListener(new View.OnClickListener(){

                            @Override
                            public void onClick(View v) {
                                howto321popup.dismiss();
                            }
                        });
                        tounpopupWindow.dismiss();
                    }
                });

//                short321info.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        LayoutInflater layoutInflater = (LayoutInflater)MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//                        View customView2 = layoutInflater.inflate(R.layout.three_two_one_short_info,null);
//
//                        close321shortinfo = customView2.findViewById(R.id.close321shortinfo);
//
//                        //Instantiate
//                        infoshort321 = new PopupWindow(customView2,RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.MATCH_PARENT);
//
//                        //Display
//                        infoshort321.showAtLocation(RelativeLayoutloader,Gravity.TOP,0,0);
//
//                        //close
//                        close321shortinfo.setOnClickListener(new View.OnClickListener(){
//
//                            @Override
//                            public void onClick(View v) {
//                                infoshort321.dismiss();
//                            }
//                        });
//                    }
//                });
                //instantiate popup window
                tounpopupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                tounpopupWindow.showAtLocation(RelativeLayoutloader, Gravity.CENTER, 0, 0);

                //join now the popup window on button click
                joinnowbtn = customView.findViewById(R.id.joinnow);

                joinnowbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, ThreetwooneTournament.class);
                        startActivity(intent);
                    }
                });
            }
        });


        // Animation of chips on main page

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.mainactivity_chips_rotate);
        findViewById(R.id.mainychips).startAnimation(animation);
//        findViewById(R.id.mainbchips).startAnimation(animation);
        findViewById(R.id.mainlimegchips).startAnimation(animation);
        findViewById(R.id.mainorgchips).startAnimation(animation);
        findViewById(R.id.darkbluechips).startAnimation(animation);
        findViewById(R.id.cyanchips).startAnimation(animation);
        findViewById(R.id.blackchips).startAnimation(animation);
        findViewById(R.id.ygreenchips).startAnimation(animation);
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
//        findViewById(R.id.mainbchips).startAnimation(antianimation);
//        findViewById(R.id.mainorgchips).startAnimation(antianimation);
//        findViewById(R.id.blackchips).startAnimation(antianimation);
//        findViewById(R.id.ygreenchips).startAnimation(antianimation);
        findViewById(R.id.innerlime).startAnimation(antianimation);
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

    //////////// Onclick method for teenpatti table
    public void sendTeenpattiPage(View view)
    {
        Intent intent = new Intent(MainActivity.this, LoadingScreen_teenpatti.class);
        startActivity(intent);
    }

    public void sendVariationPage(View view)
    {
        Intent intent = new Intent(MainActivity.this, Variation.class);
        startActivity(intent);
    }
}
