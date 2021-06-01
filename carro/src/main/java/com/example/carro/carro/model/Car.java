package com.example.carro.carro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private String chassi;

    private String nome;
    private String marca;
    private String cor;
    private Double valor;
    private int anoFabric;

    public int getAnoFabric() {
        return anoFabric;
    }

    public String getCor() {
        return cor;
    }

    public String getChassi() {
        return chassi;
    }

    public String getMarca() {
        return marca;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    public Long getId() {
        return Id;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
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

    public void setAnoFabric(int anoFabric) {
        this.anoFabric = anoFabric;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setId(Long id) {
        Id = id;
    }
}
