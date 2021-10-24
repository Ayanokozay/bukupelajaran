package com.lxmedia.buton.bukupelajaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
    private CardView pythonbtn, cppbtn, javabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pythonbtn = findViewById(R.id.pythonbtn);
        cppbtn = findViewById(R.id.cppbtn);
        javabtn = findViewById(R.id.javabtn);

        pythonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Buku_Python_A5.class);
                startActivity(intent);
            }
        });
    }
}