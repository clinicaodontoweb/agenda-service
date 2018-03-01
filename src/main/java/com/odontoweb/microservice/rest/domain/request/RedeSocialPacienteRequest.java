package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

public class RedeSocialPacienteRequest implements Serializable {

	private static final long serialVersionUID = 1547275079780422888L;

	private Long idRedeSocialPaciente;
	private RedeSocialRequest redeSocial;
	private String endereco;

	public RedeSocialPacienteRequest(Long idRedeSocialPaciente, RedeSocialRequest redeSocial, String endereco) {
		this.idRedeSocialPaciente = idRedeSocialPaciente;
		this.redeSocial = redeSocial;
		this.endereco = endereco;
	}

	public RedeSocialPacienteRequest() {
	}

	public Long getIdRedeSocialPaciente() {
		return idRedeSocialPaciente;
	}

	public void setIdRedeSocialPaciente(Long idRedeSocialPaciente) {
		this.idRedeSocialPaciente = idRedeSocialPaciente;
	}

	public RedeSocialRequest getRedeSocial() {
		return redeSocial;
	}

	public void setRedeSocial(RedeSocialRequest redeSocial) {
		this.redeSocial = redeSocial;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
