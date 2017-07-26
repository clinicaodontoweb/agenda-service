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

	@NotNull(message = "É obrigatório inserir um contato!")
	private ContatoRequest contatoRequest;

	@NotNull(message = "Gênero é obrigatório!")
	private GeneroRequest generoRequest;

	private List<DentistaRequest> dentistasRequest;

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

	public GeneroRequest getGeneroRequest() {
		return generoRequest;
	}

	public void setGeneroRequest(GeneroRequest generoRequest) {
		this.generoRequest = generoRequest;
	}

	public List<DentistaRequest> getDentistasRequest() {
		return dentistasRequest;
	}

	public void setDentistasRequest(List<DentistaRequest> dentistasRequest) {
		this.dentistasRequest = dentistasRequest;
	}

}
