package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.TipoConsulta;
import com.odontoweb.microservice.impl.service.TipoConsultaService;
import com.odontoweb.microservice.rest.domain.request.TipoConsultaRequest;
import com.odontoweb.microservice.rest.domain.response.TipoConsultaResponse;

public class TipoConsultaBinder implements Serializable {

	private static final long serialVersionUID = 6000795044646669253L;

	private TipoConsultaService tipoConsultaService;

	public TipoConsultaBinder(TipoConsultaService tipoConsultaService) {
		this.tipoConsultaService = tipoConsultaService;
	}

	public TipoConsulta requestToModel(TipoConsultaRequest tipoConsultaRequest) {
		return new TipoConsulta(tipoConsultaRequest.getIdTipoConsulta(), tipoConsultaRequest.getNome(),
				tipoConsultaRequest.getCorPrimaria(), tipoConsultaRequest.getCorSecundaria());
	}

	public TipoConsulta requestToModel(Long idTipoConsulta) {
		return tipoConsultaService.findById(idTipoConsulta);
	}

	public TipoConsultaResponse modelToResponse(TipoConsulta tipoConsulta) {
		return new TipoConsultaResponse(tipoConsulta.getIdTipoConsulta(), tipoConsulta.getNome(),
				tipoConsulta.getCorPrimaria(), tipoConsulta.getCorSecundaria());
	}

	public List<TipoConsultaResponse> modelToListResponse(List<TipoConsulta> tipoConsultas) {
		if (tipoConsultas == null)
			return null;
		return tipoConsultas.stream().filter(Objects::nonNull).map(tipoConsulta -> modelToResponse(tipoConsulta))
				.collect(Collectors.toList());

	}

}
