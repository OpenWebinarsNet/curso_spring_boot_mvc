package com.openwebinars.spring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String welcome(Model model) {
		model.addAttribute("mensaje", "¡Hola a todos los alumnos de openwebinars!");
		return "index";
	}

	@GetMapping("/saludo")
	public String saludo(Model model) {
		model.addAttribute("saludo", "Seguro que has visto otras plataformas con miles de cursos, pero en OpenWebinars nos centramos en IT. Como profesional tecnológico debes estar al día en las tecnologías más demandadas y OpenWebinars es la solución.");
		return "saludo";
	}

}
