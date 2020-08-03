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
public class StatusResponse implements Serializable {

	private static final long serialVersionUID = 965778435919501808L;

	private Long idStatus;
	private String nome;
	private String cor;
}
