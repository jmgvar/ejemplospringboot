package com.avante.springbootdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avante.springbootdemo.dao.IDepartamentoDao;
import com.avante.springbootdemo.dao.IPersonaDao;
import com.avante.springbootdemo.model.Departamento;

@Service
public class DepartamentoService implements IDepartamentoService{
	@Autowired
	private IDepartamentoDao departamentoDao;

	@Override
	public List<Departamento> getDepartamentos() {
		return (List<Departamento>)departamentoDao.findAll();
	}

	@Override
	public Departamento getDepartamento(Long id) {
		return departamentoDao.findById(id).get();
	}
}
