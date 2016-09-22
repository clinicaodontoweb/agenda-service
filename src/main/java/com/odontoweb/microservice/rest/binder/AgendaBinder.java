package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Agenda;
import com.odontoweb.microservice.rest.domain.request.AgendaRequest;
import com.odontoweb.microservice.rest.domain.response.AgendaResponse;

public class AgendaBinder implements Serializable {

	private static final long serialVersionUID = -7767265161514792685L;

	public Agenda requestToModel(AgendaRequest agendaRequest) {
		return new Agenda(agendaRequest.getIdAgenda(), agendaRequest.getConfirmado(), agendaRequest.getEncaixe(),
				agendaRequest.getStatusAgenda(), agendaRequest.getTipoConsulta(), agendaRequest.getProfissional(),
				agendaRequest.getPaciente(), agendaRequest.getAno(), agendaRequest.getMes(), agendaRequest.getDia(),
				agendaRequest.getHora(), agendaRequest.getMinuto(), agendaRequest.getObservacao());
	}

	public AgendaResponse modelToResponse(Agenda agenda) {
		return new AgendaResponse(agenda.getIdAgenda(), agenda.getConfirmado(), agenda.getEncaixe(),
				agenda.getStatusAgenda(), agenda.getTipoConsulta(), agenda.getProfissional(), agenda.getPaciente(),
				agenda.getAno(), agenda.getMes(), agenda.getDia(), agenda.getHora(), agenda.getMinuto(),
				agenda.getObservacao());
	}

	public List<AgendaResponse> modelToListResponse(List<Agenda> agendas) {
		if (agendas == null)
			return null;
		return agendas.stream().filter(Objects::nonNull).map(agenda -> modelToResponse(agenda))
				.collect(Collectors.toList());

	}

}
