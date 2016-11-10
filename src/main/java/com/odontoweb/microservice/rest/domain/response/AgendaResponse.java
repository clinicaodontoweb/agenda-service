package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;
import java.util.List;

public class AgendaResponse implements Serializable {

	private static final long serialVersionUID = 1582101913813759874L;

	private Long idAgenda;
	private ProfissionalResponse profissional;
	private List<EventoResponse> eventos;

	public AgendaResponse() {
	}

	public AgendaResponse(Long idAgenda, ProfissionalResponse profissional, List<EventoResponse> eventos) {
		this.idAgenda = idAgenda;
		this.profissional = profissional;
		this.eventos = eventos;
	}

	public Long getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Long idAgenda) {
		this.idAgenda = idAgenda;
	}

	public ProfissionalResponse getProfissional() {
		return profissional;
	}

	public void setProfissional(ProfissionalResponse profissional) {
		this.profissional = profissional;
	}

	public List<EventoResponse> getEventos() {
		return eventos;
	}

	public void setEventos(List<EventoResponse> eventos) {
		this.eventos = eventos;
	}

}
