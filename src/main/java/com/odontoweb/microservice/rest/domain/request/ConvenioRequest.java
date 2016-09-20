package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import com.odontoweb.microservice.impl.model.Contato;
import com.odontoweb.microservice.impl.model.Endereco;

public class ConvenioRequest implements Serializable {

	private static final long serialVersionUID = -6143810927663734767L;

	private Long idConvenio;
	private String nome;
	private String cnpj;
	private String razaoSocial;
	private Endereco endereco;
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
}
