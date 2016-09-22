package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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

	public List<BairroResponse> modelToListResponse(List<Bairro> bairros) {
		if (bairros == null)
			return null;
		return bairros.stream().filter(Objects::nonNull).map(bairro -> modelToResponse(bairro))
				.collect(Collectors.toList());

	}

}
