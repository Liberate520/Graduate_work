package ru.gb.graduatework;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AboutStateActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abot_state);
        init();
    }

    private void init(){}
    Intent intent=getIntent();
    int numberState=intent.getIntExtra(ListStateActivity.NUMBER_STATE,-1);
}
