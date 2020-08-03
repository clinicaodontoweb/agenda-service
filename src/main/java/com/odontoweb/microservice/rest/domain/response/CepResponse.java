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
public class CepResponse implements Serializable {

	private static final long serialVersionUID = -794807380591256302L;

	private Long idCep;
	private String cep;
}
