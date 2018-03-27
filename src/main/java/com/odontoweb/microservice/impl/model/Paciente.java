package com.odontoweb.microservice.impl.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

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

	@Column(name = "DTA_DATA_CADASTRO", updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;

	@Column(name = "STR_ESTADO_CIVIL")
	@Enumerated(EnumType.STRING)
	private EstadoCivil estadoCivil;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_CONTATO")
	private Contato contato;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_ENDERECO")
	private Endereco endereco;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_INDICACAO_PACIENTE")
	private IndicacaoPaciente indicacaoPaciente;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_PACIENTE")
	private List<RedeSocialPaciente> redesSociaisPaciente;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_PROFISSAO")
	private Profissao profissao;

	@Column(name = "STR_LOCAL_TRABALHO")
	private String localTrabalho;

	@Column(name = "STR_NOME_PAI")
	private String nomePai;

	@Column(name = "STR_NOME_MAE")
	private String nomeMae;

	@Lob
	@Type(type = "org.hibernate.type.TextType")
	@Column(name = "STR_OBSERVACAO")
	private String observacao;

	@Column(name = "BOO_PENDENCIA_FINANCEIRA")
	private Boolean pendenciaFinanceira;

	public Paciente() {
		this.pendenciaFinanceira = Boolean.FALSE;
		this.dataCadastro = new Date();
	}

	public Paciente(Long idPaciente, String cpf, String rg, String nome, Genero genero, Date dataNascimento,
			EstadoCivil estadoCivil, Contato contato, Endereco endereco, IndicacaoPaciente indicacaoPaciente,
			List<RedeSocialPaciente> redesSociaisPaciente, Profissao profissao, String localTrabalho, String nomePai,
			String nomeMae, String observacao, Boolean pendenciaFinanceira) {
		this.idPaciente = idPaciente;
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
		this.contato = contato;
		this.endereco = endereco;
		this.indicacaoPaciente = indicacaoPaciente;
		this.redesSociaisPaciente = redesSociaisPaciente;
		this.profissao = profissao;
		this.localTrabalho = localTrabalho;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.observacao = observacao;
		if (pendenciaFinanceira == null) {
			this.pendenciaFinanceira = Boolean.FALSE;
		} else {
			this.pendenciaFinanceira = pendenciaFinanceira;
		}

		if (idPaciente == null) {
			this.dataCadastro = new Date();
		}

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

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public IndicacaoPaciente getIndicacaoPaciente() {
		return indicacaoPaciente;
	}

	public void setIndicacaoPaciente(IndicacaoPaciente indicacaoPaciente) {
		this.indicacaoPaciente = indicacaoPaciente;
	}

	public List<RedeSocialPaciente> getRedesSociaisPaciente() {
		return redesSociaisPaciente;
	}

	public void setRedesSociaisPaciente(List<RedeSocialPaciente> redesSociaisPaciente) {
		this.redesSociaisPaciente = redesSociaisPaciente;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
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

	@Override
	public String toString() {
		return "Paciente [id=" + idPaciente + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", genero=" + genero
				+ ", dataNascimento=" + new SimpleDateFormat("dd/MM/yyyy").format(dataNascimento) + ", dataCadastro="
				+ new SimpleDateFormat("dd/MM/yyyy").format(dataCadastro) + ", estadoCivil=" + estadoCivil
				+ ", contato=" + contato + ", endereco=" + endereco + ", indicacao=" + indicacaoPaciente
				+ ", profissao = " + profissao + ", localTrabalho=" + localTrabalho + ", nomePai=" + nomePai
				+ ", nomeMae=" + nomeMae + ", observacao=" + observacao + ", pendenciaFinanceira=" + pendenciaFinanceira
				+ "]";
	}
}
