package com.odontoweb.microservice.impl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Convenio;
import com.odontoweb.microservice.impl.repository.ConvenioRepository;

public class ConvenioService {

	private ConvenioRepository convenioRepository;

	@Autowired
	public ConvenioService(ConvenioRepository convenioRepository) {
		this.convenioRepository = convenioRepository;
	}

	public List<Convenio> findAll() {
		return convenioRepository.findAll();
	}

	public boolean save(Convenio convenio) {
		return convenioRepository.save(convenio) != null;
	}

	public Convenio findById(Long idConvenio) {
		return convenioRepository.findOne(idConvenio);
	}

}
