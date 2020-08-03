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
public class CidadeRequest implements Serializable {

	private static final long serialVersionUID = 7823889884302590018L;

	private Long idCidade;

	@NotNull(message = "Nome da cidade obrigatório!")
	private String nome;

	@NotNull(message = "Estado é obrigatório!")
	private EstadoRequest estado;
}
