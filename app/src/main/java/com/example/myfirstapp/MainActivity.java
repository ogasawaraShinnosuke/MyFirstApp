package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// メインのActivity.
// アプリをビルドして実行すると、システムによりこのActivityインスタンスが起動し、そのレイアウトが読み込まれる
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
