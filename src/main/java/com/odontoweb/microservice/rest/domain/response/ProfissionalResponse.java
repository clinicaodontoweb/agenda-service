package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;
import java.util.List;

import com.odontoweb.microservice.impl.model.enums.Genero;

public class ProfissionalResponse implements Serializable {

	private static final long serialVersionUID = -1205176944035282783L;

	private Long idProfissional;
	private String nome;
	private List<TelefoneResponse> telefones;
	private Genero genero;
	private String conselho;
	private String registro;
	private String codigoBrasileiroOcupacao;

	public ProfissionalResponse() {
	}

	public ProfissionalResponse(Long idProfissional, String nome, List<TelefoneResponse> telefones, Genero genero,
			String conselho, String registro, String codigoBrasileiroOcupacao) {
		this.idProfissional = idProfissional;
		this.nome = nome;
		this.telefones = telefones;
		this.genero = genero;
		this.conselho = conselho;
		this.registro = registro;
		this.codigoBrasileiroOcupacao = codigoBrasileiroOcupacao;
	}

	public Long getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(Long idProfissional) {
		this.idProfissional = idProfissional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<TelefoneResponse> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<TelefoneResponse> telefones) {
		this.telefones = telefones;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getConselho() {
		return conselho;
	}

	public void setConselho(String conselho) {
		this.conselho = conselho;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getCodigoBrasileiroOcupacao() {
		return codigoBrasileiroOcupacao;
	}

	public void setCodigoBrasileiroOcupacao(String codigoBrasileiroOcupacao) {
		this.codigoBrasileiroOcupacao = codigoBrasileiroOcupacao;
	}

}
