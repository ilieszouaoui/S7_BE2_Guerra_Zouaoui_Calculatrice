package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    public float Nombre1;
    public float Nombre2;
    float calc_succ;
    public String Operation;
    public boolean ButtonInitialize;

    public TextView Champ_histo;
    public TextView Champ_saisie;
    public TextView Champ_resultat;

    //Recuperation des boutons
    TextView Bouton0;
    TextView Bouton1;
    TextView Bouton2;
    TextView Bouton3;
    TextView Bouton4;
    TextView Bouton5;
    TextView Bouton6;
    TextView Bouton7;
    TextView Bouton8;
    TextView Bouton9;
    TextView BoutonComa;
    TextView BoutonRet;

    TextView BoutonRes;
    TextView BoutonPar1;
    TextView BoutonPar2;
    TextView BoutonDiv;
    TextView BoutonMul;
    TextView BoutonMinus;
    TextView BoutonPlus;
    TextView BoutonEqual;




    private void TraiteBouton(String Operation) {
        if(ButtonInitialize==false){
            if(Champ_resultat.getText() != ""){
                ButtonInitialize=true;
            }

            else{
                Toast.makeText(getApplicationContext(), "Please select numbers", Toast.LENGTH_SHORT).show();
            }
        }

        if (ButtonInitialize) {

//            //Tentative resolution calculs successifs
//            if(Champ_histo.getText()!=""){
//                CharSequence saisie2 = Champ_saisie.getText();
//                float Nombre3 = Float.parseFloat(saisie2.toString());
//                Champ_histo.append(Champ_saisie.getText().toString());
//
//                if (Operation == "Div") {
//                    calc_succ= Nombre1/Nombre3;
//                }
//                if (Operation == "Mul") {
//                    calc_succ= Nombre1*Nombre3;
//                }
//                if (Operation == "Minus") {
//                    calc_succ= Nombre1-Nombre3;
//                }
//                if (Operation == "Plus") {
//                    calc_succ= Nombre1+Nombre3;
//                }
//                Champ_resultat.setText(Float.toString(calc_succ));
//            }
//            //fin tentative

            if (Champ_resultat.getText() == "") {
                Champ_histo.append(Champ_saisie.getText().toString());
                CharSequence saisie1 = Champ_saisie.getText();
                Nombre1 = Float.parseFloat(saisie1.toString());
            }

            if (Champ_resultat.getText() != "") {
                CharSequence resultat1 = Champ_resultat.getText();
                Nombre1 = Float.parseFloat(resultat1.toString());
                Champ_histo.setText(resultat1.toString());
            }

            if (Operation == "Div") {
                Champ_histo.append("÷");
            }
            if (Operation == "Mul") {
                Champ_histo.append("×");
            }
            if (Operation == "Minus") {
                Champ_histo.append("-");
            }
            if (Operation == "Plus") {
                Champ_histo.append("+");
            }
            Champ_saisie.setText("");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonInitialize=false;

        //Recuperation des champs de textes
        Champ_histo = (TextView) findViewById(R.id.champ_Histo);
        Champ_saisie = (TextView) findViewById(R.id.champ_Input);
        Champ_resultat = (TextView) findViewById(R.id.champ_Resultat);

        //Recuperation des boutons
        Bouton0 = (TextView) findViewById(R.id.Button0);
        Bouton1 = (TextView) findViewById(R.id.Button1);
        Bouton2 = (TextView) findViewById(R.id.Button2);
        Bouton3 = (TextView) findViewById(R.id.Button3);
        Bouton4 = (TextView) findViewById(R.id.Button4);
        Bouton5 = (TextView) findViewById(R.id.Button5);
        Bouton6 = (TextView) findViewById(R.id.Button6);
        Bouton7 = (TextView) findViewById(R.id.Button7);
        Bouton8 = (TextView) findViewById(R.id.Button8);
        Bouton9 = (TextView) findViewById(R.id.Button9);
        BoutonComa = (TextView) findViewById(R.id.ButtonComa);
        BoutonRet = (TextView) findViewById(R.id.ReturnButton);

        BoutonRes = (TextView) findViewById(R.id.ButtonRes);
        BoutonPar1 = (TextView) findViewById(R.id.ButtonPar1);
        BoutonPar2 = (TextView) findViewById(R.id.ButtonPar2);
        BoutonDiv = (TextView) findViewById(R.id.ButtonDiv);
        BoutonMul = (TextView) findViewById(R.id.ButtonMul);
        BoutonMinus = (TextView) findViewById(R.id.ButtonMinus);
        BoutonPlus = (TextView) findViewById(R.id.ButtonPlus);
        BoutonEqual = (TextView) findViewById(R.id.ButtonEqual);

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

                if (ButtonInitialize) {
                    if(Champ_saisie.getText() != "") {

                        CharSequence saisie1 = Champ_saisie.getText();
                        if(saisie1.length()>0){
                            saisie1 = saisie1.subSequence(0, saisie1.length() - 1);
                            Champ_saisie.setText(saisie1);
                        }

                        else{
                            Toast.makeText(getApplicationContext(), "Please select numbers", Toast.LENGTH_SHORT).show();
                        }
                    }

                }

                else{
                    Toast.makeText(getApplicationContext(), "Please select numbers", Toast.LENGTH_SHORT).show();
                }
            }

        });

        BoutonRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Champ_histo.setText("");
                Champ_saisie.setText("");
                Champ_resultat.setText("");
                ButtonInitialize = false;
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

        // Traitement des boutons d'actions avec la methode TraiteBouton
        BoutonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation = "Div";
                TraiteBouton(Operation);
            }
        });

        BoutonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation = "Mul";
                TraiteBouton(Operation);
                }
            //}
        });

        BoutonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation = "Minus";
                TraiteBouton(Operation);
            }
        });

        BoutonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation = "Plus";
                TraiteBouton(Operation);
            }
        });

        //Traitement de l'opération
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
                    // AlreadyRuning = false;
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