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
public class BairroResponse implements Serializable {

	private static final long serialVersionUID = 1582101913813759874L;

	private Long idBairro;
	private String nome;
}
