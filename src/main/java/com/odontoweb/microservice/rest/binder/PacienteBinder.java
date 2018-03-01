package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Paciente;
import com.odontoweb.microservice.impl.model.enums.EstadoCivil;
import com.odontoweb.microservice.impl.model.enums.Genero;
import com.odontoweb.microservice.impl.service.PacienteService;
import com.odontoweb.microservice.rest.domain.request.PacienteEditRequest;
import com.odontoweb.microservice.rest.domain.request.PacienteRequest;
import com.odontoweb.microservice.rest.domain.response.PacienteResponse;

public class PacienteBinder implements Serializable {

	private static final long serialVersionUID = 2368417682988907201L;

	private PacienteService pacienteService;
	private EnderecoBinder enderecoBinder;
	private ConvenioPacienteBinder convenioPacienteBinder;

	public PacienteBinder(PacienteService pacienteService, EnderecoBinder enderecoBinder,
			ConvenioPacienteBinder convenioPacienteBinder) {
		this.pacienteService = pacienteService;
		this.enderecoBinder = enderecoBinder;
		this.convenioPacienteBinder = convenioPacienteBinder;
	}

	public Paciente requestToModel(PacienteRequest pacienteRequest) {
		return new Paciente(pacienteRequest.getIdPaciente(), pacienteRequest.getCpf(), pacienteRequest.getRg(),
				pacienteRequest.getNome(), Genero.valueOf(pacienteRequest.getGenero().toUpperCase()),
				pacienteRequest.getDataNascimento(), pacienteRequest.getDataCadastro(),
				EstadoCivil.valueOf(pacienteRequest.getEstadoCivil().toUpperCase()),
				new ContatoBinder().requestToModel(pacienteRequest.getIdContato(), pacienteRequest.getEmail(),
						pacienteRequest.getTelefones()),
				enderecoBinder.requestToModel(pacienteRequest.getIdEndereco(), pacienteRequest.getEndereco(),
						pacienteRequest.getCep(), pacienteRequest.getPontoReferencia(), pacienteRequest.getCidade(),
						pacienteRequest.getSigla(), pacienteRequest.getBairro(), pacienteRequest.getNumero(),
						pacienteRequest.getComplemento()),
				convenioPacienteBinder.requestToListModel(pacienteRequest.getConveniosPaciente()),
				new IndicacaoPacienteBinder().requestToModel(pacienteRequest.getIndicacaoPaciente()),
				new RedeSocialPacienteBinder().requestToListModel(pacienteRequest.getRedesSociaisPaciente()),
				new ProfissaoBinder().requestToModel(pacienteRequest.getProfissao()),
				pacienteRequest.getLocalTrabalho(), pacienteRequest.getNomePai(), pacienteRequest.getNomeMae(),
				pacienteRequest.getObservacao(), pacienteRequest.getPendenciaFinanceira());
	}

	public Paciente requestToModel(PacienteEditRequest pacienteEditRequest) {
		return new Paciente(pacienteEditRequest.getIdPaciente(), pacienteEditRequest.getCpf(),
				pacienteEditRequest.getRg(), pacienteEditRequest.getNome(),
				Genero.valueOf(pacienteEditRequest.getGenero().toUpperCase()), pacienteEditRequest.getDataNascimento(),
				pacienteEditRequest.getDataCadastro(),
				EstadoCivil.valueOf(pacienteEditRequest.getEstadoCivil().toUpperCase()),
				new ContatoBinder().requestToModel(pacienteEditRequest.getContatoRequest()),
				enderecoBinder.requestToModel(pacienteEditRequest.getEnderecoRequest()),
				convenioPacienteBinder.requestToListModel(pacienteEditRequest.getConveniosPaciente()),
				new IndicacaoPacienteBinder().requestToModel(pacienteEditRequest.getIndicacaoPaciente()),
				new RedeSocialPacienteBinder().requestToListModel(pacienteEditRequest.getRedesSociaisPaciente()),
				new ProfissaoBinder().requestToModel(pacienteEditRequest.getProfissao()),
				pacienteEditRequest.getLocalTrabalho(), pacienteEditRequest.getNomePai(),
				pacienteEditRequest.getNomeMae(), pacienteEditRequest.getObservacao(),
				pacienteEditRequest.getPendenciaFinanceira());
	}

	public Paciente requestToModel(Long idPaciente) {
		return pacienteService.findById(idPaciente);
	}

	public PacienteResponse modelToResponse(Paciente paciente) {
		return new PacienteResponse(paciente.getIdPaciente(), paciente.getCpf(), paciente.getRg(), paciente.getNome(),
				new EnumerationBinder().enumToResponse(paciente.getGenero()), paciente.getDataNascimento(),
				paciente.getDataCadastro(), new EnumerationBinder().enumToResponse(paciente.getEstadoCivil()),
				new ContatoBinder().modelToResponse(paciente.getContato()),
				enderecoBinder.modelToResponse(paciente.getEndereco()),
				convenioPacienteBinder.modelToListResponse(paciente.getConveniosPaciente()),
				new ProfissaoBinder().modelToResponse(paciente.getProfissao()),
				new IndicacaoPacienteBinder().modelToResponse(paciente.getIndicacaoPaciente()),
				new RedeSocialPacienteBinder().modelToListResponse(paciente.getRedesSociaisPaciente()),
				paciente.getLocalTrabalho(), paciente.getNomePai(), paciente.getNomeMae(), paciente.getObservacao(),
				paciente.getPendenciaFinanceira());
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
