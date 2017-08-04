package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class UsuarioClinicaResponse implements Serializable {

	private static final long serialVersionUID = 7584162869156842364L;

	private Long idUsuarioClinica;
	private String email;
	private String tipoProfissional;

	public UsuarioClinicaResponse(Long idUsuarioClinica, String email,
			TipoProfissionalResponse tipoProfissionalResponse) {
		this.idUsuarioClinica = idUsuarioClinica;
		this.email = email;
		this.tipoProfissional = tipoProfissionalResponse.getTipoProfissional();
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

	public String getTipoProfissional() {
		return tipoProfissional;
	}

	public void setTipoProfissional(String tipoProfissional) {
		this.tipoProfissional = tipoProfissional;
	}

}
