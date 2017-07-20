package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Dentista;
import com.odontoweb.microservice.rest.domain.request.DentistaRequest;
import com.odontoweb.microservice.rest.domain.response.DentistaResponse;

public class DentistaBinder implements Serializable {

	private static final long serialVersionUID = -2268580869115475558L;

	public Dentista requestToModel(DentistaRequest dentistaRequest) {
		return new Dentista(dentistaRequest.getIdDentista(),
				new UsuarioClinicaBinder().requestToModel(dentistaRequest.getUsuarioClinicaRequest()),
				dentistaRequest.getNome(), new ContatoBinder().requestToModel(dentistaRequest.getContatoRequest()),
				dentistaRequest.getGenero(), dentistaRequest.getConselho(), dentistaRequest.getRegistro(),
				dentistaRequest.getCodigoBrasileiroOcupacao());
	}

	public DentistaResponse modelToResponse(Dentista dentista) {
		return new DentistaResponse(dentista.getIdDentista(),
				new UsuarioClinicaBinder().modelToResponse(dentista.getUsuarioClinica()), dentista.getNome(),
				new ContatoBinder().modelToResponse(dentista.getContato()), dentista.getGenero(),
				dentista.getConselho(), dentista.getRegistro(), dentista.getCodigoBrasileiroOcupacao());
	}

	public List<DentistaResponse> modelToListResponse(List<Dentista> dentistas) {
		if (dentistas == null)
			return null;
		return dentistas.stream().filter(Objects::nonNull).map(dentista -> modelToResponse(dentista))
				.collect(Collectors.toList());

	}

	public List<Dentista> requestToListModel(List<DentistaRequest> dentistasRequest) {
		if (dentistasRequest == null)
			return null;
		return dentistasRequest.stream().filter(Objects::nonNull)
				.map(dentistaRequest -> requestToModel(dentistaRequest)).collect(Collectors.toList());

	}

}
