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
public class TelefoneResponse implements Serializable {

	private static final long serialVersionUID = 1502274284284683154L;

	private Long idTelefone;
	private Integer numero;
	private Integer ddd;
	private String tipoTelefone;
	private Boolean principal;
	private String nome;
}
