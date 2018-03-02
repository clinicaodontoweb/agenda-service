package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

public class UsuarioClinicaRequest implements Serializable {

	private static final long serialVersionUID = 5916436510559374401L;

	private Long idUsuarioClinica;
	private String tipoProfissional;
	private String hashKey;

	public UsuarioClinicaRequest(Long idUsuarioClinica, String hashKey, String tipoProfissional) {
		this.idUsuarioClinica = idUsuarioClinica;
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
