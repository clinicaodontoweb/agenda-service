package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

public class RedeSocialRequest implements Serializable {

	private static final long serialVersionUID = -6208329137006430189L;

	private Long idRedeSocial;
	private String nome;

	public RedeSocialRequest(Long idRedeSocial, String nome) {
		this.idRedeSocial = idRedeSocial;
		this.nome = nome;
	}

	public RedeSocialRequest() {
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
