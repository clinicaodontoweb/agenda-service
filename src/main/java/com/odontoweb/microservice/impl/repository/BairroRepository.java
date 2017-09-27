package com.odontoweb.microservice.impl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.odontoweb.microservice.impl.model.Bairro;

@Repository
public interface BairroRepository extends JpaRepository<Bairro, Long> {
	public List<Bairro> findAll();
}
