package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import com.odontoweb.microservice.impl.model.enums.EstadoCivil;
import com.odontoweb.microservice.impl.model.enums.Genero;

public class PacienteRequest implements Serializable {

	private static final long serialVersionUID = -6227648176297815452L;

	private Long idPaciente;

	@NotNull(message = "Cpf é obrigatório!")
	private String cpf;

	private String rg;

	@NotNull(message = "Nome é obrigatório!")
	private String nome;

	@NotNull(message = "Gênero é obrigatório!")
	private Genero genero;

	@NotNull(message = "Data de nascimento é obrigatório!")
	private Date dataNascimento;

	private EstadoCivil estadoCivil;

	@NotNull(message = "Contato é obrigatório!")
	private ContatoRequest contatoRequest;

	@NotNull(message = "Endereço é obrigatório!")
	private EnderecoRequest enderecoRequest;

	private ConvenioRequest convenioRequest;

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

	public ContatoRequest getContatoRequest() {
		return contatoRequest;
	}

	public void setContatoRequest(ContatoRequest contatoRequest) {
		this.contatoRequest = contatoRequest;
	}

	public EnderecoRequest getEnderecoRequest() {
		return enderecoRequest;
	}

	public void setEnderecoRequest(EnderecoRequest enderecoRequest) {
		this.enderecoRequest = enderecoRequest;
	}

	public ConvenioRequest getConvenioRequest() {
		return convenioRequest;
	}

	public void setConvenioRequest(ConvenioRequest convenioRequest) {
		this.convenioRequest = convenioRequest;
	}

}
