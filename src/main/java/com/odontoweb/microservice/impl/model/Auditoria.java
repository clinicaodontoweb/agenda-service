package com.odontoweb.microservice.impl.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.odontoweb.microservice.impl.model.enums.TipoAcaoAuditoria;

@Entity
@Table(name = "TBL_AUDITORIA")
public class Auditoria implements Serializable {

	private static final long serialVersionUID = -7324893402738289653L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idAuditoria;

	@Column(name = "DTA_ATUALIZACAO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataAtualizacao;

	@Column(name = "TIPO_ACAO_AUDITORIA")
	@Enumerated(EnumType.STRING)
	private TipoAcaoAuditoria tipoAcaoAuditoria;

	@Column(name = "STR_TABELA")
	private String tabela;

	@Column(name = "NUM_ID_ENTIDADE")
	private Long idEntidade;

	@Column(name = "STR_USUARIO")
	private String usuario;

	@Lob
	@Column(name = "STR_DADOS")
	private String dados;

	public Long getIdAuditoria() {
		return idAuditoria;
	}

	public void setIdAuditoria(Long idAuditoria) {
		this.idAuditoria = idAuditoria;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public TipoAcaoAuditoria getTipoAcaoAuditoria() {
		return tipoAcaoAuditoria;
	}

	public void setTipoAcaoAuditoria(TipoAcaoAuditoria tipoAcaoAuditoria) {
		this.tipoAcaoAuditoria = tipoAcaoAuditoria;
	}

	public String getTabela() {
		return tabela;
	}

	public void setTabela(String tabela) {
		this.tabela = tabela;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getDados() {
		return dados;
	}

	public void setDados(String dados) {
		this.dados = dados;
	}

	public Long getIdEntidade() {
		return idEntidade;
	}

	public void setIdEntidade(Long idEntidade) {
		this.idEntidade = idEntidade;
	}

}
