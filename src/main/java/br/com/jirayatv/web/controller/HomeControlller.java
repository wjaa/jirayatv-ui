package br.com.jirayatv.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author Wagner Araujo wagner.wjaa@gmail.com
 *
 */
@Controller
public class HomeControlller {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String goToHome(){
		return "home/home";
	}
	
}
