package com.openwebinars.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@GetMapping("/")
	public String welcome(@RequestParam(name="name", required=false, defaultValue="Mundo") String name, Model model) {
	//public String welcome(@RequestParam(name="name") Optional<String> name, Model model) {
		//model.addAttribute("nombre", name.orElse("Mundo"));
		model.addAttribute("nombre", name);
		return "index";
	}
	
	@GetMapping("/saludo/{name}")
	public String saludo(@PathVariable String name, Model model) {
		model.addAttribute("nombre", name);
		return "index";
	}


}
