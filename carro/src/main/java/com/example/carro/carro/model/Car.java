package com.example.carro.carro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String chassi;
    private String nome;
    private String marca;
    private String cor;
    private Double valor;
    private int anoFabric;

    public Car(String chassi, String nome, String marca, String cor, Double valor, int anoFabric) {
        this.chassi = chassi;
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.valor = valor;
        this.anoFabric = anoFabric;
    }

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

}
