package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;
import java.util.Date;

import com.odontoweb.microservice.impl.model.enums.EstadoCivil;
import com.odontoweb.microservice.impl.model.enums.Genero;

public class PacienteResponse implements Serializable {

	private static final long serialVersionUID = 1098978359016228966L;

	private Long idPaciente;
	private String cpf;
	private String rg;
	private String nome;
	private Genero genero;
	private Date dataNascimento;
	private EstadoCivil estadoCivil;
	private ContatoResponse contatoResponse;
	private EnderecoResponse enderecoResponse;
	private ConvenioResponse convenioResponse;

	public PacienteResponse() {
	}

	public PacienteResponse(Long idPaciente, String cpf, String rg, String nome, Genero genero, Date dataNascimento,
			EstadoCivil estadoCivil, ContatoResponse contatoResponse, EnderecoResponse enderecoResponse,
			ConvenioResponse convenioResponse) {
		this.idPaciente = idPaciente;
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
		this.contatoResponse = contatoResponse;
		this.enderecoResponse = enderecoResponse;
		this.convenioResponse = convenioResponse;
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

	public ContatoResponse getContatoResponse() {
		return contatoResponse;
	}

	public void setContatoResponse(ContatoResponse contatoResponse) {
		this.contatoResponse = contatoResponse;
	}

	public EnderecoResponse getEnderecoResponse() {
		return enderecoResponse;
	}

	public void setEnderecoResponse(EnderecoResponse enderecoResponse) {
		this.enderecoResponse = enderecoResponse;
	}

	public ConvenioResponse getConvenioResponse() {
		return convenioResponse;
	}

	public void setConvenioResponse(ConvenioResponse convenioResponse) {
		this.convenioResponse = convenioResponse;
	}

}
