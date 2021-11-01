package com.lxmedia.buton.bukupelajaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pemdassmk extends AppCompatActivity {
    private CardView kls10btn, kls11btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemdassmk);
        kls10btn = findViewById(R.id.kls10btn);
        kls11btn = findViewById(R.id.kls11btn);

        kls10btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), pemdaskls10.class);
                startActivity(intent);
            }
        });
        kls11btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), pemdaskls11.class);
                startActivity(intent);
            }
        });
    }
}