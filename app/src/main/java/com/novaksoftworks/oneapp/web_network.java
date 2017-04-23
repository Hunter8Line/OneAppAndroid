package com.novaksoftworks.oneapp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class web_network extends Activity {
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
    Button btnBack;
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.network);

        webview=(WebView)findViewById(R.id.netweb);
        webview.setWebViewClient(new MyWebViewClient());
        openURL();
    }

    /** Opens the URL in a browser */
    private void openURL() {
        webview.loadUrl("https://novaknetwork.com");
        webview.requestFocus();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}