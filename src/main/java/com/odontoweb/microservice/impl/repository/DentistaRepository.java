package com.odontoweb.microservice.impl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.Dentista;
import com.odontoweb.microservice.impl.model.UsuarioClinica;

public interface DentistaRepository extends JpaRepository<Dentista, Long> {
	public Dentista findByUsuarioClinica(UsuarioClinica usuarioClinica);
}
