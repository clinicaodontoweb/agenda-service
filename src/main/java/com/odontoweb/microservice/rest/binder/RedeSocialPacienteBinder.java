package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.RedeSocialPaciente;
import com.odontoweb.microservice.rest.domain.request.RedeSocialPacienteRequest;
import com.odontoweb.microservice.rest.domain.response.RedeSocialPacienteResponse;

public class RedeSocialPacienteBinder implements Serializable {

	private static final long serialVersionUID = -3527560040714672650L;

	public RedeSocialPaciente requestToModel(RedeSocialPacienteRequest redeSocialPacienteRequest) {
		return new RedeSocialPaciente(redeSocialPacienteRequest.getIdRedeSocialPaciente(),
				new RedeSocialBinder().requestToModel(redeSocialPacienteRequest.getRedeSocial()),
				redeSocialPacienteRequest.getEndereco());
	}

	public RedeSocialPacienteResponse modelToResponse(RedeSocialPaciente redeSocialPaciente) {
		return new RedeSocialPacienteResponse(redeSocialPaciente.getIdRedeSocialPaciente(),
				new RedeSocialBinder().modelToResponse(redeSocialPaciente.getRedeSocial()),
				redeSocialPaciente.getEndereco());
	}

	public List<RedeSocialPacienteResponse> modelToListResponse(List<RedeSocialPaciente> redesSociaisPacientes) {
		if (redesSociaisPacientes == null)
			return null;
		return redesSociaisPacientes.stream().filter(Objects::nonNull)
				.map(redeSocialPaciente -> modelToResponse(redeSocialPaciente)).collect(Collectors.toList());

	}

	public List<RedeSocialPaciente> requestToListModel(List<RedeSocialPacienteRequest> redesSociaisPacienteRequest) {
		if (redesSociaisPacienteRequest == null)
			return null;
		return redesSociaisPacienteRequest.stream().filter(Objects::nonNull)
				.map(redeSocialPacienteRequest -> requestToModel(redeSocialPacienteRequest))
				.collect(Collectors.toList());

	}

}
