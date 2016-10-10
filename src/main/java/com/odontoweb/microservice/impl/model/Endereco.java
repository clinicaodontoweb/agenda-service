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
@Table(name = "TBL_ENDERECO")
public class Endereco implements Serializable {

	private static final long serialVersionUID = -538703579751183417L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idEndereco;

	@Column(name = "STR_ENDERECO")
	private String endereco;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_CEP")
	private Cep cep;

	@Column(name = "STR_PONTO_REFERENCIA")
	private String pontoReferencia;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_CIDADE")
	private Cidade cidade;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_BAIRRO")
	private Bairro bairro;

	@Column(name = "NUM_NUMERO")
	private Integer numero;

	@Column(name = "STR_COMPLEMENTO")
	private String complemento;

	public Endereco() {
	}

	public Endereco(Long idEndereco, String endereco, Cep cep, String pontoReferencia, Cidade cidade, Bairro bairro,
			Integer numero, String complemento) {
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

	public Cep getCep() {
		return cep;
	}

	public void setCep(Cep cep) {
		this.cep = cep;
	}

	public String getPontoReferencia() {
		return pontoReferencia;
	}

	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
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

	@Override
	public String toString() {
		return "Endereco [id=" + idEndereco + ", endereco=" + endereco + ", cep=" + cep + ", pontoReferencia="
				+ pontoReferencia + ", cidade=" + cidade + ", bairro=" + bairro + ", numero=" + numero
				+ ", complemento=" + complemento + "]";
	}

}
