package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class EstadoResponse implements Serializable {

	private static final long serialVersionUID = -9070160270916506194L;

	private Long idEstado;
	private String nome;
	private SiglaResponse sigla;

	public EstadoResponse() {
	}

	public EstadoResponse(Long idEstado, String nome, SiglaResponse sigla) {
		this.idEstado = idEstado;
		this.nome = nome;
		this.sigla = sigla;
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

	public SiglaResponse getSigla() {
		return sigla;
	}

	public void setSigla(SiglaResponse sigla) {
		this.sigla = sigla;
	}

}
