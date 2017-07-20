package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import com.odontoweb.microservice.impl.model.enums.TipoProfissional;

public class UsuarioClinicaRequest implements Serializable {

	private static final long serialVersionUID = 5916436510559374401L;

	private Long idUsuarioClinica;
	private String email;
	private TipoProfissional tipoProfissional;

	public UsuarioClinicaRequest(Long idUsuarioClinica, String email, TipoProfissional tipoProfissional) {
		this.idUsuarioClinica = idUsuarioClinica;
		this.email = email;
		this.tipoProfissional = tipoProfissional;
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

	public TipoProfissional getTipoProfissional() {
		return tipoProfissional;
	}

	public void setTipoProfissional(TipoProfissional tipoProfissional) {
		this.tipoProfissional = tipoProfissional;
	}

}
