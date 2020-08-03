package com.odontoweb.microservice.rest.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RedeSocialPacienteRequest implements Serializable {

	private static final long serialVersionUID = 1547275079780422888L;

	private Long idRedeSocialPaciente;
	private RedeSocialRequest redeSocial;
	private String endereco;
}
