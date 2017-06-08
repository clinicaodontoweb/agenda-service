package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

import com.odontoweb.microservice.impl.model.enums.Genero;

public class ProfissionalResponse implements Serializable {

	private static final long serialVersionUID = -1205176944035282783L;

	private Long idProfissional;
	private String nome;
	private ContatoResponse contatoResponse;
	private Genero genero;
	private String conselho;
	private String registro;
	private String codigoBrasileiroOcupacao;

	public ProfissionalResponse() {
	}

	public ProfissionalResponse(Long idProfissional, String nome, ContatoResponse contatoResponse, Genero genero,
			String conselho, String registro, String codigoBrasileiroOcupacao) {
		this.idProfissional = idProfissional;
		this.nome = nome;
		this.contatoResponse = contatoResponse;
		this.genero = genero;
		this.conselho = conselho;
		this.registro = registro;
		this.codigoBrasileiroOcupacao = codigoBrasileiroOcupacao;
	}

	public Long getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(Long idProfissional) {
		this.idProfissional = idProfissional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ContatoResponse getContatoResponse() {
		return contatoResponse;
	}

	public void setContatoResponse(ContatoResponse contatoResponse) {
		this.contatoResponse = contatoResponse;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getConselho() {
		return conselho;
	}

	public void setConselho(String conselho) {
		this.conselho = conselho;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getCodigoBrasileiroOcupacao() {
		return codigoBrasileiroOcupacao;
	}

	public void setCodigoBrasileiroOcupacao(String codigoBrasileiroOcupacao) {
		this.codigoBrasileiroOcupacao = codigoBrasileiroOcupacao;
	}

}
