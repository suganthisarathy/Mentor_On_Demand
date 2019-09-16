package com.example.mentorondemand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mentorondemand.dao.MentorDao;
import com.example.mentorondemand.model.MentorRegistration;

@Service
public class MentorServiceImpl implements MentorService{

	@Autowired
	MentorDao mentorDao;
	@Override
	public MentorRegistration insertUser(MentorRegistration mentor) {
		// TODO Auto-generated method stub
		return mentorDao.save(mentor);
	}
	@Override
	public List<MentorRegistration> findByEmail(String email) {
		// TODO Auto-generated method stub
		return mentorDao.findByEmail(email);
	}
	@Override
	public List<MentorRegistration> getCourseList() {
		// TODO Auto-generated method stub
	
		return mentorDao.findAll();
	}
	@Override
	public List<MentorRegistration> getMentorListWithPattern(String technology) {
		// TODO Auto-generated method stub
		return mentorDao.getMentorListWithPattern( technology);
	}
	

}
