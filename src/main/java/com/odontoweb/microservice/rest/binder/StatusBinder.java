package com.odontoweb.microservice.rest.binder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.odontoweb.microservice.impl.model.Status;
import com.odontoweb.microservice.impl.service.StatusService;
import com.odontoweb.microservice.rest.domain.request.StatusRequest;
import com.odontoweb.microservice.rest.domain.response.StatusResponse;

public class StatusBinder implements Serializable {

	private static final long serialVersionUID = 6000795044646669253L;

	private StatusService statusService;

	public StatusBinder(StatusService statusService) {
		this.statusService = statusService;
	}

	public StatusBinder() {
	}

	public Status requestToModel(StatusRequest statusRequest) {
		return new Status(statusRequest.getIdStatus(), statusRequest.getNome(), statusRequest.getCor());
	}

	public Status getStatusById(Long idStatus) {
		return statusService.findById(idStatus);
	}

	public StatusResponse modelToResponse(Status status) {
		return new StatusResponse(status.getIdStatus(), status.getNome(), status.getCor());
	}

	public List<StatusResponse> modelToListResponse(List<Status> statusList) {
		if (statusList == null)
			return null;
		return statusList.stream().filter(Objects::nonNull).map(status -> modelToResponse(status))
				.collect(Collectors.toList());

	}

}
