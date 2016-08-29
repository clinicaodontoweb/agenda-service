package com.odontoweb.microservice.impl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.TipoConsulta;

public interface TipoConsultaRepository extends JpaRepository<TipoConsulta, Long> {

}
