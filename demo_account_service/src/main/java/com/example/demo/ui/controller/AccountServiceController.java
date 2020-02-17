package com.example.demo.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountServiceController {
	@GetMapping("/test")
	public String accounService() {
		return "Account service running ...........";
	}

}
