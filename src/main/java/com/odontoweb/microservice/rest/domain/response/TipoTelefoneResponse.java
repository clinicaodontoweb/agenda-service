package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class TipoTelefoneResponse implements Serializable {

	private static final long serialVersionUID = 1506561830069602482L;

	private String tipoTelefone;

	public TipoTelefoneResponse(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public String getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

}
