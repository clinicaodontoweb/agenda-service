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
		return new Evento(eventoRequest.getIdEvento(), eventoRequest.getConfirmado(), eventoRequest.getEncaixe(),
				eventoRequest.getStatusEvento(),
				new TipoConsultaBinder().requestToModel(eventoRequest.getTipoConsultaRequest()),
				new ProfissionalBinder().requestToModel(eventoRequest.getProfissionalRequest()),
				new PacienteBinder().requestToModel(eventoRequest.getPacienteRequest()), eventoRequest.getAno(),
				eventoRequest.getMes(), eventoRequest.getDia(), eventoRequest.getHora(), eventoRequest.getMinuto(),
				eventoRequest.getObservacao());
	}

	public EventoResponse modelToResponse(Evento evento) {
		return new EventoResponse(evento.getIdEvento(), evento.getConfirmado(), evento.getEncaixe(),
				evento.getStatusEvento(), new TipoConsultaBinder().modelToResponse(evento.getTipoConsulta()),
				new ProfissionalBinder().modelToResponse(evento.getProfissional()),
				new PacienteBinder().modelToResponse(evento.getPaciente()), evento.getAno(), evento.getMes(),
				evento.getDia(), evento.getHora(), evento.getMinuto(), evento.getObservacao());
	}

	public List<EventoResponse> modelToListResponse(List<Evento> eventos) {
		if (eventos == null)
			return null;
		return eventos.stream().filter(Objects::nonNull).map(evento -> modelToResponse(evento))
				.collect(Collectors.toList());

	}

}
