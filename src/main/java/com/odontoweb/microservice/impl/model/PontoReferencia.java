package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PontoReferencia implements Serializable {

	private static final long serialVersionUID = -2515264704394789193L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ponto_referencia")
	private Long idPontoReferencia;

	@Column(name = "descricao")
	private String descricao;

	public Long getIdPontoReferencia() {
		return idPontoReferencia;
	}

	public void setIdPontoReferencia(Long idPontoReferencia) {
		this.idPontoReferencia = idPontoReferencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
