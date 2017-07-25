package com.odontoweb.microservice.impl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Recepcionista;
import com.odontoweb.microservice.impl.repository.RecepcionistaRepository;
import com.odontoweb.microservice.impl.repository.UsuarioClinicaRepository;

public class RecepcionistaService {

	private RecepcionistaRepository recepcionistaRepository;
	
	@Autowired
	private UsuarioClinicaRepository usuarioClinicaRepository;

	@Autowired
	public RecepcionistaService(RecepcionistaRepository recepcionistaRepository) {
		this.recepcionistaRepository = recepcionistaRepository;
	}

	public boolean save(Recepcionista recepcionista) {
		return recepcionistaRepository.save(recepcionista) != null;
	}

	public void delete(Long id) {
		recepcionistaRepository.delete(id);
	}

	public List<Recepcionista> findAll() {
		return recepcionistaRepository.findAll();
	}

	public Recepcionista findById(Long idRecepcionista) {
		return recepcionistaRepository.findOne(idRecepcionista);
	}
	
	public Recepcionista findByUsuarioClinica(String email){
		return recepcionistaRepository.findByUsuarioClinica(usuarioClinicaRepository.findByEmail(email));
	}

}
