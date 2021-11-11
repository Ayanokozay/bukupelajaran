package com.lxmedia.buton.bukupelajaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dasboard extends AppCompatActivity {
    private CardView bahasapemrogramanbtn, pemdasbtn, vidbtn, soalbtn, introbtn, infoappbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasboard);
        bahasapemrogramanbtn = findViewById(R.id.bahasapemrogramanbtn);
        pemdasbtn = findViewById(R.id.pemdasbtn);
        vidbtn = findViewById(R.id.vidbtn);
        soalbtn = findViewById(R.id.soalbtn);
        introbtn = findViewById(R.id.introbtn);
        infoappbtn = findViewById(R.id.infoappbtn);

        bahasapemrogramanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });
        pemdasbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), pemdassmk.class);
                startActivity(intent);
            }
        });
        vidbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), videobelajar.class);
                startActivity(intent);
            }
        });
        soalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), quis.class);
                startActivity(intent);
            }
        });
        introbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dasboard.this, introduction.class);
                startActivity(intent);
            }
        });
        infoappbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dasboard.this, informasi.class);
                startActivity(intent);
            }
        });
    }
}