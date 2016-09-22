package com.odontoweb.microservice.impl.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Estado;
import com.odontoweb.microservice.impl.repository.EstadoRepository;

public class EstadoService implements Serializable {

	private static final long serialVersionUID = 3019966634101132385L;

	private EstadoRepository estadoRepository;

	@Autowired
	public EstadoService(EstadoRepository estadoRepository) {
		this.estadoRepository = estadoRepository;
	}

	public List<Estado> findAll() {
		return estadoRepository.findAll();
	}

	public boolean save(Estado estado) {
		return estadoRepository.save(estado) != null;
	}

	public Estado findById(Long id) {
		return estadoRepository.findOne(id);
	}

	public void delete(Long id) {
		estadoRepository.delete(id);
	}
}
