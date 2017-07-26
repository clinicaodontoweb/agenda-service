package com.odontoweb.microservice.impl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Dentista;
import com.odontoweb.microservice.impl.repository.DentistaRepository;
import com.odontoweb.microservice.impl.repository.UsuarioClinicaRepository;

public class DentistaService {

	private DentistaRepository dentistaRepository;
	
	@Autowired
	private UsuarioClinicaRepository usuarioClinicaRepository;

	@Autowired
	public DentistaService(DentistaRepository profissionalRespository) {
		this.dentistaRepository = profissionalRespository;
	}

	public boolean save(Dentista dentista, String email) {
		return dentistaRepository.save(dentista) != null;
	}

	public void delete(Long id) {
		dentistaRepository.delete(id);
	}

	public List<Dentista> findAll() {
		return dentistaRepository.findAll();
	}

	public Dentista findById(Long idPaciente) {
		return dentistaRepository.findOne(idPaciente);
	}
	
	public Dentista findByUsuarioClinica(String email){
		return dentistaRepository.findByUsuarioClinica(usuarioClinicaRepository.findByEmail(email));
	}

}
