package com.villip.testgbksoftlayouts;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button oneButton = findViewById(R.id.oneButton);
        Button twoButton = findViewById(R.id.twoButton);
        Button threeButton = findViewById(R.id.threeButton);

        oneButton.setOnClickListener(this);
        twoButton.setOnClickListener(this);
        threeButton.setOnClickListener(this);

        fragmentManager = getSupportFragmentManager();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.oneButton:
                OneFragment oneFragment = new OneFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.container, oneFragment)
                        .addToBackStack(null)
                        .commit();
                break;
            case R.id.twoButton:
                TwoFragment twoFragment = new TwoFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.container, twoFragment)
                        .addToBackStack(null)
                        .commit();
                break;
            case R.id.threeButton:
                ThreeFragment threeFragment = new ThreeFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.container, threeFragment)
                        .addToBackStack(null)
                        .commit();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        fragmentManager.popBackStack();
    }
}
