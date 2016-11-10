package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;
import java.util.List;

public class AgendaRequest implements Serializable {

	private static final long serialVersionUID = 436747791286284283L;

	private Long idAgenda;
	private ProfissionalRequest profissional;
	private List<EventoRequest> eventos;

	public Long getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Long idAgenda) {
		this.idAgenda = idAgenda;
	}

	public ProfissionalRequest getProfissional() {
		return profissional;
	}

	public void setProfissional(ProfissionalRequest profissional) {
		this.profissional = profissional;
	}

	public List<EventoRequest> getEventos() {
		return eventos;
	}

	public void setEventos(List<EventoRequest> eventos) {
		this.eventos = eventos;
	}

}
