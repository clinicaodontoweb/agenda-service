package com.odontoweb.microservice.impl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.Dentista;

public interface DentistaRepository extends JpaRepository<Dentista, Long> {

}
