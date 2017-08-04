package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.odontoweb.microservice.impl.model.Convenio;
import com.odontoweb.microservice.impl.service.ConvenioService;
import com.odontoweb.microservice.rest.domain.request.ConvenioRequest;
import com.odontoweb.microservice.rest.domain.response.ConvenioResponse;

public class ConvenioBinder implements Serializable {

	private static final long serialVersionUID = -6564303786520599427L;
	
	@Autowired
	private ConvenioService convenioService;

	public Convenio requestToModel(ConvenioRequest convenioRequest) {
		return new Convenio(convenioRequest.getIdConvenio(), convenioRequest.getNome(), convenioRequest.getCnpj(),
				convenioRequest.getRazaoSocial(),
				new EnderecoBinder().requestToModel(convenioRequest.getEnderecoRequest()),
				new ContatoBinder().requestToModel(convenioRequest.getContatoRequest()));
	}

	public ConvenioResponse modelToResponse(Convenio convenio) {
		return new ConvenioResponse(convenio.getIdConvenio(), convenio.getNome(), convenio.getCnpj(),
				convenio.getRazaoSocial(), new EnderecoBinder().modelToResponse(convenio.getEndereco()),
				new ContatoBinder().modelToResponse(convenio.getContato()));
	}

	public List<ConvenioResponse> modelToListResponse(List<Convenio> convenios) {
		if (convenios == null)
			return null;
		return convenios.stream().filter(Objects::nonNull).map(convenio -> modelToResponse(convenio))
				.collect(Collectors.toList());

	}

	public List<Convenio> requestToListModel(List<ConvenioRequest> conveniosRequest) {
		if (conveniosRequest == null)
			return null;
		return conveniosRequest.stream().filter(Objects::nonNull)
				.map(convenioRequest -> requestToModel(convenioRequest)).collect(Collectors.toList());

	}
	
	public List<Convenio> requestListIdToListModel(List<Long> convenios){
		return convenioService.getListConvenios(convenios);
	}
}
