package com.odontoweb.microservice.impl.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Estado;
import com.odontoweb.microservice.impl.model.Sigla;
import com.odontoweb.microservice.impl.repository.EstadoRepository;
import com.odontoweb.microservice.impl.repository.SiglaRepository;

public class EstadoService implements Serializable {

	private static final long serialVersionUID = 3019966634101132385L;

	private EstadoRepository estadoRepository;
	private SiglaRepository siglaRepository;

	@Autowired
	public EstadoService(EstadoRepository estadoRepository, SiglaRepository siglaRepository) {
		this.estadoRepository = estadoRepository;
	}

	public List<Estado> findAll() {
		return estadoRepository.findAll();
	}

	public boolean save(Estado estado) {
		return estadoRepository.save(estado) != null;
	}

	public Estado findById(Long id) {
		return estadoRepository.getOne(id);
	}

	public void delete(Long id) {
		estadoRepository.deleteById(id);
	}

	public Estado findByNomeAndSigla(String sigla) {
		Sigla siglaModel = siglaRepository.findBySigla(sigla);
		return estadoRepository.findBySigla(siglaModel);
	}
}
