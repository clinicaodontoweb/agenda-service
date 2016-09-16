package com.odontoweb.microservice.impl.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Cidade;
import com.odontoweb.microservice.impl.repository.CidadeRepository;

public class CidadeService implements Serializable {

	private static final long serialVersionUID = -3365479642577507797L;

	private CidadeRepository cidadeRepository;

	@Autowired
	public CidadeService(CidadeRepository cidadeRepository) {
		this.cidadeRepository = cidadeRepository;
	}

	public List<Cidade> findAll() {
		return cidadeRepository.findAll();
	}

	public boolean save(Cidade cidade) {
		return cidadeRepository.save(cidade) != null;
	}

	public Cidade findById(Long id) {
		return cidadeRepository.findOne(id);
	}
}
