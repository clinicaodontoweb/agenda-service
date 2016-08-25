package com.odontoweb.microservice.impl.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Paciente;
import com.odontoweb.microservice.impl.repository.PacienteRepository;

public class PacienteService {

	private PacienteRepository pacienteRepository;

	@Autowired
	public PacienteService(PacienteRepository pacienteRepository) {
		this.pacienteRepository = pacienteRepository;
	}

	public boolean save(Paciente paciente) {
		return pacienteRepository.save(paciente) != null;
	}
	
	public Paciente findById(Long idPaciente){
		return pacienteRepository.findOne(idPaciente);
	}

}
