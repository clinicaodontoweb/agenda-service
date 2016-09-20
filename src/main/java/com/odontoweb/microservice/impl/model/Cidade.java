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
@Table(name = "TBL_CIDADE")
public class Cidade implements Serializable {

	private static final long serialVersionUID = 7165809300277589933L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idCidade;

	@Column(name = "STR_NOME")
	private String nome;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_ESTADO")
	private Estado estado;
	
	public Cidade() {
	}
	
	public Cidade(Long idCidade, String nome, Estado estado) {	
		this.idCidade = idCidade;
		this.nome = nome;
		this.estado = estado;
	}

	public Long getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(Long idCidade) {
		this.idCidade = idCidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cidade [id="+idCidade+", nome="+nome+", estado="+estado+"]";
	}
	
}
