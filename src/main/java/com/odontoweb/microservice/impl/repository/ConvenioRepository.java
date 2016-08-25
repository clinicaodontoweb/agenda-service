package com.odontoweb.microservice.impl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.Convenio;

public interface ConvenioRepository extends JpaRepository<Convenio, Long> {

}
