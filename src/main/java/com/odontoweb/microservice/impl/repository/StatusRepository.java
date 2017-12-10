package com.odontoweb.microservice.impl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.impl.model.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {

}
