package com.odontoweb.microservice.impl.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.odontoweb.microservice.impl.model.enums.Genero;

@Entity
@Table(name = "TBL_PROFISSIONAL")
public class Profissional implements Serializable {

	private static final long serialVersionUID = 5100117436384354033L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_profissional")
	private Long idProfissional;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_profissional")
	private List<Telefone> telefones;
	
	@Column(name = "genero")
	private Genero genero;
	
	@Column(name = "conselho")
	private String conselho;
	
	@Column(name = "registro")
	private String registro;
	
	@Column(name = "codigo_brasileiro_ocupacao")
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

	@Override
	public String toString() {
		return "Profissional [id=" + idProfissional + ", generoso=" + genero + ", conselho=" + conselho + ", registro="
				+ registro + ", codigoBrasileiroOcupacao=" + codigoBrasileiroOcupacao + "]";
	}

}
