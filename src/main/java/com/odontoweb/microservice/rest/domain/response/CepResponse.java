package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class CepResponse implements Serializable {

	private static final long serialVersionUID = -794807380591256302L;

	private Long idCep;
	private String cep;

	public CepResponse() {
	}

	public CepResponse(Long idCep, String cep) {
		this.idCep = idCep;
		this.cep = cep;
	}

	public Long getIdCep() {
		return idCep;
	}

	public void setIdCep(Long idCep) {
		this.idCep = idCep;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}
