package com.lxmedia.buton.bukupelajaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class informasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi);

        PDFView pdfView = findViewById(R.id.info);

        pdfView.fromAsset("bioadatainfo.pdf").load();
    }
}