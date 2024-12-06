package com.generation.esempiorest.controller.helpers;

import com.generation.esempiorest.model.entities.Person;

import java.util.List;

public interface ControllerHelper
{
	String s = "SELECT * FROM qualcosa WHERE name='stefano'";
	List<Person> findAllPersons();

	List<Person> findAllPersons25();
}
