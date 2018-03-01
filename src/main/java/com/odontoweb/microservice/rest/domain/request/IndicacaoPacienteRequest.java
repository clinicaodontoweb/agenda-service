package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

public class IndicacaoPacienteRequest implements Serializable {

	private static final long serialVersionUID = -2811469366725438029L;

	private Long idIndicacaoPaciente;
	private IndicacaoRequest indicacao;
	private String nome;

	public IndicacaoPacienteRequest(Long idIndicacaoPaciente, IndicacaoRequest indicacao, String nome) {
		this.idIndicacaoPaciente = idIndicacaoPaciente;
		this.indicacao = indicacao;
		this.nome = nome;
	}

	public IndicacaoPacienteRequest() {
	}

	public Long getIdIndicacaoPaciente() {
		return idIndicacaoPaciente;
	}

	public void setIdIndicacaoPaciente(Long idIndicacaoPaciente) {
		this.idIndicacaoPaciente = idIndicacaoPaciente;
	}

	public IndicacaoRequest getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(IndicacaoRequest indicacao) {
		this.indicacao = indicacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
