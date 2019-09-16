package com.example.mentorondemand.service;



import java.util.List;

import com.example.mentorondemand.model.MentorRegistration;

public interface MentorService {

	MentorRegistration insertUser( MentorRegistration mentor);

	List<MentorRegistration> findByEmail(String email);

	List<MentorRegistration> getCourseList();

	List<MentorRegistration> getMentorListWithPattern(String technology);

	

	

}
