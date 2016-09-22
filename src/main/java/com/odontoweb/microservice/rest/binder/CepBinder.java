package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Cep;
import com.odontoweb.microservice.rest.domain.request.CepRequest;
import com.odontoweb.microservice.rest.domain.response.CepResponse;

public class CepBinder implements Serializable {

	private static final long serialVersionUID = -3213028131138772133L;

	public Cep requestToModel(CepRequest cepRequest) {
		return new Cep(cepRequest.getIdCep(), cepRequest.getCep());
	}

	public CepResponse modelToResponse(Cep cep) {
		return new CepResponse(cep.getIdCep(), cep.getCep());
	}

	public List<CepResponse> modelToListResponse(List<Cep> ceps) {
		if (ceps == null)
			return null;
		return ceps.stream().filter(Objects::nonNull).map(cep -> modelToResponse(cep)).collect(Collectors.toList());

	}

}
