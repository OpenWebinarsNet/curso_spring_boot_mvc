package com.openwebinars.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

//	@GetMapping("/")
//	public String welcome() {
//		return "index";
//	}

	@GetMapping("/")
	public String welcome(Model model) {
		model.addAttribute("mensaje", "¡Hola a todos!");
		return "index";
	}

	@GetMapping("/saludo")
	public String saludoCompleto(Model model) {
		model.addAttribute("saludo",
				"Seguro que has visto otras plataformas con miles de cursos, pero en OpenWebinars nos centramos en IT. Como profesional tecnológico debes estar al día en las tecnologías más demandadas y OpenWebinars es la solución.");
		return "saludo";
	}

}
