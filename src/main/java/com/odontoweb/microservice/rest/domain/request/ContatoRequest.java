package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

public class ContatoRequest implements Serializable {

	private static final long serialVersionUID = -668475198201992388L;

	private Long idContato;

	@NotNull(message = "Obrigatório pelo menos 1 telefone!")
	private List<TelefoneRequest> telefones;

	@NotNull(message = "Email é obrigatório!")
	private String email;

	public Long getIdContato() {
		return idContato;
	}

	public void setIdContato(Long idContato) {
		this.idContato = idContato;
	}

	public List<TelefoneRequest> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<TelefoneRequest> telefones) {
		this.telefones = telefones;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
