package com.openwebinars.spring.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openwebinars.spring.entidades.UnaEntidad;

public interface UnRepositorio extends JpaRepository<UnaEntidad, Long> {

}
