package com.odontoweb.microservice.impl.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Bairro;
import com.odontoweb.microservice.impl.repository.BairroRepository;
import com.odontoweb.microservice.rest.domain.request.BairroRequest;

public class BairroService implements Serializable {

	private static final long serialVersionUID = -4998591815407410597L;

	private BairroRepository bairroRepository;

	@Autowired
	public BairroService(BairroRepository bairroRepository) {
		this.bairroRepository = bairroRepository;
	}

	public List<Bairro> findAll() {
		return bairroRepository.findAll();
	}

	public boolean save(Bairro bairro) {
		return bairroRepository.save(bairro) != null;
	}

	public Bairro findById(Long id) {
		return bairroRepository.getOne(id);
	}

	public void delete(Long id) {
		bairroRepository.deleteById(id);
	}

	public Bairro findByNome(String nomeBairro) {
		Bairro bairro = bairroRepository.findByNome(nomeBairro);
		if (bairro == null) {
			bairro = new Bairro();
			bairro.setNome(nomeBairro);
			save(bairro);
		}
		return bairro;
	}
	
	public Bairro findByNome(BairroRequest bairroRequest) {
		if(bairroRequest.getIdBairro() != null) return new Bairro(bairroRequest.getIdBairro(), bairroRequest.getNome());
		return findByNome(bairroRequest.getNome());
	}

}
