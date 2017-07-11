package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

import com.odontoweb.microservice.impl.model.enums.StatusEvento;

public class EventoResponse implements Serializable {

	private static final long serialVersionUID = 5941051393813560581L;

	private Long idEvento;
	private Boolean encaixe;
	private StatusEvento statusEvento;
	private TipoConsultaResponse tipoConsultaResponse;
	private AgendaResponse agendaResponse;
	private PacienteResponse pacienteResponse;
	private Long dataInicio;
	private Long dataFim;
	private String observacao;

	public EventoResponse() {
	}

	public EventoResponse(Long idEvento, Boolean encaixe, StatusEvento statusEvento,
			TipoConsultaResponse tipoConsultaResponse, AgendaResponse agendaResponse, PacienteResponse pacienteResponse,
			String observacao, Long dataInicio, Long dataFim) {
		this.idEvento = idEvento;
		this.encaixe = encaixe;
		this.statusEvento = statusEvento;
		this.tipoConsultaResponse = tipoConsultaResponse;
		this.agendaResponse = agendaResponse;
		this.pacienteResponse = pacienteResponse;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.observacao = observacao;

	}

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

	public TipoConsultaResponse getTipoConsultaResponse() {
		return tipoConsultaResponse;
	}

	public void setTipoConsultaResponse(TipoConsultaResponse tipoConsultaResponse) {
		this.tipoConsultaResponse = tipoConsultaResponse;
	}

	public PacienteResponse getPacienteResponse() {
		return pacienteResponse;
	}

	public void setPacienteResponse(PacienteResponse pacienteResponse) {
		this.pacienteResponse = pacienteResponse;
	}

	public AgendaResponse getAgendaResponse() {
		return agendaResponse;
	}

	public void setAgendaResponse(AgendaResponse agendaResponse) {
		this.agendaResponse = agendaResponse;
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
