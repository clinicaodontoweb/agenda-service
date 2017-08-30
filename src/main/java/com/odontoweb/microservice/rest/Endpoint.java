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

import com.odontoweb.arquitetura.model.User;
import com.odontoweb.microservice.impl.service.AgendaService;
import com.odontoweb.microservice.impl.service.BairroService;
import com.odontoweb.microservice.impl.service.CepService;
import com.odontoweb.microservice.impl.service.CidadeService;
import com.odontoweb.microservice.impl.service.ConvenioService;
import com.odontoweb.microservice.impl.service.EstadoService;
import com.odontoweb.microservice.impl.service.EventoService;
import com.odontoweb.microservice.impl.service.PacienteService;
import com.odontoweb.microservice.impl.service.SiglaService;
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
import com.odontoweb.microservice.rest.binder.TipoConsultaBinder;
import com.odontoweb.microservice.rest.binder.UsuarioClinicaBinder;
import com.odontoweb.microservice.rest.domain.request.AgendaRequest;
import com.odontoweb.microservice.rest.domain.request.BairroRequest;
import com.odontoweb.microservice.rest.domain.request.CepRequest;
import com.odontoweb.microservice.rest.domain.request.CidadeRequest;
import com.odontoweb.microservice.rest.domain.request.ConvenioRequest;
import com.odontoweb.microservice.rest.domain.request.EstadoRequest;
import com.odontoweb.microservice.rest.domain.request.EventoRequest;
import com.odontoweb.microservice.rest.domain.request.PacienteRequest;
import com.odontoweb.microservice.rest.domain.request.SiglaRequest;
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
import com.odontoweb.microservice.rest.domain.response.TipoConsultaResponse;
import com.odontoweb.microservice.rest.domain.response.UsuarioClinicaResponse;

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

	@RequestMapping(value = "/sigla", method = RequestMethod.POST)
	public ResponseEntity<?> saveSigla(@RequestBody @Valid SiglaRequest siglaRequest) {
		siglaService.save(siglaBinder.requestToModel(siglaRequest));
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/sigla", method = RequestMethod.PUT)
	public ResponseEntity<?> updateSigla(@RequestBody @Valid SiglaRequest siglaRequest) {
		siglaService.save(siglaBinder.requestToModel(siglaRequest));
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/evento/{id}", method = RequestMethod.POST)
	public ResponseEntity<?> saveEvento(@RequestBody @Valid EventoRequest eventoRequest, @PathVariable("id") Long id) {
		eventoService.save(eventoBinder.requestToModel(eventoRequest), id);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/evento/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateEvento(@RequestBody @Valid EventoRequest eventoRequest,
			@PathVariable("id") Long id) {
		eventoService.save(eventoBinder.requestToModel(eventoRequest), id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/agenda", method = RequestMethod.POST)
	public ResponseEntity<?> saveAgenda(@RequestBody @Valid AgendaRequest agendaRequest) {
		agendaService.save(agendaBinder.requestToModel(agendaRequest));
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/agenda", method = RequestMethod.PUT)
	public ResponseEntity<?> updateAgenda(@RequestBody @Valid AgendaRequest agendaRequest) {
		agendaService.save(agendaBinder.requestToModel(agendaRequest));
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/convenio", method = RequestMethod.POST)
	public ResponseEntity<?> saveConvenio(@RequestBody @Valid ConvenioRequest convenioRequest) {
		convenioService.save(convenioBinder.requestToModel(convenioRequest));
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/convenio", method = RequestMethod.PUT)
	public ResponseEntity<?> updateConvenio(@RequestBody @Valid ConvenioRequest convenioRequest) {
		convenioService.save(convenioBinder.requestToModel(convenioRequest));
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/bairro", method = RequestMethod.POST)
	public ResponseEntity<?> saveBairro(@RequestBody @Valid BairroRequest bairroRequest) {
		bairroService.save(bairroBinder.requestToModel(bairroRequest));
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/bairro", method = RequestMethod.PUT)
	public ResponseEntity<?> updateBairro(@RequestBody @Valid BairroRequest bairroRequest) {
		bairroService.save(bairroBinder.requestToModel(bairroRequest));
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/cep", method = RequestMethod.POST)
	public ResponseEntity<?> saveCep(@RequestBody @Valid CepRequest cepRequest) {
		cepService.save(cepBinder.requestToModel(cepRequest));
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/cep", method = RequestMethod.PUT)
	public ResponseEntity<?> updateCep(@RequestBody @Valid CepRequest cepRequest) {
		cepService.save(cepBinder.requestToModel(cepRequest));
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/cidade", method = RequestMethod.POST)
	public ResponseEntity<?> saveCidade(@RequestBody @Valid CidadeRequest cidadeRequest) {
		cidadeService.save(cidadeBinder.requestToModel(cidadeRequest));
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/cidade", method = RequestMethod.PUT)
	public ResponseEntity<?> updateCidade(@RequestBody @Valid CidadeRequest cidadeRequest) {
		cidadeService.save(cidadeBinder.requestToModel(cidadeRequest));
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/estado", method = RequestMethod.POST)
	public ResponseEntity<?> saveEstado(@RequestBody @Valid EstadoRequest estadoRequest) {
		estadoService.save(estadoBinder.requestToModel(estadoRequest));
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/estado", method = RequestMethod.PUT)
	public ResponseEntity<?> updateEstado(@RequestBody @Valid EstadoRequest estadoRequest) {
		estadoService.save(estadoBinder.requestToModel(estadoRequest));
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/paciente", method = RequestMethod.POST)
	public ResponseEntity<?> savePaciente(@RequestBody @Valid PacienteRequest pacienteRequest) {
		pacienteService.save(pacienteBinder.requestToModel(pacienteRequest));
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/paciente", method = RequestMethod.PUT)
	public ResponseEntity<?> updatePaciente(@RequestBody @Valid PacienteRequest pacienteRequest) {
		pacienteService.save(pacienteBinder.requestToModel(pacienteRequest));
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/usuarioClinica", method = RequestMethod.POST)
	public ResponseEntity<?> saveUsuarioClinica(@RequestBody @Valid UsuarioClinicaRequest usuarioClinicaRequest) {
		usuarioClinicaService.save(usuarioClinicaBinder.requestToModel(usuarioClinicaRequest));
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/usuarioClinica", method = RequestMethod.PUT)
	public ResponseEntity<?> updateUsuarioClinica(@RequestBody @Valid UsuarioClinicaRequest usuarioClinicaRequest) {
		usuarioClinicaService.save(usuarioClinicaBinder.requestToModel(usuarioClinicaRequest));
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/sigla", method = RequestMethod.GET)
	public ResponseEntity<List<SiglaResponse>> findAllSigla() {
		return new ResponseEntity<List<SiglaResponse>>(siglaBinder.modelToListResponse(siglaService.findAll()),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/evento", method = RequestMethod.GET)
	public ResponseEntity<List<EventoResponse>> findAllEventos() {
		return new ResponseEntity<List<EventoResponse>>(eventoBinder.modelToListResponse(eventoService.findAll()),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/agenda", method = RequestMethod.GET)
	public ResponseEntity<List<AgendaResponse>> findAllAgendas() {
		return new ResponseEntity<List<AgendaResponse>>(agendaBinder.modelToListResponse(agendaService.findAll()),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/convenio", method = RequestMethod.GET)
	public ResponseEntity<List<ConvenioResponse>> findAllConvenios() {
		return new ResponseEntity<List<ConvenioResponse>>(convenioBinder.modelToListResponse(convenioService.findAll()),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/bairro", method = RequestMethod.GET)
	public ResponseEntity<List<BairroResponse>> findAllBairros() {
		return new ResponseEntity<List<BairroResponse>>(bairroBinder.modelToListResponse(bairroService.findAll()),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/cep", method = RequestMethod.GET)
	public ResponseEntity<List<CepResponse>> findAllCep() {
		return new ResponseEntity<List<CepResponse>>(cepBinder.modelToListResponse(cepService.findAll()),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/cidade", method = RequestMethod.GET)
	public ResponseEntity<List<CidadeResponse>> findAllCidades() {
		return new ResponseEntity<List<CidadeResponse>>(cidadeBinder.modelToListResponse(cidadeService.findAll()),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/estado", method = RequestMethod.GET)
	public ResponseEntity<List<EstadoResponse>> findAllEstados() {
		return new ResponseEntity<List<EstadoResponse>>(estadoBinder.modelToListResponse(estadoService.findAll()),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/paciente", method = RequestMethod.GET)
	public ResponseEntity<List<PacienteResponse>> findAllPacientes() {
		return new ResponseEntity<List<PacienteResponse>>(pacienteBinder.modelToListResponse(pacienteService.findAll()),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/paciente/autocomplete/{nome}", method = RequestMethod.GET)
	public ResponseEntity<List<PacienteResponse>> findPacientesByNome(@PathVariable("nome") String nome) {
		return new ResponseEntity<List<PacienteResponse>>(
				pacienteBinder.modelToListResponse(pacienteService.findPacientesByNome(nome)), HttpStatus.OK);
	}

	@RequestMapping(value = "/sigla/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteSigla(@PathVariable("id") Long id) {
		siglaService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/evento/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteEvento(@PathVariable("id") Long id) {
		eventoService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/agenda/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteAgenda(@PathVariable("id") Long id) {
		agendaService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/convenio/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteConvenio(@PathVariable("id") Long id) {
		convenioService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/bairro/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteBairro(@PathVariable("id") Long id) {
		bairroService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/cep/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteCep(@PathVariable("id") Long id) {
		cepService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/cidade/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteCidade(@PathVariable("id") Long id) {
		cidadeService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/estado/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteEstado(@PathVariable("id") Long id) {
		estadoService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/paciente/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletePaciente(@PathVariable("id") Long id) {
		pacienteService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/usuarioClinica/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteUsuarioClinica(@PathVariable("id") Long id) {
		usuarioClinicaService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/sigla/{id}", method = RequestMethod.GET)
	public ResponseEntity<SiglaResponse> findSiglaById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(siglaBinder.modelToResponse(siglaService.findById(id)), HttpStatus.OK);
	}

	@RequestMapping(value = "/evento/{id}", method = RequestMethod.GET)
	public ResponseEntity<EventoResponse> findEventoById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(eventoBinder.modelToResponse(eventoService.findById(id)), HttpStatus.OK);
	}

	@RequestMapping(value = "/agenda/{id}", method = RequestMethod.GET)
	public ResponseEntity<AgendaResponse> findAgendaById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(agendaBinder.modelToResponse(agendaService.findById(id)), HttpStatus.OK);
	}

	@RequestMapping(value = "/convenio/{id}", method = RequestMethod.GET)
	public ResponseEntity<ConvenioResponse> findConvenioById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(convenioBinder.modelToResponse(convenioService.findById(id)), HttpStatus.OK);
	}

	@RequestMapping(value = "/bairro/{id}", method = RequestMethod.GET)
	public ResponseEntity<BairroResponse> findBairroById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(bairroBinder.modelToResponse(bairroService.findById(id)), HttpStatus.OK);
	}

	@RequestMapping(value = "/cep/{id}", method = RequestMethod.GET)
	public ResponseEntity<CepResponse> findCepById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(cepBinder.modelToResponse(cepService.findById(id)), HttpStatus.OK);
	}

	@RequestMapping(value = "/cidade/{id}", method = RequestMethod.GET)
	public ResponseEntity<CidadeResponse> findCidadeById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(cidadeBinder.modelToResponse(cidadeService.findById(id)), HttpStatus.OK);
	}

	@RequestMapping(value = "/estado/{id}", method = RequestMethod.GET)
	public ResponseEntity<EstadoResponse> findEstadoById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(estadoBinder.modelToResponse(estadoService.findById(id)), HttpStatus.OK);
	}

	@RequestMapping(value = "/paciente/{id}", method = RequestMethod.GET)
	public ResponseEntity<PacienteResponse> findPacienteById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(pacienteBinder.modelToResponse(pacienteService.findById(id)), HttpStatus.OK);
	}

	@RequestMapping(value = "/tipoConsulta", method = RequestMethod.POST)
	public ResponseEntity<?> saveTipoConsulta(@RequestBody @Valid TipoConsultaRequest tipoConsultaRequest) {
		tipoConsultaService.save(tipoConsultaBinder.requestToModel(tipoConsultaRequest));
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/tipoConsulta", method = RequestMethod.PUT)
	public ResponseEntity<?> updateTipoConsulta(@RequestBody @Valid TipoConsultaRequest tipoConsultaRequest) {
		tipoConsultaService.save(tipoConsultaBinder.requestToModel(tipoConsultaRequest));
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/tipoConsulta", method = RequestMethod.GET)
	public ResponseEntity<List<TipoConsultaResponse>> findAllTipoConsulta() {
		return new ResponseEntity<List<TipoConsultaResponse>>(
				tipoConsultaBinder.modelToListResponse(tipoConsultaService.findAll()), HttpStatus.OK);
	}

	@RequestMapping(value = "/tipoConsulta/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteTipoConsulta(@PathVariable("id") Long id) {
		tipoConsultaService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/tipoConsulta/{id}", method = RequestMethod.GET)
	public ResponseEntity<TipoConsultaResponse> findTipoConsultaById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(tipoConsultaBinder.modelToResponse(tipoConsultaService.findById(id)),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/agenda/dentista/{email}", method = RequestMethod.GET)
	public ResponseEntity<AgendaResponse> findAgendaByDentista(@PathVariable("email") String email) {
		return new ResponseEntity<>(agendaBinder.modelToResponse(agendaService.findAgendaByDentista(email)),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/evento/dentista/{email}", method = RequestMethod.GET)
	public ResponseEntity<List<EventoResponse>> findEventoByDentista(@PathVariable("email") String email,
			@RequestParam(value = "dataInicio") Long dataInicio, @RequestParam(value = "dataFim") Long dataFim) {
		return new ResponseEntity<List<EventoResponse>>(
				eventoBinder.modelToListResponse(eventoService.findEventoByDentista(email, dataInicio, dataFim)),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/usuarioClinica", method = RequestMethod.GET)
	public ResponseEntity<UsuarioClinicaResponse> findUsuarioClinica(Authentication autentication) {
		User user = (User) autentication.getPrincipal();
		return new ResponseEntity<>(
				usuarioClinicaBinder.modelToResponse(usuarioClinicaService.findUsuarioClinica(user.getUsername())),
				HttpStatus.OK);
	}

}
