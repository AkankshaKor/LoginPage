package com.example.hp.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Main1Activity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        getSupportActionBar().hide();
        Animation a = AnimationUtils.loadAnimation(this, R.anim.fadein);
        ((ImageView) findViewById(R.id.images)).startAnimation(a);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(Main1Activity.this, FacebookLoginActivity.class);
                startActivity(homeIntent);
             //   overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        }, SPLASH_TIME_OUT);



    }
}