package com.example.carro.carro.repository;

import java.util.List;

import com.example.carro.carro.model.Car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findCarByMarca(String marca);

    List<Car> findCarByNome(String nome);

    List<Car> findCarByCor(String cor);

    @Query("SELECT C FROM Car C WHERE valor=(SELECT MAX(valor) FROM Car)")
    List<Car> Caro(Double valor);

    @Query("SELECT C FROM Car C WHERE valor=(SELECT MIN(valor) FROM Car)")
    List<Car> Barato(Double valor);

    List<Car> findCarByValor(Double valor);

    List<Car> findCarByAnoFabric(String anoFabric);

}
