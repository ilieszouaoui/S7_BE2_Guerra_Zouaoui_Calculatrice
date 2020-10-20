package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    public float Nombre1;
    public float Nombre2;
    public String Operation;
    public boolean ButtonInitialize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView Champ_histo = (TextView) findViewById(R.id.champ_Histo);
        final TextView Champ_saisie = (TextView) findViewById(R.id.champ_Input);
        final TextView Champ_resultat = (TextView) findViewById(R.id.champ_Resultat);

        ButtonInitialize=false;



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
                Champ_saisie.append("0");
                ButtonInitialize=true;
            }
        });

        Bouton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Champ_saisie.append("1");
                ButtonInitialize=true;
            }
        });

        Bouton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Champ_saisie.append("2");
                ButtonInitialize=true;
            }
        });

        Bouton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Champ_saisie.append("3");
                ButtonInitialize=true;
            }
        });
        Bouton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Champ_saisie.append("4");
                ButtonInitialize=true;
            }
        });
        Bouton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Champ_saisie.append("5");
                ButtonInitialize=true;
            }
        });
        Bouton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Champ_saisie.append("6");
                ButtonInitialize=true;
            }
        });
        Bouton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Champ_saisie.append("7");
                // Tentative resolution crash
                ButtonInitialize=true;
            }
        });

        Bouton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Champ_saisie.append("8");
                ButtonInitialize=true;
            }
        });

        Bouton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Champ_saisie.append("9");
                ButtonInitialize=true;
            }
        });

        BoutonComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ButtonInitialize) {
                    Champ_saisie.append(".");
                }

                else{
                    Toast.makeText(getApplicationContext(), "Please select numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BoutonRet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ButtonInitialize == false) {
                    if (Champ_resultat.getText() != "") {
                        ButtonInitialize = true;
                    }

                    else {
                        Toast.makeText(getApplicationContext(), "Please select numbers", Toast.LENGTH_SHORT).show();
                    }
                }

                if (ButtonInitialize) {
                    if(Champ_saisie.getText() != "") {
                        CharSequence saisie1 = Champ_saisie.getText();
                        saisie1 = saisie1.subSequence(0, saisie1.length() - 1);
                        Champ_saisie.setText(saisie1);
                    }

                    else{
                        Toast.makeText(getApplicationContext(), "Please select numbers", Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });

        BoutonRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Champ_histo.setText("");
                Champ_saisie.setText("");
                Champ_resultat.setText("");
            }
        });

        BoutonPar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Champ_saisie.append("-");
            }
        });

        BoutonPar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ButtonInitialize) {
                    CharSequence saisie1 = Champ_saisie.getText();
                    float saisie2 = Float.parseFloat(saisie1.toString());
                    saisie2 = 0.01f * saisie2;
                    Champ_saisie.setText(Float.toString(saisie2));
                }
                else{
                    Toast.makeText(getApplicationContext(), "Please select numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BoutonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ButtonInitialize==false){
                    if(Champ_resultat.getText() != ""){
                        ButtonInitialize=true;
                    }

                    else{
                        Toast.makeText(getApplicationContext(), "Please select numbers", Toast.LENGTH_SHORT).show();
                    }
                }

                if(ButtonInitialize) {
                    Operation = "Div";
                    if (Champ_resultat.getText() == "") {
                        Champ_histo.append(Champ_saisie.getText().toString());
                        Champ_histo.append("÷");
                        CharSequence saisie1 = Champ_saisie.getText();
                        Nombre1 = Float.parseFloat(saisie1.toString());
                    }

                    if (Champ_resultat.getText() != "") {
                        CharSequence resultat1 = Champ_resultat.getText();
                        Nombre1 = Float.parseFloat(resultat1.toString());
                        Champ_histo.setText(resultat1.toString());
                        Champ_histo.append("÷");
                    }
                    Champ_saisie.setText("");
                }
            }
        });

        BoutonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ButtonInitialize==false){
                    if(Champ_resultat.getText() != ""){
                        ButtonInitialize=true;
                    }

                    else{
                        Toast.makeText(getApplicationContext(), "Please select numbers", Toast.LENGTH_SHORT).show();
                    }
                }

                if(ButtonInitialize) {
                    Operation = "Mul";
                    if (Champ_resultat.getText() == "") {
                        Champ_histo.append(Champ_saisie.getText().toString());
                        Champ_histo.append("×");
                        CharSequence saisie1 = Champ_saisie.getText();
                        Nombre1 = Float.parseFloat(saisie1.toString());
                    }

                    if (Champ_resultat.getText() != "") {
                        CharSequence resultat1 = Champ_resultat.getText();
                        Nombre1 = Float.parseFloat(resultat1.toString());
                        Champ_histo.setText(resultat1.toString());
                        Champ_histo.append("×");
                    }

                    Champ_saisie.setText("");
                }
            }
        });

        BoutonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ButtonInitialize==false){
                    if(Champ_resultat.getText() != ""){
                        ButtonInitialize=true;
                    }

                    else{
                        Toast.makeText(getApplicationContext(), "Please select numbers", Toast.LENGTH_SHORT).show();
                    }
                }

                if(ButtonInitialize) {
                    Operation = "Minus";
                    if (Champ_resultat.getText() == "") {
                        Champ_histo.append(Champ_saisie.getText().toString());
                        Champ_histo.append("-");
                        CharSequence saisie1 = Champ_saisie.getText();
                        Nombre1 = Float.parseFloat(saisie1.toString());
                    }

                    if (Champ_resultat.getText() != "") {
                        CharSequence resultat1 = Champ_resultat.getText();
                        Nombre1 = Float.parseFloat(resultat1.toString());
                        Champ_histo.setText(resultat1.toString());
                        Champ_histo.append("-");
                    }

                    Champ_saisie.setText("");
                }
            }
        });

        BoutonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ButtonInitialize==false){
                    if(Champ_resultat.getText() != ""){
                        ButtonInitialize=true;
                    }

                    else{
                        Toast.makeText(getApplicationContext(), "Please select numbers", Toast.LENGTH_SHORT).show();
                    }
                }

                if(ButtonInitialize) {
                    Operation = "Plus";
                    if (Champ_resultat.getText() == "") {
                        Champ_histo.append(Champ_saisie.getText().toString());
                        Champ_histo.append("+");
                        CharSequence saisie1 = Champ_saisie.getText();
                        Nombre1 = Float.parseFloat(saisie1.toString());
                    }

                    if (Champ_resultat.getText() != "") {
                        CharSequence resultat1 = Champ_resultat.getText();
                        Nombre1 = Float.parseFloat(resultat1.toString());
                        Champ_histo.setText(resultat1.toString());
                        Champ_histo.append("+");
                    }

                    Champ_saisie.setText("");
                }
            }

        });

        // Traitement de l'opération
        BoutonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ButtonInitialize) {
                    Champ_histo.append(Champ_saisie.getText().toString());
                    float calcul = 0;
                    CharSequence saisie2 = Champ_saisie.getText();
                    Nombre2 = Float.parseFloat(saisie2.toString());

                    if (Operation == "Div") {
                        calcul = Nombre1 / Nombre2;
                    }

                    if (Operation == "Mul") {
                        calcul = Nombre1 * Nombre2;
                    }

                    if (Operation == "Minus") {
                        calcul = Nombre1 - Nombre2;
                    }

                    if (Operation == "Plus") {
                        calcul = Nombre1 + Nombre2;
                    }

                    ButtonInitialize = false;
                    Champ_saisie.setText("");
                    String result=Float.toString(calcul);

                    //Correction du probleme de virgule pour les entiers
                    String calc[]=result.split("\\.");
                    if(calc.length>1){
                        if(calc[1].equals("0")){
                            result=calc[0];
                        }
                    }
                    Champ_resultat.setText(result);
                }

                else{
                    Toast.makeText(getApplicationContext(), "Please select numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}