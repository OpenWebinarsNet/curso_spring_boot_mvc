package com.openwebinars.spring.servicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.openwebinars.spring.modelo.Empleado;

@Service
public class EmpleadoService {
	
	private List<Empleado> repositorio = new ArrayList<>();
	
	
	public Empleado add(Empleado e) {
		repositorio.add(e);
		return e;
	}
	
	public List<Empleado> findAll() {
		return repositorio;
	}
	
	@PostConstruct
	public void init() {
		repositorio.addAll(
				Arrays.asList(new Empleado(1,"Antonio García", "antonio.garcia@openwebinars.net", "954000000"),
						new Empleado(2,"María López", "maria.lopez@openwebinars.net", "954000000"),
						new Empleado(3,"Ángel Antúnez", "angel.antunez@openwebinars.net", "954000000")						
						)
				);
	}

}
