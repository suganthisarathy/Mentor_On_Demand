package com.example.mentorondemand.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.mentorondemand.dao.AdminDao;
import com.example.mentorondemand.dao.MentorDao;
import com.example.mentorondemand.dao.UserRegistrationDao;
import com.example.mentorondemand.model.Admin;
import com.example.mentorondemand.model.UserRegistration;

@Controller
public class AdminControllerImpl implements AdminController {
	@Autowired
	UserRegistrationDao userRegistrationDao;
	@Autowired
	MentorDao mentorDao;
	@Autowired
	AdminDao adminDao;

	@Override
	@RequestMapping(path = "/adminlogincheck", method = RequestMethod.GET)
	public String adminlogin(ModelMap model) {
		Admin u = new Admin();
		// e.setEmail("sdfsf");
		// e.setSalary(4564.56f);
		model.addAttribute("u2", u);
		return "AdminLogin";
	}

	@RequestMapping(path = "/adminlogincheck", method = RequestMethod.POST)
	public ModelAndView loginCheck(@Valid @ModelAttribute("u2") UserRegistration user, HttpServletRequest request)
			throws Exception {

		ModelAndView mav = null;

		if (user.getEmail().equalsIgnoreCase("admin@gmail.com")) {
			mav = new ModelAndView("AdminLandingPage");

		}

		else {
			mav = new ModelAndView("AdminLogin", "message", "Invalid Username or Password");
		}

		return mav;

	}

	@Override
	@RequestMapping(path = "/userList")
	public ModelAndView getUserList() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UserList");
		// mentorService.getCourseList();
		mv.addObject("userList", userRegistrationDao.findAll());
		return mv;
	}

	@Override
	@RequestMapping(path = "/mentorList")
	public ModelAndView getMentorList() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("MentorList");
		// mentorService.getCourseList();
		mv.addObject("mentorList", mentorDao.findAll());
		return mv;
	}

	@Override
	@RequestMapping(path = "/blockmentor")
	public ModelAndView blockMentor(@RequestParam("mentorid") int mentorId) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("MentorList");
		// mentorService.getCourseList();
		mentorDao.blockMentor(mentorId);

		mv.addObject("mentorList", mentorDao.findAll());
		return mv;
	}

	@Override
	@RequestMapping(path = "/Unblockmentor")
	public ModelAndView unBlockMentor(@RequestParam("mentorid") int mentorId) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("MentorList");
		// mentorService.getCourseList();
		mentorDao.unBlockMentor(mentorId);

		mv.addObject("mentorList", mentorDao.findAll());
		return mv;
	}

	@Override
	@RequestMapping(path = "/blockUser")
	public ModelAndView blockUser(@RequestParam("userid") int userId) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UserList");
		// mentorService.getCourseList();
		userRegistrationDao.blockUser(userId);

		mv.addObject("userList", userRegistrationDao.findAll());
		return mv;
	}

	@Override
	@RequestMapping(path = "/unblockUser")
	public ModelAndView unBlockUser(@RequestParam("userid") int userId) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UserList");
		// mentorService.getCourseList();
		userRegistrationDao.unBlockUser(userId);

		mv.addObject("userList", userRegistrationDao.findAll());
		return mv;
	}

	@Override
	@RequestMapping(value = "/addcourse")
	public String addCouseDetails(ModelMap model) {

		Admin a = new Admin();
		// e.setEmail("sdfsf");
		// e.setSalary(4564.56f);
		model.addAttribute("a", a);
		return "AddCourse";
	}

	@Override
	@RequestMapping(value = "/addcourse", method = RequestMethod.POST)
	public String addDetails(Admin a) throws SQLException {

		adminDao.save(a);

		return "redirect:/courseList";

	}

	@Override
	@RequestMapping(value = "/courseList")
	public ModelAndView getCouseDetails() throws SQLException {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("CourseList");
		mv.addObject("courseList", adminDao.findAll());

		return mv;

	}

	

	@RequestMapping("/editcourse")
	public ModelAndView editCouseDetails(@RequestParam("courseid") int courseId, ModelMap map,
			HttpServletRequest request, @ModelAttribute("admin") Admin admin)
			throws ClassNotFoundException, SQLException {
		ModelAndView mav = null;
		map.addAttribute("courseList", adminDao.getByCourseId(courseId));
		mav = new ModelAndView("CourseUpdate");
		return mav;

	}

	@RequestMapping(value = "/editcourse", method = RequestMethod.POST)
	public String updateCompany(@ModelAttribute("admin") @Valid Admin admin, BindingResult result, Model model)
			throws SQLException {
		
		adminDao.save(admin);
		return "redirect:/courseList";
	}
}
