package com.example.elmedinasaldic.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

    public void MyDividieren (View v){ //OnClick(=MyDividieren) zeigen was passiert wernn man auf den Button klickt

        EditText Divident = (EditText)findViewById(R.id.Divident); //die richtige ID holen (von activity_main
        EditText Divisor = (EditText)findViewById(R.id.Divisor);  //also Objekt wird angesprochen
        EditText Ergebnis = (EditText)findViewById(R.id.Ergebnis);

        Double zahl1 = Double.parseDouble(Divident.getText().toString()); //get Text und in Double umwandeln
        Double zahl2 = Double.parseDouble(Divisor.getText().toString());

        Ergebnis.setText(String.valueOf(zahl1/zahl2)); //Die eigentliche Funktion vom Taschenrechner
    }
}
