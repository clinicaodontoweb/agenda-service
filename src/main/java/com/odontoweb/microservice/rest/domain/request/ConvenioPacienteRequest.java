package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

public class ConvenioPacienteRequest implements Serializable {

	private static final long serialVersionUID = -8611820894219165019L;

	private Long idConvenioPaciente;
	private Long idConvenio;
	private String numero;
	private String titularConvenio;

	public ConvenioPacienteRequest(Long idConvenioPaciente, Long idConvenio, String numero, String titularConvenio) {
		this.idConvenioPaciente = idConvenioPaciente;
		this.idConvenio = idConvenio;
		this.numero = numero;
		this.titularConvenio = titularConvenio;
	}

	public ConvenioPacienteRequest() {
	}

	public Long getIdConvenioPaciente() {
		return idConvenioPaciente;
	}

	public void setIdConvenioPaciente(Long idConvenioPaciente) {
		this.idConvenioPaciente = idConvenioPaciente;
	}

	public Long getIdConvenio() {
		return idConvenio;
	}

	public void setIdConvenio(Long idConvenio) {
		this.idConvenio = idConvenio;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitularConvenio() {
		return titularConvenio;
	}

	public void setTitularConvenio(String titularConvenio) {
		this.titularConvenio = titularConvenio;
	}
}
