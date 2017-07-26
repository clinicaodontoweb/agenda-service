package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

public class EstadoCivilRequest implements Serializable {

	private static final long serialVersionUID = -8810801475359564190L;

	private String estadoCivil;

	public EstadoCivilRequest(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

}
