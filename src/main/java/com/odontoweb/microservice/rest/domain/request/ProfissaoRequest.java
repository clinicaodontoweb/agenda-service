package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

public class ProfissaoRequest implements Serializable {

	private static final long serialVersionUID = 3593316855837310683L;

	private Long idProfissao;
	private String nome;

	public ProfissaoRequest(Long idProfissao, String nome) {
		this.idProfissao = idProfissao;
		this.nome = nome;
	}

	public ProfissaoRequest() {
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
