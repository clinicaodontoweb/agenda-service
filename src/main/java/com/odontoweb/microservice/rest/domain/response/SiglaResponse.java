package com.odontoweb.microservice.rest.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SiglaResponse implements Serializable {

	private static final long serialVersionUID = -6044051654240321278L;

	private Long idSigla;
	private String sigla;
}
