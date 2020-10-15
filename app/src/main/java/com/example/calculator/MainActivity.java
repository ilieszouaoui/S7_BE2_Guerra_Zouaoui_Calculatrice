package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recuperation des boutons
        TextView Bouton0 = (TextView) findViewById(R.id.Button0);
        TextView Bouton1 = (TextView) findViewById(R.id.Button1);
        TextView Bouton2 = (TextView) findViewById(R.id.Button2);
        TextView Bouton3 = (TextView) findViewById(R.id.Button3);
        TextView Bouton4 = (TextView) findViewById(R.id.Button4);
        TextView Bouton5 = (TextView) findViewById(R.id.Button5);
        TextView Bouton6 = (TextView) findViewById(R.id.Button6);
        TextView Bouton7 = (TextView) findViewById(R.id.Button7);
        TextView Bouton8 = (TextView) findViewById(R.id.Button8);
        TextView Bouton9 = (TextView) findViewById(R.id.Button9);

        //Association de la valeur du bouton au click
        Bouton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage("0");
            }
        });

        Bouton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage("1");
            }
        });

        Bouton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage("2");
            }
        });

        Bouton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage("3");
            }
        });
        Bouton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage("4");
            }
        });
        Bouton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage("5");
            }
        });
        Bouton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage("6");
            }
        });
        Bouton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage("7");
            }
        });

        Bouton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage("8");
            }
        });

        Bouton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage("9");
            }
        });


    }

    public void affichage(String champ) {
        TextView Champ_saisie = (TextView) findViewById(R.id.champ_Input);
        Champ_saisie.append(champ);
    }
}