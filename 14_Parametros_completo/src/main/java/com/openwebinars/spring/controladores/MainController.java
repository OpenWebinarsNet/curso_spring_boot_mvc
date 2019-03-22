package com.openwebinars.spring.controladores;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

//	@GetMapping("/")
//	public String welcome(@RequestParam(name="name", required=false, defaultValue="Mundo") String name, Model model) {
//		//model.addAttribute("mensaje", "¡Hola a todos los alumnos de openwebinars!");
//		model.addAttribute("nombre", name);
//		return "index";
//	}
	
	@GetMapping("/")
	public String welcome(@RequestParam("name") Optional<String> name, Model model) {
		model.addAttribute("nombre", name.orElse("Mundo"));
		return "index";
	}

	@GetMapping("/saludo/{name}")
	public String saludo(@PathVariable String name, Model model) {
		//model.addAttribute("saludo", "Seguro que has visto otras plataformas con miles de cursos, pero en OpenWebinars nos centramos en IT. Como profesional tecnológico debes estar al día en las tecnologías más demandadas y OpenWebinars es la solución.");
		model.addAttribute("saludo", "Hola " + name);
		return "saludo";
	}

}
