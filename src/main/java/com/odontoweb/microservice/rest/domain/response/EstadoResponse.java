package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

import com.odontoweb.microservice.impl.model.Sigla;

public class EstadoResponse implements Serializable {

	private static final long serialVersionUID = -9070160270916506194L;

	private Long idEstado;
	private String nome;
	private Sigla sigla;

	public EstadoResponse() {
	}

	public EstadoResponse(Long idEstado, String nome, Sigla sigla) {
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

	public Sigla getSigla() {
		return sigla;
	}

	public void setSigla(Sigla sigla) {
		this.sigla = sigla;
	}

}
