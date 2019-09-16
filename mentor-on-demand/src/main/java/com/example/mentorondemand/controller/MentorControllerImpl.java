package com.example.mentorondemand.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.mentorondemand.dao.UserMentoraDao;
import com.example.mentorondemand.model.MentorRegistration;
import com.example.mentorondemand.model.UserMentor;
import com.example.mentorondemand.service.MentorService;

@Controller
@Scope("session")
public class MentorControllerImpl implements MentorController {
	private  HttpSession session ;
	@Autowired
	MentorService mentorService;
	@Autowired
	UserController userController;
	@Autowired
	UserMentoraDao userMentorDao;
	@Override
	@RequestMapping(value = "/addMentor", method = RequestMethod.GET)
	public String getMentorRegistrationForm(ModelMap model) {

		MentorRegistration mentor = new MentorRegistration();
		// e.setEmail("sdfsf");
		// e.setSalary(4564.56f);
		model.addAttribute("m", mentor);
		return "MentorSignUp";
	}
	@Override
	@RequestMapping(value = "/addMentor", method = RequestMethod.POST)
	public String insertMentorDetails(@ModelAttribute("m") @Valid MentorRegistration mentor, BindingResult result, Model model)
			throws SQLException {
		if (result.hasErrors()) {
			System.out.println("errors");
			System.out.println(result.getAllErrors());

			return "MentorSignUp";
		}
		System.out.println(mentor);
		mentorService.insertUser(mentor);

		return "redirect:/mentorlogincheck";

	}
	@Override
	@RequestMapping(value="/getid")
	public String getUserId()
	{
		return "redirect:/userId";
	}
	@Override
	@RequestMapping(path = "/mentorlogincheck", method = RequestMethod.GET)
	public String userlogin(ModelMap model)
	{
		MentorRegistration m = new MentorRegistration();
		// e.setEmail("sdfsf");
		// e.setSalary(4564.56f);
		model.addAttribute("u2", m);
		return "MentorLogin";
	}
	@Override
	@RequestMapping(path = "/mentorlogincheck", method = RequestMethod.POST)
    public ModelAndView loginCheck(@Valid @ModelAttribute("u2") MentorRegistration mentor,HttpServletRequest request) throws Exception {

           ModelAndView mav = null;
           session=request.getSession();
           String email = mentor.getEmail();
           List<MentorRegistration> mentor1 = mentorService.findByEmail(email);
           //System.out.println(mentor1);
          //System.out.println(user1);
          
         
          if (mentor1.isEmpty()) 
          {
        	  System.out.println("hi");
                 mav = new ModelAndView("UserLogin", "message", "please register to login :(");
          } 
          else
          {
        	  MentorRegistration mentor2 = mentor1.get(0);
              System.out.println(mentor2.getMentorId());
              session.setAttribute("mentor", mentor2);
              boolean b=mentor2.isActive();
              System.out.println(b);
              boolean a=true;
              if(a==b)
              {
                    System.out.println("blocked");
                    mav = new ModelAndView("MentorLogin", "message", "Account is Blocked :(");
              }
              else  if ((mentor.getEmail().equals(mentor2.getEmail())) && (mentor.getPassword().equals(mentor2.getPassword()))) {

                  
                        mav = new ModelAndView("MentorLandingPage");
       
           } else {

                  mav = new ModelAndView("MentorLogin", "message", "Invalid Username or Password");
           }
          }
           return mav;

    }
	@Override
	@RequestMapping(path="/traininglist")
	public ModelAndView getCourseList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("TrainingDetails");
		mentorService.getCourseList();
		mv.addObject("courseList",mentorService.getCourseList());
		return mv;
	}
	@Override
	@RequestMapping(path="/requestlist")
	public ModelAndView getRequestList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("RequestDetails");
		//mentorService.getCourseList();
		MentorRegistration m=(MentorRegistration)session.getAttribute("mentor") ;
		mv.addObject("requestList",userMentorDao.findBymentorId(m.getMentorId()));
		return mv;
	}
	@Override
	@RequestMapping(value = "/searchmentor", method = RequestMethod.GET)
	public String mentorSearch(ModelMap model) {
		//System.out.println("add employee");
		MentorRegistration e=new MentorRegistration();
		//e.setEmail("sdfsf");
	//	e.setSalary(4564.56f);
		model.addAttribute("s", e);
		return "SearchMentor";
		
	}
	@Override
	@RequestMapping(value = "/searchmentor", method = RequestMethod.POST)
    public ModelAndView mentorSearch(ModelMap map,@ModelAttribute("s")@Valid MentorRegistration mentor) throws ClassNotFoundException, SQLException {
          String technology=mentor.getTechnologiesKnown();
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("MentorDetails");
		System.out.println(mentorService.getMentorListWithPattern(technology));
		
		mv.addObject("mentorList",mentorService.getMentorListWithPattern(technology));
		
		return mv;
           
    }
	@Override
	@RequestMapping(value="/userMentorLink")
	public String userMentorLink(@RequestParam("mentorid") int mentorId)
	{
		Random rand = new Random(); 
		int rand_int1 = rand.nextInt(1000); 
		int id=userController.getUserId();
		UserMentor um=new UserMentor();
		um.setMentorId(mentorId);
		um.setUserId(id);
		um.setUserMentorId(rand_int1);
		um.setStatus("request");
		userMentorDao.save(um);
		System.out.println(id);
		return "redirect:/userrequestatus";
	}
	@Override
	@RequestMapping(value="/acceptRequest")
	public String acceptRequest(@RequestParam("userid") int userId,@RequestParam("mentorid") int mentorId)
	{
		
		userMentorDao.acceptRequest(userId,mentorId);
		return "redirect:/requestlist";
	}
	@Override
	@RequestMapping(value="/rejectRequest")
	public String rejectRequest(@RequestParam("userid") int userId,@RequestParam("mentorid") int mentorId)
	{
		
		userMentorDao.rejectRequest(userId,mentorId);
		return "redirect:/requestlist";
	}
}
