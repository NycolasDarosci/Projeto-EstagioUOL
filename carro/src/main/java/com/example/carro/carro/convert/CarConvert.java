package com.example.carro.carro.convert;

import java.util.List;
import java.util.stream.Collectors;

import com.example.carro.carro.controller.dto.CarDto;
import com.example.carro.carro.model.Car;

import org.springframework.stereotype.Component;

@Component
public class CarConvert {

    public CarDto toCarDto(Car car) {
        CarDto carDto = new CarDto();
        carDto.setChassi(car.getChassi());
        carDto.setNome(car.getNome());
        carDto.setMarca(car.getMarca());
        carDto.setCor(car.getCor());
        carDto.setValor(car.getValor());
        carDto.setAnoFabric(car.getAnoFabric());
        return carDto;
    }

    public List<CarDto> toCarDto(List<Car> car) {
        return car.stream().map(x -> toCarDto(x)).collect(Collectors.toList());
    }

    public Car toDtoCar(CarDto carDto) {
        Car car = new Car();
        car.setChassi(carDto.getChassi());
        car.setNome(carDto.getNome());
        car.setMarca(carDto.getMarca());
        car.setCor(carDto.getCor());
        car.setValor(carDto.getValor());
        car.setAnoFabric(carDto.getAnoFabric());
        return car;
    }

    public List<Car> toDtoCar(List<CarDto> car) {
        return car.stream().map(x -> toDtoCar(x)).collect(Collectors.toList());
    }
}
