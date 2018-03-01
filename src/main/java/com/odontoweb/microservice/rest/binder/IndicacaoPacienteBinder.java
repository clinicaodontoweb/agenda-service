package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.IndicacaoPaciente;
import com.odontoweb.microservice.rest.domain.request.IndicacaoPacienteRequest;
import com.odontoweb.microservice.rest.domain.response.IndicacaoPacienteResponse;

public class IndicacaoPacienteBinder implements Serializable {

	private static final long serialVersionUID = 4045836099259884820L;

	public IndicacaoPaciente requestToModel(IndicacaoPacienteRequest indicacaoPacienteRequest) {
		return new IndicacaoPaciente(indicacaoPacienteRequest.getIdIndicacaoPaciente(),
				new IndicacaoBinder().requestToModel(indicacaoPacienteRequest.getIndicacao()),
				indicacaoPacienteRequest.getNome());
	}

	public IndicacaoPacienteResponse modelToResponse(IndicacaoPaciente indicacaoPaciente) {
		return new IndicacaoPacienteResponse(indicacaoPaciente.getIdIndicacaoPaciente(),
				new IndicacaoBinder().modelToResponse(indicacaoPaciente.getIndicacao()), indicacaoPaciente.getNome());
	}

	public List<IndicacaoPacienteResponse> modelToListResponse(List<IndicacaoPaciente> indicacoesPacientes) {
		if (indicacoesPacientes == null)
			return null;
		return indicacoesPacientes.stream().filter(Objects::nonNull)
				.map(indicacaoPaciente -> modelToResponse(indicacaoPaciente)).collect(Collectors.toList());

	}

}
