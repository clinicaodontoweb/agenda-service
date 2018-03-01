package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class IndicacaoPacienteResponse implements Serializable {

	private static final long serialVersionUID = 5684199990653329075L;

	private Long idIndicacaoPaciente;
	private IndicacaoResponse indicacao;
	private String nome;

	public IndicacaoPacienteResponse(Long idIndicacaoPaciente, IndicacaoResponse indicacao, String nome) {
		this.idIndicacaoPaciente = idIndicacaoPaciente;
		this.indicacao = indicacao;
		this.nome = nome;
	}

	public IndicacaoPacienteResponse() {
	}

	public Long getIdIndicacaoPaciente() {
		return idIndicacaoPaciente;
	}

	public void setIdIndicacaoPaciente(Long idIndicacaoPaciente) {
		this.idIndicacaoPaciente = idIndicacaoPaciente;
	}

	public IndicacaoResponse getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(IndicacaoResponse indicacao) {
		this.indicacao = indicacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
