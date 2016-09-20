package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

public class CepRequest implements Serializable {

	private static final long serialVersionUID = -964572396702330630L;

	private Long idCep;
	private Integer cep;

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
