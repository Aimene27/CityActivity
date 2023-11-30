package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Villes extends AppCompatActivity {

    private ImageView Paris;
    private ImageView Lisbonne;
    private ImageView Bruxelles;
    private ImageView Barcelone;
    private ImageView Amsterdam;
    public static String villeselect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_villes);


        this.Paris = (ImageView) findViewById(R.id.Paris);
        this.Lisbonne = (ImageView) findViewById(R.id.Lisbonne);
        this.Bruxelles = (ImageView) findViewById(R.id.Bruxelles);
        this.Barcelone = (ImageView) findViewById(R.id.Barcelonne);
        this.Amsterdam = (ImageView) findViewById(R.id.Amsterdam);

        Paris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchactivity = new Intent(getApplicationContext(), LesActivity.class);
                startActivity(switchactivity);
                villeselect = "Paris";
                finish();
            }

        });

        Lisbonne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchactivity = new Intent(getApplicationContext(), LesActivity.class);
                startActivity(switchactivity);
                villeselect = "Lisbonne";
                finish();
            }
        });

        Bruxelles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchactivity = new Intent(getApplicationContext(), LesActivity.class);
                startActivity(switchactivity);
                villeselect = "Bruxelles";
                finish();
            }
        });

        Barcelone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchactivity = new Intent(getApplicationContext(), LesActivity.class);
                startActivity(switchactivity);
                villeselect = "Barcelone";
                finish();
            }
        });
        Amsterdam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchactivity = new Intent(getApplicationContext(), LesActivity.class);
                startActivity(switchactivity);
                villeselect = "Amsterdam";
                finish();
            }
        });




    }
}