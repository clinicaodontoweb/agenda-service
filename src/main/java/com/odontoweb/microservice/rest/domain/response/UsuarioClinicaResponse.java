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
public class UsuarioClinicaResponse implements Serializable {

	private static final long serialVersionUID = 7584162869156842364L;

	private Long idUsuarioClinica;
	private String hashKey;
	private String tipoProfissional;
}
