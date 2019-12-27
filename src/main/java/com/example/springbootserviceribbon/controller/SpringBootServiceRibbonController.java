package com.example.springbootserviceribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootserviceribbon.service.SpringBootServiceRibbonService;

@RestController
public class SpringBootServiceRibbonController {

	@Autowired
	SpringBootServiceRibbonService springBootServiceRibbonService;

	@GetMapping(value = "/hi")
	public String hi(@RequestParam String name) {
		return springBootServiceRibbonService.hiService(name);
	}

}
