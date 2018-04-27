package affwl.com.exchange;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.DragEvent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class ThreetwooneTournament extends AppCompatActivity implements View.OnDragListener, View.OnLongClickListener{

    private static final String TAG = ThreetwooneTournament.class.getSimpleName();
    private ImageView card321_1,card321_2,card321_3,card321_4,card321_5,card321_6;
    private static final String IMAGE_VIEW_TAG_1 = "CARD ONE";
    private static final String IMAGE_VIEW_TAG_2 = "CARD TWO";
    private static final String IMAGE_VIEW_TAG_3 = "CARD THREE";
    private static final String IMAGE_VIEW_TAG_4 = "CARD FOUR";
    private static final String IMAGE_VIEW_TAG_5 = "CARD FIVE";
    private static final String IMAGE_VIEW_TAG_6 = "CARD SIX";


    ImageView closeleadleader321,leaderboard321,closeTrophyBtn,handle_right, backbtn,infobtn,infoclosebtn,chat321,chatclosebtn,chatclosebtn2,themebtn,themeclosebtn,myplayerbtn,ustatusclosebtn,dealerbtn,dealerclsbtn,oplayerbtn,oustatusclosebtn,msgclosebtn,chngdealerclosebtn;
    TextView closebtn,tipsbtn,chngdbtn,canceltipbtn,plusbtn,minusbtn,txtTimerSecond,backtolobby;
    PopupWindow threetwooneleadboardpopupWindow,TrophypopupWindow,popupWindow,infopopupWindow,chatpopupWindow,themepopupWindow,ustatuspopupWindow,dealerpopupWindow,oustatuspopupWindow,sendmsgpopupWindow,chngdpopupWindow;
    Button msgbtn,blockbtn,cards321shifterbtn;
    RelativeLayout relativeLayout,relativeLayout2,relativeLayout3,RelativeLayoutloader;
    DrawerLayout tournamenttble;
    NavigationView navigationView;
    LinearLayout linearcardholder321;
    int minteger = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threetwoone_tournament);
        findViews();
        implementEvents();

//        handle_right = findViewById(R.id.handle_right);
//        tournamenttble = findViewById(R.id.tournamenttble);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, tournamenttble, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        tournamenttble.addDrawerListener(toggle);
//        toggle.syncState();
//
//        navigationView = findViewById(R.id.teen_nav_view);
//        navigationView.setNavigationItemSelectedListener(this);
//        handle_right.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            //instantiate the popup.xml three_two_one_leaderboard file
//            LayoutInflater layoutInflater = (LayoutInflater) ThreetwooneTournament.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            View customView = layoutInflater.inflate(R.three_two_one_leaderboard.leaderboard_popup,null);
//
//            RecyclerView playerList = customView.findViewById(R.id.leaderboardlist);
//            playerList.setLayoutManager(new LinearLayoutManager(ThreetwooneTournament.this));
//            String[] values = {"Anand","Tejas","Anirudh","Ravi","Rohit","Francis"};
//            playerList.setAdapter(new LeaderboardListAdapter(values));
//        }
//    });




        //////////////// Popup for Backbutton ///////////////////


        backbtn= findViewById(R.id.back);
        tournamenttble = findViewById(R.id.tournamenttble);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml three_two_one_leaderboard file
                LayoutInflater layoutInflater = (LayoutInflater) ThreetwooneTournament.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.backbutton_popup, null);

                closebtn = customView.findViewById(R.id.close);
                backtolobby=customView.findViewById(R.id.backtolobby);
                //instantiate popup window
                popupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                popupWindow.showAtLocation(tournamenttble, Gravity.CENTER, 0, 0);

                //close the popup window on button click
                closebtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                    }
                });

                backtolobby.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(ThreetwooneTournament.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        //////////////// Popup for InfoButton ///////////////////

        infobtn= findViewById(R.id.info);
        tournamenttble = findViewById(R.id.tournamenttble);

        infobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml three_two_one_leaderboard file
                LayoutInflater layoutInflater = (LayoutInflater) ThreetwooneTournament.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.infogame_popup, null);

                infoclosebtn = customView.findViewById(R.id.infoclose);

                //instantiate popup window
                infopopupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                infopopupWindow.showAtLocation(tournamenttble, Gravity.CENTER, 0, 0);

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

        chat321= findViewById(R.id.chat321);
        tournamenttble = findViewById(R.id.tournamenttble);

        chat321.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml three_two_one_leaderboard file
                LayoutInflater layoutInflater = (LayoutInflater) ThreetwooneTournament.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.chat_popup, null);

                chatclosebtn = customView.findViewById(R.id.chatclose);
                chatclosebtn2 = customView.findViewById(R.id.chatclose2);
                //instantiate popup window
                chatpopupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                chatpopupWindow.showAtLocation(tournamenttble, Gravity.CENTER, 0, 0);

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

        myplayerbtn= findViewById(R.id.myplayer);
        tournamenttble = findViewById(R.id.tournamenttble);

        myplayerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml three_two_one_leaderboard file
                LayoutInflater layoutInflater = (LayoutInflater) ThreetwooneTournament.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.player_status_popup, null);

                ustatusclosebtn = customView.findViewById(R.id.userstatusclose);
                //instantiate popup window
                ustatuspopupWindow = new PopupWindow(customView,RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                ustatuspopupWindow.showAtLocation(tournamenttble, Gravity.CENTER_HORIZONTAL, 0, 0);

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

        oplayerbtn= findViewById(R.id.playerbg2);
        tournamenttble = findViewById(R.id.tournamenttble);

        oplayerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml three_two_one_leaderboard file
                LayoutInflater layoutInflater = (LayoutInflater) ThreetwooneTournament.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.other_player_status, null);

                msgbtn = customView.findViewById(R.id.msg);

                // onclick event for message button
                msgbtn.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        LayoutInflater layoutInflater = (LayoutInflater) ThreetwooneTournament.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                        View customView1 = layoutInflater.inflate(R.layout.send_message_popup, null);
                        msgclosebtn=customView1.findViewById(R.id.msgclose);
                        //instantiate popup window
                        sendmsgpopupWindow = new PopupWindow(customView1,RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

                        //display the popup window
                        sendmsgpopupWindow.showAtLocation(tournamenttble, Gravity.TOP, 0, 0);

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

                oustatusclosebtn = customView.findViewById(R.id.ouserstatusclose);
                //instantiate popup window
                oustatuspopupWindow = new PopupWindow(customView,RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                oustatuspopupWindow.showAtLocation(tournamenttble, Gravity.CENTER_HORIZONTAL, 0, 0);

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

        dealerbtn= findViewById(R.id.dealer);
        tournamenttble = findViewById(R.id.tournamenttble);

        dealerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml three_two_one_leaderboard file
                LayoutInflater layoutInflater = (LayoutInflater) ThreetwooneTournament.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
                        LayoutInflater layoutInflater = (LayoutInflater) ThreetwooneTournament.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                        View customView2 = layoutInflater.inflate(R.layout.change_dealer, null);
                        chngdealerclosebtn=customView2.findViewById(R.id.chngdealerclose);
                        //instantiate popup window
                        chngdpopupWindow = new PopupWindow(customView2,RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                        //display the popup window
                        chngdpopupWindow.showAtLocation(tournamenttble, Gravity.CENTER, 0, 0);

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
                dealerclsbtn = customView.findViewById(R.id.dealerclose);
                //instantiate popup window
                dealerpopupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                dealerpopupWindow.showAtLocation(tournamenttble, Gravity.CENTER_HORIZONTAL, 0, 0);

                //close the popup window on button click
                dealerclsbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dealerpopupWindow.dismiss();
                    }
                });
            }
        });

        //Button hides the buttn slides the three_two_one_leaderboard
        cards321shifterbtn = findViewById(R.id.cards321shifterbtn);
        cards321shifterbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                cards321shifterbtn.setVisibility(View.GONE);
                linearcardholder321 = findViewById(R.id.linearcardholder321);
                linearcardholder321.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT));
                linearcardholder321.setGravity(Gravity.CENTER);
            }
        });


        //////////////// Popup for Leaderboard ///////////////////

        leaderboard321=(ImageView) findViewById(R.id.leaderboard321);
        tournamenttble = (DrawerLayout) findViewById(R.id.tournamenttble);

        leaderboard321.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml three_two_one_leaderboard file
                LayoutInflater layoutInflater = (LayoutInflater) ThreetwooneTournament.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.three_two_one_leaderboard, null);

                closeleadleader321 = (ImageView) customView.findViewById(R.id.closeleadleader321);

                //instantiate popup window
                threetwooneleadboardpopupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                //display the popup window
                threetwooneleadboardpopupWindow.showAtLocation(tournamenttble, Gravity.CENTER, 0, 0);

                //close the popup window on button click
                closeleadleader321.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        threetwooneleadboardpopupWindow.dismiss();
                    }
                });
            }
        });



    }

    //Finds all views and set Tag to all draggable views
    private void findViews() {
        card321_1 = findViewById(R.id.card321_1);
        card321_1.setTag(IMAGE_VIEW_TAG_1);
        card321_2 = findViewById(R.id.card321_2);
        card321_2.setTag(IMAGE_VIEW_TAG_2);
        card321_3 = findViewById(R.id.card321_3);
        card321_3.setTag(IMAGE_VIEW_TAG_3);
        card321_4 = findViewById(R.id.card321_4);
        card321_4.setTag(IMAGE_VIEW_TAG_4);
        card321_5 = findViewById(R.id.card321_5);
        card321_5.setTag(IMAGE_VIEW_TAG_5);
        card321_6 = findViewById(R.id.card321_6);
        card321_6.setTag(IMAGE_VIEW_TAG_6);
    }

    //Implements long click and drag listener
    private void implementEvents() {
        //add or remove any view that you don't want to be dragged
        card321_1.setOnLongClickListener(this);
        card321_2.setOnLongClickListener(this);
        card321_3.setOnLongClickListener(this);
        card321_4.setOnLongClickListener(this);
        card321_5.setOnLongClickListener(this);
        card321_6.setOnLongClickListener(this);

        //the specified layouts where cards are dropped
        findViewById(R.id.greencardholder).setOnDragListener(this);
        findViewById(R.id.bluecardholder).setOnDragListener(this);
        findViewById(R.id.cyancardholder).setOnDragListener(this);
        findViewById(R.id.default321layout).setOnDragListener(this);
    }

    /////////// Slider /////////////
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.handle_right:
//                tournamenttble.openDrawer(navigationView);
//                break;
//        }
//    }


    @Override
    public void onBackPressed() {

        LayoutInflater layoutInflater = (LayoutInflater) ThreetwooneTournament.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView = layoutInflater.inflate(R.layout.backbutton_popup, null);

        closebtn = (TextView) customView.findViewById(R.id.close);
        backtolobby=customView.findViewById(R.id.backtolobby);

        //instantiate popup window
        popupWindow = new PopupWindow(customView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

        //display the popup window
        popupWindow.showAtLocation(tournamenttble, Gravity.CENTER, 0, 0);

        //close the popup window on button click
        closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });


        backtolobby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThreetwooneTournament.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


    @Override
    public boolean onLongClick(View v) {
        // this method creates a new ClipData.
        // This is done in two steps to provide clarity. The convenience method

        // Create a new ClipData.Item from the ImageView object's tag
        ClipData.Item item = new ClipData.Item((CharSequence) v.getTag());

        // Create a new ClipData using the tag as a label, the plain text MIME type, and
        // the already-created item. This will create a new ClipDescription object within the
        // ClipData, and set its MIME type entry to "text/plain"
        String[] mimeTypes = {ClipDescription.MIMETYPE_TEXT_PLAIN};

        ClipData data = new ClipData(v.getTag().toString(), mimeTypes, item);

        // Instantiates the drag shadow builder.
        View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);

        // Starts the drag
        v.startDrag(data//data to be dragged
                , shadowBuilder //drag shadow
                , v//local data about the drag and drop operation
                , 0//no needed flags
        );

        //Set view visibility to INVISIBLE as we are going to drag the view
        v.setVisibility(View.INVISIBLE);
        return true;
    }
    // This is the method that the system calls when it dispatches a drag event to the
    // listener.
    @Override
    public boolean onDrag(View view, DragEvent event) {
        // Defines a variable to store the action type for the incoming event
        int action = event.getAction();
        // Handles each of the expected events
        switch (action) {
            case DragEvent.ACTION_DRAG_STARTED:
                // Determines if this View can accept the dragged data
                if (event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)) {
                    // if you want to apply color when drag started to your view you can uncomment below lines
                    // to give any color tint to the View to indicate that it can accept
                    // data.

                    //  view.getBackground().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);//set background color to your view

                    // Invalidate the view to force a redraw in the new tint
                    //  view.invalidate();

                    // returns true to indicate that the View can accept the dragged data.
                    return true;

                }

                // Returns false. During the current drag and drop operation, this View will
                // not receive events again until ACTION_DRAG_ENDED is sent.
                return false;

            case DragEvent.ACTION_DRAG_ENTERED:
                // Applies a YELLOW or any color tint to the View, when the dragged view entered into drag acceptable view
                // Return true; the return value is ignored.

//                view.getBackground().setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_IN);

                // Invalidate the view to force a redraw in the new tint
                view.invalidate();

                return true;
            case DragEvent.ACTION_DRAG_LOCATION:
                // Ignore the event
                return true;
            case DragEvent.ACTION_DRAG_EXITED:
                // Re-sets the color tint to blue, if you had set the BLUE color or any color in ACTION_DRAG_STARTED. Returns true; the return value is ignored.

                //  view.getBackground().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);

                //If u had not provided any color in ACTION_DRAG_STARTED then clear color filter.
//                view.getBackground().clearColorFilter();
                // Invalidate the view to force a redraw in the new tint
                view.invalidate();

                return true;
            case DragEvent.ACTION_DROP:
                // Gets the item containing the dragged data
                ClipData.Item item = event.getClipData().getItemAt(0);

                // Gets the text data from the item.
                String dragData = item.getText().toString();

                // Displays a message containing the dragged data.
                Toast.makeText(this, "Dragged card is " + dragData, Toast.LENGTH_SHORT).show();

                // Turns off any color tints
//                view.getBackground().clearColorFilter();

                // Invalidates the view to force a redraw
                view.invalidate();

                View v = (View) event.getLocalState();
                ViewGroup owner = (ViewGroup) v.getParent();
                owner.removeView(v);//remove the dragged view
                LinearLayout container = (LinearLayout) view;//caste the view into LinearLayout as our drag acceptable three_two_one_leaderboard is LinearLayout
                container.addView(v);//Add the dragged view
                v.setVisibility(View.VISIBLE);//finally set Visibility to VISIBLE

                // Returns true. DragEvent.getResult() will return true.
                return true;
            case DragEvent.ACTION_DRAG_ENDED:
                // Turns off any color tinting
                // view.getBackground().clearColorFilter();

                // Invalidates the view to force a redraw
                view.invalidate();

                // Does a getResult(), and displays what happened.
//                if (event.getResult())
//                    Toast.makeText(this, "The drop was handled.", Toast.LENGTH_SHORT).show();
//
//                else
//                    Toast.makeText(this, "The drop didn't work.", Toast.LENGTH_SHORT).show();


                // returns true; the value is ignored.
                return true;

            // An unknown action type was received.
            default:
                Log.e("DragDrop Example", "Unknown action type received by OnDragListener.");
                break;
        }
        return false;
    }

//    @Override
//    public void onClick(View v) {
//        return;
//    }


//        Animation animZoomIn = AnimationUtils.loadAnimation(getApplicationContext(),
//                R.anim.zoom_in);
//        RelativeLayout vrelative=three_two_one_leaderboard.findViewById(R.id.variation);
//        vrelative.setVisibility(View.VISIBLE);
//        vrelative.startAnimation(animZoomIn);
//
//
//        Animation animZoomOut = AnimationUtils.loadAnimation(getApplicationContext(),
//                R.anim.zoom_out);
//        vrelative.setVisibility(View.VISIBLE);
//        vrelative.startAnimation(animZoomOut);
//        windows.dismiss();
    }
