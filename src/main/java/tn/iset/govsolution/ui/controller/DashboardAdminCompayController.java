package tn.iset.govsolution.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/adminCompany")
public class DashboardAdminCompayController {
	
	
	@RequestMapping(value="/doComptes",method=RequestMethod.GET)
	public String comptes() {
						
		return "/adminCompayDashboard/comptes";
	}
	
	@RequestMapping(value="/doStructures",method=RequestMethod.GET)
	public String structures() {
						
		return "/adminCompayDashboard/structure";
	}

}
