package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PacienteEditRequest implements Serializable {

	private static final long serialVersionUID = 1098978359016228966L;

	private Long idPaciente;
	private String cpf;
	private String rg;
	private String nome;
	private String genero;
	private Date dataNascimento;
	private String estadoCivil;
	private ContatoRequest contatoRequest;
	private EnderecoRequest enderecoRequest;
	private List<ConvenioRequest> conveniosRequest;
	private String profissao;
	private String indicacao;

	public PacienteEditRequest() {
	}

	public PacienteEditRequest(Long idPaciente, String cpf, String rg, String nome, GeneroRequest generoRequest,
			Date dataNascimento, EstadoCivilRequest estadoCivilRequest, ContatoRequest contatoRequest,
			EnderecoRequest enderecoRequest, List<ConvenioRequest> conveniosRequest, String profissao,
			String indicacao) {
		this.idPaciente = idPaciente;
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.genero = generoRequest.getGenero();
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivilRequest.getEstadoCivil();
		this.contatoRequest = contatoRequest;
		this.enderecoRequest = enderecoRequest;
		this.conveniosRequest = conveniosRequest;
		this.profissao = profissao;
		this.indicacao = indicacao;
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
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

	public List<ConvenioRequest> getConveniosRequest() {
		return conveniosRequest;
	}

	public void setConveniosRequest(List<ConvenioRequest> conveniosRequest) {
		this.conveniosRequest = conveniosRequest;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}

}
