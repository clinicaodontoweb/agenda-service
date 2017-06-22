package com.odontoweb.microservice.impl.service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Agenda;
import com.odontoweb.microservice.impl.repository.AgendaRepository;
import com.odontoweb.microservice.impl.repository.ProfissionalRepository;

public class AgendaService implements Serializable {

	private static final long serialVersionUID = -4998591815407410597L;

	private AgendaRepository agendaRepository;
	private ProfissionalRepository profissionalRepository;

	@Autowired
	public AgendaService(AgendaRepository agendaRepository, ProfissionalRepository profissionalRepository) {
		this.agendaRepository = agendaRepository;
		this.profissionalRepository = profissionalRepository;
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
	
	public Agenda findAgendaByProfissional(Long id) {
		return agendaRepository.findAgendaByProfissional(profissionalRepository.findOne(id));
	}
	
	public List<Agenda> findAgendaByDataEvento(Long id, Date dataInicio, Date dataFim){
		System.out.println(dataInicio);
		System.out.println(dataFim);
		return agendaRepository.findAgendaByDataEvento(profissionalRepository.findOne(id), dataInicio, dataFim);
	}

}
