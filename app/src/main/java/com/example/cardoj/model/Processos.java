package com.example.cardoj.model;

public class Processos {
    private String numero_processo;
    private String nome_parte;
    private String enderenco_parte;
    private String data_intimacao;
    private String Prazo_intimacao;

    public Processos() {
    }

    public Processos(String numero_processo, String nome_parte, String enderenco_parte, String data_intimacao, String prazo_intimacao) {
        this.numero_processo = numero_processo;
        this.nome_parte = nome_parte;
        this.enderenco_parte = enderenco_parte;
        this.data_intimacao = data_intimacao;
        this.Prazo_intimacao = prazo_intimacao;
    }

    public String getNumero_processo() {
        return numero_processo;
    }

    public void setNumero_processo(String numero_processo) {
        this.numero_processo = numero_processo;
    }

    public String getNome_parte() {
        return nome_parte;
    }

    public void setNome_parte(String nome_parte) {
        this.nome_parte = nome_parte;
    }

    public String getEnderenco_parte() {
        return enderenco_parte;
    }

    public void setEnderenco_parte(String enderenco_parte) {
        this.enderenco_parte = enderenco_parte;
    }

    public String getData_intimacao() {
        return data_intimacao;
    }

    public void setData_intimacao(String data_intimacao) {
        this.data_intimacao = data_intimacao;
    }

    public String getPrazo_intimacao() {
        return Prazo_intimacao;
    }

    public void setPrazo_intimacao(String prazo_intimacao) {
        Prazo_intimacao = prazo_intimacao;
    }
}
