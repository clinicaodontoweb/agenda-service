package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

import com.odontoweb.microservice.impl.model.enums.StatusEvento;

public class EventoResponse implements Serializable {

	private static final long serialVersionUID = 5941051393813560581L;

	private Long idEvento;
	private Boolean confirmado;
	private Boolean encaixe;
	private StatusEvento statusEvento;
	private TipoConsultaResponse tipoConsultaResponse;
	private ProfissionalResponse profissionalResponse;
	private PacienteResponse pacienteResponse;
	private Integer ano;
	private Integer mes;
	private Integer dia;
	private Integer hora;
	private Integer minuto;
	private String observacao;

	public EventoResponse() {
	}

	public EventoResponse(Long idEvento, Boolean confirmado, Boolean encaixe, StatusEvento statusEvento,
			TipoConsultaResponse tipoConsultaResponse, ProfissionalResponse profissionalResponse,
			PacienteResponse pacienteResponse, Integer ano, Integer mes, Integer dia, Integer hora, Integer minuto,
			String observacao) {
		this.idEvento = idEvento;
		this.confirmado = confirmado;
		this.encaixe = encaixe;
		this.statusEvento = statusEvento;
		this.tipoConsultaResponse = tipoConsultaResponse;
		this.profissionalResponse = profissionalResponse;
		this.pacienteResponse = pacienteResponse;
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
		this.hora = hora;
		this.minuto = minuto;
		this.observacao = observacao;

	}

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

	public TipoConsultaResponse getTipoConsultaResponse() {
		return tipoConsultaResponse;
	}

	public void setTipoConsultaResponse(TipoConsultaResponse tipoConsultaResponse) {
		this.tipoConsultaResponse = tipoConsultaResponse;
	}

	public ProfissionalResponse getProfissionalResponse() {
		return profissionalResponse;
	}

	public void setProfissionalResponse(ProfissionalResponse profissionalResponse) {
		this.profissionalResponse = profissionalResponse;
	}

	public PacienteResponse getPacienteResponse() {
		return pacienteResponse;
	}

	public void setPacienteResponse(PacienteResponse pacienteResponse) {
		this.pacienteResponse = pacienteResponse;
	}

}
