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
public class GeneroResponse implements Serializable {

	private static final long serialVersionUID = -3562159033517559499L;

	private String genero;
}
