package com.odontoweb.microservice.impl.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.RedeSocial;
import com.odontoweb.microservice.impl.repository.RedeSocialRepository;
import com.odontoweb.microservice.rest.domain.request.RedeSocialRequest;

public class RedeSocialService implements Serializable {

	private static final long serialVersionUID = -4998591815407410597L;

	private RedeSocialRepository redeSocialRepository;

	@Autowired
	public RedeSocialService(RedeSocialRepository redeSocialRepository) {
		this.redeSocialRepository = redeSocialRepository;
	}

	public List<RedeSocial> findAll() {
		return redeSocialRepository.findAll();
	}

	public boolean save(RedeSocial redeSocial) {
		return redeSocialRepository.save(redeSocial) != null;
	}

	public RedeSocial findById(Long id) {
		return redeSocialRepository.findOne(id);
	}

	public void delete(Long id) {
		redeSocialRepository.delete(id);
	}

	public RedeSocial findByNome(String nomeRedeSocial) {
		RedeSocial redeSocial = redeSocialRepository.findByNome(nomeRedeSocial);
		if (redeSocial == null) {
			redeSocial = new RedeSocial();
			redeSocial.setNome(nomeRedeSocial);
			save(redeSocial);
		}
		return redeSocial;
	}

	public RedeSocial findByNome(RedeSocialRequest redeSocialRequest) {
		if (redeSocialRequest.getIdRedeSocial() != null)
			return new RedeSocial(redeSocialRequest.getIdRedeSocial(), redeSocialRequest.getNome());
		return findByNome(redeSocialRequest.getNome());
	}

}
