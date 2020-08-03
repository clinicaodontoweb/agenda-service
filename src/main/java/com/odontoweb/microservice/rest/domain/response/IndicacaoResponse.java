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
public class IndicacaoResponse implements Serializable {

	private static final long serialVersionUID = -6273592600827327053L;

	private Long idIndicacao;
	private String nome;
}
