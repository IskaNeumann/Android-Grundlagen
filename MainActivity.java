package de.neumann.franziska.currencycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void umrechnenEuro(View view)
    {
        EditText editTextBetrag = (EditText) findViewById(R.id.eingabefeld);
        TextView ergebnis = (TextView) findViewById(R.id.umgerechneterWert);
        if (editTextBetrag.getText().toString().equals(""))
        {
            editTextBetrag.setError("Zahl wird benötigt");
        }
        else{
            Double betrag = Double.valueOf(editTextBetrag.getText().toString());
            betrag = betrag * 1.11;
            ergebnis.setText(String.valueOf(betrag));
            editTextBetrag.setText("");

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
