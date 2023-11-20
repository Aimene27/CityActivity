package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView paris;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_villes);

        this.paris = (ImageView) findViewById(R.id.paris);

paris.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent switchactivity = new Intent(getApplicationContext(), LesActivity.class);
        startActivity(switchactivity);
        finish();
    }
});
    }


}