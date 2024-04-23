package com.example.demo;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class login_controller {
@Autowired
	loginservice ls;
	@RequestMapping("/")
	public String one() {
		
		return "index";
		
	}
	
	@PostMapping("/savedata")
	public String savedata(@ModelAttribute("l1") login l1) {
		
		if(l1.getRpass().equals(l1.getRcpass())) {
		ls.register(l1);
		return "redirect:/login";
		}
		return "redirect:/";
	}
	
	
	@RequestMapping("/login")
		public String two() {
			return "login";
		}
		
		
	
	@PostMapping("/checkdata")
	public String three(@RequestParam("remail") String remail, @RequestParam("rpass") String rpass,HttpSession s1) {
	
		
		login l = ls.checkcred(remail,rpass);
		if(l==null) {

			return "login";
		}
		s1.setAttribute("k", l.getRemail());
	
		return "redirect:/dash";
		
	} 
	
	@RequestMapping("/dash")
public String dash(HttpServletRequest request) {
		
	HttpSession s1 = request.getSession(false);
	String p = (String)s1.getAttribute("k");
	if(p==null) {
		return "redirect:/login";
	}
	return "dash";
}
	@RequestMapping("/logout")
public String log(HttpSession s1) {
	s1.invalidate();
	return "redirect:/login";
}

		
	}
