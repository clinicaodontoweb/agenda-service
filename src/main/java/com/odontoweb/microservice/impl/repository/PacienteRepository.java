package com.odontoweb.microservice.impl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

	public List<Paciente> findByNomeContainingIgnoreCase(String nome);
	public Paciente findByCpf(String cpf);
	
}
