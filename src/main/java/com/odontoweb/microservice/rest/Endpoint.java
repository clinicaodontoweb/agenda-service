package com.odontoweb.microservice.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.odontoweb.arquitetura.exception.response.ExceptionResponse;
import com.odontoweb.arquitetura.model.User;
import com.odontoweb.microservice.exception.UsuarioDuplicateFoundException;
import com.odontoweb.microservice.exception.UsuarioNotFoundException;
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
import com.odontoweb.microservice.rest.binder.EstadoBinder;
import com.odontoweb.microservice.rest.binder.EventoBinder;
import com.odontoweb.microservice.rest.binder.PacienteBinder;
import com.odontoweb.microservice.rest.binder.SiglaBinder;
import com.odontoweb.microservice.rest.binder.StatusBinder;
import com.odontoweb.microservice.rest.binder.TipoConsultaBinder;
import com.odontoweb.microservice.rest.binder.UsuarioClinicaBinder;
import com.odontoweb.microservice.rest.domain.request.AgendaRequest;
import com.odontoweb.microservice.rest.domain.request.BairroRequest;
import com.odontoweb.microservice.rest.domain.request.ConvenioRequest;
import com.odontoweb.microservice.rest.domain.request.EventoRequest;
import com.odontoweb.microservice.rest.domain.request.PacienteRequest;
import com.odontoweb.microservice.rest.domain.request.StatusRequest;
import com.odontoweb.microservice.rest.domain.request.TipoConsultaRequest;
import com.odontoweb.microservice.rest.domain.request.UsuarioClinicaRequest;
import com.odontoweb.microservice.rest.domain.response.AgendaResponse;
import com.odontoweb.microservice.rest.domain.response.BairroResponse;
import com.odontoweb.microservice.rest.domain.response.CepResponse;
import com.odontoweb.microservice.rest.domain.response.CidadeResponse;
import com.odontoweb.microservice.rest.domain.response.ConvenioResponse;
import com.odontoweb.microservice.rest.domain.response.EstadoResponse;
import com.odontoweb.microservice.rest.domain.response.EventoResponse;
import com.odontoweb.microservice.rest.domain.response.PacienteResponse;
import com.odontoweb.microservice.rest.domain.response.SiglaResponse;
import com.odontoweb.microservice.rest.domain.response.StatusResponse;
import com.odontoweb.microservice.rest.domain.response.TipoConsultaResponse;

@RestController
public class Endpoint {

	@Autowired
	SiglaService siglaService;

	@Autowired
	EventoService eventoService;

	@Autowired
	AgendaService agendaService;

	@Autowired
	ConvenioService convenioService;

	@Autowired
	BairroService bairroService;

	@Autowired
	CepService cepService;

	@Autowired
	CidadeService cidadeService;

	@Autowired
	TipoConsultaService tipoConsultaService;

	@Autowired
	StatusService statusService;

	@Autowired
	EstadoService estadoService;

	@Autowired
	PacienteService pacienteService;

	@Autowired
	UsuarioClinicaService usuarioClinicaService;

	@Autowired
	SiglaBinder siglaBinder;

	@Autowired
	TipoConsultaBinder tipoConsultaBinder;

	@Autowired
	StatusBinder statusBinder;

	@Autowired
	EstadoBinder estadoBinder;

	@Autowired
	PacienteBinder pacienteBinder;

	@Autowired
	BairroBinder bairroBinder;

	@Autowired
	CepBinder cepBinder;

	@Autowired
	CidadeBinder cidadeBinder;

	@Autowired
	EventoBinder eventoBinder;

	@Autowired
	AgendaBinder agendaBinder;

	@Autowired
	ConvenioBinder convenioBinder;

	@Autowired
	UsuarioClinicaBinder usuarioClinicaBinder;

	@RequestMapping(value = "/evento/{id}", method = RequestMethod.POST)
	public ResponseEntity<?> saveEvento(@RequestBody @Valid EventoRequest eventoRequest, @PathVariable("id") Long id) {
		try {
			eventoService.save(eventoBinder.requestToModel(eventoRequest), id);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/evento/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateEvento(@RequestBody @Valid EventoRequest eventoRequest,
			@PathVariable("id") Long id) {
		try {
			eventoService.save(eventoBinder.requestToModel(eventoRequest), id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/agenda", method = RequestMethod.POST)
	public ResponseEntity<?> saveAgenda(@RequestBody @Valid AgendaRequest agendaRequest) {
		agendaService.save(agendaBinder.requestToModel(agendaRequest));
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/agenda", method = RequestMethod.PUT)
	public ResponseEntity<?> updateAgenda(@RequestBody @Valid AgendaRequest agendaRequest) {
		try {
			agendaService.save(agendaBinder.requestToModel(agendaRequest));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/convenio", method = RequestMethod.POST)
	public ResponseEntity<?> saveConvenio(@RequestBody @Valid ConvenioRequest convenioRequest) {
		try {
			convenioService.save(convenioBinder.requestToModel(convenioRequest));
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/convenio", method = RequestMethod.PUT)
	public ResponseEntity<?> updateConvenio(@RequestBody @Valid ConvenioRequest convenioRequest) {
		try {
			convenioService.save(convenioBinder.requestToModel(convenioRequest));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/bairro", method = RequestMethod.POST)
	public ResponseEntity<?> saveBairro(@RequestBody @Valid BairroRequest bairroRequest) {
		try {
			bairroService.save(bairroBinder.requestToModel(bairroRequest));
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/bairro", method = RequestMethod.PUT)
	public ResponseEntity<?> updateBairro(@RequestBody @Valid BairroRequest bairroRequest) {
		try {
			bairroService.save(bairroBinder.requestToModel(bairroRequest));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/paciente", method = RequestMethod.POST)
	public ResponseEntity<?> savePaciente(@RequestBody @Valid PacienteRequest pacienteRequest) {
		try {
			pacienteService.save(pacienteBinder.requestToModel(pacienteRequest));
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/paciente", method = RequestMethod.PUT)
	public ResponseEntity<?> updatePaciente(@RequestBody @Valid PacienteRequest pacienteRequest) {
		try {
			pacienteService.save(pacienteBinder.requestToModel(pacienteRequest));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/usuarioClinica", method = RequestMethod.POST)
	public ResponseEntity<?> saveUsuarioClinica(@RequestBody @Valid UsuarioClinicaRequest usuarioClinicaRequest) {
		try {
			if (usuarioClinicaService.usuarioExists(usuarioClinicaRequest.getEmail())) {
				throw new UsuarioDuplicateFoundException();
			}
			usuarioClinicaService.save(usuarioClinicaBinder.requestToModel(usuarioClinicaRequest));
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/usuarioClinica", method = RequestMethod.PUT)
	public ResponseEntity<?> updateUsuarioClinica(@RequestBody @Valid UsuarioClinicaRequest usuarioClinicaRequest) {
		try {
			if (!usuarioClinicaService.usuarioExists(usuarioClinicaRequest.getEmail())) {
				throw new UsuarioNotFoundException();
			}
			usuarioClinicaService.save(usuarioClinicaBinder.requestToModel(usuarioClinicaRequest));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/sigla", method = RequestMethod.GET)
	public ResponseEntity<?> findAllSigla() {
		try {
			return new ResponseEntity<List<SiglaResponse>>(siglaBinder.modelToListResponse(siglaService.findAll()),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/evento", method = RequestMethod.GET)
	public ResponseEntity<?> findAllEventos() {
		try {
			return new ResponseEntity<List<EventoResponse>>(eventoBinder.modelToListResponse(eventoService.findAll()),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/agenda", method = RequestMethod.GET)
	public ResponseEntity<?> findAllAgendas() {
		try {
			return new ResponseEntity<List<AgendaResponse>>(agendaBinder.modelToListResponse(agendaService.findAll()),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/convenio", method = RequestMethod.GET)
	public ResponseEntity<?> findAllConvenios() {
		try {
			return new ResponseEntity<List<ConvenioResponse>>(
					convenioBinder.modelToListResponse(convenioService.findAll()), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/bairro", method = RequestMethod.GET)
	public ResponseEntity<?> findAllBairros() {
		try {
			return new ResponseEntity<List<BairroResponse>>(bairroBinder.modelToListResponse(bairroService.findAll()),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/cep", method = RequestMethod.GET)
	public ResponseEntity<?> findAllCep() {
		try {
			return new ResponseEntity<List<CepResponse>>(cepBinder.modelToListResponse(cepService.findAll()),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/cidade", method = RequestMethod.GET)
	public ResponseEntity<?> findAllCidades() {
		try {
			return new ResponseEntity<List<CidadeResponse>>(cidadeBinder.modelToListResponse(cidadeService.findAll()),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/estado", method = RequestMethod.GET)
	public ResponseEntity<?> findAllEstados() {
		try {
			return new ResponseEntity<List<EstadoResponse>>(estadoBinder.modelToListResponse(estadoService.findAll()),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/paciente", method = RequestMethod.GET)
	public ResponseEntity<?> findAllPacientes() {
		try {
			return new ResponseEntity<List<PacienteResponse>>(
					pacienteBinder.modelToListResponse(pacienteService.findAll()), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/paciente/autocomplete/{nome}", method = RequestMethod.GET)
	public ResponseEntity<?> findPacientesByNome(@PathVariable("nome") String nome) {
		try {
			return new ResponseEntity<List<PacienteResponse>>(
					pacienteBinder.modelToListResponse(pacienteService.findPacientesByNome(nome)), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/sigla/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteSigla(@PathVariable("id") Long id) {
		try {
			siglaService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/evento/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteEvento(@PathVariable("id") Long id) {
		try {
			eventoService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/agenda/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteAgenda(@PathVariable("id") Long id) {
		try {
			agendaService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/convenio/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteConvenio(@PathVariable("id") Long id) {
		try {
			convenioService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/bairro/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteBairro(@PathVariable("id") Long id) {
		try {
			bairroService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/cep/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteCep(@PathVariable("id") Long id) {
		try {
			cepService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/cidade/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteCidade(@PathVariable("id") Long id) {
		try {
			cidadeService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/estado/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteEstado(@PathVariable("id") Long id) {
		try {
			estadoService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/paciente/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletePaciente(@PathVariable("id") Long id) {
		try {
			pacienteService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/usuarioClinica/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteUsuarioClinica(@PathVariable("id") Long id) {
		try {
			usuarioClinicaService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/sigla/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findSiglaById(@PathVariable("id") Long id) {
		try {
			return new ResponseEntity<>(siglaBinder.modelToResponse(siglaService.findById(id)), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/evento/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findEventoById(@PathVariable("id") Long id) {
		try {
			return new ResponseEntity<>(eventoBinder.modelToResponse(eventoService.findById(id)), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/evento/paciente/nome/{nome}", method = RequestMethod.GET)
	public ResponseEntity<?> findEventoByNomePaciente(@PathVariable("nome") String nomePaciente) {
		try {
			return new ResponseEntity<>(
					eventoBinder.modelToListResponse(eventoService.findEventoByNomePaciente(nomePaciente)),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/evento/paciente/cpf/{cpf}", method = RequestMethod.GET)
	public ResponseEntity<?> findEventoByCpfPaciente(@PathVariable("cpf") String cpf) {
		try {
			return new ResponseEntity<>(eventoBinder.modelToListResponse(eventoService.findEventoByCpfPaciente(cpf)),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/agenda/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findAgendaById(@PathVariable("id") Long id) {
		try {
			return new ResponseEntity<>(agendaBinder.modelToResponse(agendaService.findById(id)), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/convenio/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findConvenioById(@PathVariable("id") Long id) {
		try {
			return new ResponseEntity<>(convenioBinder.modelToResponse(convenioService.findById(id)), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/bairro/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findBairroById(@PathVariable("id") Long id) {
		try {
			return new ResponseEntity<>(bairroBinder.modelToResponse(bairroService.findById(id)), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/cep/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findCepById(@PathVariable("id") Long id) {
		try {
			return new ResponseEntity<>(cepBinder.modelToResponse(cepService.findById(id)), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/cidade/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findCidadeById(@PathVariable("id") Long id) {
		try {
			return new ResponseEntity<>(cidadeBinder.modelToResponse(cidadeService.findById(id)), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/estado/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findEstadoById(@PathVariable("id") Long id) {
		try {
			return new ResponseEntity<>(estadoBinder.modelToResponse(estadoService.findById(id)), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/paciente/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findPacienteById(@PathVariable("id") Long id) {
		try {
			return new ResponseEntity<>(pacienteBinder.modelToResponse(pacienteService.findById(id)), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/tipoConsulta", method = RequestMethod.POST)
	public ResponseEntity<?> saveTipoConsulta(@RequestBody @Valid TipoConsultaRequest tipoConsultaRequest) {
		try {
			tipoConsultaService.save(tipoConsultaBinder.requestToModel(tipoConsultaRequest));
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/tipoConsulta", method = RequestMethod.PUT)
	public ResponseEntity<?> updateTipoConsulta(@RequestBody @Valid TipoConsultaRequest tipoConsultaRequest) {
		try {
			tipoConsultaService.save(tipoConsultaBinder.requestToModel(tipoConsultaRequest));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/tipoConsulta", method = RequestMethod.GET)
	public ResponseEntity<?> findAllTipoConsulta() {
		try {
			return new ResponseEntity<List<TipoConsultaResponse>>(
					tipoConsultaBinder.modelToListResponse(tipoConsultaService.findAll()), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/tipoConsulta/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteTipoConsulta(@PathVariable("id") Long id) {
		try {
			tipoConsultaService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/tipoConsulta/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findTipoConsultaById(@PathVariable("id") Long id) {
		try {
			return new ResponseEntity<>(tipoConsultaBinder.modelToResponse(tipoConsultaService.findById(id)),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/agenda/dentista/{hashKey}", method = RequestMethod.GET)
	public ResponseEntity<?> findAgendaByDentista(@PathVariable("hashKey") String hashKey) {
		try {
			return new ResponseEntity<>(agendaBinder.modelToResponse(agendaService.findAgendaByUsuarioClinica(hashKey)),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/evento/dentista/{hashKey}", method = RequestMethod.GET)
	public ResponseEntity<?> findEventoByDentista(@PathVariable("hashKey") String hashKey,
			@RequestParam(value = "dataInicio") Long dataInicio, @RequestParam(value = "dataFim") Long dataFim) {
		try {
			return new ResponseEntity<List<EventoResponse>>(eventoBinder.modelToListResponse(
					eventoService.findEventoByUsuarioClinica(hashKey, dataInicio, dataFim)), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/usuarioClinica", method = RequestMethod.GET)
	public ResponseEntity<?> findUsuarioClinica(Authentication autentication) {
		User user = (User) autentication.getPrincipal();
		try {
			return new ResponseEntity<>(
					usuarioClinicaBinder.modelToResponse(usuarioClinicaService.findUsuarioClinica(user.getUsername())),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value = "/status", method = RequestMethod.POST)
	public ResponseEntity<?> saveStatus(@RequestBody @Valid StatusRequest statusRequest) {
		try {
			statusService.save(statusBinder.requestToModel(statusRequest));
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/status", method = RequestMethod.PUT)
	public ResponseEntity<?> updateStatus(@RequestBody @Valid StatusRequest statusRequest) {
		try {
			statusService.save(statusBinder.requestToModel(statusRequest));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/status", method = RequestMethod.GET)
	public ResponseEntity<?> findAllStatus() {
		try {
			return new ResponseEntity<List<StatusResponse>>(
					statusBinder.modelToListResponse(statusService.findAll()), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/status/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteStatus(@PathVariable("id") Long id) {
		try {
			statusService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/status/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findStatusById(@PathVariable("id") Long id) {
		try {
			return new ResponseEntity<>(statusBinder.modelToResponse(statusService.findById(id)),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ExceptionResponse>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}


}
