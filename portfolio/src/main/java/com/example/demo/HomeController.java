package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("indexh")
	public String one() {
		
		return "index";
	}
	
@RequestMapping("/mycv")
public String two() {
	
return "cv";
}
@RequestMapping("/abouth")
public String three() {
	
	return "about";
}

@RequestMapping("/servicesh")
public String four() {
	return "services";
}
@RequestMapping("portfolioh")
public String five() {
	return "portfolio";
}

@RequestMapping("/elementsh")
public String six() {
	
	return "elements";
}

@RequestMapping("/portfolio-detailsh")
public String seven() {
	
	return "portfolio_details";
}
@RequestMapping("/blogh")
public String eight() {
	
	return "blog";
}

@RequestMapping("/single-blogh")
public String nine() {
	return "single-blog";
}

@RequestMapping("/contacth")
public String ten() {
	return "contact";
}

}