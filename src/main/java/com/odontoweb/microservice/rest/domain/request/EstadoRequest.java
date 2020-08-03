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
public class EstadoRequest implements Serializable {
	private static final long serialVersionUID = -5930564505816279905L;

	private Long idEstado;

	@NotNull(message = "Nome do estado obrigatório!")
	private String nome;

	@NotNull(message = "Sigla do estado obrigatória!")
	private SiglaRequest sigla;
}
