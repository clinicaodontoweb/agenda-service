package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

public class UsuarioClinicaRequest implements Serializable {

	private static final long serialVersionUID = 5916436510559374401L;

	private Long idUsuarioClinica;
	private String email;
	private TipoProfissionalRequest tipoProfissionalRequest;

	public UsuarioClinicaRequest(Long idUsuarioClinica, String email, TipoProfissionalRequest tipoProfissionalRequest) {
		this.idUsuarioClinica = idUsuarioClinica;
		this.email = email;
		this.tipoProfissionalRequest = tipoProfissionalRequest;
	}

	public UsuarioClinicaRequest() {
	}

	public Long getIdUsuarioClinica() {
		return idUsuarioClinica;
	}

	public void setIdUsuarioClinica(Long idUsuarioClinica) {
		this.idUsuarioClinica = idUsuarioClinica;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoProfissionalRequest getTipoProfissionalRequest() {
		return tipoProfissionalRequest;
	}

	public void setTipoProfissionalRequest(TipoProfissionalRequest tipoProfissionalRequest) {
		this.tipoProfissionalRequest = tipoProfissionalRequest;
	}

}
