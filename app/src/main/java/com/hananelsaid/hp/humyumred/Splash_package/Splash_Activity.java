package com.hananelsaid.hp.humyumred.Splash_package;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hananelsaid.hp.humyumred.Home_package.View.Home_Activity;
import com.hananelsaid.hp.humyumred.R;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash_Activity.this,Home_Activity.class));
                finish();
            }
        }, 1200);
    }
}
