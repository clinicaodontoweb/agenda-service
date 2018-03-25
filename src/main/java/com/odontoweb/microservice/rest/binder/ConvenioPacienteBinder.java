package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.ConvenioPaciente;
import com.odontoweb.microservice.rest.domain.request.ConvenioPacienteRequest;
import com.odontoweb.microservice.rest.domain.response.ConvenioPacienteResponse;

public class ConvenioPacienteBinder implements Serializable {

	private static final long serialVersionUID = -1783417548975076896L;

	private ConvenioBinder convenioBinder;
	private PacienteBinder pacienteBinder;

	public ConvenioPacienteBinder(ConvenioBinder convenioBinder, PacienteBinder pacienteBinder) {
		this.convenioBinder = convenioBinder;
		this.pacienteBinder = pacienteBinder;
	}

	public ConvenioPaciente requestToModel(ConvenioPacienteRequest convenioPacienteRequest) {
		return new ConvenioPaciente(convenioPacienteRequest.getIdConvenioPaciente(),
				convenioBinder.requestToModel(convenioPacienteRequest.getIdConvenio()),
				pacienteBinder.requestToModel(convenioPacienteRequest.getIdPaciente()),
				convenioPacienteRequest.getNumero(), convenioPacienteRequest.getTitularConvenio());
	}

	public ConvenioPacienteResponse modelToResponse(ConvenioPaciente convenioPaciente) {
		return new ConvenioPacienteResponse(convenioPaciente.getIdConvenioPaciente(),
				convenioBinder.modelToResponse(convenioPaciente.getConvenio()), convenioPaciente.getNumero(),
				convenioPaciente.getTitularConvenio());
	}

	public List<ConvenioPacienteResponse> modelToListResponse(List<ConvenioPaciente> conveniosPaciente) {
		if (conveniosPaciente == null)
			return null;
		return conveniosPaciente.stream().filter(Objects::nonNull)
				.map(convenioPaciente -> modelToResponse(convenioPaciente)).collect(Collectors.toList());

	}

	public List<ConvenioPaciente> requestToListModel(List<ConvenioPacienteRequest> conveniosPacientesRequest) {
		if (conveniosPacientesRequest == null)
			return null;
		return conveniosPacientesRequest.stream().filter(Objects::nonNull)
				.map(convenioPacienteRequest -> requestToModel(convenioPacienteRequest)).collect(Collectors.toList());

	}

}
