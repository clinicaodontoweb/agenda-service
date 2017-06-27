package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class AgendaResponse implements Serializable {

	private static final long serialVersionUID = 1582101913813759874L;

	private Long idAgenda;
	private ProfissionalResponse profissional;

	public AgendaResponse() {
	}

	public AgendaResponse(Long idAgenda, ProfissionalResponse profissional) {
		this.idAgenda = idAgenda;
		this.profissional = profissional;
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

}
