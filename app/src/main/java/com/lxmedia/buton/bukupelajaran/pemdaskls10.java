package com.lxmedia.buton.bukupelajaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pemdaskls10 extends AppCompatActivity {
    private CardView kls10s1btn, kls10s2btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemdaskls10);
        kls10s1btn = findViewById(R.id.kls10s1btn);
        kls10s2btn = findViewById(R.id.kls10s2btn);

        kls10s1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pemdaskls10.this, pdkls10s1.class);
                startActivity(intent);
            }
        });
        kls10s2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pemdaskls10.this, pdkls10s2.class);
                startActivity(intent);
            }
        });
    }
}