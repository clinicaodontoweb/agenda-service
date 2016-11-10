package com.odontoweb.microservice.impl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
