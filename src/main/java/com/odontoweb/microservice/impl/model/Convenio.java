package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_CONVENIO")
public class Convenio implements Serializable {

	private static final long serialVersionUID = 8694950050617050219L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_convenio")
	private Long idConvenio;

	@Column(name = "nome")
	private String nome;

	@Column(name = "cnpj")
	private String cnpj;

	@Column(name = "razao_social")
	private String razaoSocial;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_contato")
	private Contato contato;

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
