package com.odontoweb.microservice.impl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.odontoweb.microservice.impl.model.RedeSocial;

@Repository
public interface RedeSocialRepository extends JpaRepository<RedeSocial, Long> {
	public List<RedeSocial> findAll();

	public RedeSocial findByNome(String nome);
}
