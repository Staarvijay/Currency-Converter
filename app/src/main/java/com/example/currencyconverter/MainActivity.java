package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void clickfun(View view){
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        String amountInRupees = nameEditText.getText().toString();
        double amountInrupeesDouble = Double.parseDouble(amountInRupees);
        double amountInDollarsDouble = amountInrupeesDouble / 71.29;
        String amountInDollarsString = String.format("%.2f",amountInDollarsDouble);
        Toast.makeText(this, "₹" + amountInRupees + " is $" + amountInDollarsString, Toast.LENGTH_LONG).show();
        Log.i("Info","Button pressed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
