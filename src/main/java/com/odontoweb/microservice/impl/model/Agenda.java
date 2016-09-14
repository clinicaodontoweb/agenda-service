package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.odontoweb.microservice.impl.model.enums.StatusAgenda;

@Entity
@Table(name = "TBL_AGENDA")
public class Agenda implements Serializable {

	private static final long serialVersionUID = -2835460669437123413L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idAgenda;
	
	@Column(name = "BOO_CONFIRMADO")
	private Boolean confirmado;
	
	@Column(name = "BOO_ENCAIXE")
	private Boolean encaixe;
	
	@Column(name = "STR_STATUS_AGENDA")
	@Enumerated(EnumType.STRING)
	private StatusAgenda statusAgenda;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_TIPO_CONSULTA")
	private TipoConsulta tipoConsulta;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_PROFISSIONAL")
	private Profissional profissional;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_PACIENTE")
	private Paciente paciente;
	
	@Column(name = "NUM_ANO")
	private Integer ano;
	
	@Column(name = "NUM_MES")
	private Integer mes;
	
	@Column(name = "NUM_DIA")
	private Integer dia;
	
	@Column(name = "NUM_HORA")
	private Integer hora;
	
	@Column(name = "NUM_MINUTO")
	private Integer minuto;
	
	@Column(name = "STR_OBSERVACAO")
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

	@Override
	public String toString() {
		return "Agenda [id=" + idAgenda + ", confirmado=" + confirmado + ", encaixe=" + encaixe + ", statusAgenda="
				+ statusAgenda + ", tipoConsulta=" + tipoConsulta + ", profissional=" + profissional + ", paciente="
				+ paciente + ", ano=" + ano + ", mes=" + mes + ", dia=" + dia + ", hora=" + hora + ", minuto=" + minuto
				+ ", observacao=" + observacao + "]";
	}

}
