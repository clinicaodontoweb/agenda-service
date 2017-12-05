package com.odontoweb.microservice.impl.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.odontoweb.microservice.impl.model.Evento;
import com.odontoweb.microservice.impl.model.UsuarioClinica;

public interface EventoRepository extends JpaRepository<Evento, Long> {
	@Query("SELECT evento FROM Evento evento WHERE evento.agenda.usuarioClinica = ?1 AND evento.dataInicio BETWEEN ?2 AND ?3")
	public List<Evento> findEventoByUsuarioClinica(UsuarioClinica usuarioClinica, Date dataInicio, Date dataFim);
	@Query("SELECT evento FROM Evento evento WHERE lower(evento.paciente.nome) LIKE lower(concat('%', ?1,'%'))")
	public List<Evento> findEventoByNomePaciente(String nomePaciente);
	@Query("SELECT evento FROM Evento evento WHERE evento.paciente.cpf = ?1")
	public List<Evento> findEventoByCpfPaciente(String cpf);
}
