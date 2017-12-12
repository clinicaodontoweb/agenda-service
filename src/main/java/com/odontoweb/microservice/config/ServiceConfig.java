package com.odontoweb.microservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.odontoweb.microservice.impl.repository.AgendaRepository;
import com.odontoweb.microservice.impl.repository.BairroRepository;
import com.odontoweb.microservice.impl.repository.CepRepository;
import com.odontoweb.microservice.impl.repository.CidadeRepository;
import com.odontoweb.microservice.impl.repository.ConvenioRepository;
import com.odontoweb.microservice.impl.repository.EstadoRepository;
import com.odontoweb.microservice.impl.repository.EventoRepository;
import com.odontoweb.microservice.impl.repository.PacienteRepository;
import com.odontoweb.microservice.impl.repository.SiglaRepository;
import com.odontoweb.microservice.impl.repository.StatusRepository;
import com.odontoweb.microservice.impl.repository.TipoConsultaRepository;
import com.odontoweb.microservice.impl.repository.UsuarioClinicaRepository;
import com.odontoweb.microservice.impl.service.AgendaService;
import com.odontoweb.microservice.impl.service.BairroService;
import com.odontoweb.microservice.impl.service.CepService;
import com.odontoweb.microservice.impl.service.CidadeService;
import com.odontoweb.microservice.impl.service.ConvenioService;
import com.odontoweb.microservice.impl.service.EstadoService;
import com.odontoweb.microservice.impl.service.EventoService;
import com.odontoweb.microservice.impl.service.PacienteService;
import com.odontoweb.microservice.impl.service.SiglaService;
import com.odontoweb.microservice.impl.service.StatusService;
import com.odontoweb.microservice.impl.service.TipoConsultaService;
import com.odontoweb.microservice.impl.service.UsuarioClinicaService;
import com.odontoweb.microservice.rest.binder.AgendaBinder;
import com.odontoweb.microservice.rest.binder.BairroBinder;
import com.odontoweb.microservice.rest.binder.CepBinder;
import com.odontoweb.microservice.rest.binder.CidadeBinder;
import com.odontoweb.microservice.rest.binder.ConvenioBinder;
import com.odontoweb.microservice.rest.binder.EnderecoBinder;
import com.odontoweb.microservice.rest.binder.EstadoBinder;
import com.odontoweb.microservice.rest.binder.EventoBinder;
import com.odontoweb.microservice.rest.binder.PacienteBinder;
import com.odontoweb.microservice.rest.binder.SiglaBinder;
import com.odontoweb.microservice.rest.binder.StatusBinder;
import com.odontoweb.microservice.rest.binder.TipoConsultaBinder;
import com.odontoweb.microservice.rest.binder.UsuarioClinicaBinder;

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
	public AgendaService agendaService(AgendaRepository repository, UsuarioClinicaRepository usuarioclinicaRepository) {
		return new AgendaService(repository, usuarioclinicaRepository);
	}

	@Bean
	public EventoService eventoService(EventoRepository repository) {
		return new EventoService(repository);
	}

	@Bean
	public TipoConsultaService tipoConsultaService(TipoConsultaRepository repository) {
		return new TipoConsultaService(repository);
	}

	@Bean
	public StatusService statusService(StatusRepository repository) {
		return new StatusService(repository);
	}

	@Bean
	public BairroService BairroService(BairroRepository repository) {
		return new BairroService(repository);
	}

	@Bean
	public CidadeService CidadeService(CidadeRepository repository, SiglaRepository siglaRepository,
			EstadoRepository estadoRepository) {
		return new CidadeService(repository, siglaRepository, estadoRepository);
	}

	@Bean
	public EstadoService estadoService(EstadoRepository repository, SiglaRepository siglaRepository) {
		return new EstadoService(repository, siglaRepository);
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
	public UsuarioClinicaService usuarioClinicaService(UsuarioClinicaRepository repository) {
		return new UsuarioClinicaService(repository);
	}

	@Bean
	public AgendaBinder agendaBinder(AgendaRepository agendaRepository,
			UsuarioClinicaRepository usuarioclinicaRepository) {
		return new AgendaBinder(agendaService(agendaRepository, usuarioclinicaRepository));
	}

	@Bean
	public EventoBinder eventoBinder(ConvenioRepository convenioRepository, PacienteRepository pacienteRepository,
			TipoConsultaRepository tipoConsultaRepository, StatusRepository statusRepository,
			CepRepository cepRepository, CidadeRepository cidadeRepository, SiglaRepository siglaRepository,
			EstadoRepository estadoRepository, BairroRepository bairroRepository, AgendaRepository agendaRepository,
			UsuarioClinicaRepository usuarioClinicaRepository) {
		return new EventoBinder(
				convenioBinder(convenioRepository, cepRepository, cidadeRepository, siglaRepository, estadoRepository,
						bairroRepository),
				pacienteBinder(pacienteRepository, cepRepository, cidadeRepository, siglaRepository, estadoRepository,
						bairroRepository, convenioRepository),
				statusBinder(statusRepository), tipoConsultaBinder(tipoConsultaRepository),
				agendaBinder(agendaRepository, usuarioClinicaRepository));

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
	public ConvenioBinder convenioBinder(ConvenioRepository convenioRepository, CepRepository cepRepository,
			CidadeRepository cidadeRepository, SiglaRepository siglaRepository, EstadoRepository estadoRepository,
			BairroRepository bairroRepository) {
		return new ConvenioBinder(convenioService(convenioRepository),
				enderecoBinder(cepRepository, cidadeRepository, siglaRepository, estadoRepository, bairroRepository));
	}

	@Bean
	public EstadoBinder estadoBinder() {
		return new EstadoBinder();
	}

	@Bean
	public PacienteBinder pacienteBinder(PacienteRepository pacienteRepository, CepRepository cepRepository,
			CidadeRepository cidadeRepository, SiglaRepository siglaRepository, EstadoRepository estadoRepository,
			BairroRepository bairroRepository, ConvenioRepository convenioRepository) {
		return new PacienteBinder(pacienteService(pacienteRepository),
				enderecoBinder(cepRepository, cidadeRepository, siglaRepository, estadoRepository, bairroRepository),
				convenioBinder(convenioRepository, cepRepository, cidadeRepository, siglaRepository, estadoRepository,
						bairroRepository));
	}

	@Bean
	public SiglaBinder siglaBinder() {
		return new SiglaBinder();
	}

	@Bean
	public TipoConsultaBinder tipoConsultaBinder(TipoConsultaRepository tipoConsultaRepository) {
		return new TipoConsultaBinder(tipoConsultaService(tipoConsultaRepository));
	}

	@Bean
	public StatusBinder statusBinder(StatusRepository repository) {
		return new StatusBinder(statusService(repository));
	}

	@Bean
	public UsuarioClinicaBinder usuarioClinicaBinder() {
		return new UsuarioClinicaBinder();
	}

	@Bean
	public EnderecoBinder enderecoBinder(CepRepository cepRepository, CidadeRepository cidadeRepository,
			SiglaRepository siglaRepository, EstadoRepository estadoRepository, BairroRepository bairroRepository) {
		return new EnderecoBinder(cepService(cepRepository),
				CidadeService(cidadeRepository, siglaRepository, estadoRepository), BairroService(bairroRepository));
	}

}
