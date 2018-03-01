package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class ProfissaoResponse implements Serializable {

	private static final long serialVersionUID = -9166182280488590139L;

	private Long idProfissao;
	private String nome;

	public ProfissaoResponse(Long idProfissao, String nome) {
		this.idProfissao = idProfissao;
		this.nome = nome;
	}

	public ProfissaoResponse() {
	}

	public Long getIdProfissao() {
		return idProfissao;
	}

	public void setIdProfissao(Long idProfissao) {
		this.idProfissao = idProfissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
