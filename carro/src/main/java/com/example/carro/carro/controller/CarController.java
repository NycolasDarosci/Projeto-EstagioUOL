package com.example.carro.carro.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.example.carro.carro.model.Car;
import com.example.carro.carro.model.request.CarRequest;
import com.example.carro.carro.model.response.CarResponse;
import com.example.carro.carro.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CarResponse> postar(@RequestBody CarRequest car) {
        return carRepository.save(car);
    }

    @GetMapping
    public List<Car> listar() {
        return carRepository.findAll();
    }
}
/*
 * @GetMapping public Car buscarChassis(String chassi) { Optional<Car> car =
 * carRepository.findByChassi(chassi); return car.orElseThrow(() -> new
 * IllegalArgumentException( "Objeto não encontrado! Chassi: " + chassi +
 * ", Tipo: " + Car.class.getName()));
 */

/*
 
 */

/*
 * @PostMapping
 * 
 * @Transactional public ResponseEntity<CarDto> cadastrar(@RequestBody CarDto
 * carDto) { // UriComponentsBuilder // uriBuilder) { Optional<Car> carro =
 * carDto.converter(carRepository); carRepository.save(carro); return null;
 */

// URI uri =
// uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
// return ResponseEntity.created(uri).body(new TopicoDto(topico));
