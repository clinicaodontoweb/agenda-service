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
public class IndicacaoRequest implements Serializable {

	private static final long serialVersionUID = -5195143023808365702L;

	private Long idIndicacao;
	private String nome;
}
