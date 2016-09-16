package com.odontoweb.microservice.impl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.Cep;

public interface CepRepository extends JpaRepository<Cep, Long> {

}
