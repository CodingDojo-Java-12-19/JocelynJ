package com.jocelyn.relationships.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jocelyn.relationships.models.Person;
import com.jocelyn.relationships.repositories.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository personRepo;
	
	public PersonService(PersonRepository personRepo) {
		this.personRepo = personRepo;
	}
	
	public List<Person> allPersons(){
		return personRepo.findAll();
	}
	
	public Person createPerson(Person person) {
		return personRepo.save(person);
	}
	
	public Person getPerson(Long id) {
		return personRepo.findById(id).orElse(null);
	}

}
