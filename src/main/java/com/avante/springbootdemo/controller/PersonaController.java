package com.avante.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avante.springbootdemo.model.Departamento;
import com.avante.springbootdemo.model.Persona;
import com.avante.springbootdemo.service.IDepartamentoService;
import com.avante.springbootdemo.service.IPersonaService;

@RestController
public class PersonaController {

	@Autowired
	private IPersonaService personaService;

	@RequestMapping("/")
	public String index() {

		return "Hola. Mi proyecto está publicado";
	}

	@GetMapping("/personas")
	public List<Persona> getPersonas() {
		return personaService.getPersonas();
	}
	
	
	@GetMapping("/persona/{id}")
	public Persona getPersona(@PathVariable Long id) {
		return personaService.getPersona(id);
	}
	
	@PostMapping("/persona")
	public Persona createPersona(@RequestBody Persona persona) {
		return personaService.createPersona(persona);
	}
	
	@RequestMapping(value = "/persona", 
			  produces = "application/json", 
			  method=RequestMethod.PUT)
	public Persona updatePersona(@RequestBody Persona persona) {
		return personaService.updatePersona(persona);
	}
	
	@DeleteMapping("/persona/{id}")
	public void deletePersona(@PathVariable Long id) {
		personaService.deletePersona(id);
	}

}
