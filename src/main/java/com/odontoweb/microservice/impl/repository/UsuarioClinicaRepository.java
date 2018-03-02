package com.odontoweb.microservice.impl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.UsuarioClinica;

public interface UsuarioClinicaRepository extends JpaRepository<UsuarioClinica, Long> {
	public UsuarioClinica findByHashKey(String hashKey);
}
