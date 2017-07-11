package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.odontoweb.microservice.impl.model.enums.StatusEvento;

public class EventoRequest implements Serializable {

	private static final long serialVersionUID = -2690624974662872216L;

	private Long idEvento;
	private Boolean encaixe;
	private StatusEvento statusEvento;
	private AgendaRequest agendaRequest;
	private Long dataInicio;
	private Long dataFim;

	@NotNull(message = "Tipo de Consulta é obrigatório!")
	private TipoConsultaRequest tipoConsultaRequest;

	@NotNull(message = "É obrigatório informar o paciente!")
	private PacienteRequest pacienteRequest;

	private String observacao;

	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}

	public Boolean getEncaixe() {
		return encaixe;
	}

	public void setEncaixe(Boolean encaixe) {
		this.encaixe = encaixe;
	}

	public StatusEvento getStatusEvento() {
		return statusEvento;
	}

	public void setStatusEvento(StatusEvento statusEvento) {
		this.statusEvento = statusEvento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public TipoConsultaRequest getTipoConsultaRequest() {
		return tipoConsultaRequest;
	}

	public void setTipoConsultaRequest(TipoConsultaRequest tipoConsultaRequest) {
		this.tipoConsultaRequest = tipoConsultaRequest;
	}

	public PacienteRequest getPacienteRequest() {
		return pacienteRequest;
	}

	public void setPacienteRequest(PacienteRequest pacienteRequest) {
		this.pacienteRequest = pacienteRequest;
	}

	public AgendaRequest getAgendaRequest() {
		return agendaRequest;
	}

	public void setAgendaRequest(AgendaRequest agendaRequest) {
		this.agendaRequest = agendaRequest;
	}

	public Long getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Long dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Long getDataFim() {
		return dataFim;
	}

	public void setDataFim(Long dataFim) {
		this.dataFim = dataFim;
	}

}
