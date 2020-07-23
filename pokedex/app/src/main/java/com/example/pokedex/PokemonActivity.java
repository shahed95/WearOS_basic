package com.example.pokedex;


import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.TextView;

public class PokemonActivity extends WearableActivity {
    private TextView nameTextView;
    private TextView numberTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);
        String name = getIntent().getStringExtra("name");
        String number = getIntent().getStringExtra("number");
        nameTextView = findViewById(R.id.pokemon_name);
        numberTextView = findViewById(R.id.pokemon_number);
        nameTextView.setText(name);
        numberTextView.setText(number);
    }
}