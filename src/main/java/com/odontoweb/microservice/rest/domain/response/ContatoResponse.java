package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;
import java.util.List;

public class ContatoResponse implements Serializable{

	private static final long serialVersionUID = 6871120103197541109L;
	
	private Long idContato;
	private List<TelefoneResponse> telefones;
	private String email;

	public ContatoResponse(Long idContato, List<TelefoneResponse> telefones, String email) {
		this.idContato = idContato;
		this.telefones = telefones;
		this.email = email;
	}

	public ContatoResponse() {
	}

	public Long getIdContato() {
		return idContato;
	}

	public void setIdContato(Long idContato) {
		this.idContato = idContato;
	}

	public List<TelefoneResponse> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<TelefoneResponse> telefones) {
		this.telefones = telefones;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
