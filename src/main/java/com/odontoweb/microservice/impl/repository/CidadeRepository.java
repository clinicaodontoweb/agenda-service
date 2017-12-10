package com.odontoweb.microservice.impl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.Cidade;
import com.odontoweb.microservice.impl.model.Estado;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
	public Cidade findByNomeAndEstado(String nome, Estado estado);
}
