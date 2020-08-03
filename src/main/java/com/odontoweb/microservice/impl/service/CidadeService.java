package com.odontoweb.microservice.impl.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Cidade;
import com.odontoweb.microservice.impl.model.Estado;
import com.odontoweb.microservice.impl.model.Sigla;
import com.odontoweb.microservice.impl.repository.CidadeRepository;
import com.odontoweb.microservice.impl.repository.EstadoRepository;
import com.odontoweb.microservice.impl.repository.SiglaRepository;

public class CidadeService implements Serializable {

	private static final long serialVersionUID = -3365479642577507797L;

	private CidadeRepository cidadeRepository;
	private SiglaRepository siglaRepository;
	private EstadoRepository estadoRepository;

	@Autowired
	public CidadeService(CidadeRepository cidadeRepository, SiglaRepository siglaRepository,
			EstadoRepository estadoRepository) {
		this.cidadeRepository = cidadeRepository;
		this.siglaRepository = siglaRepository;
		this.estadoRepository = estadoRepository;
	}

	public List<Cidade> findAll() {
		return cidadeRepository.findAll();
	}

	public boolean save(Cidade cidade) {
		return cidadeRepository.save(cidade) != null;
	}

	public Cidade findById(Long id) {
		return cidadeRepository.getOne(id);
	}

	public void delete(Long id) {
		cidadeRepository.deleteById(id);
	}

	public Cidade findByNomeAndEstado(String nome, String sigla) {
		Sigla siglaModel = siglaRepository.findBySigla(sigla);
		Estado estadoModel = estadoRepository.findBySigla(siglaModel);
		Cidade cidade = cidadeRepository.findByNomeAndEstado(nome, estadoModel);
		if(cidade == null) {
			cidade = new Cidade(null, nome, estadoModel);
			if(save(cidade)) {
				return cidade;
			}
			return null;
		}
		return cidade;
	}
}
