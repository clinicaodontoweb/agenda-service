package com.odontoweb.microservice.impl.service;

import java.util.List;

import com.odontoweb.microservice.impl.model.Status;
import com.odontoweb.microservice.impl.repository.StatusRepository;

public class StatusService {

	private StatusRepository statusRepository;

	public StatusService(StatusRepository statusRepository) {
		this.statusRepository = statusRepository;
	}

	public List<Status> findAll() {
		return this.statusRepository.findAll();
	}

	public boolean save(Status status) {
		return this.statusRepository.save(status) != null;
	}

	public Status findById(Long id) {
		return this.statusRepository.findOne(id);
	}

	public void delete(Long id) {
		statusRepository.delete(id);
	}

}
