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
public class EnderecoResponse implements Serializable {

	private static final long serialVersionUID = -2325057475478702393L;

	private Long idEndereco;
	private String endereco;
	private CepResponse cep;
	private String pontoReferencia;
	private CidadeResponse cidade;
	private BairroResponse bairro;
	private Integer numero;
	private String complemento;
}
