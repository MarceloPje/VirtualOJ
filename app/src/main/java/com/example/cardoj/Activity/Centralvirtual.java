package com.example.cardoj.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cardoj.R;
import com.example.cardoj.adapter.DistribuidorAdapter;
import com.example.cardoj.central;
import com.example.cardoj.model.Processos;

import java.util.ArrayList;
import java.util.List;

public class Centralvirtual extends AppCompatActivity {
    private Button buttonDistribuir;
    private RecyclerView recyclerDistribuidor;
    private List<Processos> expedientes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centralvirtual);

        recyclerDistribuidor = findViewById(R.id.recycler_Painel_Distribuidor);

        //Define Layout
         RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
         recyclerDistribuidor.setLayoutManager(layoutManager);

        //Define Adapter
        this.prepararExpediente();
        DistribuidorAdapter adapter = new DistribuidorAdapter(expedientes);
        recyclerDistribuidor.setAdapter(adapter);


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

    //Prepara painel do Distribuidor
    public void prepararExpediente(){

        Processos processo = new Processos("08000253-56.2020.8.20.5002","Lucivania da Silva Alves","Rua Duque de Caxias Nº 321","10/10/2020","15 dias");
        this.expedientes.add(processo);

        processo = new Processos("08000255-55.2020.8.20.5002","Eduarda da Silva Alves","Rua Duque dos Reis Nº 125","12/10/2020","15 dias");
        this.expedientes.add(processo);

        processo = new Processos("08000257-58.2020.8.20.5002","Manoel Alves da Silva","Rua tres irmão Nº 456","13/10/2020","15 dias");
        this.expedientes.add(processo);
    }


}