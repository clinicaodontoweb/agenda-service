package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.odontoweb.microservice.impl.model.enums.TipoTelefone;

@Entity
@Table(name = "TBL_TELEFONE")
public class Telefone implements Serializable {

	private static final long serialVersionUID = -449952274078352247L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_telefone")
	private Long idTelefone;

	@Column(name = "numero")
	private Integer numero;

	@Column(name = "ddd")
	private Integer ddd;

	@Column(name = "tipo_telefone")
	@Enumerated(EnumType.STRING)
	private TipoTelefone tipoTelefone;

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

	@Override
	public String toString() {
		return "Telefone [id=" + idTelefone + ", numero=" + numero + ", ddd=" + ddd + ", tipoTelefone=" + tipoTelefone
				+ "]";
	}

}
