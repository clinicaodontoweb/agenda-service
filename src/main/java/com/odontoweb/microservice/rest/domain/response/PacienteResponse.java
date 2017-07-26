package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PacienteResponse implements Serializable {

	private static final long serialVersionUID = 1098978359016228966L;

	private Long idPaciente;
	private String cpf;
	private String rg;
	private String nome;
	private GeneroResponse generoResponse;
	private Date dataNascimento;
	private EstadoCivilResponse estadoCivilResponse;
	private ContatoResponse contatoResponse;
	private EnderecoResponse enderecoResponse;
	private List<ConvenioResponse> conveniosResponse;
	private String profissao;
	private String indicacao;

	public PacienteResponse() {
	}

	public PacienteResponse(Long idPaciente, String cpf, String rg, String nome, GeneroResponse generoResponse,
			Date dataNascimento, EstadoCivilResponse estadoCivilResponse, ContatoResponse contatoResponse,
			EnderecoResponse enderecoResponse, List<ConvenioResponse> conveniosResponse, String profissao,
			String indicacao) {
		this.idPaciente = idPaciente;
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.generoResponse = generoResponse;
		this.dataNascimento = dataNascimento;
		this.estadoCivilResponse = estadoCivilResponse;
		this.contatoResponse = contatoResponse;
		this.enderecoResponse = enderecoResponse;
		this.conveniosResponse = conveniosResponse;
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

	public GeneroResponse getGeneroResponse() {
		return generoResponse;
	}

	public void setGeneroResponse(GeneroResponse generoResponse) {
		this.generoResponse = generoResponse;
	}

	public EstadoCivilResponse getEstadoCivilResponse() {
		return estadoCivilResponse;
	}

	public void setEstadoCivilResponse(EstadoCivilResponse estadoCivilResponse) {
		this.estadoCivilResponse = estadoCivilResponse;
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

	public List<ConvenioResponse> getConveniosResponse() {
		return conveniosResponse;
	}

	public void setConveniosResponse(List<ConvenioResponse> conveniosResponse) {
		this.conveniosResponse = conveniosResponse;
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
