package com.odontoweb.microservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.odontoweb.microservice.impl.repository.AgendaRepository;
import com.odontoweb.microservice.impl.repository.BairroRepository;
import com.odontoweb.microservice.impl.repository.CepRepository;
import com.odontoweb.microservice.impl.repository.CidadeRepository;
import com.odontoweb.microservice.impl.repository.ConvenioRepository;
import com.odontoweb.microservice.impl.repository.EstadoRepository;
import com.odontoweb.microservice.impl.repository.PacienteRepository;
import com.odontoweb.microservice.impl.repository.ProfissionalRepository;
import com.odontoweb.microservice.impl.repository.SiglaRepository;
import com.odontoweb.microservice.impl.repository.TipoConsultaRepository;
import com.odontoweb.microservice.impl.service.AgendaService;
import com.odontoweb.microservice.impl.service.BairroService;
import com.odontoweb.microservice.impl.service.CepService;
import com.odontoweb.microservice.impl.service.CidadeService;
import com.odontoweb.microservice.impl.service.ConvenioService;
import com.odontoweb.microservice.impl.service.EstadoService;
import com.odontoweb.microservice.impl.service.PacienteService;
import com.odontoweb.microservice.impl.service.ProfissionalService;
import com.odontoweb.microservice.impl.service.SiglaService;
import com.odontoweb.microservice.impl.service.TipoConsultaService;
import com.odontoweb.microservice.rest.binder.AgendaBinder;
import com.odontoweb.microservice.rest.binder.BairroBinder;
import com.odontoweb.microservice.rest.binder.CepBinder;
import com.odontoweb.microservice.rest.binder.CidadeBinder;
import com.odontoweb.microservice.rest.binder.ConvenioBinder;
import com.odontoweb.microservice.rest.binder.EstadoBinder;
import com.odontoweb.microservice.rest.binder.PacienteBinder;
import com.odontoweb.microservice.rest.binder.ProfissionalBinder;
import com.odontoweb.microservice.rest.binder.SiglaBinder;
import com.odontoweb.microservice.rest.binder.TipoConsultaBinder;

@Configuration
public class ServiceConfig {

	@Bean
	public ConvenioService convenioService(ConvenioRepository repository) {
		return new ConvenioService(repository);
	}

	@Bean
	public PacienteService pacienteService(PacienteRepository repository) {
		return new PacienteService(repository);
	}

	@Bean
	public AgendaService agendaService(AgendaRepository repository, ProfissionalRepository profissionalRepository) {
		return new AgendaService(repository, profissionalRepository);
	}

	@Bean
	public ProfissionalService profissionalService(ProfissionalRepository repository) {
		return new ProfissionalService(repository);
	}

	@Bean
	public TipoConsultaService tipoConsultaService(TipoConsultaRepository repository) {
		return new TipoConsultaService(repository);
	}

	@Bean
	public BairroService BairroService(BairroRepository repository) {
		return new BairroService(repository);
	}

	@Bean
	public CidadeService CidadeService(CidadeRepository repository) {
		return new CidadeService(repository);
	}

	@Bean
	public EstadoService estadoService(EstadoRepository repository) {
		return new EstadoService(repository);
	}

	@Bean
	public CepService cepService(CepRepository repository) {
		return new CepService(repository);
	}

	@Bean
	public SiglaService siglaService(SiglaRepository repository) {
		return new SiglaService(repository);
	}

	@Bean
	public AgendaBinder agendaBinder() {
		return new AgendaBinder();
	}

	@Bean
	public BairroBinder bairroBinder() {
		return new BairroBinder();
	}

	@Bean
	public CepBinder cepBinder() {
		return new CepBinder();
	}

	@Bean
	public CidadeBinder cidadeBinder() {
		return new CidadeBinder();
	}

	@Bean
	public ConvenioBinder convenioBinder() {
		return new ConvenioBinder();
	}

	@Bean
	public EstadoBinder estadoBinder() {
		return new EstadoBinder();
	}

	@Bean
	public PacienteBinder pacienteBinder() {
		return new PacienteBinder();
	}

	@Bean
	public ProfissionalBinder profissionalBinder() {
		return new ProfissionalBinder();
	}

	@Bean
	public SiglaBinder siglaBinder() {
		return new SiglaBinder();
	}

	@Bean
	public TipoConsultaBinder tipoConsultaBinder() {
		return new TipoConsultaBinder();
	}
}
