package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class TipoConsultaResponse implements Serializable {

	private static final long serialVersionUID = 965778435919501808L;

	private Long idTipoConsulta;
	private String nome;
	private String cor;

	public TipoConsultaResponse() {
	}

	public TipoConsultaResponse(Long idTipoConsulta, String nome, String cor) {
		this.idTipoConsulta = idTipoConsulta;
		this.nome = nome;
	}

	public Long getIdTipoConsulta() {
		return idTipoConsulta;
	}

	public void setIdTipoConsulta(Long idTipoConsulta) {
		this.idTipoConsulta = idTipoConsulta;
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
