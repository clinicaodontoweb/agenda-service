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
public class ConvenioPacienteResponse implements Serializable {

	private static final long serialVersionUID = -7970393148403410568L;

	private Long idConvenioPaciente;
	private ConvenioResponse convenio;
	private String numero;
	private String titularConvenio;
}
