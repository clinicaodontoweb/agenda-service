package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Estado;
import com.odontoweb.microservice.rest.domain.request.EstadoRequest;
import com.odontoweb.microservice.rest.domain.response.EstadoResponse;

public class EstadoBinder implements Serializable {

	private static final long serialVersionUID = -5110503949830176771L;

	public Estado requestToModel(EstadoRequest estadoRequest) {
		return new Estado(estadoRequest.getIdEstado(), estadoRequest.getNome(),
				new SiglaBinder().requestToModel(estadoRequest.getSiglaRequest()));
	}

	public EstadoResponse modelToResponse(Estado estado) {
		return new EstadoResponse(estado.getIdEstado(), estado.getNome(),
				new SiglaBinder().modelToResponse(estado.getSigla()));
	}

	public List<EstadoResponse> modelToListResponse(List<Estado> estados) {
		if (estados == null)
			return null;
		return estados.stream().filter(Objects::nonNull).map(estado -> modelToResponse(estado))
				.collect(Collectors.toList());

	}

}
