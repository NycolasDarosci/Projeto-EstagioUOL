package com.example.carro.carro.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.transaction.Transactional;

import com.example.carro.carro.controller.dto.CarDto;
import com.example.carro.carro.convert.CarConvert;
import com.example.carro.carro.model.Car;
import com.example.carro.carro.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private CarConvert convert;

    // Cadastrar um carro
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Transactional
    public CarDto postar(@RequestBody Car car) {
        Car carro = carRepository.save(car);
        return convert.toCarDto(carro);
    }

    // Listar todos os carros cadastrados
    @GetMapping
    public List<CarDto> listar() {
        List<Car> car = carRepository.findAll();
        return convert.toCarDto(car);
    }

    // Filtrar por marca
    @GetMapping(params = "marca")
    public List<Car> filtroMarca(@RequestParam String marca) {
        return carRepository.findCarByMarca(marca);
    }

    // Filtrar por nome
    @GetMapping(params = "nome")
    public List<Car> filtroNome(@RequestParam String nome) {
        return carRepository.findCarByNome(nome);
    }

    // Filtrar por cor
    @GetMapping(params = "cor")
    public List<Car> filtroCor(@RequestParam String cor) {
        return carRepository.findCarByCor(cor);
    }

    // Filtrar por mais caro
    @GetMapping(params = "caro")
    public List<Car> filtroCaro(@RequestParam Double caro) {
        return carRepository.Caro(caro);
    }

    // Filtrar por mais barato
    @GetMapping(params = "barato")
    public List<Car> filtroBarato(@RequestParam Double barato) {
        return carRepository.Barato(barato);
    }

    // Não consegui Ordenar
    @GetMapping(path = "/carros/{nome}")
    public List<Car> ordemNome(@PathVariable String nome) {
        List<Car> car = carRepository.findCarByNome(nome);
        convert.toCarDto(car);
        return null;
        // return Collections.sort(car);
    }

    // Não consegui Ordenar
    @GetMapping(path = "/carros/{valor}")
    public List<Car> ordemValor(@PathVariable Double valor) {
        List<Car> car = carRepository.findCarByValor(valor);
        convert.toCarDto(car);
        return null;
        // return Collections.sort(car);
    }

    // Não consegui Ordenar
    @GetMapping(path = "/carros/{anoFabric}")
    public List<Car> ordemAno(@PathVariable String anoFabric) {
        List<Car> car = carRepository.findCarByAnoFabric(anoFabric);
        convert.toCarDto(car);
        return null;
        // return Collections.sort(car);
    }
}
