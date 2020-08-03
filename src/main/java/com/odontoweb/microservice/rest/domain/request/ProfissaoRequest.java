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
public class ProfissaoRequest implements Serializable {

	private static final long serialVersionUID = 3593316855837310683L;

	private Long idProfissao;
	private String nome;
}
