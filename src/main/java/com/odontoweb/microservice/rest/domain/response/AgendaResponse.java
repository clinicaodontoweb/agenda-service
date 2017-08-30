package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class AgendaResponse implements Serializable {

	private static final long serialVersionUID = 1582101913813759874L;

	private Long idAgenda;
	private UsuarioClinicaResponse usuarioClinicaResponse;

	public AgendaResponse() {
	}

	public AgendaResponse(Long idAgenda, UsuarioClinicaResponse usuarioClinicaResponse) {
		this.idAgenda = idAgenda;
		this.usuarioClinicaResponse = usuarioClinicaResponse;
	}

	public Long getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Long idAgenda) {
		this.idAgenda = idAgenda;
	}

	public UsuarioClinicaResponse getUsuarioClinicaResponse() {
		return usuarioClinicaResponse;
	}

	public void setUsuarioClinicaResponse(UsuarioClinicaResponse usuarioClinicaResponse) {
		this.usuarioClinicaResponse = usuarioClinicaResponse;
	}

}
