package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import com.odontoweb.microservice.impl.model.Sigla;

public class EstadoRequest implements Serializable {

	private static final long serialVersionUID = -5930564505816279905L;

	private Long idEstado;
	private String nome;
	private Sigla sigla;

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
