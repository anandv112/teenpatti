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

public class HowToPlayThreeTwoOne extends AppCompatActivity {

    TextView howtoplay321btn;
    RelativeLayout relativelayout321;
    ImageView close321;
    PopupWindow howto321popup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_play_three_two_one);


        // Popup for 321 how to play
        howtoplay321btn = (TextView) findViewById(R.id.howtoplay321btn);
        relativelayout321 = (RelativeLayout) findViewById(R.id.relativelayout321);

        howtoplay321btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instantiate the popup.xml layout file
                LayoutInflater layoutInflater = (LayoutInflater) HowToPlayThreeTwoOne.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = layoutInflater.inflate(R.layout.help_popup,null);

                close321 = (ImageView) customView.findViewById(R.id.close321);

                //instantiate popup window
                howto321popup = new PopupWindow(customView, RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

                //display the popup window
                howto321popup.showAtLocation(relativelayout321, Gravity.TOP, 0, 0);

                //close the popup window on button click
                close321.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        howto321popup.dismiss();
                    }
                });

            }
        });
    }
}
