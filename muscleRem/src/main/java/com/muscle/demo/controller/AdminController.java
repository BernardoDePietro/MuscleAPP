package com.muscle.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.muscle.demo.model.Admin;
import com.muscle.demo.repository.AdminRepository;

@RestController
public class AdminController {
	private final AdminRepository adminRepository;

	public AdminController(AdminRepository repository) {
		adminRepository = repository;
	}
	
	@GetMapping("/admins")
	Iterable<Admin> getAdmins() {
		return adminRepository.findAll();
	}
	
	@PostMapping("/admins")
	Admin createAdmin(@RequestBody Admin newAdmin) {
		return adminRepository.save(newAdmin);
	}
	
}
