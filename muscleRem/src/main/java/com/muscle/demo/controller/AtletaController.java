package com.muscle.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.muscle.demo.model.Atleta;
import com.muscle.demo.repository.AtletaRepository;

@RestController
public class AtletaController {
	private final AtletaRepository atletaRepository;
	
	AtletaController(AtletaRepository repository) {
		atletaRepository = repository;
	}
	
	@GetMapping("/atleti")
	Iterable<Atleta> getAtleti() {
		return atletaRepository.findAll();
	}
	
	@PostMapping("/atleti")
	Atleta createAtleta(@RequestBody Atleta newAtleta) {
		return atletaRepository.save(newAtleta);
	}
}
