package affwl.com.exchange;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;


public class SixPatti extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener{
    ImageView handle_right, backbtn,infobtn,infoclosebtn,chatbtn,chatclosebtn,chatclosebtn2,closebtnsixpattileadboard,leaderboardsixpattibtn,myplayerbtn,ustatusclosebtn,dealerbtn,dealerclsbtn,oplayerbtn,oustatusclosebtn,msgclosebtn,chngdealerclosebtn;;
    TextView closebtn,tipsbtn,chngdbtn,canceltipbtn,plusbtn,minusbtn,txtTimerSecond,sortbtn,gobtn;
    PopupWindow popupWindow,infopopupWindow,chatpopupWindow,themepopupWindow,ustatuspopupWindow,dealerpopupWindow,oustatuspopupWindow,sendmsgpopupWindow,chngdpopupWindow,sixpattileadboardpopupWindow;
    Button msgbtn,blockbtn;
    RelativeLayout relativeLayout,relativeLayout2,relativeLayout3;
    DrawerLayout sixpattitble;
    NavigationView navigationView;
    int minteger = 0;
    ImageView card1,card2,card3,card4,card5,card6;
    ArrayList<Integer> cards;
    int value=0;
    int value1=0;
    int value2=0;
    int value3=0;
    int value4=0;
    int value5=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six_patti);

        handle_right = findViewById(R.id.handle_right);
        handle_right.setOnClickListener(this);

//        Toggle drawer
        sixpattitble = (DrawerLayout) findViewById(R.id.sixpattitble);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, sixpattitble, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        sixpattitble.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.teen_nav_view);
        navigationView.setNavigationItemSelectedListener(this);


//        Implementation of cards
        gobtn=findViewById(R.id.sixpatti_go);
        sortbtn=findViewById(R.id.sort);
        card1=findViewById(R.id.card1);
        card2=findViewById(R.id.card2);
        card3=findViewById(R.id.card3);
        card4=findViewById(R.id.card4);
        card5=findViewById(R.id.card5);
        card6=findViewById(R.id.card6);


        cards=new ArrayList<>();
        cards.add(106);// six of clubs
        cards.add(209);// nine of diamond
        cards.add(111);// ace of clubs
        cards.add(312);// jack of hearts
        cards.add(413);// queen of spades
        cards.add(214);// king of diamond


        // deal the firts 6 cards


        card1.setVisibility(View.VISIBLE);
        card2.setVisibility(View.VISIBLE);
        card3.setVisibility(View.VISIBLE);
        card4.setVisibility(View.VISIBLE);
        card5.setVisibility(View.VISIBLE);
        card6.setVisibility(View.VISIBLE);


        // Implementaion of six cards onclick and translate animation

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (value==0) {
                    Animation animation = new TranslateAnimation(0, 0, 0, -10);
                    animation.setDuration(100);
                    animation.setFillAfter(true);
                    card1.startAnimation(animation);
                    value = 1;
                    return;
                }
                if (value==1)
                {
                    Animation animation1 = new TranslateAnimation(0, 0,0, 0);
                    animation1.setDuration(100);
                    animation1.setFillAfter(true);
                    card1.startAnimation(animation1);
                    value=0;
                    return;
                }
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (value1==0) {
                    Animation animation2 = new TranslateAnimation(0, 0, 0, -10);
                    animation2.setDuration(100);
                    animation2.setFillAfter(true);
                    card2.startAnimation(animation2);
                    value1 = 1;
                    return;
                }
                if (value1==1)
                {card2.clearAnimation();
                    Animation animation3 = new TranslateAnimation(0, 0,0, 0);
                    animation3.setDuration(100);
                    animation3.setFillAfter(true);
                    card2.startAnimation(animation3);
                    value1=0;
                    return;
                }
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (value2==0) {
                    Animation animation4 = new TranslateAnimation(0, 0, 0, -10);
                    animation4.setDuration(100);
                    animation4.setFillAfter(true);
                    card3.startAnimation(animation4);
                    value2= 1;
                    return;
                }
                if (value2==1)
                {card3.clearAnimation();
                    Animation animation5 = new TranslateAnimation(0, 0,0, 0);
                    animation5.setDuration(100);
                    animation5.setFillAfter(true);
                    card3.startAnimation(animation5);
                    value2=0;
                    return;
                }
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (value3==0) {
                    Animation animation6 = new TranslateAnimation(0, 0, 0, -10);
                    animation6.setDuration(100);
                    animation6.setFillAfter(true);
                    card4.startAnimation(animation6);
                    value3= 1;
                    return;
                }
                if (value3==1)
                {card4.clearAnimation();
                    Animation animation7 = new TranslateAnimation(0, 0,0, 0);
                    animation7.setDuration(100);
                    animation7.setFillAfter(true);
                    card4.startAnimation(animation7);
                    value3=0;
                    return;
                }
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (value4==0) {
                    Animation animation8 = new TranslateAnimation(0, 0, 0, -10);
                    animation8.setDuration(100);
                    animation8.setFillAfter(true);
                    card5.startAnimation(animation8);
                    value4= 1;
                    return;
                }
                if (value4==1)
                {card5.clearAnimation();
                    Animation animation9 = new TranslateAnimation(0, 0,0, 0);
                    animation9.setDuration(100);
                    animation9.setFillAfter(true);
                    card5.startAnimation(animation9);
                    value4=0;
                    return;
                }
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (value5==0) {
                    Animation animation10 = new TranslateAnimation(0, 0, 0, -10);
                    animation10.setDuration(100);
                    animation10.setFillAfter(true);
                    card6.startAnimation(animation10);
                    value5= 1;
                    return;
                }
                if (value5==1)
                {card6.clearAnimation();
                    Animation animation11 = new TranslateAnimation(0, 0,0, 0);
                    animation11.setDuration(100);
                    animation11.setFillAfter(true);
                    card6.startAnimation(animation11);
                    value5=0;
                    return;
                }
            }
        });




        // Click on Sort button
        sortbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Collections.sort(cards);


                // deal the firts 6 cards

                assignImages(cards.get(0),card1);
                assignImages(cards.get(1),card2);
                assignImages(cards.get(2),card3);
                assignImages(cards.get(3),card4);
                assignImages(cards.get(4),card5);
                assignImages(cards.get(5),card6);

            }
        });

    gobtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TranslateAnimation animations = new TranslateAnimation(0.0f, 0.0f,
                    0.0f, -100.0f);          //  new TranslateAnimation(xFrom,xTo, yFrom,yTo)
            animations.setDuration(100);  // animation duration
            animations.setFillAfter(true);
            //animation.setFillAfter(true);
            card1.startAnimation(animations);
            card2.startAnimation(animations);
            card3.startAnimation(animations);
        }
    });
        //////////////// Popup for Backbutton ///////////////////

        backbtn=(ImageView) findViewById(R.id.back);
        sixpattitble = (DrawerLayout) findViewById(R.id.sixpattitble);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml three_two_one_leaderboard file
                LayoutInflater layoutInflater = (LayoutInflater) SixPatti.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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

        //////////////// Popup for InfoButton ///////////////////

        infobtn=(ImageView) findViewById(R.id.info);
        sixpattitble = (DrawerLayout) findViewById(R.id.sixpattitble);

        infobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml three_two_one_leaderboard file
                LayoutInflater layoutInflater = (LayoutInflater) SixPatti.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.six_patti_infogame_popup, null);

                infoclosebtn = (ImageView) customView.findViewById(R.id.infoclose);

                //instantiate popup window
                infopopupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                infopopupWindow.showAtLocation(relativeLayout, Gravity.CENTER, 0, 0);

                //close the popup window on button click
                infoclosebtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        infopopupWindow.dismiss();
                    }
                });
            }
        });


        //////////////// Popup for ChatButton ///////////////////

        chatbtn=(ImageView) findViewById(R.id.chat);
        sixpattitble = (DrawerLayout) findViewById(R.id.sixpattitble);

        chatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml three_two_one_leaderboard file
                LayoutInflater layoutInflater = (LayoutInflater) SixPatti.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.chat_popup, null);

                chatclosebtn = (ImageView) customView.findViewById(R.id.chatclose);
                chatclosebtn2 = (ImageView) customView.findViewById(R.id.chatclose2);
                //instantiate popup window
                chatpopupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                chatpopupWindow.showAtLocation(relativeLayout, Gravity.CENTER, 0, 0);

                //close the popup window on button click
                chatclosebtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        chatpopupWindow.dismiss();
                    }
                });
                chatclosebtn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        chatpopupWindow.dismiss();
                    }
                });
            }
        });


        //////////////// Popup for Userstatus ///////////////////

        myplayerbtn=(ImageView) findViewById(R.id.myplayer);
        sixpattitble = (DrawerLayout) findViewById(R.id.sixpattitble);

        myplayerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml three_two_one_leaderboard file
                LayoutInflater layoutInflater = (LayoutInflater) SixPatti.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.player_status_popup, null);

                ustatusclosebtn = (ImageView) customView.findViewById(R.id.userstatusclose);
                //instantiate popup window
                ustatuspopupWindow = new PopupWindow(customView,RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                ustatuspopupWindow.showAtLocation(relativeLayout, Gravity.CENTER_HORIZONTAL, 0, 0);

                //close the popup window on button click
                ustatusclosebtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ustatuspopupWindow.dismiss();
                    }
                });
            }
        });



        //////////////// Popup for Otheruserstatus ///////////////////

        oplayerbtn=(ImageView) findViewById(R.id.playerbg2);
        relativeLayout= (RelativeLayout) findViewById(R.id.sixpattirecycler);

        oplayerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml three_two_one_leaderboard file
                LayoutInflater layoutInflater = (LayoutInflater) SixPatti.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.other_player_status, null);

                msgbtn = customView.findViewById(R.id.msg);

                // onclick event for message button
                msgbtn.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        LayoutInflater layoutInflater = (LayoutInflater) SixPatti.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                        View customView1 = layoutInflater.inflate(R.layout.send_message_popup, null);
                        msgclosebtn=customView1.findViewById(R.id.msgclose);
                        //instantiate popup window
                        sendmsgpopupWindow = new PopupWindow(customView1,RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

                        //display the popup window
                        sendmsgpopupWindow.showAtLocation(relativeLayout, Gravity.TOP, 0, 0);

                        //close the popup window on button click
                        msgclosebtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                sendmsgpopupWindow.dismiss();
                            }
                        });

                        oustatuspopupWindow.dismiss();
                    }

                });

                oustatusclosebtn = (ImageView) customView.findViewById(R.id.ouserstatusclose);
                //instantiate popup window
                oustatuspopupWindow = new PopupWindow(customView,RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                oustatuspopupWindow.showAtLocation(relativeLayout, Gravity.CENTER_HORIZONTAL, 0, 0);

                //close the popup window on button click
                oustatusclosebtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        oustatuspopupWindow.dismiss();
                    }
                });
            }
        });

        //////////////// Popup for Dealer ///////////////////

        dealerbtn=(ImageView) findViewById(R.id.dealer);
        sixpattitble = (DrawerLayout) findViewById(R.id.sixpattitble);

        dealerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml three_two_one_leaderboard file
                LayoutInflater layoutInflater = (LayoutInflater) SixPatti.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.dealer_popup, null);

                relativeLayout2=customView.findViewById(R.id.inctip_layout);
                relativeLayout3=customView.findViewById(R.id.bottombtns);
                tipsbtn=customView.findViewById(R.id.tipbtn);
                canceltipbtn=customView.findViewById(R.id.canceltip);
                chngdbtn=customView.findViewById(R.id.chngdealer);
                // onclick event for tip button to hide and show three_two_one_leaderboard
                tipsbtn.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        if (relativeLayout2.getVisibility()==View.INVISIBLE) {
                            relativeLayout2.setVisibility(View.VISIBLE);
                        }
                        if (relativeLayout3.getVisibility()==View.VISIBLE)
                        {
                            relativeLayout3.setVisibility(View.INVISIBLE);
                        }
                    }

                });
                // onclick event for change dealer button
                chngdbtn.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        LayoutInflater layoutInflater = (LayoutInflater) SixPatti.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                        View customView2 = layoutInflater.inflate(R.layout.change_dealer, null);
                        chngdealerclosebtn=customView2.findViewById(R.id.chngdealerclose);
                        //instantiate popup window
                        chngdpopupWindow = new PopupWindow(customView2,RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                        //display the popup window
                        chngdpopupWindow.showAtLocation(relativeLayout, Gravity.CENTER, 0, 0);

                        //close the popup window on button click
                        chngdealerclosebtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                chngdpopupWindow.dismiss();
                            }
                        });
                        dealerpopupWindow.dismiss();
                    }

                });
                // onclick event for cancel button of tip
                canceltipbtn.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        if (relativeLayout2.getVisibility()==View.VISIBLE) {
                            relativeLayout2.setVisibility(View.INVISIBLE);
                        }
                        if (relativeLayout3.getVisibility()==View.INVISIBLE)
                        {
                            relativeLayout3.setVisibility(View.VISIBLE);
                        }
                    }
                });

                //Implementation of increament button
                final TextView displayInteger = customView.findViewById(R.id.tipamount);
                plusbtn=customView.findViewById(R.id.plus);
                plusbtn.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        String sub= displayInteger.getText().toString().substring(1);
                        minteger = Integer.parseInt(sub)*2;
                        displayInteger.setText("₹" + minteger);

                    }

                });

                //Implementation of decreament
                minusbtn=customView.findViewById(R.id.minus);
                minusbtn.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        String sub= displayInteger.getText().toString().substring(1);
                        minteger =Integer.parseInt(sub)/2;
                        displayInteger.setText("₹" + minteger);
                    }
                });
                dealerclsbtn = (ImageView) customView.findViewById(R.id.dealerclose);
                //instantiate popup window
                dealerpopupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                dealerpopupWindow.showAtLocation(relativeLayout, Gravity.CENTER_HORIZONTAL, 0, 0);

                //close the popup window on button click
                dealerclsbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dealerpopupWindow.dismiss();
                    }
                });
            }
        });


        //////////////// Popup for Leaderboard ///////////////////

        leaderboardsixpattibtn=(ImageView) findViewById(R.id.leaderboardsixpatti);
        sixpattitble = (DrawerLayout) findViewById(R.id.sixpattitble);

        leaderboardsixpattibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml three_two_one_leaderboard file
                LayoutInflater layoutInflater = (LayoutInflater) SixPatti.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.six_patti_leaderboard, null);

                closebtnsixpattileadboard = (ImageView) customView.findViewById(R.id.closeleadsix);

                //instantiate popup window
                sixpattileadboardpopupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                sixpattileadboardpopupWindow.showAtLocation(relativeLayout, Gravity.CENTER, 0, 0);

                //close the popup window on button click
                closebtnsixpattileadboard.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sixpattileadboardpopupWindow.dismiss();
                    }
                });
            }
        });
    }

    /////////// Slider /////////////
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.handle_right:
                sixpattitble.openDrawer(navigationView);
                break;
        }
    }


    @Override
    public void onBackPressed() {

        LayoutInflater layoutInflater = (LayoutInflater) SixPatti.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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





    /////////// Onclick for Backtolobby /////////////

    public void backtolobby(View view)
    {
        Intent intent = new Intent(SixPatti.this, MainActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

    public void assignImages(int card, ImageView image){
        switch (card)
        {
            case 106:
                image.setImageResource(R.drawable.club_6);
                break;
            case 111:
                image.setImageResource(R.drawable.club_ace);
                break;


            case 209:
                image.setImageResource(R.drawable.diamond_9);
                break;
            case 214:
                image.setImageResource(R.drawable.diamond_king);
                break;


            case 312:
                image.setImageResource(R.drawable.heart_jack);
                break;


            case 413:
                image.setImageResource(R.drawable.spade_queen);
                break;

        }
    }

}
