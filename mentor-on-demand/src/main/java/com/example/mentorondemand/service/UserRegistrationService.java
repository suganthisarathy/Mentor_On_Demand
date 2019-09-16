package com.example.mentorondemand.service;

import java.util.List;

import javax.validation.Valid;

import com.example.mentorondemand.model.MentorRegistration;
import com.example.mentorondemand.model.UserRegistration;

public interface UserRegistrationService {

	UserRegistration insertUser(UserRegistration user);

	List<UserRegistration> findByEmail(String email);

	

	

}
