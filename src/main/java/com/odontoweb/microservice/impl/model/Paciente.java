package com.odontoweb.microservice.impl.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	@Column(name = "id_paciente")
	private Long idPaciente;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "rg")
	private String rg;

	@Column(name = "nome")
	private String nome;

	@Column(name = "genero")
	@Enumerated(EnumType.STRING)
	private Genero genero;

	@Column(name = "data_nascimento")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataNascimento;

	@Column(name = "estado_civil")
	@Enumerated(EnumType.STRING)
	private EstadoCivil estadoCivil;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_contato")
	private Contato contato;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_convenio")
	private Convenio convenio;

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
				+ ", dataNascimento=" + new SimpleDateFormat("dd/MM/yyyy").format(dataNascimento) + ", estadoCivil=" + estadoCivil
				+ ", contato=" + contato + ", endereco=" + endereco + ", convenio=" + convenio + "]";
	}
}
