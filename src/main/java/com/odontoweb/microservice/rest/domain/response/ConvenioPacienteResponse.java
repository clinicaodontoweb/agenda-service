package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class ConvenioPacienteResponse implements Serializable {

	private static final long serialVersionUID = -7970393148403410568L;

	private Long idConvenioPaciente;
	private ConvenioResponse convenio;
	private String numero;
	private String titularConvenio;

	public ConvenioPacienteResponse(Long idConvenioPaciente, ConvenioResponse convenio, String numero,
			String titularConvenio) {
		this.idConvenioPaciente = idConvenioPaciente;
		this.convenio = convenio;
		this.numero = numero;
		this.titularConvenio = titularConvenio;
	}

	public ConvenioPacienteResponse() {
	}

	public Long getIdConvenioPaciente() {
		return idConvenioPaciente;
	}

	public void setIdConvenioPaciente(Long idConvenioPaciente) {
		this.idConvenioPaciente = idConvenioPaciente;
	}

	public ConvenioResponse getConvenio() {
		return convenio;
	}

	public void setConvenio(ConvenioResponse convenio) {
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
