package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class CidadeRequest implements Serializable {

	private static final long serialVersionUID = 7823889884302590018L;

	private Long idCidade;

	@NotNull(message = "Nome da cidade obrigatório!")
	private String nome;

	@NotNull(message = "Estado é obrigatório!")
	private EstadoRequest estadoRequest;

	public Long getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(Long idCidade) {
		this.idCidade = idCidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EstadoRequest getEstadoRequest() {
		return estadoRequest;
	}

	public void setEstadoRequest(EstadoRequest estadoRequest) {
		this.estadoRequest = estadoRequest;
	}

}
