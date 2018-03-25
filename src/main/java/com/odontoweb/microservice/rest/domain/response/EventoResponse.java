package com.odontoweb.microservice.rest.domain.response;

import java.io.Serializable;

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

	public EventoResponse() {
	}

	public EventoResponse(Long idEvento, Boolean encaixe, StatusResponse status, TipoConsultaResponse tipoConsulta,
			AgendaResponse agenda, PacienteResponse paciente, ConvenioPacienteResponse convenioPaciente,
			String observacao, Long dataInicio, Long dataFim) {
		this.idEvento = idEvento;
		this.encaixe = encaixe;
		this.statusEvento = status;
		this.tipoConsulta = tipoConsulta;
		this.agenda = agenda;
		this.paciente = paciente;
		this.convenioPaciente = convenioPaciente;
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

	public StatusResponse getStatusEvento() {
		return statusEvento;
	}

	public void setStatusEvento(StatusResponse statusEvento) {
		this.statusEvento = statusEvento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
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

	public TipoConsultaResponse getTipoConsulta() {
		return tipoConsulta;
	}

	public void setTipoConsulta(TipoConsultaResponse tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	public AgendaResponse getAgenda() {
		return agenda;
	}

	public void setAgenda(AgendaResponse agenda) {
		this.agenda = agenda;
	}

	public PacienteResponse getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteResponse paciente) {
		this.paciente = paciente;
	}

	public ConvenioPacienteResponse getConvenioPaciente() {
		return convenioPaciente;
	}

	public void setConvenioPaciente(ConvenioPacienteResponse convenioPaciente) {
		this.convenioPaciente = convenioPaciente;
	}

}
