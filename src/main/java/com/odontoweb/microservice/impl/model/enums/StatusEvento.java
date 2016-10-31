package com.odontoweb.microservice.impl.model.enums;

public enum StatusEvento {
	ABERTO("Aberto"), CONCLUIDO("Concluído"), CANCELADO("Cancelado");

	private String statusEvento;

	private StatusEvento(String statusEvento) {
		this.statusEvento = statusEvento;
	}

	@Override
	public String toString() {
		return this.statusEvento;
	}
}
