package com.example.mentorondemand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mentorondemand.dao.MentorDao;
import com.example.mentorondemand.dao.UserRegistrationDao;
import com.example.mentorondemand.model.MentorRegistration;
import com.example.mentorondemand.model.UserRegistration;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
   @Autowired
   UserRegistrationDao userRegistrationDao;
   
	@Override
	public UserRegistration insertUser(UserRegistration user) {
		// TODO Auto-generated method stub
		System.out.println(user);
		System.out.println(userRegistrationDao.save(user));
		return userRegistrationDao.save(user);
	}
	@Override
	public List<UserRegistration> findByEmail(String email) {
		// TODO Auto-generated method stub
		return userRegistrationDao.findByEmail(email);
	}
	
	



}
