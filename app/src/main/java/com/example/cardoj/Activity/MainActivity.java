package com.example.cardoj.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cardoj.R;
import com.example.cardoj.adapter.PostagemAdapter;
import com.example.cardoj.model.Processos;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Processos> processo = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Define layout

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager( layoutManager);

        //Define Adpter
        this.prepararProcesso();
        PostagemAdapter adapter = new PostagemAdapter(processo);
        recyclerPostagem.setAdapter(adapter);


      }

    //Criar os mandados
    public void prepararProcesso(){
        //Recuperar os dados da central
        Bundle dados = getIntent().getExtras();


        Processos mandado = new Processos("0800001-01.2020.8.20.5001","Maria Ferro Peroz","Rua Paraiso Nº357","05/05/2020","15 dias");
        this.processo.add(mandado);

        //adicionando os dados enviado da central
        mandado = new Processos(dados.getString("numero"),dados.getString("nome"),dados.getString("enderenco"),dados.getString("data"),dados.getString("prazos"));
        this.processo.add(mandado);

        mandado = new Processos("0800001-02.2020.8.20.5001","Carlos antonio dos santos","Rua Paraiso Nº111","05/06/2020","15 dias");
        this.processo.add(mandado);

        mandado = new Processos("0800001-03.2020.8.20.5001","Luiz gustavo da Silva","Rua Paraiso Nº444","05/07/2020","15 dias");
        this.processo.add(mandado);

        mandado = new Processos("0800001-04.2020.8.20.5001","Pedro Henrique Cardoso","Rua Paraiso Nº555","05/08/2020","15 dias");
        this.processo.add(mandado);

        mandado = new Processos("0800001-05.2020.8.20.5001","Maria Feliz da Cunha","Rua Paraiso Nº556","05/09/2020","15 dias");
        this.processo.add(mandado);

        mandado = new Processos("0800001-06.2020.8.20.5001","Carlos dos Santos ","Rua Paraiso Nº557","05/10/2020","15 dias");
        this.processo.add(mandado);

        mandado = new Processos("0800001-07.2020.8.20.5001","Felipe Gomes Silva","Rua Paraiso Nº777","10/10/2020","15 dias");
        this.processo.add(mandado);

        mandado = new Processos("0800001-08.2020.8.20.5001","Cararina da Costa Lima","Rua Paraiso Nº888","15/10/2020","15 dias");
        this.processo.add(mandado);

        mandado = new Processos("0800001-08.2020.8.20.5001","Cararina da Costa Lima","Rua Paraiso Nº888","15/10/2020","15 dias");
        this.processo.add(mandado);

        mandado = new Processos("0800001-08.2020.8.20.5001","Cararina da Costa Lima","Rua Paraiso Nº888","15/10/2020","15 dias");
        this.processo.add(mandado);


    }



   }