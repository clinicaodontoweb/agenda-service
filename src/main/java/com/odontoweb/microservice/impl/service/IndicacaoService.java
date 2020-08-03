package com.odontoweb.microservice.impl.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Indicacao;
import com.odontoweb.microservice.impl.repository.IndicacaoRepository;
import com.odontoweb.microservice.rest.domain.request.IndicacaoRequest;

public class IndicacaoService implements Serializable {

	private static final long serialVersionUID = -4998591815407410597L;

	private IndicacaoRepository indicacaoRepository;

	@Autowired
	public IndicacaoService(IndicacaoRepository indicacaoRepository) {
		this.indicacaoRepository = indicacaoRepository;
	}

	public List<Indicacao> findAll() {
		return indicacaoRepository.findAll();
	}

	public boolean save(Indicacao indicacao) {
		return indicacaoRepository.save(indicacao) != null;
	}

	public Indicacao findById(Long id) {
		return indicacaoRepository.getOne(id);
	}

	public void delete(Long id) {
		indicacaoRepository.deleteById(id);
	}

	public Indicacao findByNome(String nomeIndicacao) {
		Indicacao indicacao = indicacaoRepository.findByNome(nomeIndicacao);
		if (indicacao == null) {
			indicacao = new Indicacao();
			indicacao.setNome(nomeIndicacao);
			save(indicacao);
		}
		return indicacao;
	}

	public Indicacao findByNome(IndicacaoRequest indicacaoRequest) {
		if (indicacaoRequest.getIdIndicacao() != null)
			return new Indicacao(indicacaoRequest.getIdIndicacao(), indicacaoRequest.getNome());
		return findByNome(indicacaoRequest.getNome());
	}

}
