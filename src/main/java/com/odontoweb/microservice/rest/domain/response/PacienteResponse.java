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
	private String genero;
	private Date dataNascimento;
	private Date dataCadastro;
	private String estadoCivil;
	private ContatoResponse contato;
	private EnderecoResponse endereco;
	private List<ConvenioPacienteResponse> conveniosPaciente;
	private ProfissaoResponse profissao;
	private IndicacaoPacienteResponse indicacaoPaciente;
	private List<RedeSocialPacienteResponse> redesSociaisPaciente;
	private String localTrabalho;
	private String nomePai;
	private String nomeMae;
	private String observacao;
	private Boolean pendenciaFinanceira;

	public PacienteResponse() {
	}

	public PacienteResponse(Long idPaciente, String cpf, String rg, String nome, GeneroResponse genero,
			Date dataNascimento, Date dataCadastro, EstadoCivilResponse estadoCivil, ContatoResponse contato,
			EnderecoResponse endereco, List<ConvenioPacienteResponse> conveniosPaciente, ProfissaoResponse profissao,
			IndicacaoPacienteResponse indicacaoPaciente, List<RedeSocialPacienteResponse> redesSociaisPaciente,
			String localTrabalho, String nomePai, String nomeMae, String observacao, Boolean pendenciaFinanceira) {
		this.idPaciente = idPaciente;
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.genero = genero.getGenero();
		this.dataNascimento = dataNascimento;
		this.dataCadastro = dataCadastro;
		this.estadoCivil = estadoCivil.getEstadoCivil();
		this.contato = contato;
		this.endereco = endereco;
		this.conveniosPaciente = conveniosPaciente;
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

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public ProfissaoResponse getProfissao() {
		return profissao;
	}

	public void setProfissao(ProfissaoResponse profissao) {
		this.profissao = profissao;
	}

	public List<RedeSocialPacienteResponse> getRedesSociaisPaciente() {
		return redesSociaisPaciente;
	}

	public void setRedesSociaisPaciente(List<RedeSocialPacienteResponse> redesSociaisPaciente) {
		this.redesSociaisPaciente = redesSociaisPaciente;
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

	public IndicacaoPacienteResponse getIndicacaoPaciente() {
		return indicacaoPaciente;
	}

	public void setIndicacaoPaciente(IndicacaoPacienteResponse indicacaoPaciente) {
		this.indicacaoPaciente = indicacaoPaciente;
	}

	public ContatoResponse getContato() {
		return contato;
	}

	public void setContato(ContatoResponse contato) {
		this.contato = contato;
	}

	public EnderecoResponse getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoResponse endereco) {
		this.endereco = endereco;
	}

	public List<ConvenioPacienteResponse> getConveniosPaciente() {
		return conveniosPaciente;
	}

	public void setConveniosPaciente(List<ConvenioPacienteResponse> conveniosPaciente) {
		this.conveniosPaciente = conveniosPaciente;
	}

}
