package com.avante.springbootdemo.service;

import java.util.List;

import com.avante.springbootdemo.model.Persona;


public interface IPersonaService {
	public List<Persona> getPersonas ();
	public Persona getPersona (Long id);
	public Persona createPersona (Persona persona);
	public void deletePersona (Long id);
	public Persona updatePersona (Persona persona);

}
