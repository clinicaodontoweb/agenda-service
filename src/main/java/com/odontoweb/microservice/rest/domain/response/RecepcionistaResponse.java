package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;
import java.util.List;

public class RecepcionistaResponse implements Serializable {

	private static final long serialVersionUID = 8545669468435865956L;

	private Long idRecepcionista;
	private UsuarioClinicaResponse usuarioClinicaResponse;
	private String nome;
	private ContatoResponse contatoResponse;
	private GeneroResponse generoResponse;
	private List<DentistaResponse> dentistasResponse;

	public RecepcionistaResponse(Long idRecepcionista, UsuarioClinicaResponse usuarioClinicaResponse, String nome,
			ContatoResponse contatoResponse, GeneroResponse generoResponse, List<DentistaResponse> dentistasResponse) {
		this.idRecepcionista = idRecepcionista;
		this.usuarioClinicaResponse = usuarioClinicaResponse;
		this.nome = nome;
		this.contatoResponse = contatoResponse;
		this.generoResponse = generoResponse;
		this.dentistasResponse = dentistasResponse;
	}

	public RecepcionistaResponse() {

	}

	public Long getIdRecepcionista() {
		return idRecepcionista;
	}

	public void setIdRecepcionista(Long idRecepcionista) {
		this.idRecepcionista = idRecepcionista;
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

	public GeneroResponse getGeneroResponse() {
		return generoResponse;
	}

	public void setGeneroResponse(GeneroResponse generoResponse) {
		this.generoResponse = generoResponse;
	}

	public List<DentistaResponse> getDentistasResponse() {
		return dentistasResponse;
	}

	public void setDentistasResponse(List<DentistaResponse> dentistasResponse) {
		this.dentistasResponse = dentistasResponse;
	}

}
