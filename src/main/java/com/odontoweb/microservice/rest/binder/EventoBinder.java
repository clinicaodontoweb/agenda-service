package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Evento;
import com.odontoweb.microservice.rest.domain.request.AgendamentoRequest;
import com.odontoweb.microservice.rest.domain.request.EventoRequest;
import com.odontoweb.microservice.rest.domain.response.EventoResponse;

public class EventoBinder implements Serializable {

	private static final long serialVersionUID = -7767265161514792685L;

	private StatusBinder statusBinder;
	private PacienteBinder pacienteBinder;
	private ConvenioBinder convenioBinder;
	private TipoConsultaBinder tipoConsultaBinder;
	private AgendaBinder agendaBinder;

	public EventoBinder(ConvenioBinder convenioBinder, PacienteBinder pacienteBinder, StatusBinder statusBinder,
			TipoConsultaBinder tipoConsultaBinder, AgendaBinder agendaBinder) {
		this.statusBinder = statusBinder;
		this.pacienteBinder = pacienteBinder;
		this.convenioBinder = convenioBinder;
		this.tipoConsultaBinder = tipoConsultaBinder;
		this.agendaBinder = agendaBinder;
	}

	public Evento requestToModel(EventoRequest eventoRequest, String hashkey) {
		return new Evento(eventoRequest.getIdEvento(), eventoRequest.getEncaixe(),
				statusBinder.getStatusById(eventoRequest.getIdStatus()),
				tipoConsultaBinder.requestToModel(eventoRequest.getIdTipoConsulta()),
				agendaBinder.requestToModel(hashkey), pacienteBinder.requestToModel(eventoRequest.getIdPaciente()),
				convenioBinder.requestToModel(eventoRequest.getIdConvenio()), new Date(eventoRequest.getDataInicio()),
				new Date(eventoRequest.getDataFim()), eventoRequest.getObservacao());
	}

	public Evento requestToModel(AgendamentoRequest agendamentoRequest) {
		Evento evento = new Evento();
		evento.setIdEvento(agendamentoRequest.getId());
		evento.setConvenio(convenioBinder.requestToModel(agendamentoRequest.getIdConvenio()));
		evento.setPaciente(pacienteBinder.requestToModel(agendamentoRequest.getIdPaciente()));
		evento.setTipoConsulta(this.tipoConsultaBinder.requestToModel(agendamentoRequest.getIdTipoConsulta()));
		evento.setDataInicio(new Date(agendamentoRequest.getDataInicio()));
		evento.setDataFim(new Date(agendamentoRequest.getDataFim()));
		evento.setObservacao(agendamentoRequest.getObservacao());
		evento.setStatus(statusBinder.getStatusById(agendamentoRequest.getIdStatus()));
		evento.setEncaixe(agendamentoRequest.getEncaixe());

		return evento;
	}

	public EventoResponse modelToResponse(Evento evento) {
		return new EventoResponse(evento.getIdEvento(), evento.getEncaixe(),
				statusBinder.modelToResponse(evento.getStatus()),
				tipoConsultaBinder.modelToResponse(evento.getTipoConsulta()),
				agendaBinder.modelToResponse(evento.getAgenda()), pacienteBinder.modelToResponse(evento.getPaciente()),
				convenioBinder.modelToResponse(evento.getConvenio()), evento.getObservacao(),
				evento.getDataInicio().getTime(), evento.getDataFim().getTime());
	}

	public List<EventoResponse> modelToListResponse(List<Evento> eventos) {
		if (eventos == null)
			return null;
		return eventos.stream().filter(Objects::nonNull).map(evento -> modelToResponse(evento))
				.collect(Collectors.toList());

	}

}
