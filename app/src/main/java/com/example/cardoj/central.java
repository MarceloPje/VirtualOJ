package com.example.cardoj;

public class central {
    private String numero;
    private String nome;
    private String enderenco;
    private String data;
    private String prazo;

    public central(String numero, String nome, String enderenco, String data, String prazo) {
        this.numero = numero;
        this.nome = nome;
        this.enderenco = enderenco;
        this.data = data;
        this.prazo = prazo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderenco() {
        return enderenco;
    }

    public void setEnderenco(String enderenco) {
        this.enderenco = enderenco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }
}
