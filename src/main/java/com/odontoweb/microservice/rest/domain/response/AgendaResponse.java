package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

import com.odontoweb.microservice.impl.model.Paciente;
import com.odontoweb.microservice.impl.model.Profissional;
import com.odontoweb.microservice.impl.model.TipoConsulta;
import com.odontoweb.microservice.impl.model.enums.StatusAgenda;

public class AgendaResponse implements Serializable {

	private static final long serialVersionUID = 5941051393813560581L;

	private Long idAgenda;
	private Boolean confirmado;
	private Boolean encaixe;
	private StatusAgenda statusAgenda;
	private TipoConsulta tipoConsulta;
	private Profissional profissional;
	private Paciente paciente;
	private Integer ano;
	private Integer mes;
	private Integer dia;
	private Integer hora;
	private Integer minuto;
	private String observacao;

	public AgendaResponse() {
	}

	public AgendaResponse(Long idAgenda, Boolean confirmado, Boolean encaixe, StatusAgenda statusAgenda,
			TipoConsulta tipoConsulta, Profissional profissional, Paciente paciente, Integer ano, Integer mes,
			Integer dia, Integer hora, Integer minuto, String observacao) {
		this.idAgenda = idAgenda;
		this.confirmado = confirmado;
		this.encaixe = encaixe;
		this.statusAgenda = statusAgenda;
		this.tipoConsulta = tipoConsulta;
		this.profissional = profissional;
		this.paciente = paciente;
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
		this.hora = hora;
		this.minuto = minuto;
		this.observacao = observacao;

	}

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

	public TipoConsulta getTipoConsulta() {
		return tipoConsulta;
	}

	public void setTipoConsulta(TipoConsulta tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
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

}
