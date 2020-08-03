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
public class TipoConsultaResponse implements Serializable {

	private static final long serialVersionUID = 965778435919501808L;

	private Long idTipoConsulta;
	private String nome;
	private String corPrimaria;
	private String corSecundaria;
}
