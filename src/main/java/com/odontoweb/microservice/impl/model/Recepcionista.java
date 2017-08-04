package com.odontoweb.microservice.impl.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.odontoweb.microservice.impl.model.enums.Genero;

@Entity
@Table(name = "TBL_RECEPCIONISTA")
public class Recepcionista implements Serializable {

	private static final long serialVersionUID = -6571784546138634527L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idRecepcionista;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_USUARIO_CLINICA", unique = true)
	private UsuarioClinica usuarioClinica;

	@Column(name = "STR_NOME")
	private String nome;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_CONTATO")
	private Contato contato;

	@Column(name = "STR_GENERO")
	@Enumerated(EnumType.STRING)
	private Genero genero;

	@ManyToMany(cascade=CascadeType.REFRESH)
	@JoinTable(name = "TBL_RECEPCIONISTA_DENTISTA", joinColumns = @JoinColumn(name = "FK_RECEPCIONISTA", referencedColumnName = "ID", nullable = false), inverseJoinColumns = @JoinColumn(name = "FK_DENTISTA", referencedColumnName = "ID", nullable = false))
	private List<Dentista> dentistas;

	public Recepcionista(Long idRecepcionista, UsuarioClinica usuarioClinica, String nome, Contato contato,
			Genero genero, List<Dentista> dentistas) {
		this.idRecepcionista = idRecepcionista;
		this.usuarioClinica = usuarioClinica;
		this.nome = nome;
		this.contato = contato;
		this.genero = genero;
		this.dentistas = dentistas;
	}

	public Recepcionista() {

	}

	public Long getIdRecepcionista() {
		return idRecepcionista;
	}

	public void setIdRecepcionista(Long idRecepcionista) {
		this.idRecepcionista = idRecepcionista;
	}

	public UsuarioClinica getUsuarioClinica() {
		return usuarioClinica;
	}

	public void setUsuarioClinica(UsuarioClinica usuarioClinica) {
		this.usuarioClinica = usuarioClinica;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public List<Dentista> getDentistas() {
		return dentistas;
	}

	public void setDentistas(List<Dentista> dentistas) {
		this.dentistas = dentistas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idRecepcionista == null) ? 0 : idRecepcionista.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recepcionista other = (Recepcionista) obj;
		if (idRecepcionista == null) {
			if (other.idRecepcionista != null)
				return false;
		} else if (!idRecepcionista.equals(other.idRecepcionista))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Recepcionista [id=" + idRecepcionista + ", usuarioClinica=" + usuarioClinica + ", nome=" + nome
				+ ", generoso=" + genero + "]";
	}
}
