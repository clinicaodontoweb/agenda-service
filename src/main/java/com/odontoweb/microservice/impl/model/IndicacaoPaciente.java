package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
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
@Table(name = "TBL_INDICACAO_PACIENTE")
public class IndicacaoPaciente implements Serializable {

	private static final long serialVersionUID = 4725067157612125097L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idIndicacaoPaciente;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_INDICACAO")
	private Indicacao indicacao;

	@Column(name = "STR_NOME")
	private String nome;

	public IndicacaoPaciente(Long idIndicacaoPaciente, Indicacao indicacao, String nome) {
		this.idIndicacaoPaciente = idIndicacaoPaciente;
		this.indicacao = indicacao;
		this.nome = nome;
	}

	public IndicacaoPaciente() {
	}

	public Long getIdIndicacaoPaciente() {
		return idIndicacaoPaciente;
	}

	public void setIdIndicacaoPaciente(Long idIndicacaoPaciente) {
		this.idIndicacaoPaciente = idIndicacaoPaciente;
	}

	public Indicacao getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(Indicacao indicacao) {
		this.indicacao = indicacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "IndicacaoPaciente [id=" + idIndicacaoPaciente + ", indicacao=" + indicacao + ", nome=" + nome + "]";
	}

}
