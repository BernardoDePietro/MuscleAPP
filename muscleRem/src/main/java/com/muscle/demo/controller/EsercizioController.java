package com.muscle.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.muscle.demo.model.Esercizio;
import com.muscle.demo.repository.EsercizioRepository;

@RestController
public class EsercizioController {
	private final EsercizioRepository esercizioRepository;
	
	EsercizioController(EsercizioRepository repository) {
		esercizioRepository = repository;
	}
	
	@GetMapping("/esercizi")
	Iterable<Esercizio> getEsercizi() {
		return esercizioRepository.findAll();
	}
	
	@PostMapping("/esercizi")
	Esercizio createEsercizio(@RequestBody Esercizio newEsercizio) {
		return esercizioRepository.save(newEsercizio);
	}
}
