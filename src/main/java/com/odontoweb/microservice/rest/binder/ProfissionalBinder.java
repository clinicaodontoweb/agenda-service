package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;

import com.odontoweb.microservice.impl.model.Profissional;
import com.odontoweb.microservice.rest.domain.request.ProfissionalRequest;
import com.odontoweb.microservice.rest.domain.response.ProfissionalResponse;

public class ProfissionalBinder implements Serializable {

	private static final long serialVersionUID = -2268580869115475558L;

	public Profissional requestToModel(ProfissionalRequest profissionalRequest) {
		return new Profissional(profissionalRequest.getIdProfissional(), profissionalRequest.getTelefones(),
				profissionalRequest.getGenero(), profissionalRequest.getConselho(), profissionalRequest.getRegistro(),
				profissionalRequest.getCodigoBrasileiroOcupacao());
	}

	public ProfissionalResponse modelToResponse(Profissional profissional) {
		return new ProfissionalResponse(profissional.getIdProfissional(), profissional.getTelefones(),
				profissional.getGenero(), profissional.getConselho(), profissional.getRegistro(),
				profissional.getCodigoBrasileiroOcupacao());
	}

}
