package com.odontoweb.microservice.impl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.Bairro;

public interface BairroRepository extends JpaRepository<Bairro, Long> {

}
