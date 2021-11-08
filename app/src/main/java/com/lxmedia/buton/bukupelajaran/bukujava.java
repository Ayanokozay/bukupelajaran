package com.lxmedia.buton.bukupelajaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class bukujava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukujava);

        PDFView pdfView = findViewById(R.id.bkjava);

        pdfView.fromAsset("bukujava.pdf").load();
    }
}