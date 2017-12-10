package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CepRequest implements Serializable {

	private static final long serialVersionUID = -964572396702330630L;

	private Long idCep;

	@NotNull(message = "Cep obrigatório!")
	@Size(min = 8, max = 8, message = "O cep deve conter 8 digitos!")
	private String cep;

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
