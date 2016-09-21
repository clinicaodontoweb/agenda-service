package com.odontoweb.microservice.impl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Agenda;
import com.odontoweb.microservice.impl.repository.AgendaRepository;

public class AgendaService {

	private AgendaRepository agendaRepository;

	@Autowired
	public AgendaService(AgendaRepository agendaRepository) {
		this.agendaRepository = agendaRepository;
	}
	
	public List<Agenda> findAll(){
		return agendaRepository.findAll();
	}
	
	public boolean save(Agenda agenda){
		return agendaRepository.save(agenda) != null;
	}
	
	public Agenda findById(Long id){
		return agendaRepository.findOne(id);
	}

}