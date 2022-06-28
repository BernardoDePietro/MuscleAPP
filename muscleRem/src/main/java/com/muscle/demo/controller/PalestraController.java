package com.muscle.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.muscle.demo.model.Palestra;
import com.muscle.demo.repository.PalestraRepository;

@RestController
public class PalestraController {
	
	private final PalestraRepository palestraRepository;
	
	PalestraController(PalestraRepository repository) {
		palestraRepository = repository;
	}

	@GetMapping("/palestre")
	Iterable<Palestra> getPalestre() {
		return palestraRepository.findAll();
	}
	
	@PostMapping("/palestre")
	Palestra createPalestra(@RequestBody Palestra newPalestra) {
		return palestraRepository.save(newPalestra);
	}
}