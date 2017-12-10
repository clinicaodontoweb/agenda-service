package com.odontoweb.microservice.impl.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Cep;
import com.odontoweb.microservice.impl.repository.CepRepository;

public class CepService implements Serializable {

	private static final long serialVersionUID = 4297915320969051761L;

	private CepRepository cepRepository;

	@Autowired
	public CepService(CepRepository cepRepository) {
		this.cepRepository = cepRepository;
	}

	public List<Cep> findAll() {
		return cepRepository.findAll();
	}

	public boolean save(Cep cep) {
		return cepRepository.save(cep) != null;
	}

	public Cep findById(Long id) {
		return cepRepository.findOne(id);
	}

	public void delete(Long id) {
		cepRepository.delete(id);
	}
	
	public Cep findByCep(String cep) {
		Cep cepModel = cepRepository.findByCep(cep); 
		if(cepModel == null) {
			cepModel = new Cep();
			cepModel.setCep(cep);
			save(cepModel);
		}
		return cepModel;
	}

}
