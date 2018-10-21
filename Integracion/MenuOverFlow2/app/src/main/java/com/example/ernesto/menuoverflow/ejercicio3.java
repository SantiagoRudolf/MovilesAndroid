package com.example.ernesto.menuoverflow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class ejercicio3 extends AppCompatActivity {

    WebView web;
    String url1 = "https://www.nutrinfo.com/";
    String url2 = "http://www.nutricion.org/";
    String url3 = "https://www.dietascormillot.com/";
    String url4 = "http://renhyd.org/index.php/renhyd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_ejercicio3);
            web = findViewById(R.id.webView);
            web.setWebViewClient(new WebViewClient());
            web.getSettings().setJavaScriptEnabled(true);

            web.getSettings().setLoadWithOverviewMode(true);
            web.getSettings().setUseWideViewPort(true);
            web.getSettings().setSupportZoom(true);
            web.getSettings().setBuiltInZoomControls(true);
            web.getSettings().setDisplayZoomControls(false);
            web.setScrollBarStyle(web.SCROLLBARS_OUTSIDE_OVERLAY);
            web.setScrollbarFadingEnabled(false);

            web.loadUrl(url3);
    }

    //Metodos de redireccion
    public void pagina1(View view){
        web = findViewById(R.id.webView);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);

        web.getSettings().setLoadWithOverviewMode(true);
        web.getSettings().setUseWideViewPort(true);
        web.getSettings().setSupportZoom(true);
        web.getSettings().setBuiltInZoomControls(true);
        web.getSettings().setDisplayZoomControls(false);
        web.setScrollBarStyle(web.SCROLLBARS_OUTSIDE_OVERLAY);
        web.setScrollbarFadingEnabled(false);

        web.loadUrl(url1);
    }
    public void pagina2(View view){
        web = findViewById(R.id.webView);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);

        web.getSettings().setLoadWithOverviewMode(true);
        web.getSettings().setUseWideViewPort(true);
        web.getSettings().setSupportZoom(true);
        web.getSettings().setBuiltInZoomControls(true);
        web.getSettings().setDisplayZoomControls(false);
        web.setScrollBarStyle(web.SCROLLBARS_OUTSIDE_OVERLAY);
        web.setScrollbarFadingEnabled(false);

        web.loadUrl(url2);
    }
    public void pagina3(View view){
        web = findViewById(R.id.webView);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);

        web.getSettings().setLoadWithOverviewMode(true);
        web.getSettings().setUseWideViewPort(true);
        web.getSettings().setSupportZoom(true);
        web.getSettings().setBuiltInZoomControls(true);
        web.getSettings().setDisplayZoomControls(false);
        web.setScrollBarStyle(web.SCROLLBARS_OUTSIDE_OVERLAY);
        web.setScrollbarFadingEnabled(false);

        web.loadUrl(url3);
    }
    public void pagina4(View view){
        web = findViewById(R.id.webView);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);

        web.getSettings().setLoadWithOverviewMode(true);
        web.getSettings().setUseWideViewPort(true);
        web.getSettings().setSupportZoom(true);
        web.getSettings().setBuiltInZoomControls(true);
        web.getSettings().setDisplayZoomControls(false);
        web.setScrollBarStyle(web.SCROLLBARS_OUTSIDE_OVERLAY);
        web.setScrollbarFadingEnabled(false);

        web.loadUrl(url4);
    }

    //Método para mostrar y ocultar el menú
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }
    //Método para asignar las funciones correspondientes a las opciones.
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.item1){
            Intent opcion1 = new Intent(this, ejercicio1.class);
            startActivity(opcion1);
            Toast.makeText(this, "Opción 1", Toast.LENGTH_SHORT).show();
        } else if(id == R.id.item2){
            Intent opcion2 = new Intent(this, ejercicio2.class);
            startActivity(opcion2);
            Toast.makeText(this, "Opción 2", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.item3){
            Intent opcion3 = new Intent(this, ejercicio3.class);
            startActivity(opcion3);
            Toast.makeText(this, "Opción 3", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}