package com.odontoweb.microservice.impl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.Evento;
import com.odontoweb.microservice.impl.model.Profissional;

public interface EventoRepository extends JpaRepository<Evento, Long> {

	public List<Evento> findEventoByProfissional(Profissional profissional);
}
