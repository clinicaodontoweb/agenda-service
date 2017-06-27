package com.odontoweb.microservice.impl.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Evento;
import com.odontoweb.microservice.impl.repository.EventoRepository;
import com.odontoweb.microservice.impl.repository.ProfissionalRepository;

public class EventoService {

	@Autowired
	private EventoRepository eventoRepository;

	@Autowired
	private ProfissionalRepository profissionalRepository;

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

	public List<Evento> findEventoByProfissional(Long idProfissional, Date dataInicio, Date dataFim) {
		return eventoRepository.findEventoByProfissional(profissionalRepository.findOne(idProfissional), dataInicio,
				dataFim);
	}
}
