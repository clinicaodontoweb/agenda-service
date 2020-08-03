package com.odontoweb.microservice.rest.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConvenioResponse implements Serializable {

	private static final long serialVersionUID = -5474776367658295233L;

	private Long idConvenio;
	private String nome;
	private String cnpj;
	private String razaoSocial;
	private EnderecoResponse endereco;
	private ContatoResponse contato;
}
