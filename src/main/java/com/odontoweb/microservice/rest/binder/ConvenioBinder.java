package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;

import com.odontoweb.microservice.impl.model.Convenio;
import com.odontoweb.microservice.rest.domain.request.ConvenioRequest;
import com.odontoweb.microservice.rest.domain.response.ConvenioResponse;

public class ConvenioBinder implements Serializable {

	private static final long serialVersionUID = -6564303786520599427L;

	public Convenio requestToModel(ConvenioRequest convenioRequest) {
		return new Convenio(convenioRequest.getIdConvenio(), convenioRequest.getNome(), convenioRequest.getCnpj(),
				convenioRequest.getRazaoSocial(), convenioRequest.getEndereco(), convenioRequest.getContato());
	}

	public ConvenioResponse modelToResponse(Convenio convenio) {
		return new ConvenioResponse(convenio.getIdConvenio(), convenio.getNome(), convenio.getCnpj(),
				convenio.getRazaoSocial(), convenio.getEndereco(), convenio.getContato());
	}
}