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
public class EventoRequest implements Serializable {

	private static final long serialVersionUID = -2690624974662872216L;

	private Long idEvento;
	private Long idStatus;
	private Long idPaciente;
	private Long idTipoConsulta;
	private Boolean encaixe;
	private Long dataInicio;
	private Long dataFim;
	private ConvenioPacienteRequest convenioPaciente;
	private String observacao;
}
