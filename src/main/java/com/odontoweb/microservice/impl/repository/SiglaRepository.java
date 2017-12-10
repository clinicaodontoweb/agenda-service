package com.odontoweb.microservice.impl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.Sigla;

public interface SiglaRepository extends JpaRepository<Sigla, Long> {
	public Sigla findBySigla(String sigla);
}
