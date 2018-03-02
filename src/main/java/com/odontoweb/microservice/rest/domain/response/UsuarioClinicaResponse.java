package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class UsuarioClinicaResponse implements Serializable {

	private static final long serialVersionUID = 7584162869156842364L;

	private Long idUsuarioClinica;
	private String hashKey;
	private String tipoProfissional;

	public UsuarioClinicaResponse(Long idUsuarioClinica, String hashKey,
			TipoProfissionalResponse tipoProfissionalResponse) {
		this.idUsuarioClinica = idUsuarioClinica;
		this.hashKey = hashKey;
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
