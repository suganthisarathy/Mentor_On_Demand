package com.example.mentorondemand.controller;

import org.springframework.web.servlet.ModelAndView;

public interface UserController {

	String hi();

	int getUserId();

	ModelAndView getRequestStatus() throws Exception;



	
}
