package com.muscle.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.muscle.demo.model.Trainer;
import com.muscle.demo.repository.TrainerRepository;

@RestController
public class TrainerController {
	private final TrainerRepository trainerRepository;

	TrainerController(TrainerRepository repository) {
		trainerRepository = repository;
	}
	
	@GetMapping("/trainers")
	Iterable<Trainer> getTrainers() {
		return trainerRepository.findAll();
	}
	
	@PostMapping("/trainers")
	Trainer createTrainer(@RequestBody Trainer newTrainer) {
		return trainerRepository.save(newTrainer);
	}
}
