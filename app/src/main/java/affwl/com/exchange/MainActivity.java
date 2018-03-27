package affwl.com.exchange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
