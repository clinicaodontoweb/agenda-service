package com.odontoweb.microservice.impl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Evento;
import com.odontoweb.microservice.impl.repository.EventoRepository;
import com.odontoweb.microservice.impl.repository.ProfissionalRepository;

public class EventoService {

	private EventoRepository eventoRepository;
	private ProfissionalRepository profissionalRepository;

	@Autowired
	public EventoService(EventoRepository eventoRepository, ProfissionalRepository profissionalRepository) {
		this.eventoRepository = eventoRepository;
		this.profissionalRepository = profissionalRepository;
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

	public List<Evento> findEventoByProfissional(Long id) {
		return eventoRepository.findEventoByProfissional(profissionalRepository.findOne(id));
	}

}
