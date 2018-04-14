package affwl.com.exchange;

import android.content.Context;
import android.content.Intent;
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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class TeenpattiActivity extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener{
    ImageView handle_right, backbtn,infobtn,infoclosebtn,chatbtn,chatclosebtn,chatclosebtn2,themebtn,themeclosebtn,myplayerbtn,ustatusclosebtn,dealerbtn,dealerclsbtn,oplayerbtn,oustatusclosebtn,msgclosebtn,chngdealerclosebtn;;
    TextView closebtn,tipsbtn,chngdbtn,canceltipbtn,plusbtn,minusbtn;
    PopupWindow popupWindow,infopopupWindow,chatpopupWindow,themepopupWindow,ustatuspopupWindow,dealerpopupWindow,oustatuspopupWindow,sendmsgpopupWindow,chngdpopupWindow;
    Button msgbtn,blockbtn;
    RelativeLayout relativeLayout,relativeLayout2,relativeLayout3;
    DrawerLayout teenpattitble;
    NavigationView navigationView;

    int minteger = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teenpatti);

        handle_right = findViewById(R.id.handle_right);
        handle_right.setOnClickListener(this);


        teenpattitble = (DrawerLayout) findViewById(R.id.teenpattitble);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, teenpattitble, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        teenpattitble.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.teen_nav_view);
        navigationView.setNavigationItemSelectedListener(this);




        //////////////// Popup for Backbutton ///////////////////


        backbtn=(ImageView) findViewById(R.id.back);
        teenpattitble = (DrawerLayout) findViewById(R.id.teenpattitble);

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

    //////////////// Popup for InfoButton ///////////////////

        infobtn=(ImageView) findViewById(R.id.info);
        teenpattitble = (DrawerLayout) findViewById(R.id.teenpattitble);

        infobtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //instantiate the popup.xml layout file
            LayoutInflater layoutInflater = (LayoutInflater) TeenpattiActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View customView = layoutInflater.inflate(R.layout.infogame_popup, null);

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
        teenpattitble = (DrawerLayout) findViewById(R.id.teenpattitble);

        chatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml layout file
                LayoutInflater layoutInflater = (LayoutInflater) TeenpattiActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
        teenpattitble = (DrawerLayout) findViewById(R.id.teenpattitble);

        myplayerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml layout file
                LayoutInflater layoutInflater = (LayoutInflater) TeenpattiActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
        relativeLayout= (RelativeLayout) findViewById(R.id.teenpattitblerecycler);

       oplayerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml layout file
                LayoutInflater layoutInflater = (LayoutInflater) TeenpattiActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.other_player_status, null);

                msgbtn=customView.findViewById(R.id.msg);

                // onclick event for message button
                msgbtn.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        LayoutInflater layoutInflater = (LayoutInflater) TeenpattiActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
        teenpattitble = (DrawerLayout) findViewById(R.id.teenpattitble);

        dealerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml layout file
                LayoutInflater layoutInflater = (LayoutInflater) TeenpattiActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.dealer_popup, null);

                    relativeLayout2=customView.findViewById(R.id.inctip_layout);
                    relativeLayout3=customView.findViewById(R.id.bottombtns);
                    tipsbtn=customView.findViewById(R.id.tipbtn);
                    canceltipbtn=customView.findViewById(R.id.canceltip);
                    chngdbtn=customView.findViewById(R.id.chngdealer);
                        // onclick event for tip button to hide and show layout
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
                        LayoutInflater layoutInflater = (LayoutInflater) TeenpattiActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
    }

    /////////// Slider /////////////
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.handle_right:
                teenpattitble.openDrawer(navigationView);
                break;
        }
    }


    @Override
    public void onBackPressed() {

        if (teenpattitble.isDrawerOpen(GravityCompat.START)) {
            teenpattitble.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }





    /////////// Onclick for Backtolobby /////////////

    public void backtolobby(View view)
    {
        Intent intent = new Intent(TeenpattiActivity.this, MainActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
//    public void increaseInteger(View v) {
//        minteger = minteger + 1;
//        display(minteger);
//
//    }
//    public void decreaseInteger(View v) {
//        minteger = minteger - 1;
//        display(minteger);
//    }
//
//    private void display(int number) {
//        TextView displayInteger = (TextView) findViewById(R.id.tipamount);
//        if (displayInteger.getVisibility()==View.VISIBLE) {
//            displayInteger.setText("" + number);
//        }
//    }

}