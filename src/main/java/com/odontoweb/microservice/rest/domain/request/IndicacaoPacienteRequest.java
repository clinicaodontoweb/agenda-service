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
public class IndicacaoPacienteRequest implements Serializable {

	private static final long serialVersionUID = -2811469366725438029L;

	private Long idIndicacaoPaciente;
	private IndicacaoRequest indicacao;
	private String nome;
}
