package com.example.carro.carro.repository;

import java.util.Optional;

import com.example.carro.carro.model.Car;
import com.example.carro.carro.model.response.CarResponse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    Car findByChassi(String chassi);

    ResponseEntity<CarResponse> save(CarResponse car);

}
