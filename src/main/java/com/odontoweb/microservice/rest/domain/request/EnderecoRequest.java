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
public class EnderecoRequest implements Serializable {

	private static final long serialVersionUID = -3343181448308864937L;

	private Long idEndereco;

	@NotNull(message = "Endereço é obrigatório!")
	private String endereco;

	@NotNull(message = "Cep é obrigatório!")
	private CepRequest cep;

	private String pontoReferencia;

	@NotNull(message = "Cidade é obrigatório!")
	private CidadeRequest cidade;

	@NotNull(message = "Bairro é obrigatório!")
	private BairroRequest bairro;

	@NotNull(message = "Número é obrigatório!")
	private Integer numero;

	private String complemento;
}
