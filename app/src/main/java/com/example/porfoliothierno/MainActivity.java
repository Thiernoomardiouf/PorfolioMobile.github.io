package com.example.porfoliothierno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button01Clicked(View v) {
        Intent profileActivityIntent = new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(profileActivityIntent);
    }

    public void button02Clicked(View v) {
        Intent competenceActivityIntent = new Intent(MainActivity.this, CompetencesActivity.class);
        startActivity(competenceActivityIntent);
    }

    public void button03Clicked(View v) {
        Intent experiencesActivityIntent = new Intent(MainActivity.this, ExperiencesActivity.class);
        startActivity(experiencesActivityIntent);
    }

    public void button04Clicked(View v) {
        Intent formationsActivityIntent = new Intent(MainActivity.this, FormationActivity.class);
        startActivity(formationsActivityIntent);
    }

    public void button05Clicked(View v) {
        Intent referenceActivityIntent = new Intent(MainActivity.this, ReferencesActivity.class);
        startActivity(referenceActivityIntent);
    }

    public void button06Clicked(View v) {
        Intent contactActivityIntent = new Intent(MainActivity.this, ContactActivity.class);
        startActivity(contactActivityIntent);

    }
}