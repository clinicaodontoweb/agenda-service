package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.odontoweb.microservice.impl.model.enums.StatusEvento;

public class EventoRequest implements Serializable {

	private static final long serialVersionUID = -2690624974662872216L;

	private Long idEvento;
	private Boolean confirmado;
	private Boolean encaixe;
	private StatusEvento statusEvento;
	private AgendaRequest agendaRequest;

	@NotNull(message = "Tipo de Consulta é obrigatório!")
	private TipoConsultaRequest tipoConsultaRequest;

	@NotNull(message = "É obrigatório informar o paciente!")
	private PacienteRequest pacienteRequest;

	@NotNull(message = "Ano da consulta obrigatório!")
	private Integer ano;

	@NotNull(message = "Mês da consulta obrigatório!")
	private Integer mes;

	@NotNull(message = "Dia da consulta obrigatório!")
	private Integer dia;

	@NotNull(message = "Hora da consulta obrigatório!")
	private Integer hora;

	@NotNull(message = "Minuto da consulta obrigatório!")
	private Integer minuto;

	private String observacao;

	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}

	public Boolean getConfirmado() {
		return confirmado;
	}

	public void setConfirmado(Boolean confirmado) {
		this.confirmado = confirmado;
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

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
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

}
