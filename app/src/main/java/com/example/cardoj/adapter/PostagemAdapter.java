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

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.OjviemHolder> {

    private List<Processos> expediente;
    public PostagemAdapter(List<Processos> lista_proc) {

        this.expediente = lista_proc;
    }
    @NonNull
    @Override
    public OjviemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View processoLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.central_layout,parent,false);
        return new OjviemHolder(processoLista);
    }

    @Override
    public void onBindViewHolder(@NonNull OjviemHolder holder, int position) {

        Processos mandado = expediente.get(position);
        holder.numero_processo.setText(mandado.getNumero_processo());
        holder.nome_parte.setText(mandado.getNome_parte());
        holder.data_de_intimacao.setText(mandado.getData_intimacao());
        holder.enderenco_parte.setText(mandado.getEnderenco_parte());
        holder.prazos_intimacao.setText(mandado.getPrazo_intimacao());
    }

    @Override
    public int getItemCount() {
        return expediente.size();
    }

    public class OjviemHolder extends RecyclerView.ViewHolder{

        private TextView numero_processo;
        private TextView nome_parte;
        private TextView data_de_intimacao;
        private TextView enderenco_parte;
        private TextView prazos_intimacao;

        public OjviemHolder(@NonNull View itemView) {
            super(itemView);
            numero_processo   = itemView.findViewById(R.id.textNumero_processo);
            nome_parte        = itemView.findViewById(R.id.textNome_parte);
            data_de_intimacao = itemView.findViewById(R.id.textData_intimacao);
            enderenco_parte   = itemView.findViewById(R.id.textEnderenco_parte);
            prazos_intimacao  = itemView.findViewById(R.id.textPrazos);

        }
    }

}

