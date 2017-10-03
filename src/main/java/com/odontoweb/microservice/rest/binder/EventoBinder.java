package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Evento;
import com.odontoweb.microservice.impl.service.ConvenioService;
import com.odontoweb.microservice.rest.domain.request.EventoRequest;
import com.odontoweb.microservice.rest.domain.response.EventoResponse;

public class EventoBinder implements Serializable {

	private static final long serialVersionUID = -7767265161514792685L;
	private ConvenioService convenioService;

	public EventoBinder(ConvenioService convenioService) {
		this.convenioService = convenioService;
	}

	public Evento requestToModel(EventoRequest eventoRequest) {
		return new Evento(eventoRequest.getIdEvento(), eventoRequest.getEncaixe(),
				new EnumerationBinder().requestToEnum(eventoRequest.getStatusEventoRequest()),
				new TipoConsultaBinder().requestToModel(eventoRequest.getTipoConsultaRequest()),
				new AgendaBinder().requestToModel(eventoRequest.getAgendaRequest()),
				new PacienteBinder().requestToModel(eventoRequest.getPacienteRequest()),
				convenioService.findById(eventoRequest.getIdConvenio()), new Date(eventoRequest.getDataInicio()),
				new Date(eventoRequest.getDataFim()), eventoRequest.getObservacao());
	}

	public EventoResponse modelToResponse(Evento evento) {
		return new EventoResponse(evento.getIdEvento(), evento.getEncaixe(),
				new EnumerationBinder().enumToResponse(evento.getStatusEvento()),
				new TipoConsultaBinder().modelToResponse(evento.getTipoConsulta()),
				new AgendaBinder().modelToResponse(evento.getAgenda()),
				new PacienteBinder().modelToResponse(evento.getPaciente()),
				new ConvenioBinder().modelToResponse(evento.getConvenio()), evento.getObservacao(),
				evento.getDataInicio().getTime(), evento.getDataFim().getTime());
	}

	public List<EventoResponse> modelToListResponse(List<Evento> eventos) {
		if (eventos == null)
			return null;
		return eventos.stream().filter(Objects::nonNull).map(evento -> modelToResponse(evento))
				.collect(Collectors.toList());

	}

	public List<Evento> requestToListModel(List<EventoRequest> eventos) {
		if (eventos == null)
			return null;
		return eventos.stream().filter(Objects::nonNull).map(evento -> requestToModel(evento))
				.collect(Collectors.toList());

	}

}
