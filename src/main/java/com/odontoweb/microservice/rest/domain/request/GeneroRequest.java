package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

public class GeneroRequest implements Serializable {

	private static final long serialVersionUID = 2251655276910957942L;

	private String genero;

	public GeneroRequest(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
