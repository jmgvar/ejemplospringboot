package com.avante.springbootdemo.service;

import java.util.List;

import com.avante.springbootdemo.model.Departamento;

public interface IDepartamentoService {
	public List<Departamento> getDepartamentos ();
	public Departamento getDepartamento (Long id);

}
