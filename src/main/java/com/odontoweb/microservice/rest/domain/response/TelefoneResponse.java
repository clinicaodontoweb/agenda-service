package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class TelefoneResponse implements Serializable {

	private static final long serialVersionUID = 1502274284284683154L;

	private Long idTelefone;
	private Integer numero;
	private Integer ddd;
	private TipoTelefoneResponse tipoTelefoneResponse;

	public TelefoneResponse() {
	}

	public TelefoneResponse(Long idTelefone, Integer numero, Integer ddd, TipoTelefoneResponse tipoTelefoneResponse) {
		this.idTelefone = idTelefone;
		this.numero = numero;
		this.ddd = ddd;
		this.tipoTelefoneResponse = tipoTelefoneResponse;
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

	public TipoTelefoneResponse getTipoTelefoneResponse() {
		return tipoTelefoneResponse;
	}

	public void setTipoTelefoneResponse(TipoTelefoneResponse tipoTelefoneResponse) {
		this.tipoTelefoneResponse = tipoTelefoneResponse;
	}

}
