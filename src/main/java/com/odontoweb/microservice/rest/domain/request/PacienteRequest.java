package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

public class PacienteRequest implements Serializable {

	private static final long serialVersionUID = -6227648176297815452L;

	private Long idPaciente;

	@NotNull(message = "Cpf é obrigatório!")
	private String cpf;

	private String rg;

	@NotNull(message = "Nome é obrigatório!")
	private String nome;

	@NotNull(message = "Gênero é obrigatório!")
	private String genero;

	@NotNull(message = "Data de nascimento é obrigatório!")
	private Date dataNascimento;

	private String estadoCivil;

	@NotNull(message = "Contato é obrigatório!")
	private ContatoRequest contatoRequest;

	@NotNull(message = "Endereço é obrigatório!")
	private EnderecoRequest enderecoRequest;

	private List<Long> convenios;

	private String indicacao;

	private String profissao;

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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
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

	public String getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public List<Long> getConvenios() {
		return convenios;
	}

	public void setConvenios(List<Long> convenios) {
		this.convenios = convenios;
	}

}
