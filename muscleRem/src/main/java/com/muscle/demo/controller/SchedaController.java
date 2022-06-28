package com.muscle.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.muscle.demo.model.Scheda;
import com.muscle.demo.repository.SchedaRepository;

@RestController
public class SchedaController {
	
	private final SchedaRepository schedaRepository;
	
	SchedaController(SchedaRepository repository) {
		schedaRepository = repository;
	}
	
	@GetMapping("/schede")
	Iterable<Scheda> getSchede() {
		return schedaRepository.findAll();
	}
	
	@PostMapping("/schede")
	Scheda createScheda(@RequestBody Scheda newScheda) {
		return schedaRepository.save(newScheda);
	}
}
