package com.odontoweb.microservice.rest.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgendamentoRequest implements Serializable {
	private static final long serialVersionUID = 2897521903307927826L;

	private Long id;
	private Long idStatus;
	private Boolean encaixe;
	private String observacao;
	private Long dataInicio;
	private Long dataFim;
	private Long idTipoConsulta;
	private Long idPaciente;
	private ConvenioPacienteRequest convenioPaciente;
	private Long idAgenda;
}
