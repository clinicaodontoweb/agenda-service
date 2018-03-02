package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class EnderecoResponse implements Serializable {

	private static final long serialVersionUID = -2325057475478702393L;

	private Long idEndereco;
	private String endereco;
	private CepResponse cep;
	private String pontoReferencia;
	private CidadeResponse cidade;
	private BairroResponse bairro;
	private Integer numero;
	private String complemento;

	public EnderecoResponse() {
	}

	public EnderecoResponse(Long idEndereco, String endereco, CepResponse cep, String pontoReferencia,
			CidadeResponse cidade, BairroResponse bairro, Integer numero, String complemento) {
		this.idEndereco = idEndereco;
		this.endereco = endereco;
		this.cep = cep;
		this.pontoReferencia = pontoReferencia;
		this.cidade = cidade;
		this.bairro = bairro;
		this.numero = numero;
		this.complemento = complemento;
	}

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

	public CepResponse getCep() {
		return cep;
	}

	public void setCep(CepResponse cep) {
		this.cep = cep;
	}

	public CidadeResponse getCidade() {
		return cidade;
	}

	public void setCidade(CidadeResponse cidade) {
		this.cidade = cidade;
	}

	public BairroResponse getBairro() {
		return bairro;
	}

	public void setBairro(BairroResponse bairro) {
		this.bairro = bairro;
	}

}
