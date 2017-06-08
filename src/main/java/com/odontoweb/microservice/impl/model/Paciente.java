package com.odontoweb.microservice.impl.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.odontoweb.microservice.impl.model.enums.EstadoCivil;
import com.odontoweb.microservice.impl.model.enums.Genero;

@Entity
@Table(name = "TBL_PACIENTE")
public class Paciente implements Serializable {

	private static final long serialVersionUID = 1644986742662471482L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idPaciente;

	@Column(name = "STR_CPF")
	private String cpf;

	@Column(name = "STR_RG")
	private String rg;

	@Column(name = "STR_NOME")
	private String nome;

	@Column(name = "STR_GENERO")
	@Enumerated(EnumType.STRING)
	private Genero genero;

	@Column(name = "DTA_DATA_NASCIMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataNascimento;

	@Column(name = "STR_ESTADO_CIVIL")
	@Enumerated(EnumType.STRING)
	private EstadoCivil estadoCivil;

	@OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "FK_CONTATO")
	private Contato contato;

	@OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "FK_ENDERECO")
	private Endereco endereco;

	@ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "FK_CONVENIO")
	private Convenio convenio;

	public Paciente() {
	}

	public Paciente(Long idPaciente, String cpf, String rg, String nome, Genero genero, Date dataNascimento,
			EstadoCivil estadoCivil, Contato contato, Endereco endereco, Convenio convenio) {
		this.idPaciente = idPaciente;
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
		this.contato = contato;
		this.endereco = endereco;
		this.convenio = convenio;
	}

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + idPaciente + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", genero=" + genero
				+ ", dataNascimento=" + new SimpleDateFormat("dd/MM/yyyy").format(dataNascimento) + ", estadoCivil="
				+ estadoCivil + ", contato=" + contato + ", endereco=" + endereco + ", convenio=" + convenio + "]";
	}
}
