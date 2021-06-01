package com.example.carro.carro.controller.dto;

public class CarDto {

    private String chassi;
    private String nome;
    private String marca;
    private String cor;
    private Double valor;
    private int anoFabric;

    public String getChassi() {
        return chassi;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public Double getValor() {
        return valor;
    }

    public int getAnoFabric() {
        return anoFabric;
    }

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
