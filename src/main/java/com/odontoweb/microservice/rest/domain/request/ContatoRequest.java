package com.odontoweb.microservice.rest.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContatoRequest implements Serializable {

	private static final long serialVersionUID = -668475198201992388L;

	private Long idContato;

	@NotNull(message = "Obrigatório pelo menos 1 telefone!")
	private List<TelefoneRequest> telefones;

	@NotNull(message = "Email é obrigatório!")
	private String email;
}
