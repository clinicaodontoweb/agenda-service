package com.odontoweb.microservice.impl.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Agenda;
import com.odontoweb.microservice.impl.repository.AgendaRepository;
import com.odontoweb.microservice.impl.repository.UsuarioClinicaRepository;

public class AgendaService implements Serializable {

	private static final long serialVersionUID = -4998591815407410597L;

	private AgendaRepository agendaRepository;
	private UsuarioClinicaRepository usuarioClinicaRepository;

	@Autowired
	public AgendaService(AgendaRepository agendaRepository, UsuarioClinicaRepository usuarioClinicaRepository) {
		this.agendaRepository = agendaRepository;
		this.usuarioClinicaRepository = usuarioClinicaRepository;
	}

	public List<Agenda> findAll() {
		return agendaRepository.findAll();
	}

	public boolean save(Agenda agenda) {
		return agendaRepository.save(agenda) != null;
	}

	public Agenda findById(Long id) {
		return agendaRepository.findOne(id);
	}

	public void delete(Long id) {
		agendaRepository.delete(id);
	}

	public Agenda findAgendaByUsuarioClinica(String hashKey) {
		return agendaRepository.findAgendaByUsuarioClinica(usuarioClinicaRepository.findByHashKey(hashKey));
	}

}
