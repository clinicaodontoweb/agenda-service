package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class TelefoneResponse implements Serializable {

	private static final long serialVersionUID = 1502274284284683154L;

	private Long idTelefone;
	private Integer numero;
	private Integer ddd;
	private String tipoTelefone;
	private Boolean principal;
	private String nome;

	public TelefoneResponse() {
	}

	public TelefoneResponse(Long idTelefone, Integer numero, Integer ddd, TipoTelefoneResponse tipoTelefoneResponse,
			Boolean principal, String nome) {
		this.idTelefone = idTelefone;
		this.numero = numero;
		this.ddd = ddd;
		this.tipoTelefone = tipoTelefoneResponse.getTipoTelefone();
		this.principal = principal;
		this.nome = nome;
	}

	public Long getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(Long idTelefone) {
		this.idTelefone = idTelefone;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public String getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public Boolean getPrincipal() {
		return principal;
	}

	public void setPrincipal(Boolean principal) {
		this.principal = principal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
