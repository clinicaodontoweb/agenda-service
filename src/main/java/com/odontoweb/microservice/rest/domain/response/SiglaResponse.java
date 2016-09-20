package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class SiglaResponse implements Serializable {

	private static final long serialVersionUID = -6044051654240321278L;

	private Long idSigla;
	private String sigla;

	public SiglaResponse() {
	}

	public SiglaResponse(Long idSigla, String sigla) {
		this.idSigla = idSigla;
		this.sigla = sigla;
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
