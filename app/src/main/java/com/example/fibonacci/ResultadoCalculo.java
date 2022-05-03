package com.example.fibonacci;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ResultadoCalculo extends AppCompatActivity {
    private Button buttonVoltar;
    private TextView resultadoFinal;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado_calculo);

        buttonVoltar = findViewById(R.id.btnVoltar);

        Intent intent = getIntent();
        ArrayList<Integer> dadosRecebidos = intent.getIntegerArrayListExtra("resultado");


        resultadoFinal = findViewById(R.id.textResultado);
        resultadoFinal.setText(String.valueOf(dadosRecebidos));

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
