package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class DentistaResponse implements Serializable {

	private static final long serialVersionUID = -1205176944035282783L;

	private Long idDentista;
	private UsuarioClinicaResponse usuarioClinicaResponse;
	private String nome;
	private ContatoResponse contatoResponse;
	private String genero;
	private String conselho;
	private String registro;
	private String codigoBrasileiroOcupacao;

	public DentistaResponse() {
	}

	public DentistaResponse(Long idDentista, UsuarioClinicaResponse usuarioClinicaResponse, String nome,
			ContatoResponse contatoResponse, GeneroResponse generoResponse, String conselho, String registro,
			String codigoBrasileiroOcupacao) {
		this.idDentista = idDentista;
		this.usuarioClinicaResponse = usuarioClinicaResponse;
		this.nome = nome;
		this.contatoResponse = contatoResponse;
		this.genero = generoResponse.getGenero();
		this.conselho = conselho;
		this.registro = registro;
		this.codigoBrasileiroOcupacao = codigoBrasileiroOcupacao;
	}

	public Long getIdDentista() {
		return idDentista;
	}

	public void setIdDentista(Long idDentista) {
		this.idDentista = idDentista;
	}

	public UsuarioClinicaResponse getUsuarioClinicaResponse() {
		return usuarioClinicaResponse;
	}

	public void setUsuarioClinicaResponse(UsuarioClinicaResponse usuarioClinicaResponse) {
		this.usuarioClinicaResponse = usuarioClinicaResponse;
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
