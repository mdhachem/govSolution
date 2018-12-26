package tn.iset.govsolution.ui.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tn.iset.govsolution.dao.RegistrationDAO;
import tn.iset.govsolution.dao.RegistrationDAOImpl;
import tn.iset.govsolution.entity.Inscription;

@Controller
@RequestMapping("/superAdmin")
public class DashboardSuperAdminController {
	
	@RequestMapping(value="/doInscription",method=RequestMethod.GET)
	public ModelAndView inscription(HttpServletRequest request,HttpServletResponse response) {
		RegistrationDAO regDAO=new RegistrationDAOImpl();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/superAdminDashboard/inscription");	
		List<Inscription> inscriptions=regDAO.getInscriptions();
		
		mv.addObject("inscriptions",inscriptions);
		return mv;
	}
	
	
	@RequestMapping(value="/doAbonnements",method=RequestMethod.GET)
	public String abonnements() {
						
		return "/superAdminDashboard/abonnements";
	}
	
	@RequestMapping(value="/doCommandes",method=RequestMethod.GET)
	public String commandes() {
						
		return "/superAdminDashboard/commandes";
	}
	
	
	@RequestMapping(value="/doModules",method=RequestMethod.GET)
	public String modules() {
						
		return "/superAdminDashboard/modules";
	}
	
	@RequestMapping(value="/doNotifications",method=RequestMethod.GET)
	public String notifications() {
						
		return "/superAdminDashboard/notifications";
	}
	
	@RequestMapping(value="/doReglements",method=RequestMethod.GET)
	public String reglements() {
						
		return "/superAdminDashboard/reglements";
	}

}
