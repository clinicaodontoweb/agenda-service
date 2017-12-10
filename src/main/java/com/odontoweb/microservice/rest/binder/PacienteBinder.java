package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Paciente;
import com.odontoweb.microservice.impl.model.enums.EstadoCivil;
import com.odontoweb.microservice.impl.model.enums.Genero;
import com.odontoweb.microservice.rest.domain.request.PacienteRequest;
import com.odontoweb.microservice.rest.domain.response.PacienteResponse;

public class PacienteBinder implements Serializable {

	private static final long serialVersionUID = 2368417682988907201L;

	@Autowired 
	private EnderecoBinder enderecoBinder;
	
	@Autowired
	private ConvenioBinder convenioBinder;
	
	public Paciente requestToModel(PacienteRequest pacienteRequest) {
		return new Paciente(pacienteRequest.getIdPaciente(), pacienteRequest.getCpf(), pacienteRequest.getRg(),
				pacienteRequest.getNome(), Genero.valueOf(pacienteRequest.getGenero()),
				pacienteRequest.getDataNascimento(), EstadoCivil.valueOf(pacienteRequest.getEstadoCivil()),
				new ContatoBinder().requestToModel(pacienteRequest.getIdContato(), pacienteRequest.getEmail(),
						pacienteRequest.getTelefones()),
				enderecoBinder.requestToModel(pacienteRequest.getIdEndereco(), pacienteRequest.getEndereco(),
						pacienteRequest.getCep(), pacienteRequest.getPontoReferencia(), pacienteRequest.getCidade(),
						pacienteRequest.getSigla(), pacienteRequest.getBairro(), pacienteRequest.getNumero(),
						pacienteRequest.getComplemento()),
				convenioBinder.requestListIdToListModel(pacienteRequest.getConvenios()),
				pacienteRequest.getIndicacao(), pacienteRequest.getProfissao());
	}

	public PacienteResponse modelToResponse(Paciente paciente) {
		return new PacienteResponse(paciente.getIdPaciente(), paciente.getCpf(), paciente.getRg(), paciente.getNome(),
				new EnumerationBinder().enumToResponse(paciente.getGenero()), paciente.getDataNascimento(),
				new EnumerationBinder().enumToResponse(paciente.getEstadoCivil()),
				new ContatoBinder().modelToResponse(paciente.getContato()),
				enderecoBinder.modelToResponse(paciente.getEndereco()),
				convenioBinder.modelToListResponse(paciente.getConvenios()), paciente.getProfissao(),
				paciente.getIndicacao());
	}

	public List<PacienteResponse> modelToListResponse(List<Paciente> pacientes) {
		if (pacientes == null)
			return null;
		return pacientes.stream().filter(Objects::nonNull).map(paciente -> modelToResponse(paciente))
				.collect(Collectors.toList());

	}

	public List<Paciente> requestToListModel(List<PacienteRequest> pacientesRequest) {
		if (pacientesRequest == null)
			return null;
		return pacientesRequest.stream().filter(Objects::nonNull)
				.map(pacienteRequest -> requestToModel(pacienteRequest)).collect(Collectors.toList());

	}

}
