package com.odontoweb.microservice.impl.service;

import java.util.List;

import com.odontoweb.microservice.impl.model.TipoConsulta;
import com.odontoweb.microservice.impl.repository.TipoConsultaRepository;

public class TipoConsultaService {

	private TipoConsultaRepository tipoConsultaRepository;
	
	public TipoConsultaService(TipoConsultaRepository tipoConsultaRepository) {
		this.tipoConsultaRepository = tipoConsultaRepository;
	}
	
	public List<TipoConsulta> findAll(){
		return this.tipoConsultaRepository.findAll();
	}
	
	public boolean save(TipoConsulta tipoConsulta){
		return this.tipoConsultaRepository.save(tipoConsulta) != null;
	}
	
	public TipoConsulta findById(Long id){
		return this.tipoConsultaRepository.getOne(id);
	}
	
	public void delete(Long id) {
		tipoConsultaRepository.deleteById(id);
	}
	
}
