package com.generation.esempiorest.controller;

import com.generation.esempiorest.controller.helpers.ControllerHelper;
import com.generation.esempiorest.model.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController
{
	@Autowired
	private ControllerHelper ch;

	@GetMapping
	public List<Person> readAll()
	{
		return ch.findAllPersons();
	}


	@GetMapping("/age25")
	public List<Person> readAll25()
	{
		return ch.findAllPersons25();
	}


	//lettura totale
	//lettura singola
	//inserimento
	//modifica
	//cancellazione
}
