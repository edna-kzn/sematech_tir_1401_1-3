package com.kazarian.android.sematech_tir_1401_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView wvWeb = findViewById(R.id.wvTestwebview);
        wvWeb.getSettings().setJavaScriptEnabled(true);
        wvWeb.setWebViewClient(new WebViewClient());
        wvWeb.loadUrl("https://www.google.com/");
    }
}