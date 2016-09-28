package com.odontoweb.microservice.impl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.Agenda;
import com.odontoweb.microservice.impl.model.Profissional;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {

	public List<Agenda> findAgendaByProfissional(Profissional profissional);
}
