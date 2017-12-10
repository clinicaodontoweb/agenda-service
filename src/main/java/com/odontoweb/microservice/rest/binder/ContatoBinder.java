package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Contato;
import com.odontoweb.microservice.rest.domain.request.ContatoRequest;
import com.odontoweb.microservice.rest.domain.request.TelefoneRequest;
import com.odontoweb.microservice.rest.domain.response.ContatoResponse;

public class ContatoBinder implements Serializable {

	private static final long serialVersionUID = -5791966976344069044L;

	public Contato requestToModel(ContatoRequest contatoRequest) {
		return new Contato(contatoRequest.getIdContato(),
				new TelefoneBinder().requestToListModel(contatoRequest.getTelefones()), contatoRequest.getEmail());
	}

	public Contato requestToModel(Long idContato, String email, List<TelefoneRequest> telefones) {
		return new Contato(idContato, new TelefoneBinder().requestToListModel(telefones), email);
	}
	
	public ContatoResponse modelToResponse(Contato contato) {
		return new ContatoResponse(contato.getIdContato(),
				new TelefoneBinder().modelToListResponse(contato.getTelefones()), contato.getEmail());
	}

	public List<ContatoResponse> modelToListResponse(List<Contato> contatos) {
		if (contatos == null)
			return null;
		return contatos.stream().filter(Objects::nonNull).map(contato -> modelToResponse(contato))
				.collect(Collectors.toList());

	}

}
