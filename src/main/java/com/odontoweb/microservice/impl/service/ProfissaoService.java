package com.odontoweb.microservice.impl.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Profissao;
import com.odontoweb.microservice.impl.repository.ProfissaoRepository;
import com.odontoweb.microservice.rest.domain.request.ProfissaoRequest;

public class ProfissaoService implements Serializable {

	private static final long serialVersionUID = -4998591815407410597L;

	private ProfissaoRepository profissaoRepository;

	@Autowired
	public ProfissaoService(ProfissaoRepository profissaoRepository) {
		this.profissaoRepository = profissaoRepository;
	}

	public List<Profissao> findAll() {
		return profissaoRepository.findAll();
	}

	public boolean save(Profissao profissao) {
		return profissaoRepository.save(profissao) != null;
	}

	public Profissao findById(Long id) {
		return profissaoRepository.findOne(id);
	}

	public void delete(Long id) {
		profissaoRepository.delete(id);
	}

	public Profissao findByNome(String nomeProfissao) {
		Profissao profissao = profissaoRepository.findByNome(nomeProfissao);
		if (profissao == null) {
			profissao = new Profissao();
			profissao.setNome(nomeProfissao);
			save(profissao);
		}
		return profissao;
	}

	public Profissao findByNome(ProfissaoRequest profissaoRequest) {
		if (profissaoRequest.getIdProfissao() != null)
			return new Profissao(profissaoRequest.getIdProfissao(), profissaoRequest.getNome());
		return findByNome(profissaoRequest.getNome());
	}

}
