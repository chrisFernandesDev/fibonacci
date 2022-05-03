package com.example.fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button buttonCalcular;
    private EditText userDigitar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCalcular = findViewById(R.id.btnCalcular);
        userDigitar = findViewById(R.id.userDigitar);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ResultadoCalculo.class);
                int number1 = 0;
                int number2 = 1;
                int soma = 0;
                ArrayList<Integer> arrayList = new ArrayList<Integer>();

                int userDigitaNumber = Integer.parseInt(userDigitar.getText().toString());
                arrayList.add(number1);
                arrayList.add(number2);

                for (int i = 2; i < userDigitaNumber; i++) {
                    soma = number1 + number2;
                    number1 = number2;
                    number2 = soma;
                    arrayList.add(soma);
                }
                intent.putExtra("resultado", arrayList);
                startActivity(intent);
            }
        });
    }
}