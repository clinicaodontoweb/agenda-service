package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class EstadoCivilResponse implements Serializable {

	private static final long serialVersionUID = 4526218293325527525L;

	private String estadoCivil;

	public EstadoCivilResponse(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

}
