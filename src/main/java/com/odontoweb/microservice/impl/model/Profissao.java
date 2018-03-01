package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_PROFISSAO")
public class Profissao implements Serializable {

	private static final long serialVersionUID = -5029839925306133446L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idProfissao;

	@Column(name = "STR_NOME")
	private String nome;

	public Profissao(Long idProfissao, String nome) {
		this.idProfissao = idProfissao;
		this.nome = nome;
	}

	public Profissao() {
	}

	public Long getIdProfissao() {
		return idProfissao;
	}

	public void setIdProfissao(Long idProfissao) {
		this.idProfissao = idProfissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Profissao [id=" + idProfissao + ", nome=" + nome + "]";
	}

}
