package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class TipoConsultaRequest implements Serializable {

	private static final long serialVersionUID = -1455378347372024359L;

	private Long idTipoConsulta;
	
	@NotNull(message = "Nome é obrigatório!")
	private String nome;

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

}
