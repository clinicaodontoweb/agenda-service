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
public class BairroRequest implements Serializable {

	private static final long serialVersionUID = 436747791286284283L;

	private Long idBairro;

	@NotNull(message = "Nome do bairro obrigatório!")
	private String nome;
}
