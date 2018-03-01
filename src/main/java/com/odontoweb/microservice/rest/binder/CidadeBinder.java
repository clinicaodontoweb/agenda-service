package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Cidade;
import com.odontoweb.microservice.rest.domain.request.CidadeRequest;
import com.odontoweb.microservice.rest.domain.response.CidadeResponse;

public class CidadeBinder implements Serializable {

	private static final long serialVersionUID = 2977065078163921913L;

	public Cidade requestToModel(CidadeRequest cidadeRequest) {
		return new Cidade(cidadeRequest.getIdCidade(), cidadeRequest.getNome(),
				new EstadoBinder().requestToModel(cidadeRequest.getEstado()));
	}

	public CidadeResponse modelToResponse(Cidade cidade) {
		return new CidadeResponse(cidade.getIdCidade(), cidade.getNome(),
				new EstadoBinder().modelToResponse(cidade.getEstado()));
	}

	public List<CidadeResponse> modelToListResponse(List<Cidade> cidades) {
		if (cidades == null)
			return null;
		return cidades.stream().filter(Objects::nonNull).map(cidade -> modelToResponse(cidade))
				.collect(Collectors.toList());

	}

}
