package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class StatusEventoResponse implements Serializable {

	private static final long serialVersionUID = -7721617409691629280L;

	private String statusEvento;

	public StatusEventoResponse(String statusEvento) {
		this.statusEvento = statusEvento;
	}

	public String getStatusEvento() {
		return statusEvento;
	}

	public void setStatusEvento(String statusEvento) {
		this.statusEvento = statusEvento;
	}

}
