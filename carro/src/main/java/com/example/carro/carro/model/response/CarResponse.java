package com.example.carro.carro.model.response;

public class CarResponse {

    private String chassi;
    private String nome;
    private String marca;
    private String cor;
    private Double valor;
    private int anoFabric;

    public void setAnoFabric(int anoFabric) {
        this.anoFabric = anoFabric;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getChassi() {
        return chassi;
    }

    public int getAnoFabric() {
        return anoFabric;
    }

    public Double getValor() {
        return valor;
    }

    public String getCor() {
        return cor;
    }
}
