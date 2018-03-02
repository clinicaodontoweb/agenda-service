package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class EstadoRequest implements Serializable {

	private static final long serialVersionUID = -5930564505816279905L;

	private Long idEstado;

	@NotNull(message = "Nome do estado obrigatório!")
	private String nome;

	@NotNull(message = "Sigla do estado obrigatória!")
	private SiglaRequest sigla;

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public SiglaRequest getSigla() {
		return sigla;
	}

	public void setSigla(SiglaRequest sigla) {
		this.sigla = sigla;
	}

}
