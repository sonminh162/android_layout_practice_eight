package com.lifetime.practice_layout_eight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class checkerViet extends AppCompatActivity {

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checker_viet);

        view = findViewById(R.id.view);

        view.setBackgroundColor(getResources().getColor(R.color.cinnabar));
    }
}
