package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Telefone;
import com.odontoweb.microservice.impl.model.enums.TipoTelefone;
import com.odontoweb.microservice.rest.domain.request.TelefoneRequest;
import com.odontoweb.microservice.rest.domain.response.TelefoneResponse;

public class TelefoneBinder implements Serializable {

	private static final long serialVersionUID = -8147254841507563412L;

	public Telefone requestToModel(TelefoneRequest telefoneRequest) {
		return new Telefone(telefoneRequest.getIdTelefone(), telefoneRequest.getNumero(), telefoneRequest.getDdd(),
				TipoTelefone.valueOf(telefoneRequest.getTipoTelefone().toUpperCase()), telefoneRequest.getPrincipal(),
				telefoneRequest.getNome());
	}

	public TelefoneResponse modelToResponse(Telefone telefone) {
		return new TelefoneResponse(telefone.getIdTelefone(), telefone.getNumero(), telefone.getDdd(),
				new EnumerationBinder().enumToResponse(telefone.getTipoTelefone()), telefone.getPrincipal(),
				telefone.getNome());
	}

	public List<TelefoneResponse> modelToListResponse(List<Telefone> telefones) {
		if (telefones == null)
			return null;
		return telefones.stream().filter(Objects::nonNull).map(telefone -> modelToResponse(telefone))
				.collect(Collectors.toList());

	}

	public List<Telefone> requestToListModel(List<TelefoneRequest> telefones) {
		if (telefones == null)
			return null;
		return telefones.stream().filter(Objects::nonNull).map(telefone -> requestToModel(telefone))
				.collect(Collectors.toList());
	}

}
