package com.generation.esempiorest.model.repositories;

import com.generation.esempiorest.model.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer>
{
}
