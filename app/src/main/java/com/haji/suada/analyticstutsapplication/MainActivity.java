package com.haji.suada.analyticstutsapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = new Bundle();
        bundle.putString(getClass().getSimpleName(), getClass().getSimpleName());
        FirebaseAnalytics.getInstance(this).logEvent("main_activity", bundle);
    }
}
