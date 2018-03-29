package com.odontoweb.microservice.impl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.odontoweb.microservice.impl.model.Profissao;

@Repository
public interface ProfissaoRepository extends JpaRepository<Profissao, Long> {
	public List<Profissao> findAll();

	public Profissao findByNome(String nome);
}
