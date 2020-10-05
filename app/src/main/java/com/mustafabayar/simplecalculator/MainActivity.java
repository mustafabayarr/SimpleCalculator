package com.mustafabayar.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numberText;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberText = findViewById(R.id.numberText);
        number2Text = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resultText);
    }

    public void sum(View view){
        try {
            int number1 = Integer.parseInt(numberText.getText().toString()); //getText() aldığı değeri direk string alamıyor o yüzden toString ile string e çeviriyoruz. String ide Int e çevirdik.
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 + number2;

            resultText.setText("Result : " + result);
        }catch (Exception exception){
            resultText.setText("Enter Number!");
        }


    }

    public void substract(View view){
        try {
            int number1 = Integer.parseInt(numberText.getText().toString()); //getText() aldığı değeri direk string alamıyor o yüzden toString ile string e çeviriyoruz. String ide Int e çevirdik.
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 - number2;

            resultText.setText("Result : " + result);
        }catch (Exception exception){
            resultText.setText("Enter Number!");
        }
    }

    public void multiply(View view){
        try {
            int number1 = Integer.parseInt(numberText.getText().toString()); //getText() aldığı değeri direk string alamıyor o yüzden toString ile string e çeviriyoruz. String ide Int e çevirdik.
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 * number2;

            resultText.setText("Result : " + result);
        }catch (Exception exception){
            resultText.setText("Enter Number!");
        }
    }

    public void divide(View view){
        try {
            int number1 = Integer.parseInt(numberText.getText().toString()); //getText() aldığı değeri direk string alamıyor o yüzden toString ile string e çeviriyoruz. String ide Int e çevirdik.
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 / number2;

            resultText.setText("Result : " + result);
        }catch (Exception exception){
            resultText.setText("Enter Number!");
        }
    }
}