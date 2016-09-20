package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;
import java.util.List;

import com.odontoweb.microservice.impl.model.Telefone;
import com.odontoweb.microservice.impl.model.enums.Genero;

public class ProfissionalRequest implements Serializable {

	private static final long serialVersionUID = -5217785988080284220L;

	private Long idProfissional;
	private List<Telefone> telefones;
	private Genero genero;
	private String conselho;
	private String registro;
	private String codigoBrasileiroOcupacao;

	public Long getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(Long idProfissional) {
		this.idProfissional = idProfissional;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
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
