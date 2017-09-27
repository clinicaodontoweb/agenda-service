package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.odontoweb.microservice.impl.model.enums.TipoProfissional;

@Entity
@Table(name = "TBL_USUARIO_CLINICA")
public class UsuarioClinica implements Serializable {

	private static final long serialVersionUID = -5948237095355557063L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idUsuarioClinica;

	@Column(name = "STR_EMAIL", unique = true)
	private String email;

	@Column(name = "STR_HASH_KEY")
	private String hashKey;

	@Enumerated(EnumType.STRING)
	@Column(name = "STR_TIPO_PROFISSIONAL")
	private TipoProfissional tipoProfissional;

	public UsuarioClinica(Long idUsuarioClinica, String email, String hashKey, TipoProfissional tipoProfissional) {
		this.idUsuarioClinica = idUsuarioClinica;
		this.email = email;
		this.hashKey = hashKey;
		this.tipoProfissional = tipoProfissional;
	}

	public UsuarioClinica() {
	}

	public Long getIdUsuarioClinica() {
		return idUsuarioClinica;
	}

	public void setIdUsuarioClinica(Long idUsuarioClinica) {
		this.idUsuarioClinica = idUsuarioClinica;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoProfissional getTipoProfissional() {
		return tipoProfissional;
	}

	public void setTipoProfissional(TipoProfissional tipoProfissional) {
		this.tipoProfissional = tipoProfissional;
	}

	public String getHashKey() {
		return hashKey;
	}

	public void setHashKey(String hashKey) {
		this.hashKey = hashKey;
	}

	@Override
	public String toString() {
		return "UsuarioClinica [id=" + idUsuarioClinica + ", email=" + email + ", tipoProfissional=" + tipoProfissional
				+ "]";
	}

}
