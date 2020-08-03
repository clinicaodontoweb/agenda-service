package com.odontoweb.microservice.rest.domain.response;

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
	private ProfissaoResponse profissao;
	private IndicacaoPacienteResponse indicacaoPaciente;
	private List<RedeSocialPacienteResponse> redesSociaisPaciente;
	private String localTrabalho;
	private String nomePai;
	private String nomeMae;
	private String observacao;
	private Boolean pendenciaFinanceira;
	private EventoResponse ultimoEvento;
}
