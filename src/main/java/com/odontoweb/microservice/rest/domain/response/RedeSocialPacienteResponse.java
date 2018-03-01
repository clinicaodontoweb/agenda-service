package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class RedeSocialPacienteResponse implements Serializable {

	private static final long serialVersionUID = -2603084779990955125L;

	private Long idRedeSocialPaciente;
	private RedeSocialResponse redeSocial;
	private String endereco;

	public RedeSocialPacienteResponse(Long idRedeSocialPaciente, RedeSocialResponse redeSocial, String endereco) {
		this.idRedeSocialPaciente = idRedeSocialPaciente;
		this.redeSocial = redeSocial;
		this.endereco = endereco;
	}

	public RedeSocialPacienteResponse() {
	}

	public Long getIdRedeSocialPaciente() {
		return idRedeSocialPaciente;
	}

	public void setIdRedeSocialPaciente(Long idRedeSocialPaciente) {
		this.idRedeSocialPaciente = idRedeSocialPaciente;
	}

	public RedeSocialResponse getRedeSocial() {
		return redeSocial;
	}

	public void setRedeSocial(RedeSocialResponse redeSocial) {
		this.redeSocial = redeSocial;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
