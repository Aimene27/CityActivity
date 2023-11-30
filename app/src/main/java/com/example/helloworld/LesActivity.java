package com.example.helloworld;

import static com.example.helloworld.Villes.villeselect;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LesActivity extends AppCompatActivity {

    private ImageView culture;
    private ImageView restaurant;
    private ImageView loisir;
    private TextView ville;
    private ImageView retour;
    private ImageView accueil;
    public static String choixact;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.les_activity);

        this.culture = (ImageView) findViewById(R.id.culture);
        this.restaurant = (ImageView) findViewById(R.id.restauration);
        this.loisir = (ImageView) findViewById(R.id.loisirs);
        this.ville = (TextView) findViewById(R.id.titre2);
        this.retour = (ImageView) findViewById(R.id.retour_arriere);
        this.accueil = (ImageView) findViewById(R.id.accueil);

        ville.setText("vous à " + villeselect);

        culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchactivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(switchactivity);
                choixact = "Culture";
                finish();
            }
        });

        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchactivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(switchactivity);
                choixact = "Restaurant";
                finish();
            }
        });

        loisir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchactivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(switchactivity);
                choixact = "Loisir";
                finish();
            }
        });

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchactivity = new Intent(getApplicationContext(), Villes.class);
                startActivity(switchactivity);
                finish();
            }
        });

        accueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchactivity = new Intent(getApplicationContext(), Villes.class);
                startActivity(switchactivity);
                finish();
            }
        });
    }
}