package edu.miu.cs.cs425.demos.lab10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // component scan
public class HomeController {

	@GetMapping(value= {"/","/elibrary","/elibrary/home"})
	public String displayHomepage()
	{
		// not need to specify file extention
		return "home/index";
	}
}
