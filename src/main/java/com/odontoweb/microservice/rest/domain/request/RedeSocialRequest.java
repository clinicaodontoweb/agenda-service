package com.odontoweb.microservice.rest.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RedeSocialRequest implements Serializable {

	private static final long serialVersionUID = -6208329137006430189L;

	private Long idRedeSocial;
	private String nome;
}
