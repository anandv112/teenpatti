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
import android.widget.Toast;

public class TeenpattiActivity extends AppCompatActivity {
    ImageView backbtn,infobtn,infoclosebtn,chatbtn,chatclosebtn,chatclosebtn2,themebtn,
                themeclosebtn,myplayerbtn,ustatusclosebtn,dealerbtn,dealerclsbtn;
    TextView closebtn,tipsbtn,changedbtn,canceltipbtn,plusbtn,minusbtn;
    PopupWindow popupWindow,infopopupWindow,chatpopupWindow,themepopupWindow,ustatuspopupWindow,dealerpopupWindow;
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
                ustatuspopupWindow = new PopupWindow(customView,1600, 1000);

                //display the popup window
                ustatuspopupWindow.showAtLocation(relativeLayout, Gravity.CENTER_HORIZONTAL, -50, 0);

                //close the popup window on button click
                ustatusclosebtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ustatuspopupWindow.dismiss();
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
                final TextView displayInteger = customView.findViewById(R.id.tipamount);
                plusbtn=customView.findViewById(R.id.plus);
                plusbtn.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                       String sub= displayInteger.getText().toString().substring(1);
                        minteger = Integer.parseInt(sub)*2;
//                        display(minteger);

                        displayInteger.setText("₹" + minteger);

                    }

                });
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