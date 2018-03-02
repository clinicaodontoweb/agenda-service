package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Indicacao;
import com.odontoweb.microservice.rest.domain.request.IndicacaoRequest;
import com.odontoweb.microservice.rest.domain.response.IndicacaoResponse;

public class IndicacaoBinder implements Serializable {

	private static final long serialVersionUID = -5368086660917015780L;

	public Indicacao requestToModel(IndicacaoRequest indicacaoRequest) {
		return new Indicacao(indicacaoRequest.getIdIndicacao(), indicacaoRequest.getNome());
	}

	public IndicacaoResponse modelToResponse(Indicacao indicacao) {
		return new IndicacaoResponse(indicacao.getIdIndicacao(), indicacao.getNome());
	}

	public List<IndicacaoResponse> modelToListResponse(List<Indicacao> indicacoes) {
		if (indicacoes == null)
			return null;
		return indicacoes.stream().filter(Objects::nonNull).map(indicacao -> modelToResponse(indicacao))
				.collect(Collectors.toList());

	}

}
