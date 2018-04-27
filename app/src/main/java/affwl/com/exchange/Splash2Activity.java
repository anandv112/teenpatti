package affwl.com.exchange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Splash2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splash2);
        findViewById(R.id.loadingouter).startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(Splash2Activity.this, LoginActivity.class));
                finish();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        Animation myani;
        myani = AnimationUtils.loadAnimation(this, R.anim.inner_load);
        findViewById(R.id.loadinginner).startAnimation(myani);
        myani.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation myanim) {

            }

            @Override
            public void onAnimationEnd(Animation myanim) {
                startActivity(new Intent(Splash2Activity.this, LoginActivity.class));
                finish();

            }

            @Override
            public void onAnimationRepeat(Animation myanim) {

            }
        });
    }
}
