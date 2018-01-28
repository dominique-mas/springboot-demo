package com.teachersdunet.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PagesController {

	/**
	 * [@ResponseBody] permet d'indiquer que le retour de la méthode n'est pas le
	 * nom d'une vue mais le contenu de la page lui-même.
	 * 
	 * @return
	 */
	@GetMapping("/")
	@ResponseBody
	public String home() {
		return "Hello world";
	}
}
