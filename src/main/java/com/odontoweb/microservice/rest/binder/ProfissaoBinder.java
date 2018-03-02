package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Profissao;
import com.odontoweb.microservice.rest.domain.request.ProfissaoRequest;
import com.odontoweb.microservice.rest.domain.response.ProfissaoResponse;

public class ProfissaoBinder implements Serializable {

	private static final long serialVersionUID = 2470145284447359775L;

	public Profissao requestToModel(ProfissaoRequest profissaoRequest) {
		return new Profissao(profissaoRequest.getIdProfissao(), profissaoRequest.getNome());
	}

	public ProfissaoResponse modelToResponse(Profissao profissao) {
		return new ProfissaoResponse(profissao.getIdProfissao(), profissao.getNome());
	}

	public List<ProfissaoResponse> modelToListResponse(List<Profissao> profissoes) {
		if (profissoes == null)
			return null;
		return profissoes.stream().filter(Objects::nonNull).map(profissao -> modelToResponse(profissao))
				.collect(Collectors.toList());

	}

}
