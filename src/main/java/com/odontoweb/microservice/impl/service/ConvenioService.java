package com.odontoweb.microservice.impl.service;

import java.util.ArrayList;
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

	public void delete(Long id) {
		convenioRepository.delete(id);
	}
	
	public List<Convenio> getListConvenios(List<Long> idsConvenio){
		List<Convenio> convenios = new ArrayList<Convenio>();
		for (Long id : idsConvenio) {
			convenios.add(findById(id));
		}
		return convenios;
	}

}
