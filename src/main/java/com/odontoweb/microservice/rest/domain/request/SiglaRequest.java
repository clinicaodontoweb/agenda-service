package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class SiglaRequest implements Serializable {

	private static final long serialVersionUID = -3523894104353937660L;

	private Long idSigla;
	
	@NotNull(message = "Sigla é obrigatório!")
	private String sigla;

	public SiglaRequest(Long idSigla, String sigla) {
		this.idSigla = idSigla;
		this.sigla = sigla;
	}

	public SiglaRequest() {
	}

	public Long getIdSigla() {
		return idSigla;
	}

	public void setIdSigla(Long idSigla) {
		this.idSigla = idSigla;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
