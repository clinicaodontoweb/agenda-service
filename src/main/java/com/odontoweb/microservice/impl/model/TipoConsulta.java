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

	@Column(name = "STR_COR_PRIMARIA")
	private String corPrimaria;

	@Column(name = "STR_COR_SECUNDARIA")
	private String corSecundaria;

	public TipoConsulta() {
	}

	public TipoConsulta(Long idTipoConsulta, String nome, String corPrimaria, String corSecundaria) {
		this.idTipoConsulta = idTipoConsulta;
		this.nome = nome;
		this.corPrimaria = corPrimaria;
		this.corSecundaria = corSecundaria;
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

	public String getCorPrimaria() {
		return corPrimaria;
	}

	public void setCorPrimaria(String corPrimaria) {
		this.corPrimaria = corPrimaria;
	}

	public String getCorSecundaria() {
		return corSecundaria;
	}

	public void setCorSecundaria(String corSecundaria) {
		this.corSecundaria = corSecundaria;
	}

	@Override
	public String toString() {
		return "TipoConsulta [id=" + idTipoConsulta + ", nome=" + nome + "]";
	}

}
