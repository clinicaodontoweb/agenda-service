package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class EstadoResponse implements Serializable {

	private static final long serialVersionUID = -9070160270916506194L;

	private Long idEstado;
	private String nome;
	private SiglaResponse siglaResponse;

	public EstadoResponse() {
	}

	public EstadoResponse(Long idEstado, String nome, SiglaResponse siglaResponse) {
		this.idEstado = idEstado;
		this.nome = nome;
		this.siglaResponse = siglaResponse;
	}

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public SiglaResponse getSiglaResponse() {
		return siglaResponse;
	}

	public void setSiglaResponse(SiglaResponse siglaResponse) {
		this.siglaResponse = siglaResponse;
	}

}
