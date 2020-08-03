package com.odontoweb.microservice.rest.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConvenioRequest implements Serializable {

	private static final long serialVersionUID = -6143810927663734767L;

	private Long idConvenio;

	@NotNull(message = "Nome do convênio é obrigatório!")
	private String nome;

	@NotNull(message = "Cnpj do convênio é obrigatório!")
	private String cnpj;

	@NotNull(message = "Razão social do convênio é obrigatório!")
	private String razaoSocial;

	@NotNull(message = "Endereço é obrigatório!")
	private EnderecoRequest endereco;

	@NotNull(message = "Contato é obrigatório!")
	private ContatoRequest contato;

}
