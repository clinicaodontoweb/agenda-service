package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

import com.odontoweb.microservice.impl.model.Contato;
import com.odontoweb.microservice.impl.model.Endereco;

public class ConvenioResponse implements Serializable {

	private static final long serialVersionUID = -5474776367658295233L;

	private Long idConvenio;
	private String nome;
	private String cnpj;
	private String razaoSocial;
	private Endereco endereco;
	private Contato contato;

	public ConvenioResponse() {
	}

	public ConvenioResponse(Long idConvenio, String nome, String cnpj, String razaoSocial, Endereco endereco,
			Contato contato) {
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

}
