package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class BairroRequest implements Serializable {

	private static final long serialVersionUID = 436747791286284283L;

	private Long idBairro;

	@NotNull(message = "Nome do bairro obrigatório!")
	private String nome;

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
