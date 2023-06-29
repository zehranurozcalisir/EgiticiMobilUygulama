package com.example.mobil;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hayvanlarAnasayfasi extends AppCompatActivity {
Button anasayfaMemeliler;
Button anasayfaKuslar;
Button anasayfaSurungenler;
Button anasayfaBaliklar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayvanlar_anasayfasi);
        anasayfaMemeliler = findViewById(R.id.btnMemeliler);
        anasayfaMemeliler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent memeliSayfasi=new Intent(hayvanlarAnasayfasi.this, memelileranasayfa.class );
                startActivity(memeliSayfasi);
            }
        });
        anasayfaKuslar = findViewById(R.id.btnKuslar);
        anasayfaKuslar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kuslarSayfasi=new Intent(hayvanlarAnasayfasi.this, kuslaranasayfa.class );
                startActivity(kuslarSayfasi);
            }
        });
        anasayfaSurungenler = findViewById(R.id.btnSurungenler);
        anasayfaSurungenler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent surungenSayfasi=new Intent(hayvanlarAnasayfasi.this, surungenleranasayfa.class );
                startActivity(surungenSayfasi);
            }
        });
        anasayfaBaliklar = findViewById(R.id.btnBaliklar);
        anasayfaBaliklar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent balikSayfasi=new Intent(hayvanlarAnasayfasi.this, baliklaranasayfa.class );
                startActivity(balikSayfasi);
            }
        });
    }
}