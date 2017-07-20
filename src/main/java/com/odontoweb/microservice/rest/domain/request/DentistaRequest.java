package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.odontoweb.microservice.impl.model.enums.Genero;

public class DentistaRequest implements Serializable {

	private static final long serialVersionUID = -5217785988080284220L;

	private Long idDentista;

	private UsuarioClinicaRequest usuarioClinicaRequest;

	@NotNull(message = "Nome é obrigatório!")
	private String nome;

	@NotNull(message = "É obrigatório inserir um contato!")
	private ContatoRequest contatoRequest;

	@NotNull(message = "Gênero é obrigatório!")
	private Genero genero;

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

	public UsuarioClinicaRequest getUsuarioClinicaRequest() {
		return usuarioClinicaRequest;
	}

	public void setUsuarioClinicaRequest(UsuarioClinicaRequest usuarioClinicaRequest) {
		this.usuarioClinicaRequest = usuarioClinicaRequest;
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
