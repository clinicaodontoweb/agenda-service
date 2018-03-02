package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class EnderecoRequest implements Serializable {

	private static final long serialVersionUID = -3343181448308864937L;

	private Long idEndereco;

	@NotNull(message = "Endereço é obrigatório!")
	private String endereco;

	@NotNull(message = "Cep é obrigatório!")
	private CepRequest cep;

	private String pontoReferencia;

	@NotNull(message = "Cidade é obrigatório!")
	private CidadeRequest cidade;

	@NotNull(message = "Bairro é obrigatório!")
	private BairroRequest bairro;

	@NotNull(message = "Número é obrigatório!")
	private Integer numero;

	private String complemento;

	public Long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getPontoReferencia() {
		return pontoReferencia;
	}

	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public CepRequest getCep() {
		return cep;
	}

	public void setCep(CepRequest cep) {
		this.cep = cep;
	}

	public CidadeRequest getCidade() {
		return cidade;
	}

	public void setCidade(CidadeRequest cidade) {
		this.cidade = cidade;
	}

	public BairroRequest getBairro() {
		return bairro;
	}

	public void setBairro(BairroRequest bairro) {
		this.bairro = bairro;
	}

}
