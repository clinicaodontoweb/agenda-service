package com.odontoweb.microservice.rest.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
}
