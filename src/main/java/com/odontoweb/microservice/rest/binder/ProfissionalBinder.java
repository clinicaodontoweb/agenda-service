package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Profissional;
import com.odontoweb.microservice.rest.domain.request.ProfissionalRequest;
import com.odontoweb.microservice.rest.domain.response.ProfissionalResponse;

public class ProfissionalBinder implements Serializable {

	private static final long serialVersionUID = -2268580869115475558L;

	public Profissional requestToModel(ProfissionalRequest profissionalRequest) {
		return new Profissional(profissionalRequest.getIdProfissional(), profissionalRequest.getNome(),
				new ContatoBinder().requestToModel(profissionalRequest.getContatoRequest()),
				profissionalRequest.getGenero(), profissionalRequest.getConselho(), profissionalRequest.getRegistro(),
				profissionalRequest.getCodigoBrasileiroOcupacao());
	}

	public ProfissionalResponse modelToResponse(Profissional profissional) {
		return new ProfissionalResponse(profissional.getIdProfissional(), profissional.getNome(),
				new ContatoBinder().modelToResponse(profissional.getContato()), profissional.getGenero(),
				profissional.getConselho(), profissional.getRegistro(), profissional.getCodigoBrasileiroOcupacao());
	}

	public List<ProfissionalResponse> modelToListResponse(List<Profissional> profissionais) {
		if (profissionais == null)
			return null;
		return profissionais.stream().filter(Objects::nonNull).map(profissional -> modelToResponse(profissional))
				.collect(Collectors.toList());

	}

}
