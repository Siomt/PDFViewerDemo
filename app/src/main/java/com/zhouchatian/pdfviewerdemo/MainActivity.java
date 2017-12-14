package com.zhouchatian.pdfviewerdemo;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        File path = new File(Environment.getExternalStorageDirectory().getPath() + "/pdfdemo.pdf");
        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromFile(path).load();
    }
}
