package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class BairroResponse implements Serializable {

	private static final long serialVersionUID = 1582101913813759874L;

	private Long idBairro;
	private String nome;

	public BairroResponse() {
	}

	public BairroResponse(Long idBairro, String nome) {
		this.idBairro = idBairro;
		this.nome = nome;
	}

	public Long getIdBairro() {
		return idBairro;
	}

	public void setIdBairro(Long idBairro) {
		this.idBairro = idBairro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
