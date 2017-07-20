package com.odontoweb.microservice.impl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.Agenda;
import com.odontoweb.microservice.impl.model.Dentista;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
	public Agenda findAgendaByProfissional(Dentista dentista);
}
