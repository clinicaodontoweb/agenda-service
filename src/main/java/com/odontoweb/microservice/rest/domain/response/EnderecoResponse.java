package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

public class EnderecoResponse implements Serializable {

	private static final long serialVersionUID = -2325057475478702393L;
	
	private Long idEndereco;
	private String endereco;
	private CepResponse cepResponse;
	private String pontoReferencia;
	private CidadeResponse cidadeResponse;
	private BairroResponse bairroResponse;
	private Integer numero;
	private String complemento;

	public EnderecoResponse() {
	}

	public EnderecoResponse(Long idEndereco, String endereco, CepResponse cepResponse, String pontoReferencia,
			CidadeResponse cidadeResponse, BairroResponse bairroResponse, Integer numero, String complemento) {
		this.idEndereco = idEndereco;
		this.endereco = endereco;
		this.cepResponse = cepResponse;
		this.pontoReferencia = pontoReferencia;
		this.cidadeResponse = cidadeResponse;
		this.bairroResponse = bairroResponse;
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

	public CepResponse getCepResponse() {
		return cepResponse;
	}

	public void setCepResponse(CepResponse cepResponse) {
		this.cepResponse = cepResponse;
	}

	public String getPontoReferencia() {
		return pontoReferencia;
	}

	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

	public CidadeResponse getCidadeResponse() {
		return cidadeResponse;
	}

	public void setCidadeResponse(CidadeResponse cidadeResponse) {
		this.cidadeResponse = cidadeResponse;
	}

	public BairroResponse getBairroResponse() {
		return bairroResponse;
	}

	public void setBairroResponse(BairroResponse bairroResponse) {
		this.bairroResponse = bairroResponse;
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
