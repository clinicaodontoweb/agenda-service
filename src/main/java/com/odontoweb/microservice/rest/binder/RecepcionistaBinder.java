package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Recepcionista;
import com.odontoweb.microservice.impl.model.enums.Genero;
import com.odontoweb.microservice.rest.domain.request.RecepcionistaRequest;
import com.odontoweb.microservice.rest.domain.response.RecepcionistaResponse;

public class RecepcionistaBinder implements Serializable {

	private static final long serialVersionUID = -2268580869115475558L;

	public Recepcionista requestToModel(RecepcionistaRequest recepcionistaRequest) {
		if(recepcionistaRequest == null) return null;
		return new Recepcionista(recepcionistaRequest.getIdRecepcionista(),
				new UsuarioClinicaBinder().requestToModel(recepcionistaRequest.getUsuarioClinicaRequest()),
				recepcionistaRequest.getNome(),
				new ContatoBinder().requestToModel(recepcionistaRequest.getContatoRequest()),
				Genero.valueOf(recepcionistaRequest.getGenero()),
				null);
	}

	public RecepcionistaResponse modelToResponse(Recepcionista recepcionista) {
		if(recepcionista == null) return null;
		return new RecepcionistaResponse(recepcionista.getIdRecepcionista(),
				new UsuarioClinicaBinder().modelToResponse(recepcionista.getUsuarioClinica()), recepcionista.getNome(),
				new ContatoBinder().modelToResponse(recepcionista.getContato()),
				new EnumerationBinder().enumToResponse(recepcionista.getGenero()),
				new DentistaBinder().modelToListResponse(recepcionista.getDentistas()));
	}

	public List<RecepcionistaResponse> modelToListResponse(List<Recepcionista> recepcionistas) {
		if (recepcionistas == null)
			return null;
		return recepcionistas.stream().filter(Objects::nonNull).map(recepcionista -> modelToResponse(recepcionista))
				.collect(Collectors.toList());

	}

}
