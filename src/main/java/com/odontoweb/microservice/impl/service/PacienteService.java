package com.odontoweb.microservice.impl.service;

import java.util.List;

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

	public Paciente findById(Long idPaciente) {
		return pacienteRepository.findOne(idPaciente);
	}

	public void delete(Long id) {
		pacienteRepository.delete(id);
	}

	public List<Paciente> findAll() {
		return pacienteRepository.findAll();
	}

	public List<Paciente> findPacientesByNome(String nome) {
		return pacienteRepository.findByNomeContainingIgnoreCase(nome);
	}
	
	public boolean existPacienteWithCpf(String cpf) {
		return pacienteRepository.findByCpf(cpf) != null;
	}
}
