package com.odontoweb.microservice.impl.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TBL_EVENTO")
public class Evento implements Serializable {

	private static final long serialVersionUID = -2835460669437123413L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idEvento;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_AGENDA")
	private Agenda agenda;

	@Column(name = "BOO_ENCAIXE")
	private Boolean encaixe;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_STATUS")
	private Status status;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_TIPO_CONSULTA")
	private TipoConsulta tipoConsulta;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_PACIENTE")
	private Paciente paciente;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_CONVENIO")
	private Convenio convenio;

	@Lob
	@Column(name = "STR_OBSERVACAO")
	private String observacao;

	@Column(name = "DTA_INICIO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInicio;

	@Column(name = "DTA_FIM")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataFim;

	public Evento() {
	}

	public Evento(Long idEvento, Boolean encaixe, Status status, TipoConsulta tipoConsulta, Agenda agenda,
			Paciente paciente, Convenio convenio, Date dataInicio, Date dataFim, String observacao) {
		this.idEvento = idEvento;
		this.encaixe = encaixe;
		this.status = status;
		this.tipoConsulta = tipoConsulta;
		this.agenda = agenda;
		this.paciente = paciente;
		this.convenio = convenio;
		this.observacao = observacao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;

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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public TipoConsulta getTipoConsulta() {
		return tipoConsulta;
	}

	public void setTipoConsulta(TipoConsulta tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	@Override
	public String toString() {
		return "Evento [id=" + idEvento + ", encaixe=" + encaixe + ", statusEvento=" + status + ", tipoConsulta="
				+ tipoConsulta + ", agenda" + agenda + ", paciente=" + paciente + ", convenio=" + convenio
				+ ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", observacao=" + observacao + "]";
	}

}
