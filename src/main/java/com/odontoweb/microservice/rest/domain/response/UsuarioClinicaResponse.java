package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

import com.odontoweb.microservice.impl.model.enums.TipoProfissional;

public class UsuarioClinicaResponse implements Serializable {

	private static final long serialVersionUID = 7584162869156842364L;

	private Long idUsuarioClinica;
	private String email;
	private TipoProfissional tipoProfissional;

	public UsuarioClinicaResponse(Long idUsuarioClinica, String email, TipoProfissional tipoProfissional) {
		this.idUsuarioClinica = idUsuarioClinica;
		this.email = email;
		this.tipoProfissional = tipoProfissional;
	}

	public UsuarioClinicaResponse() {
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
