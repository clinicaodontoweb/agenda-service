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
public class IndicacaoPacienteResponse implements Serializable {

	private static final long serialVersionUID = 5684199990653329075L;

	private Long idIndicacaoPaciente;
	private IndicacaoResponse indicacao;
	private String nome;
}
