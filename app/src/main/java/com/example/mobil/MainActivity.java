package com.example.mobil;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button anasayfaBitki;
    Button anasayfaHayvan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anasayfaBitki = findViewById(R.id.btnA);
        anasayfaBitki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bitkiSayfasi=new Intent(MainActivity.this, bitkilerAnasayfa.class );
                startActivity(bitkiSayfasi);
            }
        });
        anasayfaHayvan = findViewById(R.id.btnAnasayfaHayvan);
        anasayfaHayvan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hayvanAnasayfasi=new Intent(MainActivity.this, hayvanlarAnasayfasi.class );
                startActivity(hayvanAnasayfasi);
            }
        });
    }
}