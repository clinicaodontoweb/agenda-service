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
public class UsuarioClinicaRequest implements Serializable {

	private static final long serialVersionUID = 5916436510559374401L;

	private Long idUsuarioClinica;
	private String tipoProfissional;
	private String hashKey;
}
