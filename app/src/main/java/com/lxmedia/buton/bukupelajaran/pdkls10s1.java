package com.lxmedia.buton.bukupelajaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdkls10s1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdkls10s1);

        PDFView pdfView = findViewById(R.id.bukupdkls10s1);

        pdfView.fromAsset("pemdaskls10s1.pdf").load();
    }
}