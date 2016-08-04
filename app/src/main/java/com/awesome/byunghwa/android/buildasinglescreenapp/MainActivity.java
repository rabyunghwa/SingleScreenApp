package com.awesome.byunghwa.android.buildasinglescreenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvDescription = (TextView) findViewById(R.id.tv_description);
        tvDescription.setSelected(true);
    }
}
