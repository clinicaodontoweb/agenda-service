package com.odontoweb.microservice.impl.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.odontoweb.microservice.impl.model.Agenda;
import com.odontoweb.microservice.impl.model.Profissional;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
	public Agenda findAgendaByProfissional(Profissional profissional);
	
	@Query("SELECT agenda FROM Agenda agenda LEFT OUTER JOIN agenda.eventos evento WHERE agenda.profissional = ?1 AND evento.dataEvento BETWEEN ?2 AND ?3")
	public List<Agenda> findAgendaByDataEvento(Profissional profissional, Date dataInicio, Date dataFim);

}
