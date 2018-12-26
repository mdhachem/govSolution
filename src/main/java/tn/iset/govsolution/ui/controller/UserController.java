package tn.iset.govsolution.ui.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tn.iset.govsolution.dao.UserDAO;
import tn.iset.govsolution.dao.UserDAOImpl;
import tn.iset.govsolution.entity.Role;
import tn.iset.govsolution.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {

	UserDAO userDAO=new UserDAOImpl();
	

	
	
	@RequestMapping(value="/doLogin",method=RequestMethod.POST)
	public ModelAndView doLogin(HttpServletRequest request,HttpServletResponse response){
		
		ModelAndView model = new ModelAndView();
		 String username = request.getParameter("username");
		 String password = request.getParameter("password");
		 boolean error = false;
		 
		 User u=userDAO.loginUser(username, password);
		 if(u!=null){
			 	HttpSession session=request.getSession();
			 	session.setAttribute("user", u);
			 	int typeApp=0;
			 	List<Role> roles=((User) session.getAttribute("user")).getRoles();
			 	for(Role r : roles){
			 		
			 		if(r.getRole().equals("SUPERADMIN"))
			 			typeApp=1;
			 		if(r.getRole().equals("ADMINCOMPANY"))
			 			typeApp=2;
			 		if(r.getRole().equals("USERCOMPANY"))
			 			typeApp=3;
			 		if(typeApp!=0)
			 			break;
			 	}
			 	session.setAttribute("typeApp", new Integer(typeApp));
			 	
			 	
			 	
			 	model.setViewName("dashboard");
			 	model.addObject("success","Authenticated successfully");
		 }else{
			 error = true;
		 }
		if(error){
			// Returns the login view 
			model.setViewName("home");
			model.addObject("error","Invalid credentials");
		}
		
		return model;
		
	}
	
	@RequestMapping(value="/doLogout",method=RequestMethod.GET)
	public String logOut(HttpServletRequest request,HttpServletResponse response) {
		
		
		HttpSession session=request.getSession();
		session.removeAttribute("user");
		session.removeAttribute("typeApp");
		session.invalidate();
		
		return "redirect:/home.action";
	}
	
	@RequestMapping(value="/doRegistration",method=RequestMethod.GET)
	public String registration() {
						
		return "registration";
	}
	
	@RequestMapping(value="/dosignin",method=RequestMethod.GET)
	public String signin(HttpServletRequest request,HttpServletResponse response) {
		
		return "redirect:/home.action";
	}
	
	
}
