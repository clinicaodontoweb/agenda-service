package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

public class UsuarioClinicaRequest implements Serializable {

	private static final long serialVersionUID = 5916436510559374401L;

	private Long idUsuarioClinica;
	private String email;
	private String tipoProfissional;
	private String hashKey;

	public UsuarioClinicaRequest(Long idUsuarioClinica, String email, String hashKey, String tipoProfissional) {
		this.idUsuarioClinica = idUsuarioClinica;
		this.email = email;
		this.hashKey = hashKey;
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

	public String getTipoProfissional() {
		return tipoProfissional;
	}

	public void setTipoProfissional(String tipoProfissional) {
		this.tipoProfissional = tipoProfissional;
	}

	public String getHashKey() {
		return hashKey;
	}

	public void setHashKey(String hashKey) {
		this.hashKey = hashKey;
	}

}
