package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

public class AgendaRequest implements Serializable {

	private static final long serialVersionUID = 436747791286284283L;

	private Long idAgenda;
	private DentistaRequest profissional;

	public Long getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Long idAgenda) {
		this.idAgenda = idAgenda;
	}

	public DentistaRequest getProfissional() {
		return profissional;
	}

	public void setProfissional(DentistaRequest profissional) {
		this.profissional = profissional;
	}

}