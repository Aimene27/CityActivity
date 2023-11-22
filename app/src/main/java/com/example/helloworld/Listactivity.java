package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Listactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);


        List<constructeurlist> constructeurlistList = new ArrayList<>();
        constructeurlistList.add(new constructeurlist("manu","charo",50.5));
        constructeurlistList.add(new constructeurlist("aimene","le parfumeur",500));
        constructeurlistList.add(new constructeurlist("Melvin","lightskin",10));

        ListView listactivityview = findViewById(R.id.list_activity);
        listactivityview.setAdapter(new ListactivityAdapt(this,constructeurlistList));

    }
}