package com.odontoweb.microservice.impl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.odontoweb.microservice.impl.model.Indicacao;

@Repository
public interface IndicacaoRepository extends JpaRepository<Indicacao, Long> {
	public List<Indicacao> findAll();

	public Indicacao findByNome(String nomeIndicacao);
}
