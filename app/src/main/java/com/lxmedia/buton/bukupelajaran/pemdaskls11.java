package com.lxmedia.buton.bukupelajaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pemdaskls11 extends AppCompatActivity {
    private CardView kls11s1btn, kls11s2btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemdaskls11);
        kls11s1btn = findViewById(R.id.kls11s1btn);
        kls11s2btn = findViewById(R.id.kls11s2btn);

        kls11s1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pemdaskls11.this, pdkls11s1.class);
                startActivity(intent);
            }
        });
        kls11s2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pemdaskls11.this, pdkls11s2.class);
                startActivity(intent);
            }
        });
    }
}