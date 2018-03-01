package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_REDE_SOCIAL_PACIENTE")
public class RedeSocialPaciente implements Serializable {

	private static final long serialVersionUID = -6367453415406156524L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idRedeSocialPaciente;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_REDE_SOCIAL")
	private RedeSocial redeSocial;

	@Column(name = "STR_ENDERECO")
	private String endereco;

	public RedeSocialPaciente(Long idRedeSocialPaciente, RedeSocial redeSocial, String endereco) {
		this.idRedeSocialPaciente = idRedeSocialPaciente;
		this.redeSocial = redeSocial;
		this.endereco = endereco;
	}

	public RedeSocialPaciente() {
	}

	public Long getIdRedeSocialPaciente() {
		return idRedeSocialPaciente;
	}

	public void setIdRedeSocialPaciente(Long idRedeSocialPaciente) {
		this.idRedeSocialPaciente = idRedeSocialPaciente;
	}

	public RedeSocial getRedeSocial() {
		return redeSocial;
	}

	public void setRedeSocial(RedeSocial redeSocial) {
		this.redeSocial = redeSocial;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "RedeSocialPaciente [id=" + idRedeSocialPaciente + ", redeSocial=" + redeSocial + ", endereco="
				+ endereco + "]";
	}
}
