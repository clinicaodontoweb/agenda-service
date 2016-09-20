package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import com.odontoweb.microservice.impl.model.Estado;

public class CidadeRequest implements Serializable {

	private static final long serialVersionUID = 7823889884302590018L;

	private Long idCidade;
	private String nome;
	private Estado estado;

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
