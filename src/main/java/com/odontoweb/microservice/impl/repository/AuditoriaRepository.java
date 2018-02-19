package com.odontoweb.microservice.impl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.Auditoria;
import com.odontoweb.microservice.impl.model.enums.TipoAcaoAuditoria;

public interface AuditoriaRepository extends JpaRepository<Auditoria, Long> {
	public List<Auditoria> findByTabela(String tabela);
	public List<Auditoria> findByIdEntidadeAndTabela(Long idEntidade, String tabela);
	public List<Auditoria> findByIdEntidadeAndTabelaAndTipoAcaoAuditoria(Long idEntidade, String tabela, TipoAcaoAuditoria tipoAcaoAuditoria);
}
