package com.odontoweb.microservice.rest.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContatoResponse implements Serializable{

	private static final long serialVersionUID = 6871120103197541109L;
	
	private Long idContato;
	private List<TelefoneResponse> telefones;
	private String email;
}
