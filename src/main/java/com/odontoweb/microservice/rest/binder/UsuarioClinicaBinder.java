package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.UsuarioClinica;
import com.odontoweb.microservice.impl.model.enums.TipoProfissional;
import com.odontoweb.microservice.rest.domain.request.UsuarioClinicaRequest;
import com.odontoweb.microservice.rest.domain.response.UsuarioClinicaResponse;

public class UsuarioClinicaBinder implements Serializable {

	private static final long serialVersionUID = 1373672342180409382L;

	public UsuarioClinica requestToModel(UsuarioClinicaRequest usuarioClinicaRequest) {
		if (usuarioClinicaRequest == null)
			return null;
		return new UsuarioClinica(usuarioClinicaRequest.getIdUsuarioClinica(), usuarioClinicaRequest.getEmail(),
				usuarioClinicaRequest.getHashKey(),
				TipoProfissional.valueOf(usuarioClinicaRequest.getTipoProfissional()));
	}

	public UsuarioClinicaResponse modelToResponse(UsuarioClinica usuarioClinica) {
		if (usuarioClinica == null)
			return null;
		return new UsuarioClinicaResponse(usuarioClinica.getIdUsuarioClinica(), usuarioClinica.getEmail(),
				usuarioClinica.getHashKey(),
				new EnumerationBinder().enumToResponse(usuarioClinica.getTipoProfissional()));
	}

	public List<UsuarioClinicaResponse> modelToListResponse(List<UsuarioClinica> usuariosClinica) {
		if (usuariosClinica == null)
			return null;
		return usuariosClinica.stream().filter(Objects::nonNull).map(usuarioClinica -> modelToResponse(usuarioClinica))
				.collect(Collectors.toList());

	}
}
