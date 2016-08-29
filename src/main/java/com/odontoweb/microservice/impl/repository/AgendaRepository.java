package com.odontoweb.microservice.impl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {

}
