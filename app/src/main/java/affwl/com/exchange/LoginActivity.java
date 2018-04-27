package affwl.com.exchange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    TextView playasguest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        playasguest=findViewById(R.id.playasguest);
        playasguest.setOnClickListener(this);
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.playasguest:
                startActivity(new Intent(LoginActivity.this, PlayasguestActivity.class));
                finish();
                break;
        }
    }
}
