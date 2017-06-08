package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
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
@Table(name = "TBL_CONVENIO")
public class Convenio implements Serializable {

	private static final long serialVersionUID = 8694950050617050219L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idConvenio;

	@Column(name = "STR_NOME")
	private String nome;

	@Column(name = "STR_CNPJ")
	private String cnpj;

	@Column(name = "STR_RAZAO_SOCIAL")
	private String razaoSocial;

	@OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "FK_ENDERECO")
	private Endereco endereco;

	@OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "FK_CONTATO")
	private Contato contato;

	public Convenio() {
	}

	public Convenio(Long idConvenio, String nome, String cnpj, String razaoSocial, Endereco endereco, Contato contato) {
		this.idConvenio = idConvenio;
		this.nome = nome;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.endereco = endereco;
		this.contato = contato;
	}

	public Long getIdConvenio() {
		return idConvenio;
	}

	public void setIdConvenio(Long idConvenio) {
		this.idConvenio = idConvenio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "Convenio [id=" + idConvenio + ", nome=" + nome + ", cnpj=" + cnpj + ", razaSocial=" + razaoSocial
				+ ", endereco=" + endereco + ", contato=" + contato + "]";
	}

}
