package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.odontoweb.microservice.impl.model.enums.Genero;

public class ProfissionalRequest implements Serializable {

	private static final long serialVersionUID = -5217785988080284220L;

	private Long idProfissional;

	@NotNull(message = "Nome é obrigatório!")
	private String nome;

	@NotNull(message = "Pelo menos um telefone é necessário!")
	private List<TelefoneRequest> telefones;

	@NotNull(message = "Gênero é obrigatório!")
	private Genero genero;

	@NotNull(message = "Conselho é obrigatório!")
	private String conselho;

	@NotNull(message = "Registro é obrigatório!")
	private String registro;

	private String codigoBrasileiroOcupacao;

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

	public List<TelefoneRequest> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<TelefoneRequest> telefones) {
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
