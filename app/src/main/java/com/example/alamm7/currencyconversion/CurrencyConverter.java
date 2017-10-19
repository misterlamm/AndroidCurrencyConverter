package com.example.alamm7.currencyconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CurrencyConverter extends AppCompatActivity {


    public void convertPounds (View view) {
        EditText dollarAmountInput = (EditText) findViewById(R.id.dollarAmountInput);

        Double dollarAmountDouble = Double.parseDouble(dollarAmountInput.getText().toString());

        Double poundAmount = dollarAmountDouble * 0.76;

        Toast.makeText(CurrencyConverter.this, "£" + String.format("%.2f", poundAmount), Toast.LENGTH_SHORT).show();

        Log.i("amount", dollarAmountInput.getText().toString());

    }

    public void convertEuros (View view) {
        EditText dollarAmountInput = (EditText) findViewById(R.id.dollarAmountInput);

        Double dollarAmountDouble = Double.parseDouble(dollarAmountInput.getText().toString());

        Double euroAmount = dollarAmountDouble * 0.86;

        Toast.makeText(CurrencyConverter.this, "€" + String.format("%.2f", euroAmount), Toast.LENGTH_SHORT).show();

        Log.i("amount", dollarAmountInput.getText().toString());

    }

    public void convertRubles (View view) {
        EditText dollarAmountInput = (EditText) findViewById(R.id.dollarAmountInput);

        Double dollarAmountDouble = Double.parseDouble(dollarAmountInput.getText().toString());

        Double rubleAmount = dollarAmountDouble * 57.40;

        Toast.makeText(CurrencyConverter.this, "" + String.format("%.2f", rubleAmount), Toast.LENGTH_SHORT).show();

        Log.i("amount", dollarAmountInput.getText().toString());

    }

    public void convertYuan (View view) {
        EditText dollarAmountInput = (EditText) findViewById(R.id.dollarAmountInput);

        Double dollarAmountDouble = Double.parseDouble(dollarAmountInput.getText().toString());

        Double yuanAmount = dollarAmountDouble * 6.63;

        Toast.makeText(CurrencyConverter.this, "" + String.format("%.2f", yuanAmount), Toast.LENGTH_SHORT).show();

        Log.i("amount", dollarAmountInput.getText().toString());

    }

    public void convertPeso (View view) {
        EditText dollarAmountInput = (EditText) findViewById(R.id.dollarAmountInput);

        Double dollarAmountDouble = Double.parseDouble(dollarAmountInput.getText().toString());

        Double pesoAmount = dollarAmountDouble * 18.82;

        Toast.makeText(CurrencyConverter.this, "" + String.format("%.2f", pesoAmount), Toast.LENGTH_SHORT).show();

        Log.i("amount", dollarAmountInput.getText().toString());

    }

    public void convertRupee (View view) {
        EditText dollarAmountInput = (EditText) findViewById(R.id.dollarAmountInput);

        Double dollarAmountDouble = Double.parseDouble(dollarAmountInput.getText().toString());

        Double rupeeAmount = dollarAmountDouble * 65;

        Toast.makeText(CurrencyConverter.this, "" + String.format("%.2f", rupeeAmount), Toast.LENGTH_SHORT).show();

        Log.i("amount", dollarAmountInput.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);
    }
}
