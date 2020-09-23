package com.avante.springbootdemo.dao;

import org.springframework.data.repository.CrudRepository;

import com.avante.springbootdemo.model.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long> {
}
