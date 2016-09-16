package com.odontoweb.microservice.impl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
