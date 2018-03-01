package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class AgendaResponse implements Serializable {

	private static final long serialVersionUID = 1582101913813759874L;

	private Long idAgenda;
	private UsuarioClinicaResponse usuarioClinica;

	public AgendaResponse() {
	}

	public AgendaResponse(Long idAgenda, UsuarioClinicaResponse usuarioClinica) {
		this.idAgenda = idAgenda;
		this.usuarioClinica = usuarioClinica;
	}

	public Long getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Long idAgenda) {
		this.idAgenda = idAgenda;
	}

	public UsuarioClinicaResponse getUsuarioClinica() {
		return usuarioClinica;
	}

	public void setUsuarioClinica(UsuarioClinicaResponse usuarioClinica) {
		this.usuarioClinica = usuarioClinica;
	}

}
