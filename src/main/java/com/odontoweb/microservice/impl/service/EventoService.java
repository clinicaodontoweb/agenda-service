package com.odontoweb.microservice.impl.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Evento;
import com.odontoweb.microservice.impl.model.enums.TipoAcaoAuditoria;
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
	private PacienteService pacienteService;

	@Autowired
	private UsuarioClinicaRepository usuarioClinicaRepository;

	@Autowired
	private AuditoriaService auditoriaService;

	public EventoService(EventoRepository eventoRepository, AuditoriaService auditoriaService) {
		this.eventoRepository = eventoRepository;
		this.auditoriaService = auditoriaService;
	}

	public List<Evento> findAll() {
		return eventoRepository.findAll();
	}

	public boolean save(Evento evento, Long idAgenda) {
		evento.setAgenda(agendaRepository.getOne(idAgenda));
		return eventoRepository.save(evento) != null;
	}

	public boolean save(Evento agendamento, String usuario) {
		boolean isNew = agendamento.getIdEvento() == null;
		auditoriaService.save(agendamento, agendamento.getIdEvento(), Evento.class.getSimpleName(),
				isNew ? TipoAcaoAuditoria.CREATE : TipoAcaoAuditoria.UPDATE, usuario);
		return eventoRepository.save(agendamento) != null;
	}

	public Evento findById(Long id) {
		return eventoRepository.getOne(id);
	}

	public void delete(Long id) {
		eventoRepository.deleteById(id);
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

	public Evento findLastEventoByPaciente(Long idPaciente) {
		return eventoRepository.findTopEventoByPacienteOrderByDataInicioDesc(pacienteService.findById(idPaciente));
	}

	public List<Evento> findEventoConflitante(String hashKey, Long dataInicio, Long dataFim) {
		if (dataInicio == null) {
			dataInicio = DateUtil.getDataInicial((new Date()).getTime());
		}

		if (dataFim == null) {
			dataFim = DateUtil.getDataInicial((new Date()).getTime());
		}

		return eventoRepository.findEventoConflitante(usuarioClinicaRepository.findByHashKey(hashKey),
				new Date(dataInicio), new Date(dataFim));
	}
}
