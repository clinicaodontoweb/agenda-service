package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_CEP")
public class Cep implements Serializable {

	private static final long serialVersionUID = 3535476443901518609L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idCep;

	@Column(name = "STR_CEP")
	private String cep;

	public Cep() {
	}

	public Cep(Long idCep, String cep) {
		this.idCep = idCep;
		this.cep = cep;
	}

	public Long getIdCep() {
		return idCep;
	}

	public void setIdCep(Long idCep) {
		this.idCep = idCep;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Cep [id= " + idCep + ", cep=" + cep + "]";
	}

}
