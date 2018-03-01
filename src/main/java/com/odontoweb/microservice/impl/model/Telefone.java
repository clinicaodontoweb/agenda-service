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
	@Column(name = "ID")
	private Long idTelefone;

	@Column(name = "NUM_NUMERO")
	private Integer numero;

	@Column(name = "NUM_DDD")
	private Integer ddd;

	@Column(name = "STR_TIPO_TELEFONE")
	@Enumerated(EnumType.STRING)
	private TipoTelefone tipoTelefone;

	@Column(name = "BOO_PRINCIPAL")
	private Boolean principal;

	@Column(name = "STR_NOME")
	private String nome;

	public Telefone() {
		this.principal = Boolean.FALSE;
	}

	public Telefone(Long idTelefone, Integer numero, Integer ddd, TipoTelefone tipoTelefone, Boolean principal, String nome) {
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

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public Boolean getPrincipal() {
		return principal;
	}

	public void setPrincipal(Boolean principal) {
		if(principal == null) {
			this.principal = Boolean.FALSE;
		}else {
			this.principal = principal;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Telefone [id=" + idTelefone + ", numero=" + numero + ", ddd=" + ddd + ", tipoTelefone=" + tipoTelefone
				+ ", nome=" + nome +", principal="+principal+"]";
	}

}
