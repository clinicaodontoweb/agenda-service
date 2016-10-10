package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

import com.odontoweb.microservice.impl.model.enums.TipoTelefone;

public class TelefoneResponse implements Serializable {

	private static final long serialVersionUID = 1502274284284683154L;

	private Long idTelefone;
	private Integer numero;
	private Integer ddd;
	private TipoTelefone tipoTelefone;

	public TelefoneResponse() {
	}

	public TelefoneResponse(Long idTelefone, Integer numero, Integer ddd, TipoTelefone tipoTelefone) {
		this.idTelefone = idTelefone;
		this.numero = numero;
		this.ddd = ddd;
		this.tipoTelefone = tipoTelefone;
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

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

}
