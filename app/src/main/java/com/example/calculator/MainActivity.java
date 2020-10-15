package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    public int Nombre1;
    public int Nombre2;
    public String Operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView Champ_saisie = (TextView) findViewById(R.id.champ_Input);
        final TextView Champ_resultat = (TextView) findViewById(R.id.champ_Resultat);


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
        TextView BoutonComa = (TextView) findViewById(R.id.ButtonComa);
        TextView BoutonRet = (TextView) findViewById(R.id.ReturnButton);

        TextView BoutonRes = (TextView) findViewById(R.id.ButtonRes);
        TextView BoutonPar1 = (TextView) findViewById(R.id.ButtonPar1);
        TextView BoutonPar2 = (TextView) findViewById(R.id.ButtonPar2);
        TextView BoutonDiv = (TextView) findViewById(R.id.ButtonDiv);
        TextView BoutonMul = (TextView) findViewById(R.id.ButtonMul);
        TextView BoutonMinus = (TextView) findViewById(R.id.ButtonMinus);
        TextView BoutonPlus = (TextView) findViewById(R.id.ButtonPlus);
        TextView BoutonEqual = (TextView) findViewById(R.id.ButtonEqual);




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

        BoutonComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage(",");
            }
        });

        BoutonRet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        BoutonRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Champ_saisie.setText("");
            }
        });

        BoutonPar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage("(");
            }
        });

        BoutonPar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage(")");
            }
        });

        BoutonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage("/");
            }
        });

        BoutonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation="Mul";
                CharSequence saisie1 =Champ_saisie.getText();
                Nombre1 = Integer.parseInt(saisie1.toString());
                Champ_saisie.setText("");

            }
        });

        BoutonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage("-");
            }
        });

        BoutonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage("+");
            }
        });

        BoutonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int calcul=0;
                CharSequence saisie2 =Champ_saisie.getText();
                Nombre2 = Integer.parseInt(saisie2.toString());
                if (Operation=="Mul"){
                    calcul=Nombre1*Nombre2;
                }

                Champ_resultat.setText(calcul);


            }
        });


    }

    public void affichage(String champ) {
        TextView Champ_saisie = (TextView) findViewById(R.id.champ_Input);
        Champ_saisie.append(champ);
    }
}