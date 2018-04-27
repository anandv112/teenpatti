package affwl.com.exchange;

import android.annotation.SuppressLint;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView showPopupBtn, closeRateus, closeHelpBtn, closeTrophyBtn,profile,orangechipsbtn,close312help,closesixpattihelp,short321info,tourney_shortinfo_closebtn,shortsixpattiinfo,bluechipsbtn,cyanchipsbtn,shortinfo_tourney,tourney_join_closebtn,share_loader,facebook,whatsapp,general;
    PopupWindow RateuspopupWindow, HelpUspopupWindow, TrophypopupWindow, tounpopupWindow,howto321popup,sixpattipopup,howtosixpattipopup,join_tourney_popupWindow,shortinfo_tourney_popupwindow;
    RelativeLayout RelativeLayoutloader,relativelayout321,relativeLayoutsixpatti,relativeLayout_tourney;
    TextView loaderbuychips,joinnowbtn,howtoplay321btn,howtoplaysixpattibtn,joinnowsixpattibtn,join_tourneybtn,nametext,code;
    Session session;

    ImageView mainychips,mainlimegchips,blackchips;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        ListView listView = (ListView) findViewById(R.id.ll);
//        listView.setAdapter(adapter);

        profile=findViewById(R.id.profile);
        nametext=findViewById(R.id.nametext);
        share_loader=findViewById(R.id.share_loader);

        mainychips=findViewById(R.id.mainychips);
        mainychips.setOnClickListener(this);

        mainlimegchips=findViewById(R.id.mainlimegchips);
        mainlimegchips.setOnClickListener(this);

        blackchips=findViewById(R.id.blackchips);
        blackchips.setOnClickListener(this);

        code=findViewById(R.id.code);
        session=new Session(this);
        String encodedimage=session.getImage();
        if (!encodedimage.equalsIgnoreCase(""))
        {
            byte[] b= Base64.decode(encodedimage, Base64.DEFAULT);
            Bitmap bmp= BitmapFactory.decodeByteArray(b,0,b.length);
            profile.setImageBitmap(bmp);
        }
        String name=session.getName();
        nametext.setText(name);

        // Popup for RateUS
        showPopupBtn = findViewById(R.id.rateus_btn_loader);
        RelativeLayoutloader = findViewById(R.id.linearLayoutloader);
//        profile=findViewById(R.id.profile);
//        Intent intent=getIntent();
//        Bitmap bmp=intent.getParcelableExtra("img");
        //Toast.makeText(this, String.valueOf(bmp), Toast.LENGTH_SHORT).show();
//        profile.setImageBitmap(bmp);
        showPopupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml three_two_one_leaderboard file
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
                //instantiate the popup.xml three_two_one_leaderboard file
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
                //instantiate the popup.xml three_two_one_leaderboard file
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
                //instantiate the popup.xml three_two_one_leaderboard file
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







        //////////////// Popup for six patti ////////////////
        bluechipsbtn = findViewById(R.id.darkbluechips);
        RelativeLayoutloader = findViewById(R.id.linearLayoutloader);
        relativeLayoutsixpatti = findViewById(R.id.relativelayoutsixpatti);


        bluechipsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml three_two_one_leaderboard file
                LayoutInflater layoutInflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.activity_how_to_play_sixpatti,null);
                shortsixpattiinfo = findViewById(R.id.shortsixpattiinfo);

                howtoplaysixpattibtn = customView.findViewById(R.id.howtoplaysixpattibtn);



                // onclick event
                howtoplaysixpattibtn.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        LayoutInflater layoutInflater1 = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                        View customView1 = layoutInflater1.inflate(R.layout.sixpatti_how_to_play_info,null);
                        closesixpattihelp = customView1.findViewById(R.id.closesixpattihelp);

                        //Instantiate the popup
                        howtosixpattipopup = new PopupWindow(customView1, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                        //display the popup window
                        howtosixpattipopup.showAtLocation(RelativeLayoutloader, Gravity.TOP, 0, 0);

                        //closing the popup
                        closesixpattihelp.setOnClickListener(new View.OnClickListener(){

                            @Override
                            public void onClick(View v) {
                                howtosixpattipopup.dismiss();
                            }
                        });
                        sixpattipopup.dismiss();
                    }
                });

                //instantiate popup window
                sixpattipopup = new PopupWindow(customView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                sixpattipopup.showAtLocation(RelativeLayoutloader, Gravity.CENTER, 0, 0);

                //join now the popup window on button click
                joinnowsixpattibtn = customView.findViewById(R.id.joinnowsixpatti);

                joinnowsixpattibtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, LoadingScreen_sixpatti.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        //////////////// Popup for Tourney ////////////////
        cyanchipsbtn = findViewById(R.id.cyanchips);
        RelativeLayoutloader = findViewById(R.id.linearLayoutloader);
        relativeLayout_tourney = findViewById(R.id.relativelayout_tourney);


        cyanchipsbtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml three_two_one_leaderboard file
                LayoutInflater layoutInflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.tourney_join_tournament_popup,null);
                shortinfo_tourney =customView.findViewById(R.id.short_tourney_info);

                tourney_join_closebtn = customView.findViewById(R.id.join_tourney_close);



                // onclick event
                shortinfo_tourney.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        LayoutInflater layoutInflater1 = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                        View customView1 = layoutInflater1.inflate(R.layout.tourney_info,null);
                        tourney_shortinfo_closebtn = customView1.findViewById(R.id.close_tourney_info);

                        //Instantiate the popup
                        shortinfo_tourney_popupwindow = new PopupWindow(customView1, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                        //display the popup window
                        shortinfo_tourney_popupwindow.showAtLocation(RelativeLayoutloader, Gravity.TOP, 0, 0);

                        //closing the popup
                        tourney_shortinfo_closebtn.setOnClickListener(new View.OnClickListener(){

                            @Override
                            public void onClick(View v) {
                                shortinfo_tourney_popupwindow.dismiss();
                            }
                        });
//                        sixpattipopup.dismiss();
                    }
                });

                //instantiate popup window
                join_tourney_popupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                join_tourney_popupWindow.showAtLocation(RelativeLayoutloader, Gravity.CENTER, 0, 0);

                //join now the popup window on button click
                join_tourneybtn = customView.findViewById(R.id.joinnow_tourney);

                join_tourneybtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, LoadingScreen_tourney.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

//        Implementation of share

        share_loader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(v.getContext());
                LayoutInflater inflater=getLayoutInflater();
                View view= inflater.inflate(R.layout.share_dialog,null);
                builder.setView(view);
                facebook=view.findViewById(R.id.facebook);
                whatsapp=view.findViewById(R.id.whatsapp);
                general=view.findViewById(R.id.general);
                facebook.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                        sharingIntent.setType("text/plain");
                        sharingIntent.putExtra(Intent.EXTRA_TEXT, "http://www.facebook.com");
                        startActivity(Intent.createChooser(sharingIntent, "Share via"));
                    }
                });
                whatsapp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
                        whatsappIntent.setType("text/plain");
                        whatsappIntent.setPackage("com.whatsapp");
                        whatsappIntent.putExtra(Intent.EXTRA_TEXT, "The text you wanted to share");
                        try {
                            startActivity(whatsappIntent);
                        } catch (android.content.ActivityNotFoundException ex) {
                            Toast.makeText(MainActivity.this, "whatsapp not installed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                general.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Uri pictureUri = Uri.parse("https://lifeclearance.com/androidImages/0.png");
                        Intent shareIntent = new Intent();
                        shareIntent.setAction(Intent.ACTION_SEND);
                        shareIntent.putExtra(Intent.EXTRA_STREAM, "hi");
                        shareIntent.setType("text/plain");
                        //shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                        startActivity(Intent.createChooser(shareIntent, "Share images..."));
                    }
                });
                AlertDialog alert= builder.create();
                WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
                lp.copyFrom(alert.getWindow().getAttributes());
                lp.width = WindowManager.LayoutParams.MATCH_PARENT;
                lp.height = WindowManager.LayoutParams.MATCH_PARENT;
                alert.show();
                alert.getWindow().setAttributes(lp);
                // builder.show();


            }
        });


        //////////////// Popup for Tourney ////////////////
        cyanchipsbtn = findViewById(R.id.cyanchips);
        RelativeLayoutloader = findViewById(R.id.linearLayoutloader);
        relativeLayout_tourney = findViewById(R.id.relativelayout_tourney);


        cyanchipsbtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml layout file
                LayoutInflater layoutInflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.tourney_join_tournament_popup,null);
                shortinfo_tourney =customView.findViewById(R.id.short_tourney_info);

                tourney_join_closebtn = customView.findViewById(R.id.join_tourney_close);



                // onclick event
                shortinfo_tourney.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        LayoutInflater layoutInflater1 = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                        View customView1 = layoutInflater1.inflate(R.layout.tourney_info,null);
                        tourney_shortinfo_closebtn = customView1.findViewById(R.id.close_tourney_info);

                        //Instantiate the popup
                        shortinfo_tourney_popupwindow = new PopupWindow(customView1, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                        //display the popup window
                        shortinfo_tourney_popupwindow.showAtLocation(RelativeLayoutloader, Gravity.TOP, 0, 0);

                        //closing the popup
                        tourney_shortinfo_closebtn.setOnClickListener(new View.OnClickListener(){

                            @Override
                            public void onClick(View v) {
                                shortinfo_tourney_popupwindow.dismiss();
                            }
                        });
//                        sixpattipopup.dismiss();
                    }
                });

                //instantiate popup window
                join_tourney_popupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                join_tourney_popupWindow.showAtLocation(RelativeLayoutloader, Gravity.CENTER, 0, 0);

                //join now the popup window on button click
                join_tourneybtn = customView.findViewById(R.id.joinnow_tourney);

                join_tourneybtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, LoadingScreen_tourney.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

//        Implementation of share

        share_loader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(v.getContext());
                LayoutInflater inflater=getLayoutInflater();
                View view= inflater.inflate(R.layout.share_dialog,null);
                builder.setView(view);
                facebook=view.findViewById(R.id.facebook);
                whatsapp=view.findViewById(R.id.whatsapp);
                general=view.findViewById(R.id.general);
                facebook.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                        sharingIntent.setType("text/plain");
                        sharingIntent.putExtra(Intent.EXTRA_TEXT, "http://www.facebook.com");
                        startActivity(Intent.createChooser(sharingIntent, "Share via"));
                    }
                });
                whatsapp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
                        whatsappIntent.setType("text/plain");
                        whatsappIntent.setPackage("com.whatsapp");
                        whatsappIntent.putExtra(Intent.EXTRA_TEXT, "The text you wanted to share");
                        try {
                            startActivity(whatsappIntent);
                        } catch (android.content.ActivityNotFoundException ex) {
                            Toast.makeText(MainActivity.this, "whatsapp not installed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                general.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Uri pictureUri = Uri.parse("https://lifeclearance.com/androidImages/0.png");
                        Intent shareIntent = new Intent();
                        shareIntent.setAction(Intent.ACTION_SEND);
                        shareIntent.putExtra(Intent.EXTRA_STREAM, "hi");
                        shareIntent.setType("text/plain");
                        //shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                        startActivity(Intent.createChooser(shareIntent, "Share images..."));
                    }
                });
                AlertDialog alert= builder.create();
                WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
                lp.copyFrom(alert.getWindow().getAttributes());
                lp.width = WindowManager.LayoutParams.MATCH_PARENT;
                lp.height = WindowManager.LayoutParams.MATCH_PARENT;
                alert.show();
                alert.getWindow().setAttributes(lp);
                // builder.show();


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

    //////////// Onclick method for teenpatti table /////////////


    @Override
    public void onBackPressed() {
            displayExitAlert("Alert","Do you want to Exit?");
        }

    private void displayExitAlert(String title, String message) {

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
            tv_alert_ok.setText("Yes");
            tv_alert_cancel.setText("No");

            alert_box_close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    myAlertDialog.dismiss();
                }
            });

            tv_alert_ok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    System.exit(0);
                }
            });

            tv_alert_cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    myAlertDialog.dismiss();
                }
            });
            myAlertDialog.show();

        }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mainychips:
                startActivity(new Intent(MainActivity.this, LoadingScreen_teenpatti.class));
                finish();
                break;

            case R.id.mainlimegchips:
                startActivity(new Intent(MainActivity.this, Variation.class));
                finish();
                break;

            case R.id.blackchips:
                startActivity(new Intent(MainActivity.this, NewVariationActivity.class));
                finish();
                break;
        }
    }
}

