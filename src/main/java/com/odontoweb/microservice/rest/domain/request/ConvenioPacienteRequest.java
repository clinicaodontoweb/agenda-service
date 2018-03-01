package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

public class ConvenioPacienteRequest implements Serializable {

	private static final long serialVersionUID = -8611820894219165019L;

	private Long idConvenioPaciente;
	private ConvenioRequest convenio;
	private String numero;
	private String titularConvenio;

	public ConvenioPacienteRequest(Long idConvenioPaciente, ConvenioRequest convenio, String numero,
			String titularConvenio) {
		this.idConvenioPaciente = idConvenioPaciente;
		this.convenio = convenio;
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

	public ConvenioRequest getConvenio() {
		return convenio;
	}

	public void setConvenio(ConvenioRequest convenio) {
		this.convenio = convenio;
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
