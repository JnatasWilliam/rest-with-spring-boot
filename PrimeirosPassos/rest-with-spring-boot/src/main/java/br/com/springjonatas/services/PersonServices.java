package br.com.springjonatas.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.springjonatas.model.entity.Person;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());


	// Criando um mock para encontrar uma pessoa	
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<>();

		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}

		return persons;
	}

	// Criando um mock para encontrar uma pessoa
	public Person findById(String id) {

		logger.info("Finding one person");
		Person person = new Person();

		person.setID(counter.incrementAndGet());
		person.setFirstName("Jonatas");
		person.setLastName("Santos");
		person.setAddress("Alameda dos Guatás");
		person.setGender("Male");

		return person;
	}

	public Person create(Person person) {

		logger.info("Creating one person");
		
		return person;
	}
	
	public Person update(Person person) {

		logger.info("Updating one person");
		
		return person;
	}
	
	public void delete(String id) {

		logger.info("Deleting one person");
	}
	
	private Person mockPerson(int i) {

		logger.info("Finding all");
		Person person = new Person();

		person.setID(counter.incrementAndGet());
		person.setFirstName("Person name: " + i);
		person.setLastName("Lasta name: " + 1);
		person.setAddress("Some address in Brasil: " + i);
		person.setGender("Male");

		return person;

	}
}
