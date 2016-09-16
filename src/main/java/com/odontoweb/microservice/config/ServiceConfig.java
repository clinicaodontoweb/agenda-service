package com.odontoweb.microservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

import com.odontoweb.microservice.impl.repository.AgendaRepository;
import com.odontoweb.microservice.impl.repository.BairroRepository;
import com.odontoweb.microservice.impl.repository.CepRepository;
import com.odontoweb.microservice.impl.repository.CidadeRepository;
import com.odontoweb.microservice.impl.repository.ConvenioRepository;
import com.odontoweb.microservice.impl.repository.EstadoRepository;
import com.odontoweb.microservice.impl.repository.PacienteRepository;
import com.odontoweb.microservice.impl.repository.ProfissionalRepository;
import com.odontoweb.microservice.impl.repository.RoleRepository;
import com.odontoweb.microservice.impl.repository.SiglaRepository;
import com.odontoweb.microservice.impl.repository.TipoConsultaRepository;
import com.odontoweb.microservice.impl.repository.UsuarioRepository;
import com.odontoweb.microservice.impl.service.AgendaService;
import com.odontoweb.microservice.impl.service.BairroService;
import com.odontoweb.microservice.impl.service.CepService;
import com.odontoweb.microservice.impl.service.CidadeService;
import com.odontoweb.microservice.impl.service.ConvenioService;
import com.odontoweb.microservice.impl.service.EstadoService;
import com.odontoweb.microservice.impl.service.PacienteService;
import com.odontoweb.microservice.impl.service.ProfissionalService;
import com.odontoweb.microservice.impl.service.RoleService;
import com.odontoweb.microservice.impl.service.SiglaService;
import com.odontoweb.microservice.impl.service.TipoConsultaService;
import com.odontoweb.microservice.impl.service.UsuarioService;
import com.odontoweb.microservice.rest.binder.UsuarioBinder;

@Configuration
public class ServiceConfig {

	@Bean
	public UsuarioService usuarioService(UsuarioRepository repositorio, Md5PasswordEncoder encoder) {
		return new UsuarioService(repositorio, encoder);
	}

	@Bean
	public RoleService roleService(RoleRepository repository) {
		return new RoleService(repository);
	}

	@Bean
	public ConvenioService convenioService(ConvenioRepository repository) {
		return new ConvenioService(repository);
	}

	@Bean
	public PacienteService pacienteService(PacienteRepository repository) {
		return new PacienteService(repository);
	}

	@Bean
	public AgendaService agendaService(AgendaRepository repository) {
		return new AgendaService(repository);
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
	public UsuarioBinder usuarioBinder() {
		return new UsuarioBinder();
	}
}
