package com.odontoweb.microservice.impl.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Agenda;
import com.odontoweb.microservice.impl.model.UsuarioClinica;
import com.odontoweb.microservice.impl.repository.AgendaRepository;

public class AgendaService implements Serializable {

	private static final long serialVersionUID = -4998591815407410597L;

	private AgendaRepository agendaRepository;
	private UsuarioClinicaService usuarioClinicaService;

	@Autowired
	public AgendaService(AgendaRepository agendaRepository, UsuarioClinicaService usuarioClinicaService) {
		this.agendaRepository = agendaRepository;
		this.usuarioClinicaService = usuarioClinicaService;
	}

	public List<Agenda> findAll() {
		return agendaRepository.findAll();
	}

	public boolean save(Agenda agenda) {
		return agendaRepository.save(agenda) != null;
	}

	public Agenda findById(Long id) {
		return agendaRepository.getOne(id);
	}

	public void delete(Long id) {
		agendaRepository.deleteById(id);
	}

	public Agenda findAgendaByUsuarioClinica(UsuarioClinica usuarioClinica) {
		Agenda agenda = null;
		if (usuarioClinica != null) {
			agenda = agendaRepository.findByUsuarioClinica(usuarioClinica);
		}
		return agenda;
	}

	public Agenda findOrCreateAgendaByUsuarioClinica(String hashKey) {
		UsuarioClinica usuarioClinica = usuarioClinicaService.findUsuarioClinicaByHashKey(hashKey);
		Agenda agenda = null;
		if (usuarioClinica != null) {
			agenda = findAgendaByUsuarioClinica(usuarioClinica);
			if (agenda == null) {
				agenda = new Agenda();
				agenda.setUsuarioClinica(usuarioClinica);
				save(agenda);
			}
		}
		return agenda;
	}

}
