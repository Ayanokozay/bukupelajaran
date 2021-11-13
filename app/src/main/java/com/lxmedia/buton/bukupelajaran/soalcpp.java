package com.lxmedia.buton.bukupelajaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class soalcpp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soalcpp);

        PDFView pdfView = findViewById(R.id.soalcpp);

        pdfView.fromAsset("soalcpp.pdf").load();
    }
}