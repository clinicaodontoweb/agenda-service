package com.odontoweb.microservice.impl.model.enums;

public enum StatusAgenda {
	ABERTO("Aberto"), CONCLUIDO("Concluído"), CANCELADO("Cancelado");

	private String statusAgenda;

	private StatusAgenda(String statusAgenda) {
		this.statusAgenda = statusAgenda;
	}

	@Override
	public String toString() {
		return this.statusAgenda;
	}
}
