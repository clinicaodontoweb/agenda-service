package com.odontoweb.microservice.impl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.Estado;
import com.odontoweb.microservice.impl.model.Sigla;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
	public Estado findBySigla(Sigla sigla);
}
