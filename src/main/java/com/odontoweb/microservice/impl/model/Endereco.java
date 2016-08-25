package com.odontoweb.microservice.impl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Endereco implements Serializable{

	private static final long serialVersionUID = -538703579751183417L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	private Long idEndereco;
	
	@Column(name = "endereco")
	private String endereco;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cep")
	private Cep cep;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_ponto_referencia")
	private PontoReferencia pontoReferencia;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cidade")
	private Cidade cidade;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_bairro")
	private Bairro bairro;
	
	@Column(name = "numero")
	private Integer numero;
	
	@Column(name = "complemento")
	private String complemento;

}
