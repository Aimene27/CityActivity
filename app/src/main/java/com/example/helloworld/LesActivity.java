package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LesActivity extends AppCompatActivity {

    private ImageView culture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.les_activity);

        this.culture = (ImageView) findViewById(R.id.culture);

        culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchactivity = new Intent(getApplicationContext(), Listactivity.class);
                startActivity(switchactivity);
                finish();
            }
        });
    }
}