package com.novaksoftworks.oneapp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class web_server extends Activity {
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
        setContentView(R.layout.server);

        webview=(WebView)findViewById(R.id.serverweb);
        webview.setWebViewClient(new MyWebViewClient());
        openURL();
    }

    /** Opens the URL in a browser */
    private void openURL() {
        webview.loadUrl("https://novakserver.com");
        webview.requestFocus();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}