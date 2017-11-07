package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;

import com.odontoweb.microservice.impl.model.enums.EstadoCivil;
import com.odontoweb.microservice.impl.model.enums.Genero;
import com.odontoweb.microservice.impl.model.enums.StatusEvento;
import com.odontoweb.microservice.impl.model.enums.TipoProfissional;
import com.odontoweb.microservice.impl.model.enums.TipoTelefone;
import com.odontoweb.microservice.rest.domain.request.EstadoCivilRequest;
import com.odontoweb.microservice.rest.domain.request.GeneroRequest;
import com.odontoweb.microservice.rest.domain.request.StatusEventoRequest;
import com.odontoweb.microservice.rest.domain.request.TipoProfissionalRequest;
import com.odontoweb.microservice.rest.domain.request.TipoTelefoneRequest;
import com.odontoweb.microservice.rest.domain.response.EstadoCivilResponse;
import com.odontoweb.microservice.rest.domain.response.GeneroResponse;
import com.odontoweb.microservice.rest.domain.response.StatusEventoResponse;
import com.odontoweb.microservice.rest.domain.response.TipoProfissionalResponse;
import com.odontoweb.microservice.rest.domain.response.TipoTelefoneResponse;

public class EnumerationBinder implements Serializable {

	private static final long serialVersionUID = 1657444370654160537L;

	public EstadoCivil requestToEnum(EstadoCivilRequest estadoCivilRequest) {
		return EstadoCivil.valueOf(estadoCivilRequest.getEstadoCivil());
	}

	public EstadoCivilResponse enumToResponse(EstadoCivil estadoCivil) {
		return new EstadoCivilResponse(estadoCivil.name());
	}

	public Genero requestToEnum(GeneroRequest generoRequest) {
		return Genero.valueOf(generoRequest.getGenero());
	}

	public GeneroResponse enumToResponse(Genero genero) {
		return new GeneroResponse(genero.name());
	}

	public StatusEvento requestToEnum(StatusEventoRequest statusEventoRequest) {
		return StatusEvento.valueOf(statusEventoRequest.getStatusEvento());
	}

    public StatusEvento requestToEnum(String statusEvento) {
        return StatusEvento.valueOf(statusEvento);
    }

	public StatusEventoResponse enumToResponse(StatusEvento statusEvento) {
		return new StatusEventoResponse(statusEvento.name());
	}

	public TipoProfissional requestToEnum(TipoProfissionalRequest tipoProfissionalRequest) {
		return TipoProfissional.valueOf(tipoProfissionalRequest.getTipoProfissional());
	}

	public TipoProfissionalResponse enumToResponse(TipoProfissional tipoProfissional) {
		return new TipoProfissionalResponse(tipoProfissional.name());
	}

	public TipoTelefone requestToEnum(TipoTelefoneRequest tipoTelefoneRequest) {
		return TipoTelefone.valueOf(tipoTelefoneRequest.getTipoTelefone());
	}

	public TipoTelefoneResponse enumToResponse(TipoTelefone tipoTelefone) {
		return new TipoTelefoneResponse(tipoTelefone.name());
	}

}
