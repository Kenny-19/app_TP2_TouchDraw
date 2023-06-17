package com.example.application_tp2_touchapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class dessinActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessin_activiy);
    }
    DrawingView drawingView = findViewById(R.id.drawingView);
}