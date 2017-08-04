package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

public class RecepcionistaRequest implements Serializable {

	private static final long serialVersionUID = -6226294694573759482L;

	private Long idRecepcionista;

	@NotNull(message = "Nome é obrigatório!")
	private String nome;
	private UsuarioClinicaRequest usuarioClinicaRequest;
	private ContatoRequest contatoRequest;
	private String genero;
	private List<Long> dentistas;

	public Long getIdRecepcionista() {
		return idRecepcionista;
	}

	public void setIdRecepcionista(Long idRecepcionista) {
		this.idRecepcionista = idRecepcionista;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Long> getDentistas() {
		return dentistas;
	}

	public void setDentistas(List<Long> dentistas) {
		this.dentistas = dentistas;
	}

}
