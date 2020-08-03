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
public class EventoResponse implements Serializable {

	private static final long serialVersionUID = 5941051393813560581L;

	private Long idEvento;
	private Boolean encaixe;
	private StatusResponse statusEvento;
	private TipoConsultaResponse tipoConsulta;
	private AgendaResponse agenda;
	private PacienteResponse paciente;
	private ConvenioPacienteResponse convenioPaciente;
	private Long dataInicio;
	private Long dataFim;
	private String observacao;
}
