package com.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.model.Admin;
import com.microservice.repo.AdminRepository;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api5")
public class AdminController {
    @Autowired
    AdminRepository adminRepo;
	
	@GetMapping("/checkAdmin/{username}/{password}")
	public Admin checkAdmin(@PathVariable("username") String username,@PathVariable("password") String password){
		System.out.println("inside mentor");
		Admin admin=adminRepo.findAdmin(username,password);
		return admin;
	}
}
