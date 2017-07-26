package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

public class TipoProfissionalRequest implements Serializable {

	private static final long serialVersionUID = -663503942838928903L;

	private String tipoProfissional;

	public TipoProfissionalRequest(String tipoProfissional) {
		this.tipoProfissional = tipoProfissional;
	}

	public String getTipoProfissional() {
		return tipoProfissional;
	}

	public void setTipoProfissional(String tipoProfissional) {
		this.tipoProfissional = tipoProfissional;
	}

}
