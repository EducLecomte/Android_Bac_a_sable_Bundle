package com.example.bac_a_sable_bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //attribut
    EditText etinteger, etchaine;
    Button btn;
    MonObjet monObjet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        //init des attributs
        etinteger = findViewById(R.id.et_chiffre);
        etchaine = findViewById(R.id.et_chaine);
        btn = findViewById(R.id.btn);
        monObjet=new MonObjet(0,"");

        ecoutebtn();

    }

    private void ecoutebtn() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    monObjet.setChiffre(Integer.parseInt(etinteger.getText().toString()));
                    monObjet.setChaine(etchaine.getText().toString());
                } catch (Exception e){};

                // création de l'intention
                Intent monIntent = new Intent(MainActivity.this, MainActivity2.class);
                // ajout d'un objet Serialisable
                monIntent.putExtra("monObjet", monObjet);
                startActivity(monIntent);
            }
        });
    }
}