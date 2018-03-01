package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_REDE_SOCIAL")
public class RedeSocial implements Serializable {

	private static final long serialVersionUID = -1537804394836197048L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idRedeSocial;

	@Column(name = "STR_NOME")
	private String nome;

	public RedeSocial(Long idRedeSocial, String nome) {
		this.idRedeSocial = idRedeSocial;
		this.nome = nome;
	}

	public RedeSocial() {
	}

	public Long getIdRedeSocial() {
		return idRedeSocial;
	}

	public void setIdRedeSocial(Long idRedeSocial) {
		this.idRedeSocial = idRedeSocial;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "RedeSocial [id=" + idRedeSocial + ", nome=" + nome + "]";
	}

}
