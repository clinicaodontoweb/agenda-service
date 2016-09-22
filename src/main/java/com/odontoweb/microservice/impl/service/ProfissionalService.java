package com.odontoweb.microservice.impl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Profissional;
import com.odontoweb.microservice.impl.repository.ProfissionalRepository;

public class ProfissionalService {

	private ProfissionalRepository profissionalRepository;

	@Autowired
	public ProfissionalService(ProfissionalRepository profissionalRespository) {
		this.profissionalRepository = profissionalRespository;
	}

	public boolean save(Profissional profissional) {
		return profissionalRepository.save(profissional) != null;
	}

	public void delete(Long id) {
		profissionalRepository.delete(id);
	}

	public List<Profissional> findAll() {
		return profissionalRepository.findAll();
	}

	public Profissional findById(Long idPaciente) {
		return profissionalRepository.findOne(idPaciente);
	}

}
