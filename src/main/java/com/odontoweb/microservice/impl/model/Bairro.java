package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_BAIRRO")
public class Bairro implements Serializable {

	private static final long serialVersionUID = -4519130640084136900L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idBairro;

	@Column(name = "STR_NOME")
	private String nome;

	public Bairro() {
	}

	public Bairro(Long idBairro, String nome) {
		this.idBairro = idBairro;
		this.nome = nome;
	}

	public Long getIdBairro() {
		return idBairro;
	}

	public void setIdBairro(Long idBairro) {
		this.idBairro = idBairro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Bairro [id= " + idBairro + ", nome=" + nome + "]";
	}

}
