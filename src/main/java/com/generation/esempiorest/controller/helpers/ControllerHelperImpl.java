package com.generation.esempiorest.controller.helpers;

import com.generation.esempiorest.model.entities.Person;
import com.generation.esempiorest.model.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

	@Override
	public List<Person> findAllPersons25()
	{
		List<Person> age25 = new ArrayList<Person>();
		for(Person p : repo.findAll())
			if(p.getAge() > 25)
				age25.add(p);
		return age25;
	}
}
