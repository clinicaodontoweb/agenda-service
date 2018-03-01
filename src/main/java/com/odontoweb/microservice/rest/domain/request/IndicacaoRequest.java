package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

public class IndicacaoRequest implements Serializable {

	private static final long serialVersionUID = -5195143023808365702L;

	private Long idIndicacao;
	private String nome;

	public IndicacaoRequest(Long idIndicacao, String nome) {
		this.idIndicacao = idIndicacao;
		this.nome = nome;
	}

	public IndicacaoRequest() {
	}

	public Long getIdIndicacao() {
		return idIndicacao;
	}

	public void setIdIndicacao(Long idIndicacao) {
		this.idIndicacao = idIndicacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
