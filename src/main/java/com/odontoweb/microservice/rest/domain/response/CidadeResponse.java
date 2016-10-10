package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class CidadeResponse implements Serializable {

	private static final long serialVersionUID = -5156138853416811208L;

	private Long idCidade;
	private String nome;
	private EstadoResponse estadoResponse;

	public CidadeResponse() {
	}

	public CidadeResponse(Long idCidade, String nome, EstadoResponse estadoResponse) {
		this.idCidade = idCidade;
		this.nome = nome;
		this.estadoResponse = estadoResponse;
	}

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

	public EstadoResponse getEstadoResponse() {
		return estadoResponse;
	}

	public void setEstadoResponse(EstadoResponse estadoResponse) {
		this.estadoResponse = estadoResponse;
	}

}
