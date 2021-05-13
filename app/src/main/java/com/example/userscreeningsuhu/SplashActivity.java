package com.example.userscreeningsuhu;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.userscreeningsuhu.login.LoginActivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);

        Handler handler = new Handler();
        handler.postDelayed(() -> {
            startActivity(intent);
            finish();
        },3000);
    }
}
