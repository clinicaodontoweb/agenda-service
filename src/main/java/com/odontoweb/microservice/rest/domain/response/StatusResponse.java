package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class StatusResponse implements Serializable {

	private static final long serialVersionUID = 965778435919501808L;

	private Long idStatus;
	private String nome;
	private String cor;

	public StatusResponse() {
	}

	public StatusResponse(Long idStatus, String nome, String cor) {
		this.idStatus = idStatus;
		this.nome = nome;
		this.cor = cor;
	}

	public Long getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Long idStatus) {
		this.idStatus = idStatus;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
