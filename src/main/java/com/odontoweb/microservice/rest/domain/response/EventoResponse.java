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
	private Integer ano;
	private Integer mes;
	private Integer dia;
	private Integer horaInicio;
	private Integer horaFim;
	private Integer minutoInicio;
	private Integer minutoFim;
	private String observacao;

	public EventoResponse() {
	}

	public EventoResponse(Long idEvento, Boolean encaixe, StatusEvento statusEvento,
			TipoConsultaResponse tipoConsultaResponse, AgendaResponse agendaResponse, PacienteResponse pacienteResponse,
			Integer ano, Integer mes, Integer dia, Integer horaInicio, Integer horaFim, Integer minutoInicio,
			Integer minutoFim, String observacao) {
		this.idEvento = idEvento;
		this.encaixe = encaixe;
		this.statusEvento = statusEvento;
		this.tipoConsultaResponse = tipoConsultaResponse;
		this.agendaResponse = agendaResponse;
		this.pacienteResponse = pacienteResponse;
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.minutoInicio = minutoInicio;
		this.minutoFim = minutoFim;
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

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Integer horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Integer getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(Integer horaFim) {
		this.horaFim = horaFim;
	}

	public Integer getMinutoInicio() {
		return minutoInicio;
	}

	public void setMinutoInicio(Integer minutoInicio) {
		this.minutoInicio = minutoInicio;
	}

	public Integer getMinutoFim() {
		return minutoFim;
	}

	public void setMinutoFim(Integer minutoFim) {
		this.minutoFim = minutoFim;
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

}
