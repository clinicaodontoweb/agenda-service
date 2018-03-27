package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_CONVENIO_PACIENTE")
public class ConvenioPaciente implements Serializable {

	private static final long serialVersionUID = 2407253827836984979L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idConvenioPaciente;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_CONVENIO")
	private Convenio convenio;

	@Column(name = "STR_NUMERO")
	private String numero;

	@Column(name = "STR_TITULAR_CONVENIO")
	private String titularConvenio;

	public ConvenioPaciente(Long idConvenioPaciente, Convenio convenio, String numero, String titularConvenio) {
		this.idConvenioPaciente = idConvenioPaciente;
		this.convenio = convenio;
		this.numero = numero;
		this.titularConvenio = titularConvenio;
	}

	public ConvenioPaciente() {
	}

	public Long getIdConvenioPaciente() {
		return idConvenioPaciente;
	}

	public void setIdConvenioPaciente(Long idConvenioPaciente) {
		this.idConvenioPaciente = idConvenioPaciente;
	}

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
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

	@Override
	public String toString() {
		return "ConvenioPaciente [id=" + idConvenioPaciente + ", convenio=" + convenio + ", numero=" + numero
				+ ", titularConvenio=" + titularConvenio + "]";
	}

}
