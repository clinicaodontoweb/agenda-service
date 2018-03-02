package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_INDICACAO")
public class Indicacao implements Serializable {

	private static final long serialVersionUID = 2062842037354474511L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idIndicacao;

	@Column(name = "STR_NOME")
	private String nome;

	public Indicacao(Long idIndicacao, String nome) {
		this.idIndicacao = idIndicacao;
		this.nome = nome;
	}

	public Indicacao() {
	}

	public Long getIdIndicacao() {
		return idIndicacao;
	}

	public void setIdIndicacao(Long idIndicacao) {
		this.idIndicacao = idIndicacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Indicacao [id=" + idIndicacao + ", nome=" + nome + "]";
	}

}
