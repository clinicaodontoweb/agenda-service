package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class CepResponse implements Serializable {

	private static final long serialVersionUID = -794807380591256302L;

	private Long idCep;
	private Integer cep;

	public CepResponse() {
	}

	public CepResponse(Long idCep, Integer cep) {
		this.idCep = idCep;
		this.cep = cep;
	}

	public Long getIdCep() {
		return idCep;
	}

	public void setIdCep(Long idCep) {
		this.idCep = idCep;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}
}
