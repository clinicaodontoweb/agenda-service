package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

import com.odontoweb.microservice.impl.model.Estado;

public class CidadeResponse implements Serializable {

	private static final long serialVersionUID = -5156138853416811208L;

	private Long idCidade;
	private String nome;
	private Estado estado;

	public CidadeResponse() {
	}

	public CidadeResponse(Long idCidade, String nome, Estado estado) {
		this.idCidade = idCidade;
		this.nome = nome;
		this.estado = estado;
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

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
