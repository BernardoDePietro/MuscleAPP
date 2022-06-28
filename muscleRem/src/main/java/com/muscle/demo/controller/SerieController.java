package com.muscle.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.muscle.demo.model.Serie;
import com.muscle.demo.repository.SerieRepository;

@RestController
public class SerieController {
	
	private final SerieRepository serieRepository;
	
	SerieController(SerieRepository repository) {
		serieRepository = repository;
	}
	
	@GetMapping("/Serie")
	Iterable<Serie> getSerie() {
		return serieRepository.findAll();
	}
	
	@PostMapping("/serie")
	Serie createSerie(@RequestBody Serie newSerie) {
		return serieRepository.save(newSerie);
	}
}
