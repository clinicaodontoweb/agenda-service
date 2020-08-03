package com.odontoweb.microservice.impl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.UsuarioClinica;
import com.odontoweb.microservice.impl.model.enums.TipoProfissional;
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
		usuarioClinicaRepository.deleteById(id);
	}

	public List<UsuarioClinica> findAll() {
		return usuarioClinicaRepository.findAll();
	}

	public UsuarioClinica findById(Long idUsuarioClinica) {
		return usuarioClinicaRepository.getOne(idUsuarioClinica);
	}

	public UsuarioClinica findUsuarioClinica(String hashKey) {
		return usuarioClinicaRepository.findByHashKey(hashKey);
	}

	public UsuarioClinica findUsuarioClinicaByHashKey(String hashKey) {
		UsuarioClinica usuarioClinica = usuarioClinicaRepository.findByHashKey(hashKey);
		if(usuarioClinica == null) {
			usuarioClinica = new UsuarioClinica();
			usuarioClinica.setHashKey(hashKey);
			usuarioClinica.setTipoProfissional(TipoProfissional.DENTISTA);
			usuarioClinicaRepository.save(usuarioClinica);
		}
		return usuarioClinica;
	}

	public boolean usuarioExists(String hashKey) {
		if (findUsuarioClinica(hashKey) != null)
			return true;
		return false;
	}

}
