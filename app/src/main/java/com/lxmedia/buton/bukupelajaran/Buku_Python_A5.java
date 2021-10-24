package com.lxmedia.buton.bukupelajaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Buku_Python_A5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku_python_a5);

        PDFView pdfView = findViewById(R.id.pythona5);

        pdfView.fromAsset("Buku Python A5.pdf").load();
    }
}