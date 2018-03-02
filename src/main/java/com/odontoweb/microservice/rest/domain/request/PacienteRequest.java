package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PacienteRequest implements Serializable {

	private static final long serialVersionUID = -6227648176297815452L;

	private Long idPaciente;
	private Long idEndereco;

	@NotNull(message = "Cpf é obrigatório!")
	private String cpf;

	private String rg;

	@NotNull(message = "Nome é obrigatório!")
	private String nome;

	@NotNull(message = "Gênero é obrigatório!")
	private String genero;

	@NotNull(message = "Data de nascimento é obrigatório!")
	private Date dataNascimento;

	private Date dataCadastro;

	private String estadoCivil;

	private Long idContato;

	private String email;

	private List<TelefoneRequest> telefones;

	@NotNull(message = "Endereço é obrigatório!")
	private String endereco;

	@NotNull(message = "Cep obrigatório!")
	@Size(min = 8, max = 8, message = "O cep deve conter 8 digitos!")
	private String cep;

	private String pontoReferencia;

	@NotNull(message = "Nome da cidade obrigatório!")
	private String cidade;

	@NotNull(message = "Sigla é obrigatório!")
	private String sigla;

	@NotNull(message = "Nome do bairro obrigatório!")
	private String bairro;

	@NotNull(message = "Número é obrigatório!")
	private Integer numero;

	private String complemento;

	private List<ConvenioPacienteRequest> conveniosPaciente;

	private IndicacaoPacienteRequest indicacaoPaciente;

	private List<RedeSocialPacienteRequest> redesSociaisPaciente;

	private ProfissaoRequest profissao;

	private String localTrabalho;

	private String nomePai;

	private String nomeMae;

	private String observacao;

	private Boolean pendenciaFinanceira;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<TelefoneRequest> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<TelefoneRequest> telefones) {
		this.telefones = telefones;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getPontoReferencia() {
		return pontoReferencia;
	}

	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
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

	public Long getIdContato() {
		return idContato;
	}

	public void setIdContato(Long idContato) {
		this.idContato = idContato;
	}

	public Long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public List<ConvenioPacienteRequest> getConveniosPaciente() {
		return conveniosPaciente;
	}

	public void setConveniosPaciente(List<ConvenioPacienteRequest> conveniosPaciente) {
		this.conveniosPaciente = conveniosPaciente;
	}

	public IndicacaoPacienteRequest getIndicacaoPaciente() {
		return indicacaoPaciente;
	}

	public void setIndicacaoPaciente(IndicacaoPacienteRequest indicacaoPaciente) {
		this.indicacaoPaciente = indicacaoPaciente;
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

	public List<RedeSocialPacienteRequest> getRedesSociaisPaciente() {
		return redesSociaisPaciente;
	}

	public void setRedesSociaisPaciente(List<RedeSocialPacienteRequest> redesSociaisPaciente) {
		this.redesSociaisPaciente = redesSociaisPaciente;
	}

}
