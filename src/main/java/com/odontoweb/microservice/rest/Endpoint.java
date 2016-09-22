package com.odontoweb.microservice.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.odontoweb.microservice.impl.service.EstadoService;
import com.odontoweb.microservice.impl.service.PacienteService;
import com.odontoweb.microservice.impl.service.ProfissionalService;
import com.odontoweb.microservice.impl.service.SiglaService;
import com.odontoweb.microservice.impl.service.TipoConsultaService;
import com.odontoweb.microservice.rest.binder.EstadoBinder;
import com.odontoweb.microservice.rest.binder.PacienteBinder;
import com.odontoweb.microservice.rest.binder.ProfissionalBinder;
import com.odontoweb.microservice.rest.binder.SiglaBinder;
import com.odontoweb.microservice.rest.binder.TipoConsultaBinder;
import com.odontoweb.microservice.rest.domain.request.EstadoRequest;
import com.odontoweb.microservice.rest.domain.request.PacienteRequest;
import com.odontoweb.microservice.rest.domain.request.ProfissionalRequest;
import com.odontoweb.microservice.rest.domain.request.SiglaRequest;
import com.odontoweb.microservice.rest.domain.request.TipoConsultaRequest;
import com.odontoweb.microservice.rest.domain.response.EstadoResponse;
import com.odontoweb.microservice.rest.domain.response.PacienteResponse;
import com.odontoweb.microservice.rest.domain.response.ProfissionalResponse;
import com.odontoweb.microservice.rest.domain.response.SiglaResponse;
import com.odontoweb.microservice.rest.domain.response.TipoConsultaResponse;

@RestController
public class Endpoint {

	@Autowired
	SiglaService siglaService;

	@Autowired
	TipoConsultaService tipoConsultaService;

	@Autowired
	EstadoService estadoService;

	@Autowired
	PacienteService pacienteService;

	@Autowired
	ProfissionalService profissionalService;

	@Autowired
	SiglaBinder siglaBinder;

	@Autowired
	TipoConsultaBinder tipoConsultaBinder;

	@Autowired
	EstadoBinder estadoBinder;

	@Autowired
	PacienteBinder pacienteBinder;

	@Autowired
	ProfissionalBinder profissionalBinder;

	@RequestMapping(value = "/sigla", method = RequestMethod.POST)
	public ResponseEntity<?> saveSigla(@RequestBody @Valid SiglaRequest siglaRequest) {
		siglaService.save(siglaBinder.requestToModel(siglaRequest));
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/estado", method = RequestMethod.POST)
	public ResponseEntity<?> saveEstado(@RequestBody @Valid EstadoRequest estadoRequest) {
		estadoService.save(estadoBinder.requestToModel(estadoRequest));
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/paciente", method = RequestMethod.POST)
	public ResponseEntity<?> savePaciente(@RequestBody @Valid PacienteRequest pacienteRequest) {
		pacienteService.save(pacienteBinder.requestToModel(pacienteRequest));
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/profissional", method = RequestMethod.POST)
	public ResponseEntity<?> saveProfissional(@RequestBody @Valid ProfissionalRequest profissionalRequest) {
		profissionalService.save(profissionalBinder.requestToModel(profissionalRequest));
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/sigla", method = RequestMethod.GET)
	public ResponseEntity<List<SiglaResponse>> findAllSigla() {
		return new ResponseEntity<List<SiglaResponse>>(siglaBinder.modelToListResponse(siglaService.findAll()),
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

	@RequestMapping(value = "/profissional", method = RequestMethod.GET)
	public ResponseEntity<List<ProfissionalResponse>> findAllProfissionais() {
		return new ResponseEntity<List<ProfissionalResponse>>(
				profissionalBinder.modelToListResponse(profissionalService.findAll()), HttpStatus.OK);
	}

	@RequestMapping(value = "/sigla/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteSigla(@PathVariable("id") Long id) {
		siglaService.delete(id);
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

	@RequestMapping(value = "/profissional/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteProfissional(@PathVariable("id") Long id) {
		profissionalService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/sigla/{id}", method = RequestMethod.GET)
	public ResponseEntity<SiglaResponse> findSiglaById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(siglaBinder.modelToResponse(siglaService.findById(id)), HttpStatus.OK);
	}

	@RequestMapping(value = "/estado/{id}", method = RequestMethod.GET)
	public ResponseEntity<EstadoResponse> findEstadoById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(estadoBinder.modelToResponse(estadoService.findById(id)), HttpStatus.OK);
	}

	@RequestMapping(value = "/paciente/{id}", method = RequestMethod.GET)
	public ResponseEntity<PacienteResponse> findPacienteById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(pacienteBinder.modelToResponse(pacienteService.findById(id)), HttpStatus.OK);
	}

	@RequestMapping(value = "/profissional/{id}", method = RequestMethod.GET)
	public ResponseEntity<ProfissionalResponse> findProfissionalById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(profissionalBinder.modelToResponse(profissionalService.findById(id)),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/tipoConsulta", method = RequestMethod.POST)
	public ResponseEntity<?> saveTipoConsulta(@RequestBody @Valid TipoConsultaRequest tipoConsultaRequest) {
		tipoConsultaService.save(tipoConsultaBinder.requestToModel(tipoConsultaRequest));
		return new ResponseEntity<>(HttpStatus.CREATED);
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

}
