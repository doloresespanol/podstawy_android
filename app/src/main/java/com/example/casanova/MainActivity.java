package com.example.casanova;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public float rozmiarCzionki = 14f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void zwieksz (View view){
        rozmiarCzionki+=4f;
            TextView witaj = findViewById(R.id.textView);
            witaj.setTextSize(rozmiarCzionki);
    }
    public void zmniejsz (View view){
        rozmiarCzionki-=4f;
        TextView witaj = findViewById(R.id.textView);
        witaj.setTextSize(rozmiarCzionki);
    }

    public void zmienTapete(View view){
        Drawable kolor = view.getBackground();
        findViewById(R.id.textView).setBackground(kolor);
    }
}