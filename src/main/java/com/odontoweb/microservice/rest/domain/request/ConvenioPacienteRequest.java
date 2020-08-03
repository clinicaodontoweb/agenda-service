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
public class ConvenioPacienteRequest implements Serializable {

	private static final long serialVersionUID = -8611820894219165019L;

	private Long idConvenioPaciente;
	private ConvenioRequest convenio;
	private String numero;
	private String titularConvenio;
}
