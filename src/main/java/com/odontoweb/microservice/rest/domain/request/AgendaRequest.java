package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.odontoweb.microservice.impl.model.enums.StatusAgenda;

public class AgendaRequest implements Serializable {

	private static final long serialVersionUID = -2690624974662872216L;

	private Long idAgenda;
	private Boolean confirmado;
	private Boolean encaixe;
	private StatusAgenda statusAgenda;
	@NotNull(message = "Tipo de Consulta é obrigatório!")
	private TipoConsultaRequest tipoConsultaRequest;

	@NotNull(message = "É obrigatório informar o profissional!")
	private ProfissionalRequest profissionalRequest;

	@NotNull(message = "É obrigatório informar o paciente!")
	private PacienteRequest pacienteRequest;

	@NotNull(message = "Data da consulta obrigatório!")
	private Integer ano;

	@NotNull(message = "Data da consulta obrigatório!")
	private Integer mes;

	@NotNull(message = "Data da consulta obrigatório!")
	private Integer dia;

	@NotNull(message = "Data da consulta obrigatório!")
	private Integer hora;

	@NotNull(message = "Data da consulta obrigatório!")
	private Integer minuto;

	private String observacao;

	public Long getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Long idAgenda) {
		this.idAgenda = idAgenda;
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

	public StatusAgenda getStatusAgenda() {
		return statusAgenda;
	}

	public void setStatusAgenda(StatusAgenda statusAgenda) {
		this.statusAgenda = statusAgenda;
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

	public ProfissionalRequest getProfissionalRequest() {
		return profissionalRequest;
	}

	public void setProfissionalRequest(ProfissionalRequest profissionalRequest) {
		this.profissionalRequest = profissionalRequest;
	}

	public PacienteRequest getPacienteRequest() {
		return pacienteRequest;
	}

	public void setPacienteRequest(PacienteRequest pacienteRequest) {
		this.pacienteRequest = pacienteRequest;
	}

}
