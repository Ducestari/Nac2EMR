package com.example.nac1mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton webview;
        Button botao;

        botao = (Button) findViewById(R.id.buttonSobre);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sobre();
            }
        });

        webview = (ImageButton) findViewById(R.id.imageAmericanas);
        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Americanas();
            }
        }) ;

        webview = (ImageButton) findViewById(R.id.ImageMercadoLivre);
        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MercadoLivre();
            }
        }) ;

        webview = (ImageButton) findViewById(R.id.ImageEbay);
        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ebay();
            }
        }) ;

        webview = (ImageButton) findViewById(R.id.ImageWebMotors);
        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebMotors();
            }
        }) ;

        }
        public void Americanas(){
    Intent A = new Intent(this, Americanas.class);
    startActivity(A);
    }
        public void MercadoLivre(){
        Intent ML = new Intent(this, MercadoLivre.class);
        startActivity(ML);
    }
        public void Ebay(){
        Intent E = new Intent(this, Ebay.class);
        startActivity(E);
    }
        public void WebMotors(){
        Intent WM = new Intent(this, WebMotors.class);
        startActivity(WM);
    }

        public void Sobre(){
            Intent sobre= new Intent(this, Sobre.class);
        startActivity(sobre);
        }

}
