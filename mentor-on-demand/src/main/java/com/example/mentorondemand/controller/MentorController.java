package com.example.mentorondemand.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import com.example.mentorondemand.model.MentorRegistration;

public interface MentorController {

	ModelAndView getCourseList() throws Exception;

	ModelAndView getRequestList() throws Exception;

	String getMentorRegistrationForm(ModelMap model);

	String insertMentorDetails(@Valid MentorRegistration mentor, BindingResult result, Model model) throws SQLException;

	String getUserId();

	String userlogin(ModelMap model);

	ModelAndView loginCheck(@Valid MentorRegistration mentor, HttpServletRequest request) throws Exception;

	String mentorSearch(ModelMap model);

	ModelAndView mentorSearch(ModelMap map, @Valid MentorRegistration mentor)
			throws ClassNotFoundException, SQLException;

	String userMentorLink(int mentorId);

	String acceptRequest(int userId, int mentorId);

	String rejectRequest(int userId, int mentorId);

	

}
