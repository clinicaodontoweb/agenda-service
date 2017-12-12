package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Agenda;
import com.odontoweb.microservice.impl.service.AgendaService;
import com.odontoweb.microservice.rest.domain.request.AgendaRequest;
import com.odontoweb.microservice.rest.domain.response.AgendaResponse;

public class AgendaBinder implements Serializable {

	private static final long serialVersionUID = -7938299380544799580L;

	private AgendaService agendaService;
	
	public AgendaBinder(AgendaService agendaService) {
		this.agendaService = agendaService;
	}
	
	public Agenda requestToModel(AgendaRequest agendaRequest) {
		return new Agenda(agendaRequest.getIdAgenda(),
				new UsuarioClinicaBinder().requestToModel(agendaRequest.getUsuarioClinicaRequest()));
	}
	
	public Agenda requestToModel(Long idAgenda) {
		return agendaService.findById(idAgenda);
	}
	
	public Agenda requestToModel(String hashKey) {
		return agendaService.findOrCreateAgendaByUsuarioClinica(hashKey);
	}

	public AgendaResponse modelToResponse(Agenda agenda) {
		if(agenda == null) return null;
		return new AgendaResponse(agenda.getIdAgenda(),
				new UsuarioClinicaBinder().modelToResponse(agenda.getUsuarioClinica()));
	}

	public List<AgendaResponse> modelToListResponse(List<Agenda> agendas) {
		if (agendas == null)
			return null;
		return agendas.stream().filter(Objects::nonNull).map(agenda -> modelToResponse(agenda))
				.collect(Collectors.toList());

	}

}
