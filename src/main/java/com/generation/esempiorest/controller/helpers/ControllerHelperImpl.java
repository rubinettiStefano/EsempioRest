package com.generation.esempiorest.controller.helpers;

import com.generation.esempiorest.model.entities.Person;
import com.generation.esempiorest.model.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ControllerHelperImpl implements ControllerHelper
{
	@Autowired
	PersonRepository repo;


	@Override
	public List<Person> findAllPersons()
	{
		return repo.findAll();
	}
}
