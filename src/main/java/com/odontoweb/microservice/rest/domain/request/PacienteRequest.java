package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PacienteRequest implements Serializable {

	private static final long serialVersionUID = 1098978359016228966L;

	private Long idPaciente;
	private String cpf;
	private String rg;
	private String nome;
	private String genero;
	private Date dataNascimento;
	private String estadoCivil;
	private ContatoRequest contato;
	private EnderecoRequest endereco;
	private IndicacaoPacienteRequest indicacaoPaciente;
	private List<RedeSocialPacienteRequest> redesSociaisPaciente;
	private ProfissaoRequest profissao;
	private String localTrabalho;
	private String nomePai;
	private String nomeMae;
	private String observacao;
	private Boolean pendenciaFinanceira;

	public PacienteRequest() {
	}

	public PacienteRequest(Long idPaciente, String cpf, String rg, String nome, GeneroRequest generoRequest,
			Date dataNascimento, EstadoCivilRequest estadoCivilRequest, ContatoRequest contato,
			EnderecoRequest endereco, List<ConvenioPacienteRequest> conveniosPacientes,
			IndicacaoPacienteRequest indicacaoPaciente, List<RedeSocialPacienteRequest> redesSociaisPaciente,
			ProfissaoRequest profissao, String localTrabalho, String nomePai, String nomeMae, String observacao,
			Boolean pendenciaFinanceira) {
		this.idPaciente = idPaciente;
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.genero = generoRequest.getGenero();
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivilRequest.getEstadoCivil();
		this.contato = contato;
		this.endereco = endereco;
		this.profissao = profissao;
		this.indicacaoPaciente = indicacaoPaciente;
		this.redesSociaisPaciente = redesSociaisPaciente;
		this.localTrabalho = localTrabalho;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.observacao = observacao;
		this.pendenciaFinanceira = pendenciaFinanceira;
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

	public IndicacaoPacienteRequest getIndicacaoPaciente() {
		return indicacaoPaciente;
	}

	public void setIndicacaoPaciente(IndicacaoPacienteRequest indicacaoPaciente) {
		this.indicacaoPaciente = indicacaoPaciente;
	}

	public List<RedeSocialPacienteRequest> getRedesSociaisPaciente() {
		return redesSociaisPaciente;
	}

	public void setRedesSociaisPaciente(List<RedeSocialPacienteRequest> redesSociaisPaciente) {
		this.redesSociaisPaciente = redesSociaisPaciente;
	}

	public ProfissaoRequest getProfissao() {
		return profissao;
	}

	public void setProfissao(ProfissaoRequest profissao) {
		this.profissao = profissao;
	}

	public String getLocalTrabalho() {
		return localTrabalho;
	}

	public void setLocalTrabalho(String localTrabalho) {
		this.localTrabalho = localTrabalho;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Boolean getPendenciaFinanceira() {
		return pendenciaFinanceira;
	}

	public void setPendenciaFinanceira(Boolean pendenciaFinanceira) {
		this.pendenciaFinanceira = pendenciaFinanceira;
	}

	public ContatoRequest getContato() {
		return contato;
	}

	public void setContato(ContatoRequest contato) {
		this.contato = contato;
	}

	public EnderecoRequest getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoRequest endereco) {
		this.endereco = endereco;
	}

}
