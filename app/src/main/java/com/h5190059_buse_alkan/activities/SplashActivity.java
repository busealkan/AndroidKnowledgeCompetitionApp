package com.h5190059_buse_alkan.activities;

import androidx.appcompat.app.AppCompatActivity;
import com.h5190059_buse_alkan.R;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;


public class SplashActivity extends AppCompatActivity {

    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        zamanlayici();
    }

    private void zamanlayici(){
        countDownTimer = new CountDownTimer(3000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                Intent oyuncuIsimGirisIntent = new Intent(SplashActivity.this, OyuncuIsimActivity.class);
                startActivity(oyuncuIsimGirisIntent);
                finish();
            }
        };
        countDownTimer.start();
    }
}