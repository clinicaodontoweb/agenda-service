package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class TipoConsultaResponse implements Serializable {

	private static final long serialVersionUID = 965778435919501808L;

	private Long idTipoConsulta;
	private String nome;
	private String corPrimaria;
	private String corSecundaria;

	public TipoConsultaResponse() {
	}

	public TipoConsultaResponse(Long idTipoConsulta, String nome, String corPrimaria, String corSecundaria) {
		this.idTipoConsulta = idTipoConsulta;
		this.nome = nome;
		this.corPrimaria = corPrimaria;
		this.corSecundaria = corSecundaria;
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

	public String getCorPrimaria() {
		return corPrimaria;
	}

	public void setCorPrimaria(String corPrimaria) {
		this.corPrimaria = corPrimaria;
	}

	public String getCorSecundaria() {
		return corSecundaria;
	}

	public void setCorSecundaria(String corSecundaria) {
		this.corSecundaria = corSecundaria;
	}

}
