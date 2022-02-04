package com.example.signal;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends MainActivity{

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_activity);
//        String url = getIntent().getStringExtra("url");
//        String url = "https://youtu.be/DKB32L_yB6w";
//        String url = "https://firebasestorage.googleapis.com/v0/b/instagramandroid-23a44.appspot.com/o/peru.webm?alt=media&token=0549ddb3-f361-44cd-886f-c5cded9680de";
        String url = "https://firebasestorage.googleapis.com/v0/b/instagramandroid-23a44.appspot.com/o/Peru.webm?alt=media&token=7686d837-c897-4736-a907-8045a41e4703";
        myWebView = findViewById(R.id.webview);
        myWebView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl(url);
    }
}
