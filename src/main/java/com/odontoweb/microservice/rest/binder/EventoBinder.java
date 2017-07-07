package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Evento;
import com.odontoweb.microservice.rest.domain.request.EventoRequest;
import com.odontoweb.microservice.rest.domain.response.EventoResponse;

public class EventoBinder implements Serializable {

	private static final long serialVersionUID = -7767265161514792685L;

	public Evento requestToModel(EventoRequest eventoRequest) {
		return new Evento(eventoRequest.getIdEvento(), eventoRequest.getEncaixe(), eventoRequest.getStatusEvento(),
				new TipoConsultaBinder().requestToModel(eventoRequest.getTipoConsultaRequest()),
				new AgendaBinder().requestToModel(eventoRequest.getAgendaRequest()),
				new PacienteBinder().requestToModel(eventoRequest.getPacienteRequest()), eventoRequest.getAno(),
				eventoRequest.getMes(), eventoRequest.getDia(), eventoRequest.getHoraInicio(),
				eventoRequest.getHoraFim(), eventoRequest.getMinutoInicio(), eventoRequest.getMinutoFim(),
				eventoRequest.getObservacao());
	}

	public EventoResponse modelToResponse(Evento evento) {
		return new EventoResponse(evento.getIdEvento(), evento.getEncaixe(), evento.getStatusEvento(),
				new TipoConsultaBinder().modelToResponse(evento.getTipoConsulta()),
				new AgendaBinder().modelToResponse(evento.getAgenda()),
				new PacienteBinder().modelToResponse(evento.getPaciente()), evento.getAno(), evento.getMes(),
				evento.getDia(), evento.getHoraInicio(), evento.getHoraFim(), evento.getMinutoInicio(),
				evento.getMinutoFim(), evento.getObservacao());
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
