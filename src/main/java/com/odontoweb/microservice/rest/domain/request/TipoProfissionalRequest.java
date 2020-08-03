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
public class TipoProfissionalRequest implements Serializable {

	private static final long serialVersionUID = -663503942838928903L;

	private String tipoProfissional;
}
