package com.avante.springbootdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avante.springbootdemo.dao.IPersonaDao;
import com.avante.springbootdemo.model.Persona;
import com.avante.springbootdemo.service.IPersonaService;

@Service
public class PersonaService implements IPersonaService {

	@Autowired
	private IPersonaDao personaDao;

	@Override
	public List<Persona> getPersonas() {
		return (List<Persona>) personaDao.findAll();
	}
	
	@Override
	public Persona getPersona(Long id){
		return (Persona) personaDao.findById(id).get();
	}

	@Override
	public Persona createPersona(Persona persona) {
		personaDao.save(persona);
		return persona;
	}

	@Override
	public void deletePersona(Long id) {
		personaDao.deleteById(id);
	}

	@Override
	public Persona updatePersona(Persona persona) {
		Persona p = personaDao.findById(persona.getId()).get();
		p.setNombre(persona.getNombre());
		p.setApellidos(persona.getApellidos());
		p.setEdad(persona.getEdad());
		return personaDao.save(p);
	}
}