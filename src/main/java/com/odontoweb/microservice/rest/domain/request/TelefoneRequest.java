package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class TelefoneRequest implements Serializable {

	private static final long serialVersionUID = -8017936722048406458L;

	private Long idTelefone;

	@NotNull(message = "Número é obrigatório")
	private Integer numero;

	@NotNull(message = "DDD é obrigatório")
	private Integer ddd;

	@NotNull(message = "Tipo de Telefone é obrigatório")
	private String tipoTelefone;

	private Boolean principal;

	private String nome;

	public TelefoneRequest() {
	}

	public TelefoneRequest(Long idTelefone, Integer numero, Integer ddd, String tipoTelefone, Boolean principal,
			String nome) {
		this.idTelefone = idTelefone;
		this.numero = numero;
		this.ddd = ddd;
		this.tipoTelefone = tipoTelefone;
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
