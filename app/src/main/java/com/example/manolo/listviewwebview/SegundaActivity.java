package com.example.manolo.listviewwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class SegundaActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        webView=(WebView)findViewById(R.id.webView);

        Bundle bundle=getIntent().getExtras();
        String dato=bundle.getString("url");

        webView.loadUrl("http://" + dato );
    }
}
