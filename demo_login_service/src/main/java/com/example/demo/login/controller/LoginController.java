package com.example.demo.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
	@GetMapping("/test")
	public String  login()
	{
		return "login services running ...............";
	}

}
