package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Endereco;
import com.odontoweb.microservice.rest.domain.request.EnderecoRequest;
import com.odontoweb.microservice.rest.domain.response.EnderecoResponse;

public class EnderecoBinder implements Serializable {

	private static final long serialVersionUID = -891048115909804924L;

	public Endereco requestToModel(EnderecoRequest enderecoRequest) {
		return new Endereco(enderecoRequest.getIdEndereco(), enderecoRequest.getEndereco(),
				new CepBinder().requestToModel(enderecoRequest.getCepRequest()), enderecoRequest.getPontoReferencia(),
				new CidadeBinder().requestToModel(enderecoRequest.getCidadeRequest()),
				new BairroBinder().requestToModel(enderecoRequest.getBairroRequest()), enderecoRequest.getNumero(),
				enderecoRequest.getComplemento());
	}

	public EnderecoResponse modelToResponse(Endereco endereco) {
		return new EnderecoResponse(endereco.getIdEndereco(), endereco.getEndereco(),
				new CepBinder().modelToResponse(endereco.getCep()), endereco.getPontoReferencia(),
				new CidadeBinder().modelToResponse(endereco.getCidade()),
				new BairroBinder().modelToResponse(endereco.getBairro()), endereco.getNumero(),
				endereco.getComplemento());
	}

	public List<EnderecoResponse> modelToListResponse(List<Endereco> enderecos) {
		if (enderecos == null)
			return null;
		return enderecos.stream().filter(Objects::nonNull).map(endereco -> modelToResponse(endereco))
				.collect(Collectors.toList());

	}

}
