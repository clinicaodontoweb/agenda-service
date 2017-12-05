package com.odontoweb.microservice.impl.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Evento;
import com.odontoweb.microservice.impl.repository.AgendaRepository;
import com.odontoweb.microservice.impl.repository.EventoRepository;
import com.odontoweb.microservice.impl.repository.UsuarioClinicaRepository;
import com.odontoweb.microservice.rest.util.DateUtil;

public class EventoService {

	@Autowired
	private EventoRepository eventoRepository;

	@Autowired
	private AgendaRepository agendaRepository;

	@Autowired
	private UsuarioClinicaRepository usuarioClinicaRepository;

	public EventoService(EventoRepository eventoRepository) {
		this.eventoRepository = eventoRepository;
	}

	public List<Evento> findAll() {
		return eventoRepository.findAll();
	}

	public boolean save(Evento evento, Long idEvento) {
		evento.setAgenda(agendaRepository.findOne(idEvento));
		return eventoRepository.save(evento) != null;
	}

	public boolean save(Evento agendamento) {
		return eventoRepository.save(agendamento) != null;
	}

	public Evento findById(Long id) {
		return eventoRepository.findOne(id);
	}

	public void delete(Long id) {
		eventoRepository.delete(id);
	}

	public List<Evento> findEventoByUsuarioClinica(String hashKey, Long dataInicio, Long dataFim) {
		if (dataInicio == null) {
			dataInicio = DateUtil.getDataInicial((new Date()).getTime());
		}

		if (dataFim == null) {
			dataFim = DateUtil.getDataInicial((new Date()).getTime());
		}

		return eventoRepository.findEventoByUsuarioClinica(usuarioClinicaRepository.findByHashKey(hashKey),
				new Date(dataInicio), new Date(dataFim));
	}

	public List<Evento> findEventoByNomePaciente(String nomePaciente) {
		return eventoRepository.findEventoByNomePaciente(nomePaciente);
	}

	public List<Evento> findEventoByCpfPaciente(String cpf) {
		return eventoRepository.findEventoByCpfPaciente(cpf);
	}
}
