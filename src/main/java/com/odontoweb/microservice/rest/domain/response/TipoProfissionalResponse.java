package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class TipoProfissionalResponse implements Serializable {

	private static final long serialVersionUID = -1279152976310287964L;

	private String tipoProfissional;

	public TipoProfissionalResponse(String tipoProfissional) {
		this.tipoProfissional = tipoProfissional;
	}

	public String getTipoProfissional() {
		return tipoProfissional;
	}

	public void setTipoProfissional(String tipoProfissional) {
		this.tipoProfissional = tipoProfissional;
	}

}
