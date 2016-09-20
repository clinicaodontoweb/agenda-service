package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_TIPO_CONSULTA")
public class TipoConsulta implements Serializable {

	private static final long serialVersionUID = 8511761043739548695L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idTipoConsulta;

	@Column(name = "STR_NOME")
	private String nome;

	public TipoConsulta() {
	}

	public TipoConsulta(Long idTipoConsulta, String nome) {
		this.idTipoConsulta = idTipoConsulta;
		this.nome = nome;
	}

	public Long getIdTipoConsulta() {
		return idTipoConsulta;
	}

	public void setIdTipoConsulta(Long idTipoConsulta) {
		this.idTipoConsulta = idTipoConsulta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "TipoConsulta [id=" + idTipoConsulta + ", nome=" + nome + "]";
	}

}
