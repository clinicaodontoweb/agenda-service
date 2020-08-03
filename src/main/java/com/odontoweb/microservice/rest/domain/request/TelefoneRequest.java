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
public class TelefoneRequest implements Serializable {

	private static final long serialVersionUID = -8017936722048406458L;

	private Long idTelefone;

	@NotNull(message = "Número é obrigatório")
	private Integer numero;

	@NotNull(message = "DDD é obrigatório")
	private Integer ddd;

	@NotNull(message = "Tipo de Telefone é obrigatório")
	private String tipoTelefone;

	private Boolean principal;

	private String nome;
}
