package com.odontoweb.microservice.impl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Evento;
import com.odontoweb.microservice.impl.repository.EventoRepository;

public class EventoService {

	private EventoRepository eventoRepository;

	@Autowired
	public EventoService(EventoRepository eventoRepository) {
		this.eventoRepository = eventoRepository;
	}

	public List<Evento> findAll() {
		return eventoRepository.findAll();
	}

	public boolean save(Evento evento) {
		return eventoRepository.save(evento) != null;
	}

	public Evento findById(Long id) {
		return eventoRepository.findOne(id);
	}

	public void delete(Long id) {
		eventoRepository.delete(id);
	}
}
