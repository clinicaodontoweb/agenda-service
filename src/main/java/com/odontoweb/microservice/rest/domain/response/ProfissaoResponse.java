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
public class ProfissaoResponse implements Serializable {

	private static final long serialVersionUID = -9166182280488590139L;

	private Long idProfissao;
	private String nome;
}
