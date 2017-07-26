package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

public class StatusEventoRequest implements Serializable {

	private static final long serialVersionUID = 1606259406031743769L;

	private String statusEvento;

	public StatusEventoRequest(String statusEvento) {
		this.statusEvento = statusEvento;
	}

	public String getStatusEvento() {
		return statusEvento;
	}

	public void setStatusEvento(String statusEvento) {
		this.statusEvento = statusEvento;
	}

}
