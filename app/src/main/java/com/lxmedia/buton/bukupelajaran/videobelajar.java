package com.lxmedia.buton.bukupelajaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class videobelajar extends AppCompatActivity {
    private CardView vid01, vid02, vid03, vid04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videobelajar);
        vid01 = findViewById(R.id.vid01);
        vid02 = findViewById(R.id.vid02);
        vid03 = findViewById(R.id.vid03);
        vid04 = findViewById(R.id.vid04);

        vid01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), vidpython01.class);
                startActivity(intent);
            }
        });
        vid02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), video02.class);
                startActivity(intent);
            }
        });
        vid03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), video03.class);
                startActivity(intent);
            }
        });
        vid04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), video04.class);
                startActivity(intent);
            }
        });
    }
}