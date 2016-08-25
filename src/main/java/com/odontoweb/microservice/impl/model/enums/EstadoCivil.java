package com.odontoweb.microservice.impl.model.enums;

public enum EstadoCivil {
	SOLTEIRO("Solteiro"), CASADO("Casado"), DIVORCIADO("Divorciado"), VIUVO("Viúvo");

	private String estadoCivil;

	private EstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return this.estadoCivil;
	}
}
