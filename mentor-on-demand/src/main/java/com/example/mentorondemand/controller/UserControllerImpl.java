package com.example.mentorondemand.controller;

import java.sql.SQLException;
import java.util.List;

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
import org.springframework.web.servlet.ModelAndView;

import com.example.mentorondemand.dao.UserMentoraDao;
import com.example.mentorondemand.model.UserRegistration;
import com.example.mentorondemand.service.MentorService;
import com.example.mentorondemand.service.UserRegistrationService;



@Controller
@Scope("session")
public class UserControllerImpl implements UserController {
	
	private  HttpSession session ;
	@Autowired
    UserRegistrationService userRegistrationService;
    MentorService mentorService;
    @Autowired
    UserMentoraDao userMentorDao;
	@Override
	@RequestMapping(path = "/hello")
	public String hi() {
		return "index";
	}
	

	

	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String getRegistrationForm(ModelMap model) {

		UserRegistration u = new UserRegistration();
		// e.setEmail("sdfsf");
		// e.setSalary(4564.56f);
		model.addAttribute("u1", u);
		return "UserSignup";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String insertUser(@ModelAttribute("u1") @Valid UserRegistration user, BindingResult result, Model model)
			throws SQLException {
		if (result.hasErrors()) {
			System.out.println("errors");
			System.out.println(result.getAllErrors());

			return "Signup";
		}
		//System.out.println(user);
		userRegistrationService.insertUser(user);
		

		return "redirect:/userlogincheck";

	}
	
	
	@RequestMapping(path = "/userlogincheck", method = RequestMethod.GET)
	public String userlogin(ModelMap model)
	{
		UserRegistration u = new UserRegistration();
		// e.setEmail("sdfsf");
		// e.setSalary(4564.56f);
		model.addAttribute("u2", u);
		return "UserLogin";
	}
	@RequestMapping(path = "/userlogincheck", method = RequestMethod.POST)
    public ModelAndView loginCheck(@Valid @ModelAttribute("u2") UserRegistration user,HttpServletRequest request) throws Exception {
            session=request.getSession();
           ModelAndView mav = null;

           String email = user.getEmail();
           List<UserRegistration> user1 = userRegistrationService.findByEmail(email);
          System.out.println(user1);
         
          if (user1.isEmpty()) 
          {
        	  System.out.println("hi");
                 mav = new ModelAndView("UserLogin", "message", "please register to login :(");
          } 

          else
          {
        	  UserRegistration user2 = user1.get(0);
              
              // System.out.println(user2.getId());
               session.setAttribute("user", user2);
               boolean b=user2.isActive();
               boolean a=true;
               if(a==b)
               {
                     System.out.println("blocked");
                     mav = new ModelAndView("UserLogin", "message", "Account is Blocked :(");
               }

               else   if ((user.getEmail().equals(user2.getEmail())) && (user.getPassword().equals(user2.getPassword()))) {

                  
                        mav = new ModelAndView("UserLandingPage");
       
           } else {

                  mav = new ModelAndView("UserLogin", "message", "Invalid Username or Password");
           }
           
          }
          return mav;

    }
	@Override
	@RequestMapping(path="/userrequestatus")
	public ModelAndView getRequestStatus() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("UserRequestStatus");
		//mentorService.getCourseList();
		UserRegistration u=(UserRegistration)session.getAttribute("user") ;
		mv.addObject("userRequestList",userMentorDao.findByUserId(u.getId()));
		return mv;
	}
	@Override
	public int getUserId()
	{
		UserRegistration u=(UserRegistration)session.getAttribute("user") ;
		int id=u.getId();
		System.out.println(id);
		return id;
	}

}
