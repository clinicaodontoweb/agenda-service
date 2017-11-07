package com.odontoweb.microservice.rest.domain.request;

import java.io.Serializable;

public class AgendamentoRequest implements Serializable{
    private static final long serialVersionUID = 2897521903307927826L;

    private Long id;
    private Boolean encaixe;
    private String status;
    private String observacao;
    private Long dataInicio;
    private Long dataFim;
    private Long idTipoConsulta;
    private Long idPaciente;
    private Long idConvenio;
    private Long idAgenda;

    AgendamentoRequest(){}

    public AgendamentoRequest(Long id, Boolean encaixe, String status, String observacao, Long dataInicio, Long dataFim, Long idTipoConsulta, Long idPaciente, Long idConvenio, Long idAgenda) {
        this.id = id;
        this.encaixe = encaixe;
        this.status = status;
        this.observacao = observacao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.idTipoConsulta = idTipoConsulta;
        this.idPaciente = idPaciente;
        this.idConvenio = idConvenio;
        this.idAgenda = idAgenda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getEncaixe() {
        return encaixe;
    }

    public void setEncaixe(Boolean encaixe) {
        this.encaixe = encaixe;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Long getIdTipoConsulta() {
        return idTipoConsulta;
    }

    public void setIdTipoConsulta(Long idTipoConsulta) {
        this.idTipoConsulta = idTipoConsulta;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Long getIdConvenio() {
        return idConvenio;
    }

    public void setIdConvenio(Long idConvenio) {
        this.idConvenio = idConvenio;
    }

    public Long getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(Long idAgenda) {
        this.idAgenda = idAgenda;
    }
}
