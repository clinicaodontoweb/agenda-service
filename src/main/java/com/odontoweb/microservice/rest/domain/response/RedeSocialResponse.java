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
public class RedeSocialResponse implements Serializable {

	private static final long serialVersionUID = 1909405514983227509L;

	private Long idRedeSocial;
	private String nome;
}
