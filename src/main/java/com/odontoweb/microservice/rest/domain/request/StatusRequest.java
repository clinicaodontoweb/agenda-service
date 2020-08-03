package com.odontoweb.microservice.rest.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StatusRequest implements Serializable {

	private static final long serialVersionUID = -1455378347372024359L;

	private Long idStatus;

	@NotNull(message = "Nome é obrigatório!")
	private String nome;

	private String cor;
}
