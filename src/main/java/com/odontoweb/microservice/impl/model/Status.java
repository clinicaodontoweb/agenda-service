package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_STATUS")
public class Status implements Serializable {

	private static final long serialVersionUID = 7298936665021640988L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idStatus;

	@Column(name = "STR_NOME")
	private String nome;

	@Column(name = "STR_COR")
	private String cor;

	public Status() {
	}

	public Status(Long idStatus, String nome, String cor) {
		this.idStatus = idStatus;
		this.nome = nome;
		this.cor = cor;
	}

	public Long getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Long idStatus) {
		this.idStatus = idStatus;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
