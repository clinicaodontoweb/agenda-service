package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.RedeSocial;
import com.odontoweb.microservice.rest.domain.request.RedeSocialRequest;
import com.odontoweb.microservice.rest.domain.response.RedeSocialResponse;

public class RedeSocialBinder implements Serializable {

	private static final long serialVersionUID = -6170090558373072175L;

	public RedeSocial requestToModel(RedeSocialRequest redeSocialRequest) {
		return new RedeSocial(redeSocialRequest.getIdRedeSocial(), redeSocialRequest.getNome());
	}

	public RedeSocialResponse modelToResponse(RedeSocial redeSocial) {
		return new RedeSocialResponse(redeSocial.getIdRedeSocial(), redeSocial.getNome());
	}

	public List<RedeSocialResponse> modelToListResponse(List<RedeSocial> redesSociais) {
		if (redesSociais == null)
			return null;
		return redesSociais.stream().filter(Objects::nonNull).map(redeSocial -> modelToResponse(redeSocial))
				.collect(Collectors.toList());

	}

}
