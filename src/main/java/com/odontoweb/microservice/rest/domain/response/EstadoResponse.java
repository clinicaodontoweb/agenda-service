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
public class EstadoResponse implements Serializable {

	private static final long serialVersionUID = -9070160270916506194L;

	private Long idEstado;
	private String nome;
	private SiglaResponse sigla;
}
