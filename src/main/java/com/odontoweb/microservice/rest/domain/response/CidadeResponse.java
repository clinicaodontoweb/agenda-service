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
public class CidadeResponse implements Serializable {

	private static final long serialVersionUID = -5156138853416811208L;

	private Long idCidade;
	private String nome;
	private EstadoResponse estado;
}
