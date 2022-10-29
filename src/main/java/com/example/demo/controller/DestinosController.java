package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DestinosController {
	
	@RequestMapping("/")
	public String getAllindex() {
		return "index";
	}
	
	@RequestMapping("/contato")
	public String getAllContato() {
		return "contato";
	}
	
	@RequestMapping("/destinos")
	public String getAllDestinos() {
		return "destinos";
	}
	
	@RequestMapping("/promocoes")
	public String getAllpromocoes() {
		return "promocoes";
	}
}
