package com.example.helloworld;

import static com.example.helloworld.LesActivity.choixact;
import static com.example.helloworld.Villes.villeselect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    MainAdapter mainAdapter;

private ImageView accueil;
private ImageView retour;
private TextView ville;
private TextView activity;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
        recyclerView =(RecyclerView) findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<MainModel> options;
        options = new FirebaseRecyclerOptions.Builder<MainModel>()
                .setQuery(FirebaseDatabase.getInstance().getReference().child("villes").child(villeselect).child(choixact), MainModel.class)
                .build();

        mainAdapter = new MainAdapter((options));
        recyclerView.setAdapter(mainAdapter);

        this.retour = (ImageView) findViewById(R.id.retour_arriere);
        this.accueil = (ImageView) findViewById(R.id.accueil);
        this.ville = (TextView) findViewById(R.id.texte2);
        this.activity = (TextView) findViewById(R.id.texte1);

        ville.setText(villeselect);
        activity.setText(choixact);


        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchactivity = new Intent(getApplicationContext(), LesActivity.class);
                startActivity(switchactivity);
                finish();
            }
        });

        accueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchacitivity = new Intent(getApplicationContext(), Villes.class);
                startActivity(switchacitivity);
                finish();
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        mainAdapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainAdapter.stopListening();
    }
}