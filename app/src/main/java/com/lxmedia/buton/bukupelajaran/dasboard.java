package com.lxmedia.buton.bukupelajaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dasboard extends AppCompatActivity {
    private CardView bahasapemrogramanbtn, pemdasbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasboard);
        bahasapemrogramanbtn = findViewById(R.id.bahasapemrogramanbtn);
        pemdasbtn = findViewById(R.id.pemdasbtn);

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
    }
}