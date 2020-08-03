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
public class SiglaRequest implements Serializable {

	private static final long serialVersionUID = -3523894104353937660L;

	private Long idSigla;
	
	@NotNull(message = "Sigla é obrigatório!")
	private String sigla;
}
