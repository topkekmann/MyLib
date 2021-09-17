package com.indofun.wottk.nearme.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.indofun.wottk.nearme.mytestlib.MyClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyClass.log();
    }
}