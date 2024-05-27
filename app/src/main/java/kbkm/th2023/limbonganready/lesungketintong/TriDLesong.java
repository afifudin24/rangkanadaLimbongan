package kbkm.th2023.limbonganready.lesungketintong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;

import android.webkit.WebView;

import kbkm.th2023.limbonganready.R;

public class TriDLesong extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tri_dlesong);

        // Inisialisasi WebView
        webView = findViewById(R.id.webView);

        // Aktifkan JavaScript (opsional, tergantung pada kebutuhan)
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


//        // Muat halaman web ke dalam WebView
//        webView.loadUrl("https://sketchfab.com/3d-models/alat-musik-tradisional-gambangan-a6f72e387ec14030abd0203cfd75cc7e");
//

        String sketchfabEmbedCode ="<iframe title='Alat Musik Gambangan Desa Limbongan' frameborder='0' " +
                "allowfullscreen mozallowfullscreen='true' webkitallowfullscreen='true' " +
                "allow='autoplay; fullscreen; xr-spatial-tracking' " +
                "xr-spatial-tracking execution-while-out-of-viewport " +
                "execution-while-not-rendered web-share " +
                "width='410' height='810' " +
                "src='https://sketchfab.com/models/9467cf85c3cb47c8be9bf8538e6bfd8b/embed?autostart=1'></iframe>";

// Load the Sketchfab embed code into the WebView
        webView.loadData(sketchfabEmbedCode, "text/html", "utf-8");
    }
    public void Finish(View view) {
        onBackPressed();
    }
}