package com.avante.springbootdemo.dao;

import org.springframework.data.repository.CrudRepository;

import com.avante.springbootdemo.model.Departamento;

public interface IDepartamentoDao extends CrudRepository<Departamento, Long>{

}
