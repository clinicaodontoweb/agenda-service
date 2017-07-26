package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

public class TipoTelefoneRequest implements Serializable {

	private static final long serialVersionUID = 2655642733297967852L;

	private String tipoTelefone;

	public TipoTelefoneRequest(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public String getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

}
