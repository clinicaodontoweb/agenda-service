package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;

import com.odontoweb.microservice.impl.model.Bairro;
import com.odontoweb.microservice.rest.domain.request.BairroRequest;
import com.odontoweb.microservice.rest.domain.response.BairroResponse;

public class BairroBinder implements Serializable {

	private static final long serialVersionUID = -7938299380544799580L;

	public Bairro requestToModel(BairroRequest bairroRequest) {
		return new Bairro(bairroRequest.getIdBairro(), bairroRequest.getNome());
	}

	public BairroResponse modelToResponse(Bairro bairro) {
		return new BairroResponse(bairro.getIdBairro(), bairro.getNome());
	}

}
