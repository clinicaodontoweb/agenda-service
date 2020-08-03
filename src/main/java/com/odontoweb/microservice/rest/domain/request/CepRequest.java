package com.odontoweb.microservice.rest.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CepRequest implements Serializable {

	private static final long serialVersionUID = -964572396702330630L;

	private Long idCep;

	@NotNull(message = "Cep obrigatório!")
	@Size(min = 8, max = 8, message = "O cep deve conter 8 digitos!")
	private String cep;
}
