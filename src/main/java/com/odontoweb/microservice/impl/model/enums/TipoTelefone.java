package com.odontoweb.microservice.impl.model.enums;

public enum TipoTelefone {
	RESIDENCIAL("Residencial"), COMERCIAL("Comercial"), CELULAR("Celular"), WHATSAPP("WhatsApp");

	private String tipoTelefone;

	private TipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	@Override
	public String toString() {
		return tipoTelefone;
	}
}
