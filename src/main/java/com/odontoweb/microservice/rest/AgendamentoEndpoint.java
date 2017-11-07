package com.odontoweb.microservice.rest;

import com.odontoweb.arquitetura.exception.response.ExceptionResponse;
import com.odontoweb.arquitetura.model.User;
import com.odontoweb.microservice.exception.UsuarioDuplicateFoundException;
import com.odontoweb.microservice.exception.UsuarioNotFoundException;
import com.odontoweb.microservice.impl.model.Evento;
import com.odontoweb.microservice.impl.service.*;
import com.odontoweb.microservice.rest.binder.*;
import com.odontoweb.microservice.rest.domain.request.*;
import com.odontoweb.microservice.rest.domain.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AgendamentoEndpoint {

	@Autowired
	EventoService eventoService;

	@Autowired
    AgendaService agendaService;

	@Autowired
	EventoBinder eventoBinder;

	@RequestMapping(value = "/agendamento/{hashKey}", method = RequestMethod.POST)
	public ResponseEntity<?> saveAgendamento(@RequestBody @Valid AgendamentoRequest agendamentoRequest, @PathVariable("hashKey") String hashKey) {
		try {
            Evento agendamento = eventoBinder.requestToModel(agendamentoRequest);
            agendamento.setAgenda(agendaService.findAgendaByUsuarioClinica(hashKey));

			eventoService.save(agendamento);

			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(
					new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		}
	}

}
