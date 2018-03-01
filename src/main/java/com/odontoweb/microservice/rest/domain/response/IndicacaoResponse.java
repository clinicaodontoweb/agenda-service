package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class IndicacaoResponse implements Serializable {

	private static final long serialVersionUID = -6273592600827327053L;

	private Long idIndicacao;
	private String nome;

	public IndicacaoResponse(Long idIndicacao, String nome) {
		this.idIndicacao = idIndicacao;
		this.nome = nome;
	}

	public IndicacaoResponse() {
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
