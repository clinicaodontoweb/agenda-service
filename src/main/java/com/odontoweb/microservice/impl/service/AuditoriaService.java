package com.odontoweb.microservice.impl.service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.odontoweb.microservice.impl.model.Auditoria;
import com.odontoweb.microservice.impl.model.enums.TipoAcaoAuditoria;
import com.odontoweb.microservice.impl.repository.AuditoriaRepository;

public class AuditoriaService implements Serializable {

	private static final long serialVersionUID = -4998591815407410597L;

	private AuditoriaRepository auditoriaRepository;
	private ObjectMapper mapper;

	@Autowired
	public AuditoriaService(AuditoriaRepository auditoriaRepository, ObjectMapper mapper) {
		this.auditoriaRepository = auditoriaRepository;
		this.mapper = mapper;
	}

	public List<Auditoria> findByTabela(String tabela) {
		return this.auditoriaRepository.findByTabela(tabela);
	}

	public List<Auditoria> findByIdEntidadeAndTabela(Long idEntidade, String tabela) {
		return this.auditoriaRepository.findByIdEntidadeAndTabela(idEntidade, tabela);
	}

	public List<Auditoria> findByIdEntidadeAndTabelaAndTipoAcaoAuditoria(Long idEntidade, String tabela,
			TipoAcaoAuditoria tipoAcaoAuditoria) {
		return this.auditoriaRepository.findByIdEntidadeAndTabelaAndTipoAcaoAuditoria(idEntidade, tabela,
				tipoAcaoAuditoria);
	}
	
	public boolean save(Object entity, Long idEntidade, String nomeTabela, TipoAcaoAuditoria tipoAcaoAuditoria, String nomeUsuario) {
		Auditoria auditoria = new Auditoria();
		auditoria.setDataAtualizacao(new Date());
		auditoria.setIdEntidade(idEntidade);
		auditoria.setTabela(nomeTabela);
		auditoria.setTipoAcaoAuditoria(tipoAcaoAuditoria);
		auditoria.setUsuario(nomeUsuario);
		try {
			String dados = mapper.writeValueAsString(entity);
			auditoria.setDados(dados);
			auditoriaRepository.save(auditoria);
			return true;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return false;
		}
	}

}
