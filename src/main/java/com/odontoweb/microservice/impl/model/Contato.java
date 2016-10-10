package com.odontoweb.microservice.impl.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_CONTATO")
public class Contato implements Serializable {

	private static final long serialVersionUID = -629010714259641248L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContato;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_CONTATO")
	private List<Telefone> telefones;

	@Column(name = "STR_EMAIL")
	private String email;
	
	public Contato() {}
	
	public Contato(Long idContato, List<Telefone> telefones, String email) {
		this.idContato = idContato; 
		this.telefones = telefones; 
		this.email = email;
	}
 
	public Long getIdContato() {
		return idContato;
	}

	public void setIdContato(Long idContato) {
		this.idContato = idContato;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contato [id=" + idContato + ", email=" + email + "]";
	}

}
