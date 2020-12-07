package com.example.cardoj.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cardoj.R;
import com.example.cardoj.central;

public class Centralvirtual extends AppCompatActivity {
    private Button buttonDistribuir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centralvirtual);

        buttonDistribuir = findViewById(R.id.buttonDistribuir);
        buttonDistribuir.setOnClickListener(view -> {
            //Chamando a activity do oficial
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);

            //Passar os dados do mandados
            intent.putExtra("numero","0800015.75.2020.20.8.5002");
            intent.putExtra("nome","Carlos Alberto da Silva");
            intent.putExtra("enderenco","Rua henrique de Ferro");
            intent.putExtra("data","05/05/2020");
            intent.putExtra("prazos","10 dias");

            startActivity(intent);

        });
    }
}