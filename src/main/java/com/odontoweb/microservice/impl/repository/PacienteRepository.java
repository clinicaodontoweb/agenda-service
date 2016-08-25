package com.odontoweb.microservice.impl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
