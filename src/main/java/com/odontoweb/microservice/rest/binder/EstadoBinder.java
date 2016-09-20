package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;

import com.odontoweb.microservice.impl.model.Estado;
import com.odontoweb.microservice.rest.domain.request.EstadoRequest;
import com.odontoweb.microservice.rest.domain.response.EstadoResponse;

public class EstadoBinder implements Serializable {

	private static final long serialVersionUID = -5110503949830176771L;

	public Estado requestToModel(EstadoRequest estadoRequest) {
		return new Estado(estadoRequest.getIdEstado(), estadoRequest.getNome(), estadoRequest.getSigla());
	}

	public EstadoResponse modelToResponse(Estado estado) {
		return new EstadoResponse(estado.getIdEstado(), estado.getNome(), estado.getSigla());
	}

}
