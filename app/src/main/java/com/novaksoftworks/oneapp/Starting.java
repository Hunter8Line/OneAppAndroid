package com.novaksoftworks.oneapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static com.novaksoftworks.oneapp.R.styleable.View;

public class Starting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);
    }
    public void softweb(View v) {
        startActivity(new Intent(Starting.this, web_softworks.class));
    }public void netweb(View v) {
        startActivity(new Intent(Starting.this, web_softworks.class));
    }public void serverweb(View v) {
        startActivity(new Intent(Starting.this, web_softworks.class));
    }public void webweb(View v) {
        startActivity(new Intent(Starting.this, web_softworks.class));
    }
    }
