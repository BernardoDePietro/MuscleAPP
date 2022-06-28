package com.muscle.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.muscle.demo.model.Muscolo;
import com.muscle.demo.repository.MuscoloRepository;

@RestController
public class MuscoloController {
	private final MuscoloRepository muscoloRepository;
	
	MuscoloController(MuscoloRepository repository) {
		muscoloRepository = repository;
	}
	
	@GetMapping("/muscoli")
	Iterable<Muscolo> getMuscoli() {
		return muscoloRepository.findAll();
	}
	
	@PostMapping("/muscoli")
	Muscolo createMuscolo(@RequestBody Muscolo newMuscolo) {
		return muscoloRepository.save(newMuscolo);
	}
}
