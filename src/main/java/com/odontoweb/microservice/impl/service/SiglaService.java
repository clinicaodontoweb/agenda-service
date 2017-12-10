package com.odontoweb.microservice.impl.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Sigla;
import com.odontoweb.microservice.impl.repository.SiglaRepository;

public class SiglaService implements Serializable {

	private static final long serialVersionUID = -345476950787516583L;

	private SiglaRepository siglaRepository;

	@Autowired
	public SiglaService(SiglaRepository siglaRepository) {
		this.siglaRepository = siglaRepository;
	}

	public List<Sigla> findAll() {
		return siglaRepository.findAll();
	}

	public void save(Sigla sigla) {
		siglaRepository.save(sigla);
	}

	public Sigla findById(Long id) {
		return siglaRepository.findOne(id);
	}
	
	public void delete(Long id) {
		siglaRepository.delete(id);
	}
	
	public Sigla findBySigla(String sigla) {
		return siglaRepository.findBySigla(sigla);
	}

}
