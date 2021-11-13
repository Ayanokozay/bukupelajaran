package com.lxmedia.buton.bukupelajaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class quis extends AppCompatActivity {
    private CardView soalpd, soaljava, soalcpp, soalpy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quis);
        soalpd = findViewById(R.id.soalpd);
        soaljava = findViewById(R.id.soaljava);
        soalcpp = findViewById(R.id.soalcpp);
        soalpy = findViewById(R.id.soalpy);

        soalpd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(quis.this, soalpd.class);
                startActivity(intent);
            }
        });
        soaljava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(quis.this, soaljava.class);
                startActivity(intent);
            }
        });
        soalcpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(quis.this, soalcpp.class);
                startActivity(intent);
            }
        });
        soalpy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(quis.this, soalpy.class);
                startActivity(intent);
            }
        });
    }
}