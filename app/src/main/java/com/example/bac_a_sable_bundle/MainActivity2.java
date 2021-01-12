package com.example.bac_a_sable_bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    // attribut
    TextView tvChiffre, tvChaine;
    MonObjet monObjetRecup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        init();
    }

    private void init() {
        // init des attributs
        tvChiffre = findViewById(R.id.tv_chiffre);
        tvChaine = findViewById(R.id.tv_chaine);

        // on essaie de récupèrer les
        try {
            Bundle extras = getIntent().getExtras();
            monObjetRecup = (MonObjet) extras.getSerializable("monObjet");

            tvChiffre.setText(monObjetRecup.getChiffre().toString());
            tvChaine.setText(monObjetRecup.getChaine());
        } catch (Exception e) {}
    }
}