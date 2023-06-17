package com.example.application_tp2_touchapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TP_2activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp2activity);
        Button myButton1 = findViewById(R.id.monBouton1);
        Button myButton2 = findViewById(R.id.monBouton2);
        TextView myTextView = findViewById(R.id.textview);
        myButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myTextView.setText("Le bouton a été cliqué !");
            }
        });
        myButton2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                myTextView.setText("Le bouton a été cliqué longuement !");
                return true;
            }
        });
    }
}