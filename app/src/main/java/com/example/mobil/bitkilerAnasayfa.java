package com.example.mobil;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.Button;

public class bitkilerAnasayfa extends AppCompatActivity {
    Button anasayfaAgaclar;
    Button anasayfaCicekler;
    Button anasayfaOtlar;
    Button anasayfaSebzeler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitkiler_anasayfa);
        anasayfaAgaclar = findViewById(R.id.btnAgaclar);
        anasayfaAgaclar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent agacSayfasi=new Intent(bitkilerAnasayfa.this, agaclarAnasayfa.class );
                startActivity(agacSayfasi);
            }
        });
        anasayfaCicekler = findViewById(R.id.btnCicekler);
        anasayfaCicekler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cicekSayfasi=new Intent(bitkilerAnasayfa.this, ciceklerAnasayfa.class );
                startActivity(cicekSayfasi);
            }
        });
        anasayfaOtlar = findViewById(R.id.btnOtlar);
        anasayfaOtlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otlarSayfasi=new Intent(bitkilerAnasayfa.this, otlarAnasayfa.class );
                startActivity(otlarSayfasi);
            }
        });
        anasayfaSebzeler = findViewById(R.id.btnSebzeler);
        anasayfaSebzeler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sebzelerSayfasi=new Intent(bitkilerAnasayfa.this, sebzelerAnasayfa.class );
                startActivity(sebzelerSayfasi);
            }
        });
    }
}
