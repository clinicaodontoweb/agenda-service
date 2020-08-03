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
public class RedeSocialPacienteResponse implements Serializable {

	private static final long serialVersionUID = -2603084779990955125L;

	private Long idRedeSocialPaciente;
	private RedeSocialResponse redeSocial;
	private String endereco;
}
