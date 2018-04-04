package affwl.com.exchange;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class TeenpattiActivity extends AppCompatActivity {
    ImageView backbtn,infobtn,infoclosebtn,chatbtn,chatclosebtn,chatclosebtn2,themebtn,
                themeclosebtn,myplayerbtn,ustatusclosebtn,dealerbtn,dealerclsbtn,oplayerbtn,oustatusclosebtn,msgclosebtn;
    TextView closebtn,tipsbtn,changedbtn,canceltipbtn,plusbtn,minusbtn;
    PopupWindow popupWindow,infopopupWindow,chatpopupWindow,themepopupWindow,ustatuspopupWindow,dealerpopupWindow,oustatuspopupWindow,sendmsgpopupWindow;
    Button msgbtn,blockbtn;
    RelativeLayout relativeLayout,relativeLayout2,relativeLayout3;
    int minteger = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teenpatti);



        //////////////// Popup for Backbutton ///////////////////


        backbtn=(ImageView) findViewById(R.id.back);
        relativeLayout= (RelativeLayout) findViewById(R.id.teenpattitble);

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
        relativeLayout= (RelativeLayout) findViewById(R.id.teenpattitble);

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
        relativeLayout= (RelativeLayout) findViewById(R.id.teenpattitble);

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

        //////////////// Popup for ThemeButton ///////////////////

        themebtn=(ImageView) findViewById(R.id.theme);
        relativeLayout= (RelativeLayout) findViewById(R.id.teenpattitble);

        themebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml layout file
                LayoutInflater layoutInflater = (LayoutInflater) TeenpattiActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.thememanager_popup, null);

                themeclosebtn = (ImageView) customView.findViewById(R.id.themeclose);
                //instantiate popup window
                themepopupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                themepopupWindow.showAtLocation(relativeLayout, Gravity.CENTER, 0, 0);

                //close the popup window on button click
                themeclosebtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        themepopupWindow.dismiss();
                    }
                });
            }
        });



        //////////////// Popup for Userstatus ///////////////////

        myplayerbtn=(ImageView) findViewById(R.id.myplayer);
        relativeLayout= (RelativeLayout) findViewById(R.id.teenpattitble);

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
        relativeLayout= (RelativeLayout) findViewById(R.id.teenpattitble);

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
        relativeLayout= (RelativeLayout) findViewById(R.id.teenpattitble);

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

//                Implementation of increament button
                final TextView displayInteger = customView.findViewById(R.id.tipamount);
                plusbtn=customView.findViewById(R.id.plus);
                plusbtn.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                       String sub= displayInteger.getText().toString().substring(1);
                        minteger = Integer.parseInt(sub)*2;
                        displayInteger.setText("₹" + minteger);

                    }

                });

//                Implementation of decreament
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
                dealerpopupWindow.showAtLocation(relativeLayout, Gravity.CENTER_HORIZONTAL, -50, 0);

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
    /////////// Onclick for Backtolobby /////////////

    public void backtolobby(View view)
    {
        Intent intent = new Intent(TeenpattiActivity.this, MainActivity.class);
        startActivity(intent);
    }
}