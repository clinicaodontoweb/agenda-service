package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_AGENDA")
public class Agenda implements Serializable {

	private static final long serialVersionUID = -136404003004523012L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idAgenda;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_PROFISSIONAL")
	private Dentista dentista;

	public Agenda() {}
	
	public Agenda(Long idAgenda, Dentista dentista){
		this.idAgenda = idAgenda;
		this.dentista = dentista;
	}
	
	public Long getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Long idAgenda) {
		this.idAgenda = idAgenda;
	}

	public Dentista getProfissional() {
		return dentista;
	}

	public void setProfissional(Dentista dentista) {
		this.dentista = dentista;
	}

}
