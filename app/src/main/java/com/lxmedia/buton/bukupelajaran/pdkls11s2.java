package com.lxmedia.buton.bukupelajaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdkls11s2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdkls11s2);

        PDFView pdfView = findViewById(R.id.bukupdkls11s2);

        pdfView.fromAsset("pemdaskls11s2.pdf").load();
    }
}