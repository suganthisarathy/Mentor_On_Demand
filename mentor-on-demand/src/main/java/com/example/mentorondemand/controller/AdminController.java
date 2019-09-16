package com.example.mentorondemand.controller;

import java.sql.SQLException;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import com.example.mentorondemand.model.Admin;

public interface AdminController {

	ModelAndView getUserList() throws Exception;

	ModelAndView getMentorList() throws Exception;

	ModelAndView blockMentor(int mentorId) throws Exception;

	ModelAndView unBlockMentor(int mentorId) throws Exception;

	ModelAndView blockUser(int mentorId) throws Exception;

	ModelAndView unBlockUser(int mentorId) throws Exception;

	String adminlogin(ModelMap model);

	
	String addDetails( Admin skill) throws SQLException;

	ModelAndView getCouseDetails() throws SQLException;

	String addCouseDetails(ModelMap model);

	

	



	

	
}
