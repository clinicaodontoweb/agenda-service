package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class EnderecoRequest implements Serializable {

	private static final long serialVersionUID = -3343181448308864937L;

	private Long idEndereco;

	@NotNull(message = "Endereço é obrigatório!")
	private String endereco;

	@NotNull(message = "Cep é obrigatório!")
	private CepRequest cepRequest;

	private String pontoReferencia;

	@NotNull(message = "Cidade é obrigatório!")
	private CidadeRequest cidadeRequest;

	@NotNull(message = "Bairro é obrigatório!")
	private BairroRequest bairroRequest;

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

	public CepRequest getCepRequest() {
		return cepRequest;
	}

	public void setCepRequest(CepRequest cepRequest) {
		this.cepRequest = cepRequest;
	}

	public String getPontoReferencia() {
		return pontoReferencia;
	}

	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

	public CidadeRequest getCidadeRequest() {
		return cidadeRequest;
	}

	public void setCidadeRequest(CidadeRequest cidadeRequest) {
		this.cidadeRequest = cidadeRequest;
	}

	public BairroRequest getBairroRequest() {
		return bairroRequest;
	}

	public void setBairroRequest(BairroRequest bairroRequest) {
		this.bairroRequest = bairroRequest;
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

}
