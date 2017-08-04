package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class DentistaRequest implements Serializable {

	private static final long serialVersionUID = -5217785988080284220L;

	private Long idDentista;

	@NotNull(message = "Nome é obrigatório!")
	private String nome;

	@NotNull(message = "É obrigatório inserir um contato!")
	private ContatoRequest contatoRequest;

	@NotNull(message = "Gênero é obrigatório!")
	private String genero;

	@NotNull(message = "Conselho é obrigatório!")
	private String conselho;

	@NotNull(message = "Registro é obrigatório!")
	private String registro;

	private String codigoBrasileiroOcupacao;

	public Long getIdDentista() {
		return idDentista;
	}

	public void setIdDentista(Long idDentista) {
		this.idDentista = idDentista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ContatoRequest getContatoRequest() {
		return contatoRequest;
	}

	public void setContatoRequest(ContatoRequest contatoRequest) {
		this.contatoRequest = contatoRequest;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
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
