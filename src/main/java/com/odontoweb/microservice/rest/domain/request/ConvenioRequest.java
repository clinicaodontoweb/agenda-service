package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class ConvenioRequest implements Serializable {

	private static final long serialVersionUID = -6143810927663734767L;

	private Long idConvenio;

	@NotNull(message = "Nome do convênio é obrigatório!")
	private String nome;

	@NotNull(message = "Cnpj do convênio é obrigatório!")
	private String cnpj;

	@NotNull(message = "Razão social do convênio é obrigatório!")
	private String razaoSocial;

	@NotNull(message = "Endereço é obrigatório!")
	private EnderecoRequest enderecoRequest;

	@NotNull(message = "Contato é obrigatório!")
	private ContatoRequest contatoRequest;

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

	public EnderecoRequest getEnderecoRequest() {
		return enderecoRequest;
	}

	public void setEnderecoRequest(EnderecoRequest enderecoRequest) {
		this.enderecoRequest = enderecoRequest;
	}

	public ContatoRequest getContatoRequest() {
		return contatoRequest;
	}

	public void setContatoRequest(ContatoRequest contatoRequest) {
		this.contatoRequest = contatoRequest;
	}

}
