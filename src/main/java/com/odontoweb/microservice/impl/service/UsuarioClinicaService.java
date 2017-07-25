package com.odontoweb.microservice.impl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.UsuarioClinica;
import com.odontoweb.microservice.impl.repository.UsuarioClinicaRepository;

public class UsuarioClinicaService {

	private UsuarioClinicaRepository usuarioClinicaRepository;

	@Autowired
	public UsuarioClinicaService(UsuarioClinicaRepository usuarioClinicaRepository) {
		this.usuarioClinicaRepository = usuarioClinicaRepository;
	}

	public boolean save(UsuarioClinica dentista) {
		return usuarioClinicaRepository.save(dentista) != null;
	}

	public void delete(Long id) {
		usuarioClinicaRepository.delete(id);
	}

	public List<UsuarioClinica> findAll() {
		return usuarioClinicaRepository.findAll();
	}

	public UsuarioClinica findById(Long idUsuarioClinica) {
		return usuarioClinicaRepository.findOne(idUsuarioClinica);
	}
	
	public UsuarioClinica findUsuarioClinica(String email){
		return usuarioClinicaRepository.findByEmail(email);
	}

}
