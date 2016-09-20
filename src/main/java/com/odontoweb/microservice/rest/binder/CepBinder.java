package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;

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

}
