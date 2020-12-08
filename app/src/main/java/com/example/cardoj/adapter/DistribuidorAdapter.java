package com.example.cardoj.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardoj.R;
import com.example.cardoj.model.Processos;

import java.util.List;

public class DistribuidorAdapter extends RecyclerView.Adapter <DistribuidorAdapter.DistribuidorHolder>{

    private List<Processos> listaProcesso;
    public DistribuidorAdapter(List<Processos> processo) {
        this.listaProcesso = processo;
    }

    @NonNull
    @Override
    public DistribuidorHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.distribuidor_layout, parent, false);
        return new DistribuidorHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull DistribuidorHolder holder, int position) {

        Processos processo = listaProcesso.get(position);
        //exibicao
        holder.numero_processo.setText(processo.getNumero_processo());
        holder.nome_parte_processo.setText(processo.getNome_parte());
        holder.enderenco_parte_processo.setText(processo.getEnderenco_parte());
        holder.data_parte_processo.setText(processo.getData_intimacao());
        holder.prazo_parte_processo.setText(processo.getPrazo_intimacao());

    }

    @Override
    public int getItemCount() {
        return listaProcesso.size();
    }

    public class DistribuidorHolder extends RecyclerView.ViewHolder{
        private TextView numero_processo;
        private TextView nome_parte_processo;
        private TextView enderenco_parte_processo;
        private TextView data_parte_processo;
        private TextView prazo_parte_processo;


        public DistribuidorHolder(@NonNull View itemView) {
            super(itemView);
            numero_processo          = itemView.findViewById(R.id.textNumero_Processo);
            nome_parte_processo      = itemView.findViewById(R.id.textNome_Parte);
            enderenco_parte_processo = itemView.findViewById(R.id.textEnderenco_Parte);
            data_parte_processo      = itemView.findViewById(R.id.textData_Expediente);
            prazo_parte_processo     = itemView.findViewById(R.id.textPrazo_Expediente);
        }
    }
}
