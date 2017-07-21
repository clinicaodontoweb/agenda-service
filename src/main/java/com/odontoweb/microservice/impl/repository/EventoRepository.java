package com.odontoweb.microservice.impl.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.odontoweb.microservice.impl.model.Dentista;
import com.odontoweb.microservice.impl.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {
	@Query("SELECT evento FROM Evento evento WHERE evento.agenda.dentista = ?1 AND evento.dataInicio BETWEEN ?2 AND ?3")
	public List<Evento> findEventoByDentista(Dentista dentista, Date dataInicio, Date dataFim);
}
