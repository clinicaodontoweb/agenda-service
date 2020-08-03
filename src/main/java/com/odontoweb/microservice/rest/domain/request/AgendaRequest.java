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
public class AgendaRequest implements Serializable {

	private static final long serialVersionUID = 436747791286284283L;

	private Long idAgenda;
	private UsuarioClinicaRequest usuarioClinica;
}