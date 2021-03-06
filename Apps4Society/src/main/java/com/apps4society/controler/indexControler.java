package com.apps4society.controler;

import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexControler {
	
	@RequestMapping(value="/", method= RequestMethod.GET)	
	public String indexHTML() {
	
		return "fragments/login";
	}
	@RequestMapping(value="/logout",method=RequestMethod.POST)
	public String redirectLogout() {	
		return "/";
	}
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String acessADMIN() {
		return "painel_administrador";
	}
    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String login() {
        return "fragments/login";
    }

}
