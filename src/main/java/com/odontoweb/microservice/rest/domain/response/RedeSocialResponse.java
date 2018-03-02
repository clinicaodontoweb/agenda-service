package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class RedeSocialResponse implements Serializable {

	private static final long serialVersionUID = 1909405514983227509L;

	private Long idRedeSocial;
	private String nome;

	public RedeSocialResponse(Long idRedeSocial, String nome) {
		this.idRedeSocial = idRedeSocial;
		this.nome = nome;
	}

	public RedeSocialResponse() {
	}

	public Long getIdRedeSocial() {
		return idRedeSocial;
	}

	public void setIdRedeSocial(Long idRedeSocial) {
		this.idRedeSocial = idRedeSocial;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
