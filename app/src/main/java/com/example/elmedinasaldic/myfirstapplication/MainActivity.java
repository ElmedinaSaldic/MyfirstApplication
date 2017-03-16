package com.example.elmedinasaldic.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       double dividend;
       double divisor;
       double Ergebnis;



       // System.out.print("Hello World");
    }

    public void MyDividieren (View v) { //OnClick(=MyDividieren) zeigen was passiert wernn man auf den Button klickt

        EditText DividentZahl = (EditText) findViewById(R.id.DividentZahl); //die richtige ID holen (von activity_main
        EditText DivisorZahl = (EditText) findViewById(R.id.DivisorZahl);  //also Objekt wird angesprochen
        EditText Ergebnis = (EditText) findViewById(R.id.Ergebnis);


        Double zahl1 = Double.parseDouble(DividentZahl.getText().toString()); //get Text und in Double umwandeln
        Double zahl2 = Double.parseDouble(DivisorZahl.getText().toString());

        Ergebnis.setText(String.valueOf(zahl1 / zahl2)); //Die eigentliche Funktion vom Taschenrechner

        /*try {
            Ergebnis = Convert.ToDouble(Console.ReadLine());
        } catch (Exception e) {
            Console.WriteLine("Zahl eingeben");

        } */
    }



    public void MyReset (View view){
        Button Reset = (Button) view;
    }

    //test Branch
}
